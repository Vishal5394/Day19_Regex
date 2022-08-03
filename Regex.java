package com.BridgeLabz.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	public void validateFirstName(String firstName){
			Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
		    boolean matches = pattern.matcher(firstName).matches();
		    if (matches){
		        System.out.println("FirstName Is Valid");
		    }
		    else
		        System.out.println("Please Enter valid FirstName ");
}

public static void main(String[] args) {
	    Regex regex=new Regex();
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter first name :");
	    String firstName=scanner.next();
	    regex.validateFirstName(firstName);
    
	}
	
}


