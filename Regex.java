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

public static void main(String[] args) {
	    Regex regex=new Regex();
	    Scanner scanner=new Scanner(System.in);
	    /*System.out.println("Enter first name :");
	    String firstName=scanner.next();
	    regex.validateName(firstName);
	    

        System.out.println("\n Enter last name: ");
        String lastName=scanner.next();
        regex.validateName(lastName);*/
        
        System.out.println("Enter email: ");
        String email=scanner.next();
        regex.validateEmail(email);
    
	}
	
}


