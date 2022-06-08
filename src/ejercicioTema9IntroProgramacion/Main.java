package ejercicioTema9IntroProgramacion;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.setEdad(25);
        cliente.setNombre("ayrton");
        cliente.setTelefono(522866);
        cliente.setCredito(25000);
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());
        trabajador.setEdad(30);
        trabajador.setNombre("mikael");
        trabajador.setTelefono(123465);
        trabajador.setSalario(5000);
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
