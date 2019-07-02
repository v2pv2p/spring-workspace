package kr.co.jhta.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Customer;

public class CustomerDao {

	private SqlMapClientTemplate template;
	
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> allSelect() {
		return template.queryForList("allSelect");
	}
//	public Customer searchSelect(Map<String, Object> map) {
//		return (Customer) template.queryForObject("searchSelect", map);
//	}

}
