package lab12.lab12.src.main.java.ua.edu.ucu.apps.Task1;

public class ATM {
    private CoinHandler coinHandler;

    public ATM() {
        coinHandler = new CoinHandler1();
        coinHandler = new CoinHandler5();
        coinHandler = new CoinHandler10();
    }

    public void provideChange(int amount) {
        Coin coin = new Coin(amount);
        coinHandler.handleRequest(coin, amount);
    }
}