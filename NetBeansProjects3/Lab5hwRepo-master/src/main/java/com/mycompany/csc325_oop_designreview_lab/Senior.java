/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author adam_solomon_home
 */
class Senior extends Student {

    /**
     * this method is where we overload the default Senior Constructor and give parameters for name,age and credits
     * @param name
     * @param age
     * @param Credits 
     */
    public Senior(String name, short age, int Credits) {
        super(name, age, Credits);
        if(Credits>85){//this will check if the student has enough crdits in order to be considered as a senior
            System.out.println ("not a senior");
            System.out.println("Credits must be minumium 85 credits");
        }
    }
        /**
         * here we are overriding the toString method of the Senior class with the parent Student class's implementation in order to print out all of the student's information
         * @return 
         */
   @Override
    public String toString() {
        return "Stduent Info "+super.toString();//here we print out all the information I associated with a student
    }
    
  
    }
    
    
