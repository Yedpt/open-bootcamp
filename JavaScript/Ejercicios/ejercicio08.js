function sinP () {
    return true;
}

const asin = () => {
    return new Promise ((resolve, reject) =>{
        setTimeout(() =>{
            let saludo ="Hola soy una promesa";
            resolve(saludo);
    } , 5000)
    });
}

asin().then((saludo)=> console.log(saludo));

// - Una función generadora de índices pares automáticos

function* generaIdPares () {
    let id=0;
    while(true){
        yield id+=2;      
    }
}

const genId = generaIdPares();

console.log(genId.next());
console.log(genId.next());
console.log(genId.next());
console.log(genId.next());
console.log(genId.next());
