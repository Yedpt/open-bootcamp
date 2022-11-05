public class EjercicioTema4 {

    public static void main(String[] args) {

        int numeroIf = -2;
        /*usando un if. he comprobado metiendo un numero mayor que
        0 da positivo y si es menor que 0 es negativo*/
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
        /*usando While. este bucle tendrá que tener como
        condición que la variable numeroWhile sea inferior
         a 3, el bloque de código que tendrá el bucle deberá:
         -incrementar el valor de la variable en uno cada vez
         que se ejeute.
         -mostrarlo por pantalla cada vez que se ejecute
         */
        int numeroWhile = 1;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("el numero es : " + numeroWhile);
        }
        /*Para el bucle Do While, deberás crear la misma
        estructura que en el While, pero solo se debe
        ejecutar una vez.
         */
        int numeroWhile1 = 10;
        do {

            System.out.println("el numero ess: " + numeroWhile1);
            numeroWhile1++;
        } while (numeroWhile1 < 3);

        /*Para el bucle For, crea una variable numeroFor,
        esta variable tendrá como valor 0 y su condición será
        que la variable sea igual o menor que 3,
        se irá incrementando en 1 su valor cada vez que
        se ejecute y deberá mostrarse por pantalla.
         */
        int numeroFor = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.println(numeroFor);
            numeroFor++;
        }

        /*Por último, para el Switch, deberás crear la variable
         estacion, y distintos case para las cuatro estaciones
         del año. Dependiendo del valor de la variable
          estacion se deberá mandar un mensaje por consola
          informando de la estación en la que está.
           También habrá que poner un default para cuando
           el valor de la variable no sea una estación.
         */

        var estacion = "OTOÑO";

        switch (estacion) {
            case "INVIERNO":
                System.out.println("Es invierno");
                break;

            case "VERANO":
                System.out.println("Es verano");
                break;

            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;

            case "OTOÑO":
                System.out.println("Es otoño");
                break;

            default:
                System.out.println("Tienes que elegir una estacion");
        }
    }
}
