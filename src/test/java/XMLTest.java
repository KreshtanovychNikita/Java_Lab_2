import classes.Detal;
import deserialize.XMLDeserialize;
import org.testng.annotations.Test;
import serialize.XMLSerialize;

import java.io.IOException;
import java.util.UUID;

import static org.testng.Assert.*;

public class XMLTest {

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

        XMLSerialize<Detal> xmlSerialize = new XMLSerialize<>();
        String xml = null;

        Detal detal1 = null;

        try {
            xml = xmlSerialize.objToString(detal);
            detal1  = new XMLDeserialize<Detal>(Detal.class).stringToObj(xml);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(xml);
        assertEquals(detal.toString(),detal1.toString());


    }

}