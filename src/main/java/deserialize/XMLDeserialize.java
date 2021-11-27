package deserialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XMLDeserialize <T> implements MyDeserialize<T>{
    Class<T> cl;
    public XMLDeserialize(Class<T> t){ cl = t;}


    public T stringToObj(String str) throws IOException{
        ObjectMapper mapper = new XmlMapper();
        return mapper.readValue(str,cl);
    }
}
