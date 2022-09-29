package com.mainpackage;

import com.childpackage.AdminDepartment;
import com.childpackage.HrDepartment;
import com.childpackage.TechDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment admindept=new AdminDepartment();
		HrDepartment hrDept=new HrDepartment();
		TechDepartment techDept=new TechDepartment();
		
		System.out.println("Welcome to "+admindept.departmentName());
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday()+"\n");
		
		
		
		

	}

}
