

let div=document.getElementById('productoCategoria');
let categoria_continuar=document.getElementById('categoria-continuar');
let lente_duracion=document.getElementById('lentes-duracion');
let duracion_continuar=document.getElementById('duracion-continuar');
let usos=document.getElementById('lentes-usos');
let usos_continuar=document.getElementById('usos-continuar');
let colorCristal= document.getElementById('color-crital');
let colorCristal_continuar=document.getElementById('color-crital-continuar');
let estilo=document.getElementById('estilo');
let estilo_continuar=document.getElementById('estilo-continuar');
let tamanio=document.getElementById('tamanio');
let tamanio_continuar=document.getElementById('tamanio-continuar');
let marca=document.getElementById('marca');
let marca_continuar=document.getElementById('marca-continuar');
let modelo=document.getElementById('modelo');
let modelo_continuar=document.getElementById('modelo-continuar');
let codigo=document.getElementById('codigo');
let codigo_continuar=document.getElementById('codigo-continuar');
let descripcion=document.getElementById('descripcion');
let descripcion_continuar=document.getElementById('descripcion-continuar');
let costo=document.getElementById('costo');
let costo_continuar=document.getElementById('costo-continuar');
let remarque=document.getElementById('remarque');
let remarque_continuar=document.getElementById('remarque-continuar');
let precio=document.getElementById('precio');
let precio_continuar=document.getElementById('precio-continuar');
let descuento=document.getElementById('descuento');
let descuento_continuar=document.getElementById('descuento-continuar');
let genero=document.getElementById('genero');
let genero_continuar=document.getElementById('genero-continuar');
let fecha_alta=document.getElementById('fecha-alta');
let fecha_alta_continuar=document.getElementById('fecha-alta-continuar');
let color=document.getElementById('color');
let color_continuar=document.getElementById('color-continuar');
let material=document.getElementById('material');
let material_continuar=document.getElementById('material-continuar');

categoria_continuar.addEventListener('click', function () {
    /*div.classList.toggle("quitar");*/
   console.log( categoria.value);
   if(categoria.value === 'Lentes de Contacto' ){
       div.classList.add('quitar');
       lente_duracion.classList.add('ver');

   }else{
       colorCristal.classList.add('ver');
   }
});
duracion_continuar.addEventListener('click', function () {
usos.classList.add('ver');
});
usos_continuar.addEventListener('click', function () {
marca.classList.add('ver');
});
colorCristal_continuar.addEventListener('click', function () {
   estilo.classList.add('ver')
    });
estilo_continuar.addEventListener('click', function () {
   tamanio.classList.add('ver')
    });
tamanio_continuar.addEventListener('click', function () {
   marca.classList.add('ver')
    });
marca_continuar.addEventListener('click', function () {
   modelo.classList.add('ver')
    });
modelo_continuar.addEventListener('click', function () {
   codigo.classList.add('ver')
    });
codigo_continuar.addEventListener('click', function () {
   descripcion.classList.add('ver')
    });
descripcion_continuar.addEventListener('click', function () {
   costo.classList.add('ver')
    });
costo_continuar.addEventListener('click', function () {
   remarque.classList.add('ver')
    });
remarque_continuar.addEventListener('click', function () {
   precio.classList.add('ver')
    });
precio_continuar.addEventListener('click', function () {
   descuento.classList.add('ver')
    });
descuento_continuar.addEventListener('click', function () {
   genero.classList.add('ver')
    });
genero_continuar.addEventListener('click', function () {
   fecha_alta.classList.add('ver')
    });
fecha_alta_continuar.addEventListener('click', function () {
   color.classList.add('ver')
    });
color_continuar.addEventListener('click', function () {
   material.classList.add('ver')
    });



    /********************************************************/
    
(function(){
    document.addEventListener("keyup", function(event){
    	if(event.target.matches(".count-chars")){
    		// get input value and length
    		const value = event.target.value;
    		const valueLength = event.target.value.length;
    		// get data value
    		const maxChars = parseInt(event.target.getAttribute("data-max-chars"));
    		const remainingChars = maxChars - valueLength;
    		if(valueLength > maxChars){
    			// limit chars to maxChars
    			event.target.value = value.substr(0, maxChars);
    			return;  //end function execution
    		}
    		event.target.nextElementSibling.innerHTML = remainingChars + " caracteres restantes";
    	}
    })
})();