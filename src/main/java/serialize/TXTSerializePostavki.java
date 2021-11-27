package serialize;

import classes.Postavki;

public class TXTSerializePostavki implements MySerialize<Postavki> {
    public String objToString(Postavki postavki){
        StringBuilder builder = new StringBuilder();
        builder.append("class:Postavki\n");
        builder.append("PostavkaId:"+postavki.getIdp()+"\n");
        builder.append("NamePostavki:"+postavki.getName()+"\n");
        builder.append("DatePostavki:"+postavki.getDate()+"\n");
        builder.append("IdDetalPostavki:"+postavki.getIdDetal()+"\n");

        return builder.toString();
    }

}