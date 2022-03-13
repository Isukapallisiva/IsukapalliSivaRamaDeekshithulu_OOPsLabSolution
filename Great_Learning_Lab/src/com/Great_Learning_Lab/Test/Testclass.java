package com.Great_Learning_Lab.Test;

import java.util.Scanner;

import com.Great_Learning_Lab.Entity.Employee;
import com.Great_Learning_Lab.Service.CredentialService;

public class Testclass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(
				"Please enter the department from the following options \n 1. Techincal \n 2. Admin \n 3. Human Resource \n 4. Legal");
		int i = s.nextInt();
		String department = null;
		String Company = "GreatLearning";
		if (i == 1) {
			department = "Tech";
		} else if (i == 2) {
			department = "Admin";
		} else if (i == 3) {
			department = "HumanResource";
		} else if (i == 4) {
			department = "Legal";
		} else {
			System.out.println("enter the vaild number");
			s.close();
			System.exit(0);
		}

		Employee e = new Employee("siva", "ram");
		CredentialService cs = new CredentialService();
		String q = cs.generateEmailAddress(e, department, Company);
		char[] p = cs.generatePassword();
		cs.showCredentials(e, q, p);
		s.close();

	}

}
