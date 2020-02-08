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
public class ticket {
    protected String seatNum = "";
    protected int numTicket = 0;
    protected String [] team = new String [4];
    protected int teamChoice = 0;
    protected String [] gameType = new String [2];
    protected int gameChoice = 0;
    protected double cost = 0.0;
    
    
    
    public ticket(String seatNum, int numTicket, double cost, int teamChoice,int gameChoice){
        this.seatNum=seatNum;
        this.numTicket=numTicket;
        this.cost=cost;
        this.teamChoice=teamChoice;
        this.gameChoice=gameChoice;
        team [0]= "Dublin";
        team [1]= "Cork";
        team [2]= "Galway";
        team [3]= "Meath";
        team [4]= "Belfast";
        gameType [0]="Home";
        gameType [1]="Away";
        gameType [2]="Friendly";
    }
    
    public String toString(){
        return "Game Details:\nMatch: "+team[teamChoice]+" "+gameType[gameChoice]+" game.\nSeat number: " + seatNum +"\nNumber of tickets: "+numTicket+"\nCost of tickets: "+cost;
    }
    
    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTeamChoice() {
        return teamChoice;
    }

    public void setTeamChoice(int teamChoice) {
        this.teamChoice = teamChoice;
    }

    public int getGameChoice() {
        return gameChoice;
    }

    public void setGameChoice(int gameChoice) {
        this.gameChoice = gameChoice;
    }
    
    
    
    
}
