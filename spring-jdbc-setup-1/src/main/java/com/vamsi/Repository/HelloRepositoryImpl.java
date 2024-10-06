package com.vamsi.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.vamsi.Student.Student;

@Repository("hr")
public class HelloRepositoryImpl implements HelloRepository {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public Student save(Student st) {
	 String sql="insert into people values (?,?,?)";
	 jt.update(sql, 
			 new Object[] {st.getPid(),st.getPname(),st.getPemail()},
			 new int[] {Types.INTEGER,Types.VARCHAR,Types.VARCHAR} );
	 
		return st;
	}
	

	@Override
	public List<Student> saveAll(List<Student> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	public void delete(Student st) {
		String sql = "delete from people where pid= ?";
		jt.update(sql, st.getPid());

	}

	public void deleteAll() {
		//String sql="delete from people";
		//jt.update(sql);

	}

	public void deleteById(int id) {
		String sql = "delete from people where pid= " + id;
		jt.update(sql);
	}


	@Override
	public Student updateById(int pid, Student s1) {
		String sql="update people set pname=?,pemail=? where pid=?";
		jt.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, s1.getPname() );
				ps.setString(2, s1.getPemail());
				ps.setInt(3, pid);
			}
		});
			s1.setPid(pid);
		return s1;
	}


	@Override
	public Student updateByName(String name, String email) {
		jt.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			String	sql="update people set pemail=? where pname like ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,email);
				ps.setString(2,"%"+name+"%");
				return ps;
			}
		});
		return new Student(name,email);
	}


	@Override
	public Student getById(int id) {
		String sql="select * from people where pid= " +id;
	return	jt.query(sql, new ResultSetExtractor<Student>() {

			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				Student st=null;
		    if(rs.next()) {
		    	st=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
		    }
				return st;
			}
			
		});
	
	}


	@Override
	public List<Student> getAll() {
		String sql="select * from people";
		
     return jt.query(sql,new RowMapper<Student>() {
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("RowMapper");
			return new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
		}
    	 
     });
		
	}


	@Override
	public void getAllRCH() {
		String sql="select * from people";
		
		jt.query(sql,new RowCallbackHandler() {

			public void processRow(ResultSet rs) throws SQLException {
				System.out.println("rowcall back called");
				System.out.println("row called" + "   "+rs.getInt(1));
			}
							});
	}


	@Override
	public List<Student> AllStudents() {
		String sql="select * from people";
		
		Test t1=new Test();
		jt.query(sql,t1 );
		
		
		return t1.getStudents();
	}


	@Override
	public int counts(int id) {
		String sql="Select Count(*) from people where pid=?";
		jt.queryForObject(sql, Integer.class,id);
		return id;
	}


	@Override
	public List<Student> findAllStudents() {
		String sql="select * from people";
		
		 SqlRowSet sr = jt.queryForRowSet(sql);
		 
		 List<Student> s1=new ArrayList<>();
		 
		 while(sr.next()) {
			 Student s=new Student(sr.getInt(1),sr.getString(2),sr.getString(3));
			 s1.add(s);
		 }
		return s1;
		
	}


	@Override
	public void SaveStudent(Student st) {
		jt.execute(new ConnectionCallback<Student>() {
			public Student doInConnection(Connection con) throws SQLException, DataAccessException {
				String sql="insert into student values=(?,?,?)";
				 PreparedStatement ps = con.prepareStatement(sql);
				 ps.setInt(1, st.getPid());
				 ps.setString(2, st.getPname());
				 ps.setString(3, st.getPemail());
				 
			    ps.executeUpdate();
				 return null;
				
			}
	
		});
	}
	
}

class Test implements RowCallbackHandler
{

	private List<Student> students=new ArrayList<>();
	
	public void processRow(ResultSet rs) throws SQLException {
	   
	int pid = rs.getInt(1);
	String pname = rs.getString(2);
	String pemail = rs.getString(3);	
	
	students.add(new Student(pid, pname, pemail));
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
}


