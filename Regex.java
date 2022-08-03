package com.BridgeLabz.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	  public void validateName(String name){
        Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
        boolean matches = pattern.matcher(name).matches();
        if (matches){
            System.out.println(name+" is valid");
        }else
            System.out.println(name+" is not valid");
	  }
	  
	  public void validateEmail(String email){
		          Pattern pattern=Pattern.compile("^[a-zA-Z0-9_'*+=~^.-]+@[a-zA-Z0-9.-]+$");
		          boolean matches = pattern.matcher(email).matches();
		          if (matches){
		              System.out.println("email is valid");
		          }else
		              System.out.println("email is not valid");
		      }
	  public void validateMobileNo(String mobileNo){
	        Pattern pattern=Pattern.compile("^(\\+\\d{2}\\s)?[\\d]{10}$");
	        boolean isValid = pattern.matcher(mobileNo).matches();
	        if (isValid){
	            System.out.println("mobile is valid");
	        }else {
	            System.out.println("mobile is not valid");
	        }
	  }
	  
	  public void validatePassword(String password){
	        boolean isValid=true;
	        validatePassRule1(password);
	        validatePassRule2(password);
	        validatePassRule3(password);
	        }
	    boolean validatePassRule1(String password){
	        Pattern pattern=Pattern.compile("[\\w]{8,}");
	        Boolean isValid=pattern.matcher(password).matches();
	        if (isValid){
	            System.out.println("Rule1 Pass..Valid Password");
	        }else {
	            System.out.println("Rule1 Fail...Invalid Password! \nPassword must have minimum 8 characters");
	        }
	        return isValid;
	    }
	    
	    boolean validatePassRule2(String password){
	        Pattern pattern=Pattern.compile("(?=.*[A-Z])[\\S]{8,}");
	        Boolean isValid=pattern.matcher(password).matches();
	        if (isValid){
	            System.out.println("Rule2 Pass..Valid Password");
	        }else {
	            System.out.println("Rule2 Fail..Invalid Password! \npassword must have at least one uppercase letter");
	        }
	        return isValid;
	    }
	    
	    Boolean validatePassRule3(String password){
	        Pattern pattern=Pattern.compile("(?=.*[A-Z])(?=.*[0-9])[\\S]{8,}");
	        Boolean isValid=pattern.matcher(password).matches();
	        if (isValid){
	            System.out.println("Rule3 Pass..Valid Password");
	        }else {
	            System.out.println("Rule3 Fail...Invalid Password! => password must have at least numeric letter");
	        }
	        return isValid;
	    }
	  
	

public static void main(String[] args) {
	    Regex regex=new Regex();
	    Scanner scanner=new Scanner(System.in);
	    /*System.out.println("Enter first name :");
	    String firstName=scanner.next();
	    regex.validateName(firstName);
	    

        System.out.println("\n Enter last name: ");
        String lastName=scanner.next();
        regex.validateName(lastName);
        
        System.out.println("Enter email: ");
        String email=scanner.next();
        regex.validateEmail(email);
        
        System.out.println("Enter mobile no as per format: (e.g. +91 1234567890) ");
        String mobileNo=scanner.nextLine();
        regex.validateMobileNo(mobileNo);*/
	    
	    System.out.println("\nPassword Rule1 – minimum 8 Characters"+"\nPassword Rule2 – Should have at least 1 Upper Case"
	    						+ "\\nPassword Rule3 – at least 1 numeric number");
        System.out.println("Enter Password:");
        String password=scanner.next();
        regex.validatePassword(password);
    
	}
	
}


