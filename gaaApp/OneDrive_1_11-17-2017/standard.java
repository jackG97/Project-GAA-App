
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
public class standard extends ticket{
     
    protected String standardExtra = "";
    
    public standard(String seatNum, int numTicket, double cost, String standardExtra, int teamChoice, int gameChoice){
        super(seatNum, numTicket, cost,teamChoice, gameChoice);
        this.standardExtra=standardExtra;
    }

    public String getStandardExtra() {
        return standardExtra;
    }

    public void setStandardExtra(String standardExtra) {
        this.standardExtra = standardExtra;
    }
    public void computeCost(){
        this.cost=cost*numTicket;
    }
    
    public String toString(){
        return super.toString() + "\nIncluded with the ticket: " + standardExtra;
    }
    
    
    
}
