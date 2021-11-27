import classes.Detal;
import deserialize.TXTDeserializeDetal;
import org.testng.annotations.Test;
import serialize.TXTSerializeDetal;

import java.io.IOException;
import java.util.UUID;

import static org.testng.Assert.*;

public class TXTDetalTest {
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

        String txt = null;
        Detal res = null;
        try {
            txt = new TXTSerializeDetal().objToString(detal);
            res = new TXTDeserializeDetal().stringToObj(txt);

        }catch (IOException e){
            e.printStackTrace();
        }
        assertEquals(detal.toString(),res.toString());
    }

}