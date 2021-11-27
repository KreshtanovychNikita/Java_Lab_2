import classes.Postavki;
import classes.Proizvoditel;
import deserialize.JSONDeserialize;
import org.testng.annotations.Test;
import serialize.JSONSerialize;

import java.io.IOException;
import java.util.UUID;

import static org.testng.Assert.*;

public class JSONTestProizv {

    @Test
    public void goodTest(){
        UUID uuid = UUID.randomUUID();
        Proizvoditel proizvoditel = new Proizvoditel.Builder()
                .addIdProizvoditel(uuid)
                .addName("c")
                .addCountry("ua")
                .addPhoneNumber("+123")
                .build();

        JSONSerialize<Proizvoditel> jsonSerialize = new JSONSerialize<>();
        String json = null;

        Proizvoditel proizvoditel1 = null;

        try {
            json = jsonSerialize.objToString(proizvoditel);
            proizvoditel1  = new JSONDeserialize<Proizvoditel>(Proizvoditel.class).stringToObj(json);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(json);
        assertEquals(proizvoditel.toString(),proizvoditel1.toString());


    }

}