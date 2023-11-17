package tp;

import java.util.Scanner;

import tp.tp.State.Inicio;

public class Main {
    public static void main(String[] args) {
        Inicio inicio = new Inicio();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos");

        System.out.println("Razón social");
        String entrada = scanner.nextLine();

        System.out.println("DNI o CUIT");
        String cuit = scanner.nextLine();

        System.out.println(" ");

        String formatCuit = cuit.startsWith("20-") && cuit.endsWith("-2") ? cuit : "20-" + cuit + "-2";

        System.out.println(formatCuit);

        inicio.setRazonSocial(entrada, cuit);
        inicio.actuar();
        inicio.actuar();
        inicio.actuar();

    }

}
