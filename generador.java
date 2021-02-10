import java.util.*; //Importando todas las clases, para que no hayan problemas.

//Importando todas las clases encargadas de abrir y trabajar el archivo de Excel.
import java.io.File; 
import java.io.FileWriter; //Es el que escribe los archivos de Excel.

public class generador {
    //Clase que generará y almacenará los números en un archivo de Excel.

    //Método para abrir el archivo xlms.
    public static void agregarNums(){
        //Abriendo y agregando los números que se generarán.
        
        try{//Buscando el archivo de Excel.
            
            //Verificando si está el archivo.
            File archv = new File("est.xlsx");
            Scanner enc = new Scanner(archv); 
        
        }catch(Exception archivoNoExistente){//El archivo no está.
            System.out.println("El archivo no se encuentra en las carpetas.....");
        }


    }
    
}