/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adam.java.projects;

/**
 *
 * @author adam_solomon_home
 */
import java.util.Scanner;

public class Lab1Class {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);//here I am creating a new scanner input so that I can use user input in my program
    int User_int=input.nextInt();
    int[] list_of_User_ints=new int[User_int];
    for(int i=0;i<list_of_User_ints.length;i++){
        list_of_User_int[i]=i;
    }
int Lower_range=input.nextInt();
    int Upper_range=input.nextInt();
   
     for(int i=0;i<list_of_User_ints.length;i++){
        if( list_of_User_int[i]>Lower_range &&  list_of_User_int[i]<Upper_range)
        System.out.println(list_of_User_int[i]);
    }
    
    
}

}
