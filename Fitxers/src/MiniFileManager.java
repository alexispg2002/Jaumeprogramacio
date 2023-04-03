import java.io.File;

public class MiniFileManager {

    private File ruta = new File(System.getProperty("user.home"));


    public String getPWD(){
        return "Hola";
    }

    public boolean changeDir(String dir){
        return false;
    }

    public void printLint(boolean info){

    }
}
