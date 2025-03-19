package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employee_details")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	private String role;
}
