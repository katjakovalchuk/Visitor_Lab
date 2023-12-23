package lab12.lab12.src.main.java.ua.edu.ucu.apps.Task1;

public abstract class CoinHandler {
    private CoinHandler nextHandler;

    public void setNextHandler(CoinHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Coin coin, int remainingAmount);

    protected void passToNextHandler(Coin coin, int remainingAmount) {
        if (nextHandler != null) {
            nextHandler.handleRequest(coin, remainingAmount);
        } else {
            System.out.println("Not enough money in the ATM");
        }
    }
}
