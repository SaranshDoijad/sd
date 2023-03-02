package password_generator;

import java.util.*;


public class Generator {
    
   private final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     private final String lower = "abcdefghijklmnopqrstuvwxyz";
     private final String special = "!@#$%^&*/?";
    private final String number = "0123456789";
    
    private String allow = ""; 
    private String pass = "";
    
   public String generator1(boolean uppercase, boolean lowercase , boolean specialchar, boolean numbers , int size)
    {
              
		if(uppercase)
			allow += upper;
		if(lowercase)
			allow += lower;
		if(specialchar)
			allow += special;
		if(numbers)
			allow += number;
		
		Random random = new Random();
		
		for(int i=0;i<size;i++){
			int ran = random.nextInt(allow.length());
			pass += String.valueOf(allow.charAt(ran));
		}
		
		return pass;

    }
    
    //public static void main(String [] args)
    //{
//        Generator p = new Generator();
//        
//        System.out.println("Password ->"+p.generator1(true,false,true,true,12));
    //}
   
}
