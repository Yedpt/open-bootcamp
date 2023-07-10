 const nombre = "Yeder"

 const apellido = "Pimentel"

 const obj = {
    nombre: "Yeder",
    apellido: "Pimentel"
 }

sessionStorage.setItem("obj" , JSON.stringify(obj))

localStorage.setItem("obj", JSON.stringify(obj))

const now = new Date ()

document.cookie = `obj=${JSON.stringify(obj)};  
expires= ${new Date(now.getTime() + 2 *60000)}`


