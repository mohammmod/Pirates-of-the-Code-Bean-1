package at.refugeescode.jacksparrow;

import java.util.Optional;

public class Coin {
    public Optional<Coin> GetTheCoin(){
        Optional <Coin> coin = Optional.of(new Coin());
        return coin;
    }
}
