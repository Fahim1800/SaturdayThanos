package com.upskill.java_2;

public class IfElseStatement {

        static int age = 105;
        
        public static void main(String[] args) {
        	age();
        }


        public static void age() {
           if (age<13){
        	   System.out.println("you are children");
           } else if (age >13 && age < 18) {
        	   System.out.println("you are teenager");
           } else if (age >=60){
        	   //Nested If Else Statement 
        	   if (age > 100) {
         System.out.println("you are hero");
        	   } else {
       System.out.println("you are senior");
        	   }
           } else {
           System.out.println("you are adult");
           }
        }
}


           