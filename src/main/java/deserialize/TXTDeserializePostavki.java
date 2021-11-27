package deserialize;

import classes.Postavki;

import java.io.IOException;
import java.util.UUID;

public class TXTDeserializePostavki implements MyDeserialize<Postavki> {

    public Postavki stringToObj(String str) throws IOException{
        Postavki.Builder builder = new Postavki.Builder();

        String[] mas = str.split("\n");
        var r = mas[0].split(":");
        if(mas[0].split(":")[1].equals("Postavki")){
            for(var s: mas){
                addSomeValueToPostavki(builder,s.split(":"));
            }
        }
        return builder.build();
    }
    public void addSomeValueToPostavki(Postavki.Builder builder, String[] arr){
        switch (arr[0]){
            case "PostavkiId":
                builder.addIdPostavki(UUID.fromString(arr[1]));
                break;
            case "PostavkiName":
                builder.addName(arr[1]);
                break;
            case "DatePostavki":
                builder.addDate();
                break;
            case "DetalId":
                builder.addIdDetal(UUID.fromString(arr[1]));
                break;
            default:
                break;
        }
    }

}