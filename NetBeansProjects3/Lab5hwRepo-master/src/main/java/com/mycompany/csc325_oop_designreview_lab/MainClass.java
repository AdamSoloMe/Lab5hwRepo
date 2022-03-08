/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        // ToDo 5: Fix the errors done

        // ToDo 6: Fix the constructor of Student class done
        // Todo 7: Create two classes for Freshman and Senior done
        // ToDo 8: The senior class should have a minimum of 85 credits  done
        // ToDo 9: Add a toString method for Freshman class done
        // ToDo 10: Add a toString method for Senior class done
        
        //here I am creating 2 student objects to reprenest a freshman student and a 
        Student std1 = new Freshman("James", (short) 20, 12); // name, age, credits

        Student std2 = new Senior("John", (short) 30, 90);

        // ToDo 11: Set the gpa of the student using the scanner and user
        // 			input and then print the output.
        
        Scanner mystudentinfo = new Scanner(System.in);//I am defining a scanner variable so that I can enter the Gpa information for my student objects
        System.out.println("Please enter a gpa: ");
        double gpa = mystudentinfo.nextDouble();//this double gpa variable is where i store the gpa I wll enter for Second student
        if (gpa > 0 && gpa <= 4) {//this is a valiadtion check to make sure that the user will enter a vaild gpa otherwise the gpa will not be considered as valid 
            System.out.println("vaild GPA");
        } else {
            System.out.println("not valid");
        }
        std1.setGPA(gpa);//here I where i set the gpa for my first student
        std1.setAddress("420 woodsbro avenue");//here is where I set the address for my First student

        System.out.println("Please enter a gpa");
        double gpa2 = mystudentinfo.nextDouble();//this double gpa2 variable is where i store the gpa I wll enter for my seonnd Student
        if (gpa2 > 0 && gpa2 <= 4) {//this is a antoher validation check for my second student to make sure that the user will enter a vaild gpa otherwise the gpa will not be considered as valid 
            System.out.println("vaild GPA");
        } else {
            System.out.println("not valid");
        }
        std2.setGPA(gpa2);///here I where i set the gpa for my Second student
        std2.setAddress("1600 Pensyalvanina avenue");//here is where I set the address for my Second student

        System.out.println(std1);//here is where I print all of the info for my first studnet

        System.out.println(std2);// here is where I print all of the info for my second student

        // ToDo 12: add comments and explain your code done
        // ToDo 13: submit using a pull request.
    }

}
