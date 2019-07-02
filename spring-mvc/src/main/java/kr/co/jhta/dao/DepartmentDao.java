package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Department;
import kr.co.jhta.vo.Employee;

@Repository
public class DepartmentDao {
	@Autowired
	private SqlMapClientTemplate template;
	
	@SuppressWarnings("unchecked")
	public List<Department> selectAllByDepartment() {
		return template.queryForList("selectAllByDepartment");
	}
	

	
	
}
