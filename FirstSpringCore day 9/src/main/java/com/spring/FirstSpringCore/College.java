package com.spring.FirstSpringCore;

import java.util.List;

public class College {
	private int clgid;
	private String clgname;
	private List<Student> sl;
	public int getClgid() {
		return clgid;
	}
	public void setClgid(int clgid) {
		this.clgid = clgid;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public List<Student> getSl() {
		return sl;
	}
	public void setSl(List<Student> sl) {
		this.sl = sl;
	}

}
