public class EjercicioTema3 {
    public static void main(String[] args) {

        int resultado = suma(10,5,4);

        Coche miCoche = new Coche(2);
        //incrementamos una puerta al objeto.
        miCoche.incPuerta();

        //imprimimos cuantas puertas tiene dicho objeto.
        System.out.println(miCoche.infoPuerta());

        System.out.println(resultado);
    }

    /*primera parte: creamos la funcion que sume numeros
       entre si y luego llamamos a la funcion para darle
        valores.*/
    public static int suma (int a, int b, int c) {

        return a + b + c;
    }

}

/* segunda parte : creamos la clase coche, creamos
* una funcion que incremente las puertas del coche,
* crear un objeto "miCoche" y añadirle una puerta,
* por ultimo, mostrar el numero de puertas que tiene el obj*/
class Coche {

     int numPuertas;

    public Coche(int numPuertas){

        this.numPuertas= numPuertas;
    }

    public int incPuerta (){

        return numPuertas++;
    }

    public String infoPuerta(){

        return "el numero de puertas del coche es " + numPuertas;
    }

}
