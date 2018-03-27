package at.refugeescode.jacksparrow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegendaryCompassTest {
    private LegendaryCompass legendaryCompass;
    @BeforeEach
    void makeThingsReady(){
        legendaryCompass = new LegendaryCompass();
    }
    @Test
    void tellMeWhereisTheCoin() {
        String result = legendaryCompass.tellMeWhereisTheCoin();
        String expacted = "i found the Coin";
        Assertions.assertEquals(expacted,result);



    }
}