import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaveLoad {
    public String loadFrom(String pathandname)throws IOException {
        FileReader fileReader = new FileReader(pathandname);
        StringBuilder builder = new StringBuilder();
        int c;
        while ((c = fileReader.read())!=-1){
            builder.append(c);
        }
        return builder.toString();
    }
    public void saveInFile(String pathandname, String data) throws IOException{
        FileWriter fileWriter = new FileWriter(pathandname);
        fileWriter.write(data);
        fileWriter.flush();
        fileWriter.close();
    }

}
