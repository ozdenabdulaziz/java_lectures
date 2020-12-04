package day37_CustomClass;

import java.time.LocalDate;

public class Player {

    public String playerTeam, playerName, playerPositions;
    public int playerNumber, playerAge;
    public double playerRating, playerValue;
    public LocalDate dateOfBirth;



    public void setInfo(String playerTeam, String playerName, String playerPositions, int playerNumber, LocalDate dateOfBirth, double playerRating, double playerValue){

        this.playerName = playerName;
        this.playerPositions = playerPositions;
        this.playerNumber = playerNumber;
        playerAge = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.playerRating = playerRating;
        this.playerValue = playerValue;
        this.dateOfBirth = dateOfBirth;

    }

    public void getInfo(){

        System.out.println("Team: " + playerTeam + "\nName: " + playerName + "\nPosition: " + playerPositions + "\nJersey Number: "  + playerNumber + "\nAge: " + playerAge + "\nRating: " + playerRating + "\nValue: " + playerValue);

    }


    @Override
    public String toString() {
        return "Player{" +
                "playerTeam='" + playerTeam + '\'' +
                ", playerName='" + playerName + '\'' +
                ", playerPositions='" + playerPositions + '\'' +
                ", playerNumber=" + playerNumber +
                ", playerAge=" + playerAge +
                ", playerRating=" + playerRating +
                ", playerValue=" + playerValue +
                '}';
    }
}


