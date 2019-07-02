package kr.co.jhta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.DepartmentDao;
import kr.co.jhta.dao.EmployeeDao;
import kr.co.jhta.vo.Department;
import kr.co.jhta.vo.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private DepartmentDao deptDao;

	@Autowired
	private EmployeeDao empDao;
	
	@RequestMapping("/depts.do")
	public String selectAllByDepartment(Model model) {
		List<Department> depts = deptDao.selectAllByDepartment();
		model.addAttribute("depts", depts);
		
		return "emp/depts";
	}
	
	@RequestMapping("/employees.do")
	public String selectEmployeeByDepartmentId(Model model, int id) {
		List<Employee> emps = empDao.selectEmployeeByDepartmentId(id);
		model.addAttribute("emps", emps);
		
		return "emp/employees";
	}
	
	@RequestMapping("/employee.do")
	public String selectEmployeeByEmployeeId(Model model, int id) {
		Employee employee = empDao.selectEmployeeByEmployeeId(id);
		
		model.addAttribute("employee", employee);
		return "emp/employee";
	}
	@RequestMapping("/form.do")
	public String form() {
		
		return "emp/form";
	}
	
	@RequestMapping("/add.do")
	public String add(Employee emp) {
		empDao.addEmployee(emp);
		
		
		return "redirect:list.do";
	}
	
	
}
