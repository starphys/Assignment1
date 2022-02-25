package edu.sjsu.assignment1;

public class Card {
    private String suitRank;
    private String description;
    private static final String UNKNOWN = "Unknown";

    public Card(String suitRank) {
        //Assume input is always valid
        if (suitRank.length() > 3 || suitRank.length() < 2) {
            this.suitRank = UNKNOWN;
        } else {
            this.suitRank = suitRank;
        }
        setDescription();
    }

    private void setDescription() {
        if(suitRank.equals(UNKNOWN)) {
            description = suitRank;
            return;
        }
        //Get suit
        String suit = getSuit();
        if(suit.equals(UNKNOWN)) {
            description = suit;
            return;
        }
        //Get rank
        String rank = getRank();
        if(rank.equals(UNKNOWN)) {
            description = rank;
            return;
        }

        //Return results
        description = rank + " of " + suit;
    }

    public String getDescription() {
        return description;
    }

    private String getSuit() {

        //TODO: extract suit from suitRank
        //Last digit is always suit, so compare here and return in words
        String suit = suitRank.substring(suitRank.length()-1);
        switch(suit) {
            case "D":
                return "Diamonds";
            case "H":
                return "Hearts";
            case "S":
                return "Spades";
            case "C":
                return "Clubs";
            default:
                return UNKNOWN;
        }
    }

    private String getRank() {

        //TODO: extract rank from suitRank
        //First digit or two is rank, so check validity and return in words
        String rank = suitRank.substring(0,suitRank.length()-1);
        switch(rank) {
            case "A":
                return "Ace";
            case "1":
                return "One";
            case "2":
                return "Two";
            case "3":
                return "Three";
            case "4":
                return "Four";
            case "5":
                return "Five";
            case "6":
                return "Six";
            case "7":
                return "Seven";
            case "8":
                return "Eight";
            case "9":
                return "Nine";
            case "10":
                return "Ten";
            case "J":
                return "Jack";
            case "Q":
                return "Queen";
            case "K":
                return "King";
            default:
                return UNKNOWN;
        }
    }
}
