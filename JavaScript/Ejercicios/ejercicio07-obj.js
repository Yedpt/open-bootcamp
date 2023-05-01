const obj = {
    nombre:"Yeder", apellido:"Pimentel", edad: 29, isDeveloper: true
}
const edad = obj.edad;

console.log(edad);

const objDatos =[
    {
    ...obj
    },{
        nombre:"juan",
        apellido: "Perez",
        edad: 40
    },{
        nombre:"joan",
        apellido: "velarde",
        edad: 30
    }
]

console.log(objDatos);

const listaOrdenada = objDatos.sort((a,b) => b.edad - a.edad);

console.log(listaOrdenada);
