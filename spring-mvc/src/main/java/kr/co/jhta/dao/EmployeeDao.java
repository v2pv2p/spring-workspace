package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	private SqlMapClientTemplate template;
	
	@SuppressWarnings("unchecked")
	public List<Employee> selectEmployeeByDepartmentId(int id) {
		return template.queryForList("selectEmployeeByDepartmentId",id);
	}
	
	public Employee selectEmployeeByEmployeeId(int id) {
		return (Employee) template.queryForObject("selectEmployeeByEmployeeId",id);
	}
	
	
	
	public void addEmployee(Employee employee) {
		template.insert("addEmployee", employee);
	}
	

}
