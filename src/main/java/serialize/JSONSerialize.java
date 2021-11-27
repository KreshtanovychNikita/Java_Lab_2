package serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;

public class JSONSerialize<T> implements MySerialize<T> {
    public String objToString(T t) throws JsonProcessingException {
        ObjectMapper mapper = new JsonMapper();
        return mapper.writeValueAsString(t);
    }
}
