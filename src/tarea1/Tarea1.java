
package tarea1;

import java.io.*;
import javax.swing.*;
import java.util.*;
public class Tarea1 {
 static Integer tam=10;
     static Integer numero;      
    @SuppressWarnings("ConvertToTryWithResources")
    //metodo para leer el archivo y ordenarlo ya sea de forma decendente o acendente
     
    public static void Leer1(){
        try{
            @SuppressWarnings("UnusedAssignment")
            String texto="";
            FileReader lector = new FileReader("numeros.txt");
            BufferedReader contenido = new BufferedReader(lector);
            texto = contenido.readLine();
            int []numeritos=new int[tam];
                   
            while(texto!=null){
                
              String arreglo[]  = texto.split(",");
              
                for(int x=0;x<arreglo.length;x++){
                String numeros1 = arreglo[x];
                 numero=Integer.parseInt(numeros1);
                 numeritos[x]=numero;
                }
                
             System.out.println("DATOS DEL ARCHIVO");
              for(int d=0;d<numeritos.length;d++){
                  System.out.print(numeritos[d]+" ");
              }
               System.out.println("\n_________________________________________________");
               System.out.println("ORDENAMIENTO DE FORMA ASCENDENTE");
              Arrays.sort(numeritos);
              for(int z=0;z<numeritos.length;z++){
            System.out.println("["+numeritos[z]+"]");
        }     
               System.out.println("_________________________________________________");
               System.out.println("ORDENAMIENTO DE FORMA DESCENDENTE");
              
       
               texto=contenido.readLine();         
            }
            lector.close();
        }
        catch(Exception e){
            System.out.println("ERROR EN EL ORDENADO DEL ARREGLO DE TIPO: "+e);
        }
    }
    
    public static void main(String[] args) {   
        Tarea1.Leer1();
       
    }
    
}
