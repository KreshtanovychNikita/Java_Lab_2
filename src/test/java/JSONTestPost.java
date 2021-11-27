import classes.Postavki;
import deserialize.JSONDeserialize;
import org.testng.annotations.Test;
import serialize.JSONSerialize;

import java.io.IOException;
import java.util.UUID;

import static org.testng.Assert.*;

public class JSONTestPost {

    @Test
    public void goodTest(){
        UUID uuid = UUID.randomUUID();
        UUID uuiddetal = UUID.randomUUID();
        Postavki postavki = new Postavki.Builder()
                .addIdPostavki(uuid)
                .addName("b")
                .addIdDetal(uuiddetal)
                .addDate()
                .build();

        JSONSerialize<Postavki> jsonSerialize = new JSONSerialize<>();
        String json = null;

        Postavki postavki1 = null;

        try {
            json = jsonSerialize.objToString(postavki);
            postavki1  = new JSONDeserialize<Postavki>(Postavki.class).stringToObj(json);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(json);
        assertEquals(postavki.toString(),postavki1.toString());


    }

}