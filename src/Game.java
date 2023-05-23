import java.util.Random;
import java.util.Scanner;

public class Game {
    private String tablero [] = new String [20];
    private boolean flag = true;
    private String player = "";
    private int posActualPlayer, posActualComputer = 0;

    public void jugar(){
        llenarTablero();
        pintarTablero();
        Scanner read = new Scanner(System.in);

        do{
            System.out.println("");
            System.out.println("1.- Tirar dado");
            System.out.println("2.- Salir...");
            int opc = read.nextInt();

            switch (opc){

                case 1:

                    turnoPlayer();

                    if(!flag) break;

                    esperarTurno();
                    turnoComputadora();

                    if(!flag) break;
                    break;

                case 2:

                    System.out.println("Saliendo....");
                    flag = false;
                    break;

                default:

                    System.out.println("Por favor ingresa una opción valída");
                    break;
            }


        }while(flag);


        System.out.println("El ganador es " + ((player == "p") ? "Player" : "Computer"));


    }


    public void turnoPlayer(){


        if(posActualPlayer > 0){
            eliminarPos(posActualPlayer);
        }

        player = "p";
        posActualPlayer += tirarDado();
        System.out.println("Contador Player : " + posActualPlayer);
        pintarJugadorTablero(posActualPlayer);

    }

    public void turnoComputadora(){

        if(posActualComputer > 0){
            eliminarPos(posActualComputer);
        }

        player = "c";
        posActualComputer += tirarDado();
        System.out.println("Contador computer : " + posActualComputer);
        pintarJugadorTablero(posActualComputer);



    }

    public void eliminarPos(int posicion){

        if(posicion <= tablero.length-1) tablero[posicion] = "-";
    }

    public void pintarJugadorTablero (int tiroNumero) {

        // System.out.println("tiro resta " + tiroNumero);

        if(tiroNumero >= tablero.length-1) {
            flag = false;
            return;
        }

        if(tablero[tiroNumero].contains("p")  || tablero[tiroNumero].contains("c")){
            tablero[tiroNumero] += "&"+player;
        }


        tablero[tiroNumero] = player;

        pintarTablero();




    }

    public int validarTiroTablero(int tiroNumero){

        return Math.abs(tablero.length - tiroNumero);
    }

    public int tirarDado() {
        return (int) Math.floor(Math.random() * 10+1);
    }

    public void llenarTablero(){

        System.out.println("");

        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = "-";
        }
    }

    public void pintarTablero(){

        for (int i = 0; i < 5; i++) {
            System.out.print(tablero[i] + " | ");
        }
        System.out.println("");

        for (int i = 9; i >= 5; i--) {
            System.out.print(tablero[i] + " | ");
        }


        System.out.println("");

        for (int i = 10; i < 15; i++) {
            System.out.print(tablero[i] + " | ");
        }

        System.out.println("");
        for (int i = 19; i >= 15; i--) {
            System.out.print(tablero[i] + " | ");
        }

        System.out.println("");

    }

    public void esperarTurno(){

        try {

            System.out.println("__________________________________________");
            System.out.println("Esperando el tiro de la computadora...");
            System.out.println("__________________________________________");

            Thread.sleep(1 * 1000);

        }catch (Exception e){
            e.getMessage();
        }

    }

}
