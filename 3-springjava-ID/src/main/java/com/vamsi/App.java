package com.vamsi;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.SimpleThreadScope;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		beanFactory.registerScope("thread", new SimpleThreadScope());
		sample s1 = context.getBean("s1", sample.class);
		sample s2 = context.getBean("s1", sample.class);
		
		System.out.println("s1==s2"+(s1==s2));
		
		 Thread t1=new Thread(new Runnable() {
			
			
			public void run() {
				sample s1 = context.getBean("s1", sample.class);
				sample s2 = context.getBean("s1", sample.class);
				
				System.out.println("s1==s2"+(s1==s2));
				
			}
		});
		 t1.start();
		context.close();

	}

}
