package com.spring.second;

public class Department {
	private int deptcode;
	private String deptname;
	private Employee eobj;
	public Employee getEobj() {
		return eobj;
	}
	public void setEobj(Employee eobj) {
		this.eobj = eobj;
	}
	public int getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	

}
