package serialize;

import classes.Proizvoditel;

public class TXTSerializeProizvoditel implements MySerialize<Proizvoditel> {
    public String objToString(Proizvoditel proizvoditel){
        StringBuilder builder = new StringBuilder();
        builder.append("class:Proizvoditel\n");
        builder.append("ProizvoditelId:"+proizvoditel.getId()+"\n");
        builder.append("NameProizvoditel:"+proizvoditel.getName()+"\n");
        builder.append("PhoneNumber:"+proizvoditel.getPhoneNumber()+"\n");
        builder.append("Country:"+proizvoditel.getCountry()+"\n");

        return builder.toString();
    }

}