
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class Exercici1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String ruta="";
        do{
            try {
                System.out.println("*********************");
                System.out.println("Introdueix una ruta: ");
                System.out.println("*********************");
                System.out.print("Ruta =");
                ruta=src.nextLine();

                if(!ruta.equals("")){
                    File nouFitxer = new File(ruta);
                    mostraInfoRuta(nouFitxer, true);
                }
            }catch (FileNotFoundException e){
                System.out.println(e);
            }

        }while(!ruta.equals(""));
    }
    public static void mostraInfoRuta(File ruta,boolean info)throws FileNotFoundException{
            if(!ruta.exists()){
                throw new FileNotFoundException("Error ruta no valida");
            }

            if (ruta.isFile()){
                System.out.println("Es un fichero"+ruta.getName());
            }

            else if (ruta.isDirectory()){
                File[] llistat=ruta.listFiles();

                Arrays.sort(llistat);
                for (int i=0; i< llistat.length;i++){
                    if(llistat[i].isFile()) {
                        if (info) {
                            System.out.println("[A]" + llistat[i].getName() + " /homela seua grandaria es de " + llistat.length + "bytes y la ultima fecha de modificacion es de " + ruta.lastModified());
                        } else {
                            System.out.println("[A]" + llistat[i].getName());
                        }
                    }
                }

                for (int i=0; i< llistat.length;i++){
                    if (llistat[i].isDirectory()){

                        if (info){
                            System.out.println("[D]" + llistat[i].getName() + " la seua grandaria es de " + llistat.length + " bytes y la ultima fecha de modificacion es de " + ruta.lastModified());
                        }else {
                            System.out.println("[D]"+llistat[i].getName());
                        }
                    }
                }
            }

    }

}
