package serialize;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface MySerialize<T> {
     String objToString(T t) throws IOException;
}
