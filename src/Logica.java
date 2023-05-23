import java.time.LocalDate;
import java.util.*;

public class Logica {


    public void subArray(){

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int n = 6;
        int m = 3;

        int i = 0;

        while (i < n){



        }



    }

    public void fibo(int numero){

        int counter = 0;

        for (int i = 0; i < numero; i++) {

            if(i > 0){
                counter += i;
                System.out.println(counter);
                counter += i-1;
            }
            System.out.print(counter + "  ");

        }



    }
    public void notDuplicates(List<Integer> lista){

        Set<Integer> hash = new HashSet<>(lista);

        hash.forEach(System.out::println);



    }
    public void orderString(String texto){

        String arr [] = texto.split("");
        List<String> lista = Arrays.asList(arr);
        Collections.shuffle(lista);
        lista.forEach(System.out::print);

    }

    public void anoBiciesto(int year){

        boolean isLeapYear = LocalDate.of(year, 1, 1).isLeapYear();

        System.out.println(isLeapYear);


    }
    public void multiple2(int number){

            if(number % 2 == 0){
                System.out.println("es multiplo");
            }else{
                System.out.println("no es multiplo");

            }

    }

    public void stringRevez(String palabra){

        String arr [] = palabra.split("");

        String texto = new StringBuilder(palabra).reverse().toString();

        System.out.println(texto);
    }

    public void numberCharacter(String palabra){


        int contador [] = new int[256];

        for (int i = 0; i < palabra.length(); i++) {

            contador[palabra.charAt(i)]++;

        }

        for (int i = 0; i < contador.length ; i++) {

            if(contador[i] != 0){
                System.out.println( (char) i + " No veces : " + contador[i]);
            }

        }


    }


}
