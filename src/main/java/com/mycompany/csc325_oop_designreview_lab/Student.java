
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{

    public Student(String name, short age,int Credits) {
        super(name, age);
         this.Credits=Credits;
        
    }
    
    protected int Credits;
    protected int GPA;//here I am defining the Gpa field variable for my Student class
      
    protected String address;

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int Credits) {
        this.Credits = Credits;
    }
   

    public int getGPA() {//here I am defining the getter function of the Gpa field variable for my Student class
        return GPA;
    }

    public void setGPA(int GPA) {//here I am defining the setter function of the Gpa field variable for my Student class
        this.GPA = GPA;
    }
    public void setAddress(String address) {//here I am creating the implemenation of the setAddress method 
        //which was inherited from the abstract human class 
        this.address = address;
    }

    public String getAddress() {//here I am creating the implemenation of the getAddress method 
        //which was inherited from the abstract human class 
        return address;
    }
      
       
	// ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code

}