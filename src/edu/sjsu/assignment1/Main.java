package edu.sjsu.assignment1;

public class Main {

    public static void main(String[] args) {
        String midnight = "0000", noon = "1200", wakeup = "0831", sleep = "2253";

        MyTime.printTimeDifference(midnight, noon);
        MyTime.printTimeDifference(noon, midnight);
        MyTime.printTimeDifference(midnight, wakeup);
        MyTime.printTimeDifference(midnight, sleep);
        MyTime.printTimeDifference(sleep, wakeup);
        MyTime.printTimeDifference(noon, noon);

        MyTime.printTimeDifference("0120", "1510");
        MyTime.printTimeDifference("1635", "0250");

        Card card1 = new Card("10S");
        String fullDescription = card1.getDescription();
        System.out.println(fullDescription);

        Card card2 = new Card("QC");
        fullDescription = card2.getDescription();
        System.out.println(fullDescription);

        Card card3 = new Card("11H");
        fullDescription = card3.getDescription();
        System.out.println(fullDescription);

        Card card4 = new Card("AH");
        fullDescription = card4.getDescription();
        System.out.println(fullDescription);
    }


}
