package com.upskill.java_2;

public class MethodType {
   /* Types of method
    
    1. Void Method 
    2. Static Method
    3. Return type Method  */
   
	public static int hourlyIncome=75;
    public static void main(String[] args) {
               MethodType obj = new MethodType();
               obj.annualIncomeVoid();
               System.out.println("My monthly Income ::: "+ obj.monthlyIncomeReturn());
               WeeklyIncomeVoid();


}
//Void Method
    public void annualIncomeVoid(){
               int calculateAnnualIncome = hourlyIncome *2000;
               System.out.println("My Annual Income ::: "+ calculateAnnualIncome);
    }
   
   
    // Return Type Method
    public int monthlyIncomeReturn(){
    int calculatemonthlyIncome=hourlyIncome * 180;
    return calculatemonthlyIncome;
   
   
    }
    //static method
    public static void WeeklyIncomeVoid(){
    int calculateweeklyIncome = hourlyIncome *40;
    System.out.println("My weekly Income ::: "+ calculateweeklyIncome);
   
   
    }
   
}

	