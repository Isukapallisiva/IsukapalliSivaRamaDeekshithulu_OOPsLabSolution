package com.Great_Learning_Lab.Service;

import java.util.Random;

import com.Great_Learning_Lab.Entity.Employee;

public class CredentialService {
	public char[] generatePassword( ) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[8];

	//	password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		//password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	//	password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		//password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 0; i < 8; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
	}

	public String generateEmailAddress(Employee e, String f, String c) {
		return e.getFirstname() + e.getLastname() + "@" + f +"."+ c + ".com";
	}

	public void showCredentials(Employee e,String email, char[] password) {
		System.out.println("hello "+e.getFirstname()+" your credentials are genarated. please find as below");
		System.out.println("Email-id is -->"+email);
		System.out.println("Password is  -->" +"1"+""+String.valueOf(password));
		

	}

}