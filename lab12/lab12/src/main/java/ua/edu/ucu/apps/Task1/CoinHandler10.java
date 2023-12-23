package lab12.lab12.src.main.java.ua.edu.ucu.apps.Task1;

public class CoinHandler10 extends CoinHandler {
    private int denomination = 10;

    @Override
    public void handleRequest(Coin coin, int remainingAmount) {
        if (coin.getDenomination() == denomination) {
            if (remainingAmount >= denomination) {
                System.out.println("Providing change for " + coin.getDenomination());
            } else {
                System.out.println("Not enough coins of denomination " + denomination);
                passToNextHandler(coin, remainingAmount);
            }
        } else {
            passToNextHandler(coin, remainingAmount);
        }
    }
}