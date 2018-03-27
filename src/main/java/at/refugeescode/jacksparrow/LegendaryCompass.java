package at.refugeescode.jacksparrow;

import java.util.Random;

public class LegendaryCompass {

    public String tellMeWhereisTheCoin() {
        Coin coin = new Coin();
        if (coin.GetTheCoin().isPresent()){
            return "i found the Coin";
        }
        return "i didnt find the coin ";

    }
}
