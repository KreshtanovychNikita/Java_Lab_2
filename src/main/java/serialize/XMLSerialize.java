package serialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XMLSerialize<T> implements  MySerialize<T>{

      public String objToString(T t) throws IOException{
          ObjectMapper mapper = new XmlMapper();
          return mapper.writeValueAsString(t);
      }

}
