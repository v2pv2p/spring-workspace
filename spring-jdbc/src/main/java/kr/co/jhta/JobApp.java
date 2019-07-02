package kr.co.jhta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobApp {
	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		JobDao jobDao = ctx.getBean(JobDao.class);
		
//		Job job = new Job();
//		job.setId("영업");
//		job.setTitle("영업지원팀");
//		job.setMaxSalary(2000);
//		job.setMinSalary(6000);
		
//		jobDao.insertJob(job);
		
		
		Job job = jobDao.getJobById("영업");
		System.out.println(job.getId());
		System.out.println(job.getMaxSalary());
		System.out.println(job.getMinSalary());
		System.out.println(job.getTitle());
		
		jobDao.deleteJob("영업");
	}
}
