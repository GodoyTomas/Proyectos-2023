const $contenedor = document.getElementById('contenedor-carrousel');
const $btnNext = document.getElementById('btnNext');
const $btnPrev = document.getElementById('btnPrev');


let containerDimensiones = $contenedor.getBoundingClientRect();
let containerWidth = containerDimensiones.width;

$btnNext.addEventListener('click', ()=>{
    $contenedor.scrollLeft += containerWidth;
})

$btnPrev.addEventListener('click', ()=>{
    $contenedor.scrollLeft -= containerWidth;
})
document.addEventListener("input", (e) => {
    let busqueda = e.target.value;
    filtrar(busqueda, arrayPiezas, $listaProductos)
  })
  /**
 * Funcion para filtrar el array de Piezas segun el string que le vaya pasando como parametro
 * @param {string} busqueda - termino de busqueda
 * @param {array} array - array con las piezas en donde buscar
 * @param {HTMLElement} elementoHtml - div donde se pinta el error
 */
const filtrar = (busqueda, array, elementoHtml)=> {
    let filtrados = array.filter((item)=> item.nombre.toLowerCase().includes(busqueda.toLowerCase()) || item.categoria.toLowerCase().includes(busqueda.toLowerCase()));

    if (filtrados.length > 0){
        elementoHtml.innerHTML = `;
        generarCards(filtrados, elementoHtml)
    }else{
        elementoHtml.innerHTML = 
            <div class="text-center py-5 text-danger">
            <h1> Oooooops.... </h1>
            <h2> No hay coincidencias </h2>
            </div>`;
    }
}


