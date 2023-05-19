class Estudiante {
    nombre = "Yeder";
    asignatura = ["Javascript","HTML","CSS"];
    obtenDatos (){
        return {
            nombre: this.nombre,
            asignatura: this.asignatura
        }
    }

}

const estudiante = new Estudiante();

console.log(estudiante.obtenDatos());