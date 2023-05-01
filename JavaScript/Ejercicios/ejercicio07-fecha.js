const fecha = new Date();
console.log(fecha);

const fechaNac = new Date(1993,01,18);
console.log(fechaNac);

console.log(fecha.getTime() > fechaNac.getTime());

const diaNac = fechaNac.getDate();

console.log(diaNac);

const mesNac = fechaNac.getMonth() + 1;

console.log(mesNac);

const anyoNac = fechaNac.getFullYear();

console.log(anyoNac);

