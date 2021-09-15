/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author adam_solomon_home
 */
public class NewClass {
     //to call the method from the class you have to make it static
    //otherwise you have to create an object from this class and then call the method using the object
     int return_Largest_array(int[] Sample_array) {//if you pass as an Array as a parameter you do not need to give it a size
        int max_number = Sample_array[0];
        int array_index = 0;
        while(array_index<Sample_array.length){
            if (Sample_array[array_index]>max_number){
                max_number=Sample_array[array_index];
            }
            array_index++;
        }
        return max_number;

    }
    public static void main(String[] args){
         largest_array ArrayObj1=new largest_array();//here I am creating an object from my largest array class
        int[] arr={1,2,3,6,7,8,9};
        //here I am calling the Retuen largest array method from my object
        int Max_number= ArrayObj1.return_Largest_array(arr);
        //this is how you call the method if it is static
       // int Max_number=return_Largest_array(arr);
        System.out.println("The max is "+Max_number);
    }

}
