/*
Kenneth Eduardo Galvez Requena 20079
Javier Sebastian Valle Balsells 20159
Ultima modificación: 09/02/2021
Clase Generador
 */
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;
import source.Ordena;

 public class Generador implements InterfazKS{
      
    public static void abrir(){
       try{//Buscando el archivo de Excel.
            
            //Verificando si está el archivo.
            File archv = new File("est.xlsx");
            FileWriter sal = new FileWriter(archv);
            Scanner enc = new Scanner(archv);

            int numero; //Número encargado de almacenar los números entre 10 y 3000.
            for(int i = 10; i <= 3000; i++){
                //For para generar los números.
                numero = (int)(Math.random() * 3000 + 1); //Almacenando los números. 
                sal.write(numero);
            }

            System.out.println(archv);

        }catch(Exception archivoNoExistente){//El archivo no está.
            System.out.println("El archivo no se encuentra en las carpetas.....");
        }
      }

      /*
      public static void escribir(){
          
          int numero; //Número encargado de almacenar los números entre 10 y 3000.
          for(int i = 10; i <= 3000; i++){
              //For para generar los números.
              numero = (int)(Math.random() * 3000 + 1); //Almacenando los números. 
          }
          
          //enc.write(numero); //Escribiendo los números en el archivo.
            

      }
*/
      public static void gnome(int arr[], int n){
          
          int index = 0; //Variable para el index del Array. 
          
          String gnome = "est.xlsx"; 
          File file = new File(gnome);
          
            Scanner analisis = new Scanner(file);

          while(index < gnome.length()){
             if(index == 0){
                 index++; //El index aumenta. 
                 if(arr[gnome.length()] >= arr[gnome.length() - 1]){
                    //Si el número es mayor al anterior, entonces el número que estaba mal se regresa a su posición debida. 
                    index++; 
                 }else{
                     int temp = 0; //Creando una variable temporal.
                     temp = arr[index]; //Asignando a la variable temp el Array.
                     arr[index] = arr[index - 1]; //Igualando el Array con el índice normal y el anterior.
                     arr[index - 1] = temp; //Asignando ahora la matriz a la variable temp.
                     index--; //Disminuyendo el index.
                 }
             }
             return; 
          }
      }

      public static void merge(int[] a, int n){
          
            String archivo = "est.xlsx";
            File file = new File(archivo); 

            for(int i = 0; i < archivo.length(); i++){
                
                //Recorriendo el archivo.
                if((archivo.length() < 2)){
                    return;
                }
                
                int mid = (archivo.length())/2; //Declarando la variable mid, que es la mitad de la variable n.
                int[] l = new int[mid];     //Declarando esta nueva sub matriz con la variable mid.
                int[] r = new int[n - mid]; //Declarando esta sub matriz con la diferencia de n - mid.
                
                for(int b = 0; i < mid; b++){//For para igualar la matriz l[] con la matriz a[].
                    l[b] = a[b]; //Se hace la igualación de la matriz "l" con la matriz "a".
                }
        
                for(int c = mid; i < n; c++){//For para igualar la submatriz r[] y a[].
                    r[c - mid] = a[c]; //Igualando la matriz r[i - mid] y a[i].
        
                }
            }

      //mergeSort(l, mid); //Aplicando el mergeSort a la submatriz con el índice mid.
      //mergeSort(r, n - mid); //Aplicando el mergeSort a la submatriz con el índice n - mid.

      //merge(a, l, r, mid, n - mid); //Aplicando el merge a las matrices a, l y r. También se le aplicó a las las variables mid y n - mid.

      }

      public static void quick(String a[], int izquierda, int derecha){
        int num; //Pivote
        
        String archivo = "est.xlsx";
        File file = new File(archivo);

        for(int i; i < archivo.length(); i++){
            //Recorriendo el archivo
            if (archivo.length() < archivo.length()-1){//Se establece un pivote y se ordena los numenores menores del lado izquierdo y los mayores del derecho.
                
                //Si en caso el de la izquierda es menor que el de la derecha, entonces en el array se almacena primero el menor y luego el mayor.

                a[archivo.charAt(i)] = a[archivo.charAt(i) - 1]; //Almacenando los números de los índices. 

            }else{

                //Si en caso el de la derecha es mayor al de la derecha, entonces en el array se almacena primero el menor y luego el mayor.
                
                a[archivo.charAt(i) - 1] = a[archivo.charAt(i)]; //Almacenando los números de los índices.
            }
        
      }
    }
      public static void radix(int[] a, int index, int pla){
        //Se saca el numero mas grande para compararlo con el resto.
        int out = new int[index + 1];
        int max = a[0];
        for (int i = 1; i < index; i++){
          if (a[i] > max){
            max = a[i];
          }
        }
        int [] cou = new int[max + 1];
        for(int i = 0; i < max; ++i){
          cou[i] = 0;
        }
        //Calcular los elementos de la nueva lista
        for(int i = 0; i < index; i++){
          cou[(a[i] / pla) % 10]++;
        }
        for(int i = 1; i < 10; i++){
          cou[i] += cou[i- 1];
        }
        //Ordenar los datos
        for(int i = index - 1; i >= 0; i--){
          out[cou[(a[i] / place) % 10] - 1] = a[i];
          cou[(a[i]/pla) % 10]--;
        }
        for(int i = 0; i < size; i++){
          a[i] = out[i];
        }
      }
      public static void burbuja(int[] a){
        int n = a.length; //Numero que almacenara la cantidad de numeros que habra en la lista.
        //Se subdivide la lista para hacerla mas pequeña y poder ordenarla.
        for (int i = 0; i <= n - 2; i++ ){
          for(int j = n-1; j > i; j--){
            if(a[j-1] > a[j]){
              permuta(a, j - 1, j);
            }
        } 
      }
  }
} 