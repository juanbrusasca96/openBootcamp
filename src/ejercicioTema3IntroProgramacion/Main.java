package ejercicioTema3IntroProgramacion;

public class Main {
    public static void main(String[] args) {
        suma(1,2,3);
        Coche coche = new Coche();
        coche.sumarPuertas();
        System.out.println(coche.puertas);
    }

    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}

class Coche{
    public int puertas = 0;
    public void sumarPuertas(){
        puertas++;
    }
}


