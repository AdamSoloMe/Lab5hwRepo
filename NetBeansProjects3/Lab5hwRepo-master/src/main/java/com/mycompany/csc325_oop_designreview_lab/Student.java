
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

    /**
     *  this method is where we overload the default Student Constructor as part of task 5 and give parameters for name,age and credits
     * @param name
     * @param age
     * @param Credits 
     */
    public Student(String name, short age,int Credits) {
        super(name, age);
         this.Credits=Credits;
        
    }

    /**
     * this method overrides the toString method from the Object class in order to print out all of the information within a studnet
     * @return 
     */
    @Override
    public String toString() {
        return "Student{" + "Credits=" + Credits + ", GPA=" + GPA + ", address=" + address + '}';
    }
    
    protected int Credits;
    protected double GPA;//here I am defining the Gpa field variable for my Student class
      
    protected String address;

    /**
     * this method gets the credits for a student 
     * @return 
     */
    public int getCredits() {
        return Credits;
    }
/**
 * this method sets the credits for a student
 * @param Credits 
 */
    public void setCredits(int Credits) {
        this.Credits = Credits;
    }
   
/**
 * this method gets the Gpa for a student
 * @return 
 */
    public double getGPA() {//here I am defining the getter function of the Gpa field variable for my Student class
        return GPA;
    }
/**
 * this method sets the gpa for a student
 * @param GPA 
 */
    public void setGPA( double GPA) {//here I am defining the setter function of the Gpa field variable for my Student class
        this.GPA = GPA;
    }
    
    /**
     * this method sets the Address for a student
     * @param address 
     */
    public void setAddress(String address) {//here I am creating the implemenation of the setAddress method 
        //which was inherited from the abstract human class 
        this.address = address;
    }
/**
 * this method gets the address for a student
 * @return 
 */
    public String getAddress() {//here I am creating the implemenation of the getAddress method 
        //which was inherited from the abstract human class 
        return address;
    }
      
       
	// ToDo 1: Make this class a child of Human done
	
	// ToDo 2: Fix the resulting errors done
	
	// ToDo 3: Add a field for GPA and create setter and getter done
	
	// ToDo 4: Add comments to your code done

}