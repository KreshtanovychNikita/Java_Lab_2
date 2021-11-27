package deserialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;

public class JSONDeserialize<T> implements MyDeserialize<T> {
    Class<T> cl;
    public JSONDeserialize(Class<T> t){ cl = t;}

    public T stringToObj(String str) throws IOException {
        ObjectMapper mapper = new JsonMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper.readValue(str,cl);
    }
}
