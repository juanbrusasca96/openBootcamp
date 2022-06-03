package ejercicioTema4IntroProgramacion;

import java.lang.invoke.MethodHandles;

public class Main {
    public static void main(String[] args) {
        int numeroIf = 56;
        int numeroWhile = -7;
        String estacion = "verano";
        if (numeroIf > 0) {
            System.out.println("numeroIf es positivo");
        } else if (numeroIf < 0) {
            System.out.println("numeroIf es negativo");
        } else {
            System.out.println("numeroIf es cero");
        }
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (false);
        for (int numeroFor = 0; numeroFor <=3 ; numeroFor++) {
            System.out.println(numeroFor);
        }
        switch (estacion){
            case "verano":
                System.out.println("es " + estacion);
                break;
            case "primavera":
                System.out.println("es " + estacion);
                break;
            case "invierno":
                System.out.println("es " + estacion);
                break;
            case "otoño":
                System.out.println("es " + estacion);
                break;
            default:
                System.out.println("no es nada");
        }
    }
}
