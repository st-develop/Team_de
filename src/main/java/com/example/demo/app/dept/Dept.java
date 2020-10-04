package com.example.demo.app.dept;

import lombok.Data;

@Data
public class Dept {
	
	private String groupName;
	private String departmentName;
 	private String recruitment;
 	private String recruitee;
 	private String skills;
 	private String contact;
 	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getRecruitment() {
		return recruitment;
	}
	public void setRecruitment(String recruitment) {
		this.recruitment = recruitment;
	}
	public String getRecruitee() {
		return recruitee;
	}
	public void setRecruitee(String recruitee) {
		this.recruitee = recruitee;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

}
