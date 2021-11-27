package serialize;

import classes.Postavki;

public class TXTSerializePostavki implements MySerialize<Postavki> {
    public String objToString(Postavki postavki){
        StringBuilder builder = new StringBuilder();
        builder.append("class:Postavki\n");
        builder.append("PostavkiId:"+postavki.getIdp()+"\n");
        builder.append("PostavkiName:"+postavki.getName()+"\n");
        builder.append("DatePostavki:"+postavki.getDate()+"\n");
        builder.append("DetalId:"+postavki.getIdDetal()+"\n");

        return builder.toString();
    }

}