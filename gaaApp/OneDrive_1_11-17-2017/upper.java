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
public class upper extends ticket{
    
    protected String upperExtra = "";
    
    public upper(String seatNum, int numTicket, double cost, String upperExtra, int teamChoice,int gameChoice){
        super(seatNum, numTicket, cost, teamChoice, gameChoice);
        this.upperExtra=upperExtra;
    }

    public String getUpperExtra() {
        return upperExtra;
    }

    public void setUpperExtra(String upperExtra) {
        this.upperExtra = upperExtra;
    }
    public void computeCost(){
        this.cost=cost*numTicket;
    }
    
    public String toString(){
        return super.toString() + "\nIncluded with the ticket: " + upperExtra;
    }
    
}
