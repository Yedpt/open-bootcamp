public class EjercicioTema8 {

    public static void main(String[] args) {

        Persona obj = new Persona();

        obj.setEdad(20);
        obj.setNombre("Juan");
        obj.setTelefono(654621829);

        System.out.println("Mi nombnre es: " + obj.getNombre() +
                " tengo " + obj.getEdad() + " años " + " y mi num de telef es : "
                + obj.getTelefono());
    }
}
        //crear un clase Persona.

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

