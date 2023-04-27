
const listaCompra = ["Jabon","fideos","Arroz","Fruta","Helados"];

listaCompra.push("Aceite Girasol");
listaCompra.pop();

console.log(listaCompra);

const listaPelicula = [
    {titulo:"la vida es bella", director:"Freddy mercurie", fecha: new Date (2000,4,2)},
    {titulo:"king kong", director:"Eva hache", fecha: new Date (1993,4,2)},
    {titulo:"Avatar", director:"James cameron", fecha: new Date (2012,4,2)}
];

const NuevaListaPeli = listaPelicula.filter(peli => peli.fecha< new Date(2010,0,1));

console.log(NuevaListaPeli);

const listaPeliDirec = listaPelicula.map(listaPelicula =>{
    return listaPelicula.director;
})

console.log(listaPeliDirec);

const listaPeliTitle = listaPelicula.map(listaPelicula => {
    return listaPelicula.titulo;
})

console.log(listaPeliTitle);


const directores_titulos = listaPeliDirec.concat(listaPeliTitle);
console.log(directores_titulos);
const directores_titulos_prop = [...listaPeliDirec, ...listaPeliTitle];
console.log(directores_titulos_prop);


// const newArray = array.map((valor, indice) => `${indice + 1} - ${valor}`);
// const personaMayores = listaObjetos.filter(obj => obj.edad>30);