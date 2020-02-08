/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author x01420442
 */
public class premuim extends ticket{
    
    protected String premuimExtra = "";
    
    public premuim(String seatNum, int numTicket, double cost, String premuimExtra, int teamChoice,int gameChoice){
        super(seatNum, numTicket, cost, teamChoice, gameChoice);
        this.premuimExtra=premuimExtra;
    }

    public String getPremuimExtra() {
        return premuimExtra;
    }

    public void setPremuimExtra(String premuimExtra) {
        this.premuimExtra = premuimExtra;
    }
    public void computeCost(){
        this.cost=cost*numTicket;
    }
    
    public String toString(){
        return super.toString() + "\nIncluded with the ticket: " + premuimExtra;
    }
    
    
}
