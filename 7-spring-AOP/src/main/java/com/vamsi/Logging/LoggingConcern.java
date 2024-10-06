package com.vamsi.Logging;

import org.aspectj.lang.JoinPoint;

public class LoggingConcern {
	
	public void LogBefore(JoinPoint jp) {
		Object[] args = jp.getArgs();
		StringBuffer sb=new StringBuffer();
		for(Object obj:args) {
			sb.append(obj);
			sb.append(" ");
		}
		System.out.println("Logging Before...."+sb);
	}

		public void afterReturing(JoinPoint jp,Object rv) {
			System.out.println("after returing...." + rv);
		}
		
		public void afterThrowing(JoinPoint jp,Throwable t) {
			System.out.println("after Throwing..."+t.getMessage());
		}
		
		public void LogAfter() {
			System.out.println("Logafter..." );
		}
}
