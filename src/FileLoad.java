import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileLoad {
    private String path;
    private BufferedReader br;
    private File file;

    public FileLoad(String path) throws Exception {
        file=new File(path);
        br=new BufferedReader(new FileReader(file));
    }
}
