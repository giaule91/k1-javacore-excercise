package com.demo.core.lab4;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		Employee employee1 = new Employee("Anh",24, "Bartender", 1000000.0,"aptechhue" );
		Employee employee2 = new Employee("Sanh",22, "youtuber", 2000000.0,"aptechhue");
		Employee employee3 = new Employee("Sang",20, "Developer", 3000000.0,"aptechhue");
		Employee employee4= new Employee("Thọ",26, "Manager", 5000000.0,"aptechhue");
		Employee employee5 = new Employee("Hùng",24, "Manager", 8000000.0,"aptechhue");
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		for(Employee anh: employees){
			System.out.println(employee1.getName()+"\t"+employee1.getAge()+"\t"+employee1.getJob()+"\t"+employee1.getSalary()+"\t"+employee1.getDepartment());
			System.out.println(employee2.getName()+"\t"+employee2.getAge()+"\t"+employee2.getJob()+"\t"+employee2.getSalary()+"\t"+employee2.getDepartment());
			System.out.println(employee3.getName()+"\t"+employee3.getAge()+"\t"+employee3.getJob()+"\t"+employee3.getSalary()+"\t"+employee3.getDepartment());
			System.out.println(employee4.getName()+"\t"+employee4.getAge()+"\t"+employee4.getJob()+"\t"+employee4.getSalary()+"\t"+employee4.getDepartment());
			System.out.println(employee5.getName()+"\t"+employee5.getAge()+"\t"+employee5.getJob()+"\t"+employee5.getSalary()+"\t"+employee5.getDepartment());
		}}};