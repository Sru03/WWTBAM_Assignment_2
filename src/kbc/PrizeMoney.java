/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kbc;
import java.util.*;
// new Branch for prize money created 
// new branch by varnika
/**
 *
 * @author Sonu
 */
public class PrizeMoney {
   // int [] Prizemoney ;//{100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 25000, 50000,100000, 250000, 500000,1000000};
    int number;
    int questionNo;
    int lm;
    int qn;
    int pv;
    int pi;
    int li;
    List<Integer> list ;
    
    public PrizeMoney(){
     this.number = 0;
     //this.Prizemoney = new Prizemoney[];
    // int [] Prizemoney = new int []{100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 25000, 50000,100000, 250000, 500000,1000000};
     this.questionNo = 0;
     //this.prizemoney = 0;
     this.list = new ArrayList<Integer>();
     this.list.add(100);
     this.list.add(200);
     this.list.add(300);
    }
    
    public int getQuestionNo( int n) {
    this.qn = (n/6)+1;
    this.questionNo = qn;
    this.number = n;
    return this.questionNo;
}
    
    
    public int getPrizeMoney(){
       this.pi = (this.questionNo)-1;
       this.pv = this.list.get(pi);
        return pv;
    }
    
    public int getLostMoney(){
        this.li = (this.pi)-1;
        if(li< 0) {
            this.lm = 0;
        } else {
            this.lm = this.list.get(li);
        }
        return lm;
    }
    
}
