import classes.Detal;
import deserialize.JSONDeserialize;
import org.testng.annotations.Test;
import serialize.JSONSerialize;

import java.io.IOException;
import java.util.UUID;

import static org.testng.Assert.*;

public class JSONTest {

    @Test
    public void goodTest(){
        UUID uuid = UUID.randomUUID();
        UUID uuidproizvoditel = UUID.randomUUID();
        Detal detal = new Detal.Builder()
                .addIdDetal(uuid)
                .addArticul(1)
                .addName("a")
                .addPrice(1)
                .addIdProizvoditel(uuidproizvoditel)
                .build();

        JSONSerialize<Detal> jsonSerialize = new JSONSerialize<>();
        String json = null;

        Detal detal1 = null;

        try {
            json = jsonSerialize.objToString(detal);
            detal1  = new JSONDeserialize<Detal>(Detal.class).stringToObj(json);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(json);
        assertEquals(detal.toString(),detal1.toString());


    }

}