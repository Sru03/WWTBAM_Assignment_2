/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kbc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sonu
 */
public class Game {

    public String player_id;

    Game(String playerId) {
        this.setPlayer_Id(playerId);

    }

    public String getPlayer_Id() {
        return this.player_id;
    }

    public void setPlayer_Id(String player_id) {
        this.player_id = player_id;
    }

    public void idsetter() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("src/kbc/GameFile.txt", true));
            String str = this.getPlayer_Id();

            // String line = Files.readAllLines(Paths.get("src/kbc/GameFile.txt")).get(n);
            // while (line != null)
            //  System.out.println(line);
            /*  {
                while (PlayerId.equals(line)) {
                    System.out.println("ID Already taken");
                    
                }
                n = n + 3;
            }*/
            out.append(str);
            out.append('\n');
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
        } catch (IOException ex) {
            System.out.println("exception");
        }

    }
    
    public void idmatcher(){
        
        try {
           int n= 0;
           String str = this.getPlayer_Id();
           BufferedReader br = new BufferedReader(new FileReader("src/kbc/GameFile.txt"));
           String line = null;
           while((line=br.readLine())!=null)
            {
                while(str.equals(line))
                {
                    System.out.println("ID Already taken. Enter a unique id:");
                    Scanner input = new Scanner(System.in);
                    str = input.nextLine();
                    this.setPlayer_Id(str);
                    
                }
                n++;
                        
            }
        } catch (IOException ex) {
            System.out.println("FileNotFound");
        }
    }

}
