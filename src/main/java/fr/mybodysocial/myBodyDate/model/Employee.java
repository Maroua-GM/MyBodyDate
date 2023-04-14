package fr.mybodysocial.myBodyDate.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Employee {
	private String empId;
	@NonNull
	private String name;
	@NonNull
	private String designation;
	@NonNull
	private double salary;


}
