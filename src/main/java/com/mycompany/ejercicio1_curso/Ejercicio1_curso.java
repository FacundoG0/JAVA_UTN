package com.mycompany.ejercicio1_curso;
import java.util.ArrayList;


public class Ejercicio1_curso {

    public static void main(String[] args) {
        
        // EJERCICIO 1A
        
        int a = 1;
        int b = 10;
        int c = 2;
        
        
        // ACLARACIÖN: nunca programé en JAVA. Importé los ArrayList para poder acomodar el printeo de los resultados
        ArrayList numeros = new ArrayList();
        ArrayList pares = new ArrayList();
        ArrayList impares = new ArrayList();

        while(a < b){
            a = a + 1;
            numeros.add(a);

            // EJERCICIO 1B
            if (a % 2 == 0){
                pares.add(a);
            }
            
            if((a % 2) > 0){
                impares.add(a);
            }
        }
        
        // printear array con todos los números entre A y B
        System.out.println("Los números que hay entre " +  (a + 1 - b)  + " y " + b + " son");
        System.out.println(numeros);
        
        
        // printear ejecicio 1B:
        // System.out.println("Los números PARES que hay entre " +  (a + 1 - b) + " y " + b + " son");
        // System.out.println(pares);

        /* ACLARACIÓN: tuve que usar esa formula de "a+1-b" porque al pisarme los 
        valores de a, después no se como volver al valor inicial de a (no se como se maneja el scope de java
        no es como js.
        ) */
        
         // EJERCICIO 1C
           switch (c){
               case 1:
                   System.out.println("Los números PARES que hay entre " +  (a + 1 - b) + " y " + b + " son");
                   System.out.println(pares);
                   
                   break;
                   
               case 2:
                   System.out.println("Los números IMPARES que hay entre " +  (a + 1 - b) + " y " + b + " son");
                   System.out.println(impares);

                   break;
                   
               default: System.out.println("Haz elegido una opción incorrecta");
           }


           
            // EJERCICIO 1D
            /* no me salió - espero si nos podrán explicar después como hacerlo:
            En JS se puede hacer sencillo invirtiendo el rango, pero como todavía no vimos Arrays en JAVA, no se como resolverlo.
            supongo que existe una forma mucho más sencilla y que no me he podido dar cuenta */
            
            

            //_________________________________separador___________________________________
            System.out.println("_____________________________________________");
            System.out.println("_____________________EJERCICIO 2____________________");
            
                    
            // EJERCICIO 2
            
            double ingresos = 100;
            int vehiculos = 5, inmuebles = 6;
           // String cuarta = "no";
           
           
           if (ingresos < 163539  && inmuebles <= 1 && vehiculos <= 1){
                System.out.println("Entras en el segmento de menores ingresos");
           }
           
           else if (ingresos > 572386.50 && inmuebles >= 3 && vehiculos >= 3){
                System.out.println("Entras en el segmento de altos ingresos");
           }
           
           else{
               System.out.println("Entras en el segmento de medios ingresos");
           }
           
           // creo que está bien hecho, aunque hay muchas más posibilidades de combinaciónes que no se abarcan
           
    }
}
