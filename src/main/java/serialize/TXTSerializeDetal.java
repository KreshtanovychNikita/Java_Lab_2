package serialize;

import classes.Detal;

public class TXTSerializeDetal implements MySerialize<Detal> {
    public String objToString(Detal detal){
        StringBuilder builder = new StringBuilder();
        builder.append("class:Detal\n");
        builder.append("DetalId:"+detal.getId()+"\n");
        builder.append("DetalName:"+detal.getName()+"\n");
        builder.append("DetalArticul:"+detal.getArticul()+"\n");
        builder.append("DetalPrice:"+detal.getPrice()+"\n");
        builder.append("DetalIdProizvoditel:"+detal.getIdProizvoditel()+"\n");
        return builder.toString();
    }

}
