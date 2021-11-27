
import classes.Postavki;
import deserialize.TXTDeserializePostavki;
import org.testng.annotations.Test;
import serialize.TXTSerializePostavki;

import java.io.IOException;
import java.util.UUID;

import static org.testng.Assert.*;

public class TXTPostavkiTest {
    @Test
    public void goodTest(){
        UUID uuid = UUID.randomUUID();
        UUID uuiddetali = UUID.randomUUID();
        Postavki postavki = new Postavki.Builder()
                .addIdPostavki(uuid)
                .addName("b")
                .addDate()
                .addIdDetal(uuiddetali)
                .build();

        String txt = null;
        Postavki res = null;
        try {
            txt = new TXTSerializePostavki().objToString(postavki);
            res = new TXTDeserializePostavki().stringToObj(txt);

        }catch (IOException e){
            e.printStackTrace();
        }
        assertEquals(postavki.toString(),res.toString());
    }

}