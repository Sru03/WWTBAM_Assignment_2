package kbc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileReader;

/*
 */
 /*PDC Assignment 1 
 *Group 20 
 * Varnika Bansal 22158598 and Srushti Madaiah Basavaraju 19092262
 */
public class WwtbamMain {

    public static void main(String[] args) {
        
        new WWTBM_LoginGui().setVisible(true);
        
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to WHO WANTS TO BE A MILLIONAIRE!!");
        System.out.println("choose one of the following");
        System.out.println("1.Start a new game 2.Rules 3.Exit");
        int x = scan.nextInt();// to scan user input 
        while (x > 0) {
            switch (x) {
                case 1: //start a new game
                    System.out.println("Please enter a new unique game id: "); 
                    Scanner input = new Scanner(System.in); 
                    String id = input.nextLine(); //takes in unique gamer id
                    Game a = new Game(id);
                    a.idmatcher(); // matches the game id with the pre existing game id and check if entered id is unique or not 
                    a.idsetter();  // saves the game id if it is not already taken 
                    System.out.println("Game start");
                    int noOfLifeline = 3; // Number of lifelines available in this game 
                    int n = 0; //variable for the number of lines in the QUestion text file that is going to be read from
                    boolean check = true;
                    PrizeMoney pm = new PrizeMoney(); // to get the Prize amount 
                    String answer = ""; //variable that  stores the right answer
                    String ans = "";  // answer entered by the user or Player
                    String cont = "abc";

                    try {
                        while (check == true) {
                            System.out.print("Here is your question ");
                            System.out.print(pm.getQuestionNo(n) + " for $");
                            System.out.println(pm.getPrizeMoney());

                            String Question = Files.readAllLines(Paths.get("src/kbc/questions.txt")).get(n); //reads the lines in the Questions text file with the count n.
                            System.out.println(Question); 
                            n++;
                            // this for loop prints the Question and its options together 
                            for (int i = 0; i < 4; i++) {
                                String options = Files.readAllLines(Paths.get("src/kbc/questions.txt")).get(n);
                                System.out.println(options);
                                n++;
                            }
                            answer = Files.readAllLines(Paths.get("src/kbc/questions.txt")).get(n); // reads the line which has the right answer and stores it in answer variable
                            Lifeline lifeline = new Lifeline(noOfLifeline, answer); // gives user an option of using the lifeline
                            lifeline.UseLifeline();//displayes the right answer
                           // noOfLifeline--; // keeps the count on how many lifelines are left
                            System.out.println("PLEASE ENTER THE ANSWER (A/B/C/D)");

                            // Scanner continue = new Scanner(System.in);
                            ans = input.nextLine(); // takes in user input 
                            if (ans.equalsIgnoreCase(answer)) {
                                System.out.print("Congratulations! Your answer is correct! Your total winning amount is $"); // if user entered right ans
                                System.out.println(pm.getPrizeMoney());
                                if (pm.questionNo == 15) {
                                    System.out.println("Congratulations you have become a millionaire!!"); // when user gets all the Questions right
                                }
                                System.out.println("Do You Want To Continue (Y/N): "); // gives user the option to continue to next question or quit the game
                                cont = "abc";
                                while (cont != null) {
                                    cont = input.nextLine();
                                    cont = cont.toUpperCase();
                                    switch (cont) {
                                        case "Y" :
                                            cont = null; // it is not leading back to the 2nd Ques 
                                        case "N" :
                                            System.exit(0);
                                        default :
                                            System.out.println("Please enter valid input(Y/N)");
                                            // number of lifelines needs to be fixed 
                                            

                                    }
                                }
                                n++;

                            } else {
                                System.out.print("Sorry incorrect answer! You Lose the game! You only won $"); // when user enters incorrect answer
                                System.out.println(pm.getLostMoney()); // it displayes the prize amount for the questions that were correct

                                check = false;
                            }
                        }

                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    x = 0;
                    break;

                case 2: // to open the RULE BOOK of the game 
                    int choose;

                    try {
                        FileReader fr = new FileReader("src/kbc/rule.txt"); // instantiating file reader and adding address of the file path 
                        BufferedReader br = new BufferedReader(fr);
                        String line = null;
                        while ((line = br.readLine()) != null) { //checks if the next line is null or not and prints untill it is null
                            System.out.println(line);
                        }

                        br.close();
                        System.out.println("Choose one of the following: 1.Start a new game 2. Exit from game");
                        Scanner choice = new Scanner(System.in);
                        String opt = "abc";
                        while (opt != null) {
                            choose = choice.nextInt();
                            switch (choose) {
                                case 1:
                                    x = 1;
                                    opt = null;
                                    break;
                                case 2:
                                    x = 3;
                                    opt = null;
                                    break;
                                default:
                                    System.out.println("Enter option 1 or 2:");
                            }
                        }

                    } catch (FileNotFoundException e) {
                        System.out.println("File not found");
                    } catch (IOException e) {
                        System.out.println("Error reading from file rule");
                    }

                    break;
                case 3:
                    //exit the game 
                    System.exit(0);
                default:
                    break;
            }
        }

    }
}
