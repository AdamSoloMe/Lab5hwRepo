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

    public Senior(String name, short age, int Credits) {
        super(name, age, Credits);
        if(Credits>85){
            System.out.println("Credits must be minumium 85 credits");
        }
  
    }
    
    
}
