let nombre = "Hola, me llamo Yeder"

let apellido = "Mi apellido es Pimentel"

let nombre1 = "Hola, me llamo pepe"

let estudiante = nombre.concat(" ").concat(apellido)

let estudianteMayus = estudiante.toUpperCase()

let estudianteMinus = estudiante.toLowerCase()

let contEstudiante = estudiante.length

let firstLetterNombre = nombre.substring(0,1)

let LastLetterApellido = apellido.substring(apellido.length - 1, apellido.length)

let estudianteSinEspacios = estudiante.replace(/ /g, "")

let nombreEnestudiantes = estudiante.includes(nombre)

console.log(nombreEnestudiantes)