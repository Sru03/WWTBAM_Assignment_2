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

    int questionNo;
    int presentValue;
    int presentIndex;
    List<Integer> list;

    public PrizeMoney() {

        this.questionNo = 0;

        this.list = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 25000, 50000, 100000, 250000, 500000, 1000000));
    }

    public int getQuestionNo(int n) {
        this.questionNo = (n / 6) + 1;

        return this.questionNo;
    }

    public int getPrizeMoney() {
        this.presentIndex = (this.questionNo) - 1;
        this.presentValue = this.list.get(presentIndex);
        return presentValue;
    }

    public int getLostMoney() {
        int lostMoneyIndex = this.presentIndex - 1;
        if (lostMoneyIndex >= 0) {
            return this.list.get(lostMoneyIndex);
        }
        return 0;
    }

}
