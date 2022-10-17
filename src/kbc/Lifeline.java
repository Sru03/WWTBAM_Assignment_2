/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kbc;

import java.util.Scanner;

/**
 *
 * @author Sonu
 */
public class Lifeline {
    
   private  int numberOfLifelines;
   private String answer;
     
     public Lifeline(int numberOfLifelines, String answer){
     this.setLifeLine(numberOfLifelines);
     this.setAnswer(answer);
     }
     
     public int getLifeLine(){
     return this.numberOfLifelines;}
     
     public void setLifeLine(int numberOfLifelines){
     this.numberOfLifelines = numberOfLifelines;}
     
     public String getAnswer(){
         return this.answer;
     }
     
     public void setAnswer(String answer){
         this.answer = answer;
     }
     public void UseLifeline(){
     System.out.println("Do you want to use a Lifeline ( Y/N) ");
     Scanner scan = new Scanner (System.in);
     String choice = "abc";
     while(choice!= null)
     {
      choice = scan.nextLine();
     choice = choice.toUpperCase();
     switch(choice){
         case "Y" -> {
             if(this.getLifeLine()>0)
             { System.out.println("Expert says answer is "+ this.getAnswer() );
             choice = null;
             int noOfLifeline = 0; // changes added 
              noOfLifeline--;      // changes added
             }
             else
             {System.out.println("Sorry no more lifelines left");
             choice = null;}
             }
         case "N" -> {choice = null;
             }
         default -> System.out.println("Please enter valid input(Y/N)");
             
     }
     }
     
     
     
      
     }
    
     }
    

