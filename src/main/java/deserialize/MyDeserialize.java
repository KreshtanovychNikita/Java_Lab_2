package deserialize;

import java.io.IOException;

public interface MyDeserialize<T> {
    T stringToObj(String str) throws IOException;
}
