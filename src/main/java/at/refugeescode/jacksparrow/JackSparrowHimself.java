package at.refugeescode.jacksparrow;

import org.springframework.stereotype.Component;

@Component
public class JackSparrowHimself {
    public void main() {
        LegendaryCompass legendaryCompass = new LegendaryCompass();
        String result = legendaryCompass.tellMeWhereisTheCoin();
        System.out.println(result);

    }
}
