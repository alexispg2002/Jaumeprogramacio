

import java.io.File;
import java.util.Scanner;

public class ClasseFile {

    public static void main(String[] args) {

        //Crea 3 objectes de tipus FILE per al directori i per als fitxers. Utilitza les 3 maneres de referenciar-los.


        System.out.println("\n***********************************************************************");
        System.out.println("1.- Crea 3 objectes de tipus FILE per al directori i per als fitxers.\n" +
                "Utilitza les 3 maneres de referenciar-los.");
        System.out.println("***********************************************************************\n");


        /*
         *  Ruta absoluta windows:
         *  File directori= new File("C:\\Users\\Usuario\\Desktop\\Fitxers\\ClasseFile\\exemples\\fitxer1.txt");
         */

        // Creem el directori exemples y el current directory (.)
        File carpeta =new File("exemples");
        File dirActual = new File(".");

        // Creem un fitxer amb l'opció File (String directori, String fitxer)
        File f1 =new File("exemples","fitxer1.txt");

        // Creem un fitxer amb l'opció File (File directori, String fitxer)
        File f2 =new File(carpeta,"fitxer2.txt");


        // 2.- Mostra el contingut  (llistat) del directori actual (.)

        System.out.println("\n**************************************************************");
        System.out.println("2.- Mostra el contingut  (llistat) del directori actual (.)");
        System.out.println("**************************************************************\n");

        for(String s: dirActual.list()){
            System.out.println(s);
        }

        // 3.- Mostra el contingut  (llistat) del directori "exemples"

        System.out.println("\n***********************************************************");
        System.out.println("3.- Mostra el contingut  (llistat) del directori exemples");
        System.out.println("***********************************************************\n");

        for(String s: carpeta.list()){
            System.out.println(s);
        }




        // 4.- Demana una ruta per teclat i mostra el contingut (llistat)."

        System.out.println("\n**************************************************************");
        System.out.println("4.- Demana una ruta per teclat i mostra el contingut (llistat).");
        System.out.println("**************************************************************\n");

        Scanner src = new Scanner(System.in);
        String ruta;

        System.out.println("Dime la ruta del contingut");
        ruta= src.nextLine();

        File noufitxer=new File(ruta);

        for(String e:noufitxer.list()){
            System.out.println(e);
        }

        // 5.- Mostra el nom d’un dels fitxers o directoris


        System.out.println("\n*************************************************");
        System.out.println("5.- Mostra el nom d’un dels fitxers o directoris.");
        System.out.println("*************************************************\n");

        System.out.println(f1.getName());

        // Mostra la ruta relativa dels 3

        System.out.println("\n********************************************************");
        System.out.println("6.- Mostra la ruta relativa dels 3 fitxers o directoris.");
        System.out.println("********************************************************\n");

        System.out.println(f1.getPath());
        System.out.println(f2.getPath());
        System.out.println(carpeta.getPath());

        System.out.println("\n********************************************************");
        System.out.println("7.- Mostra la ruta absoluta dels 3 fitxers o directoris.");
        System.out.println("********************************************************\n");

        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
        System.out.println(carpeta.getAbsolutePath());


        System.out.println("\n**************");
        System.out.println("8.-getParent().");
        System.out.println("****************\n");

        System.out.println("Retorna el nom(String) del directori pare. Si no existeix per ser l'arrel retorna NULL.");
        System.out.println("El directori pare de fitxer1 es: "+ f1.getParent());
        System.out.println();

        System.out.println("\n****************");
        System.out.println("9.-getParentFile().");
        System.out.println("****************\n");

        System.out.println("Retorna el directori pare com un FILE. Si no existeix per ser l'arrel retorna NULL.");
        System.out.println("El directori pare de fitxer1 es: "+ f1.getParentFile());
        System.out.println();

        System.out.println("\n******************");
        System.out.println("10.-exists().");
        System.out.println("********************\n");

        System.out.println("Retorna true si el fitxer o directori existeix");
        System.out.println("El fitxer1 "+ f1.exists()+" existeix");
        System.out.println();


        System.out.println("\n******************");
        System.out.println("11.-isDirectory().");
        System.out.println("********************\n");

        System.out.println("Retorna true si es un directory");
        System.out.println("El fitxer1 "+ f1.isDirectory()+" es un directori");
        System.out.println();


        System.out.println("\n******************");
        System.out.println("12.-isFile().");
        System.out.println("********************\n");

        System.out.println("Retorna true si es  un arxiu");
        System.out.println("El fitxer1 "+ f1.isFile()+" es un arxiu");
        System.out.println();

        System.out.println("\n******************");
        System.out.println("13.-isHidden().");
        System.out.println("********************\n");

        System.out.println("Retorna true si es un arxiu ocult");
        System.out.println("El fitxer1 "+ f1.isHidden()+" esta ocult");
        System.out.println();

        System.out.println("\n******************");
        System.out.println("14.-length().");
        System.out.println("********************\n");

        System.out.println("Retorna el tamany en bytes del fitxer");
        System.out.println("El tamany del fitxer1 es "+ f1.length());
        System.out.println();

        System.out.println("\n******************");
        System.out.println("15.-lastModified().");
        System.out.println("********************\n");

        System.out.println("Retorna la data de modificacio de l'arxiu");
        System.out.println("El fitxer1 asigut modificat en  "+ f1.lastModified());
        System.out.println();

        System.out.println("\n******************");
        System.out.println("16.-mkdir().");
        System.out.println("********************\n");

        System.out.println("Crea un directori amb el nom indicat en el creacio del FILE. Ha d'existir el directori pare.");
        File hola = new File("Exemples");
        System.out.println("Se ha creat un nou directori: "+hola.mkdir());

        System.out.println("\n******************");
        System.out.println("17.-renameTo().");
        System.out.println("********************\n");

        System.out.println("Canvia el nom de l'arxiu");
        System.out.println("Se ha canviat correctament de f1 a f2 "+f1.renameTo(f2));

        System.out.println("\n******************");
        System.out.println("18.-delete().");
        System.out.println("********************\n");

        System.out.println("Esborra l'arxiu o directori");
        System.out.println("Se ha esborrrat el fitxer f2 "+f2.delete());

    }
}
