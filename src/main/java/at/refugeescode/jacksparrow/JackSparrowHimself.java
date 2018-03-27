package at.refugeescode.jacksparrow;

import org.springframework.stereotype.Component;

@Component
public class JackSparrowHimself {

    private LegendaryCompass legendaryCompass;

    public JackSparrowHimself(LegendaryCompass legendaryCompass){
        this.legendaryCompass = legendaryCompass;
    }

    public void main() {

        String result = legendaryCompass.tellMeWhereisTheCoin();

        System.out.println(result);

    }
}
