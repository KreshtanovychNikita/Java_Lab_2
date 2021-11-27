package deserialize;

import classes.Detal;

import java.io.IOException;
import java.util.UUID;

public class TXTDeserializeDetal implements MyDeserialize<Detal> {

    public Detal stringToObj(String str) throws IOException{
        Detal.Builder builder = new Detal.Builder();

        String[] mas = str.split("\n");
         var r = mas[0].split(":");
        if(mas[0].split(":")[1].equals("Detal")){
            for(var s: mas){
                addSomeValueToDetal(builder,s.split(":"));
            }
        }
        return builder.build();
    }
    public void addSomeValueToDetal(Detal.Builder builder, String[] arr){
        switch (arr[0]){
            case "DetalId":
                builder.addIdDetal(UUID.fromString(arr[1]));
                break;
            case "DetalName":
                builder.addName(arr[1]);
                break;
            case "DetalArticul":
                builder.addArticul(Integer.parseInt(arr[1]));
                break;
            case "DetalPrice":
                builder.addPrice(Float.parseFloat(arr[1]));
                break;
            case "DetalIdProizvoditel":
                builder.addIdProizvoditel(UUID.fromString(arr[1]));
                break;
            default:
                break;
        }
    }

}
