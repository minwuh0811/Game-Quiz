import java.io.*;

public class DataToTxt implements FileSave {

    Writer fw;

    public DataToTxt(Writer fw){
        this.fw=fw;
    }


    public void writeFile(String str) {
        try {
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
