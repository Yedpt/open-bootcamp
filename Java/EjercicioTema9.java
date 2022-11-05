public class EjercicioTema9 {

    public static void main(String[] args) {

        Cliente obj = new Cliente(16,"yeder",652613526, 1500);

        System.out.println(obj.dameDatos());

        Trabajador tbj = new Trabajador(40, "Pepe" , 956152632, 2000);

        System.out.println(tbj.dameDatos());
    }
}

 class Persona1 {

    int edad;
    String nombre;
    int telefono;


}

class Cliente extends Persona1 {

    private int credito;

    public Cliente(int edad, String nom, int telefono, int credito) {
        super();
        this.edad=edad;
        this.nombre=nom;
        this.telefono=telefono;
        this.credito=credito;
    }

    public String dameDatos(){

        return "la edad es " + edad + " tu nombre es: "
                + nombre + " tu telefono es: " + telefono
                + " y tienes un credio de " + credito;
    }
}

class Trabajador extends Persona1{
    int salario;

    public Trabajador(int edad, String nom, int telefono, int salario) {
        super();
        this.edad=edad;
        this.nombre=nom;
        this.telefono=telefono;
        this.salario=salario;
    }

    public String dameDatos(){

        return "la edad es " + edad + " tu nombre es: "
                + nombre + " tu telefono es: " + telefono
                + " y tienes un salario de " + salario;
    }
}
