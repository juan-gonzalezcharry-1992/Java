
package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

    //en este bloque de codigo le damos el tamaño del array1 y de damos lo valores correspondientes 
  
      System.out.println("Digite el tamaño del primer Array");
      Scanner tamañoVector1 = new Scanner(System.in);
      int tamañoArray1 = tamañoVector1.nextInt();
      int [] array1 = new int[tamañoArray1]; 
      // insertamos numeros aleatorios dependiendo el tamaño del array1
        for (int i = 0; i < tamañoArray1; i++) {
             int valor = (int) (Math.random()*tamañoArray1+1);
            array1[i]=valor;
        }
        
        //recorremos e imporimimos el array1
        System.out.println("Primer  array");
        for (int i = 0; i < array1.length; i++) {
        
            System.out.println("Array1 "+array1[i]);
        }
        //en este bloque de codigo le damos el tamaño del array2 y de damos lo valores correspondientes
        System.out.println("Digite el tamaño del segundo Array");
        Scanner tamañoVector2 = new Scanner(System.in);
        int tamañoArray2 =tamañoVector2.nextInt();
        int [] array2 = new int[tamañoArray2];
         // insertamos numeros aleatorios dependiendo el tamaño del array2
        for (int i = 0; i < tamañoArray2; i++) {
             int valor = (int) (Math.random()*tamañoArray1+1);
            array2[i]=valor;
        }
        System.out.println("Segundo array");
        //recorremos e imporimimos el array2
        for (int i = 0; i < array2.length; i++) {
        
            System.out.println("Array2 "+array2[i]);
        }
        System.out.println("Tercer array");
        //recorremos los dos arrays creados anteriormente 
        int[] resultado=ConcatenarArray(array1,array2);
        for (int i=0; i<resultado.length; i++)
            {
                System.out.println("Array3 "+resultado[i]);
            }
        }
    
    public static int[] ConcatenarArray(int[] o1, int[] o2 ){
         int [] ret = new int [o1.length + o2.length];
         System.arraycopy(o1, 0, ret, 0, o1.length);
         System.arraycopy(o2, 0, ret, o1.length, o2.length);
         return ret;
    }
    
  }
    
