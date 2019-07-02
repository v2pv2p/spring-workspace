package kr.co.jhta.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.CustomerDao;
import kr.co.jhta.vo.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);

		CustomerDao customerDao = ctx.getBean(CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			System.out.println("1.전체조회 2.검색 3.등록 4.수정 5.삭제 6.상세검색 0.종료");
			System.out.println("------------------------------------------------------");
			
			System.out.print("메뉴선택> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Customer> customers = customerDao.allSelect();
				
				for(Customer customer : customers) {
					System.out.println("번    호 : " + customer.getNo());
					System.out.println("이    름 : " + customer.getName());
					System.out.println("이 메 일 : " + customer.getEmail());
					System.out.println("주    소 : " + customer.getAddress());
					System.out.println("포 인 트 : " + customer.getPoint());
					System.out.println("전화번호 : " + customer.getTel());
					System.out.println("등 록 일 : " + customer.getCreateDate());
					
				}
			} else if (menu == 2) {
//				System.out.println("검색 할 옵션을 입력하세요(no, name, nick중에)");
//				String search = scanner.next();
//				Map<String, Object> map = new HashMap<String, Object>();
//				System.out.println("검색 할 정보를 입력하세요");
//				String input = scanner.next();
//				map.put("search", search);
//				map.put("input",input);
//				Customer customer =  customerDao.searchSelect(map);
//				System.out.println(customer.getNo());
//				System.out.println(customer.getName());
//				System.out.println(customer.getEmail());
//				System.out.println(customer.getTel());
				
//				
			} else if (menu == 3) {
				
			} else if (menu == 4) {
				
			} else if (menu == 5) {
				
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
}
