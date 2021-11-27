package deserialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;

public class JSONDeserialize<T> implements MyDeserialize<T> {
    Class<T> cl;
    public JSONDeserialize(Class<T> t){ cl = t;}

    public T stringToObj(String str) throws IOException {
        ObjectMapper mapper = new JsonMapper();
        return mapper.readValue(str,cl);
    }
}
