package deserialize;

import classes.Proizvoditel;

import java.io.IOException;
import java.util.UUID;

public class TXTDeserializeProizvoditel implements MyDeserialize<Proizvoditel> {

    public Proizvoditel stringToObj(String str) throws IOException{
        Proizvoditel.Builder builder = new Proizvoditel.Builder();

        String[] mas = str.split("\n");
        var r = mas[0].split(":");
        if(mas[0].split(":")[1].equals("Proizvoditel")){
            for(var s: mas){
                addSomeValueToProizvoditel(builder,s.split(":"));
            }
        }
        return builder.build();
    }
    public void addSomeValueToProizvoditel(Proizvoditel.Builder builder, String[] arr){
        switch (arr[0]){
            case "ProizvoditelId":
                builder.addIdProizvoditel(UUID.fromString(arr[1]));
                break;
            case "PostavkiName":
                builder.addName(arr[1]);
                break;
            case "PhoneNumber":
                builder.addPhoneNumber(arr[1]);
                break;
            case "Country":
                builder.addCountry(arr[1]);
                break;
            default:
                break;
        }
    }

}