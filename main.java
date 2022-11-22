import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cajero cajeroPrincipal = new cajero("Elvis Guanoluisa", "1750001",0);
        String opcionMenu;
        boolean opcionsalir;
        do {
            mostrarMenuPrincipal();
            System.out.print("Elija una opcion: ");
            opcionMenu = sc.next().toUpperCase();
            opcionsalir = true;
            switch (opcionMenu){
                case "A":
                    System.out.print("Ingrese la cantidad a depositar: ");
                    cajeroPrincipal.depositar(sc.nextDouble());
                    break;
                case "B":
                    System.out.print("Ingrese la cantidad a retirar: ");
                    cajeroPrincipal.retirar(sc.nextDouble());
                    break;
                case "C":
                    System.out.println("\n-----------------------------");
                    System.out.println("INFORMACION DE LA CUENTA");
                    System.out.println("Titular: " + cajeroPrincipal.getTitular());
                    System.out.println("Numero de cuenta: " + cajeroPrincipal.getNumeroCuenta());
                    System.out.println("Saldo disponible: " + cajeroPrincipal.getSaldo());
                    System.out.println("-----------------------------");
                    break;
                case "D":
                    opcionsalir = false;
                    break;
            }
        } while(opcionsalir);
    }

    static void mostrarMenuPrincipal(){
        System.out.println("\n\t*** MENU ***");
        System.out.println("A. Depositar dinero");
        System.out.println("B. Retirar dinero");
        System.out.println("C. Estado de cuenta");
        System.out.println("D. Salir");
    }
}
