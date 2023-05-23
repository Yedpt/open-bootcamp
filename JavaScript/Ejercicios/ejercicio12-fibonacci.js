function fibonacci (num){
    const fib = [0,1];
    
    for (let i = 2 ; i<=num; i++){
        fib.push (fib[i-1] + fib[i-2]); // el metodo push el elemento al final del array y devuelve la nueva longitud
    }
    
    return fib;
    }
    
    console.log(fibonacci(6));