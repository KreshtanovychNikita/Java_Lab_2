
import classes.Proizvoditel;
import deserialize.TXTDeserializeProizvoditel;
import org.testng.annotations.Test;
import serialize.TXTSerializeProizvoditel;

import java.io.IOException;
import java.util.UUID;

import static org.testng.Assert.*;

public class TXTProizvoditelTest {
    @Test
    public void goodTest(){
        UUID uuid = UUID.randomUUID();
        Proizvoditel proizvoditel = new Proizvoditel.Builder()
                .addIdProizvoditel(uuid)
                .addName("c")
                .addPhoneNumber("+123")
                .addCountry("ua")
                .build();

        String txt = null;
        Proizvoditel res = null;
        try {
            txt = new TXTSerializeProizvoditel().objToString(proizvoditel);
            res = new TXTDeserializeProizvoditel().stringToObj(txt);

        }catch (IOException e){
            e.printStackTrace();
        }
        assertEquals(proizvoditel.toString(),res.toString());
    }

}