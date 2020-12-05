package day37_CustomClass;

import java.time.LocalDate;

public class Player {

    public String  playerName, playerPositions;
    public String teamName;
    public int playerNumber, playerAge;
    public double playerRating, playerValue;
    public LocalDate dateOfBirth;



    public void setInfo(String teamName, String playerName, String playerPositions, int playerNumber, LocalDate dateOfBirth, double playerRating, double playerValue){

        this.teamName = teamName;
        this.playerName = playerName;
        this.playerPositions = playerPositions;
        this.playerNumber = playerNumber;
        this.playerAge = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.playerRating = playerRating;
        this.playerValue = playerValue;
        this.dateOfBirth = dateOfBirth;

    }


    public void getInfo(){

        System.out.println("Team: " + teamName + "\nName: " + playerName + "\nPosition: " + playerPositions + "\nJersey Number: "  + playerNumber + "\nAge: " + playerAge + "\nRating: " + playerRating + "\nValue: " + playerValue);

    }


}


