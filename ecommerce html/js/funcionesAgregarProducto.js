

let div=document.getElementById('productoCategoria');
let categoria_continuar=document.getElementById('categoria-continuar');

let lente_duracion=document.getElementById('lentes-duracion');
let duracion_continuar=document.getElementById('duracion-continuar');
let duracion_volver=document.getElementById('duracion-volver');
let usos=document.getElementById('lentes-usos');
let usos_continuar=document.getElementById('usos-continuar');
let usos_volver=document.getElementById('usos-volver');
let colorCristal= document.getElementById('color-crital');
let colorCristal_continuar=document.getElementById('color-crital-continuar');
let colorCristal_volver=document.getElementById('color-crital-volver');
let estilo=document.getElementById('estilo');
let estilo_continuar=document.getElementById('estilo-continuar');
let estilo_volver=document.getElementById('estilo-volver');
let tamanio=document.getElementById('tamanio');
let tamanio_continuar=document.getElementById('tamanio-continuar');
let tamanio_volver=document.getElementById('tamanio-volver');
let marca=document.getElementById('marca');
let marca_continuar=document.getElementById('marca-continuar');
let marca_volver=document.getElementById('marca-volver');
let modelo=document.getElementById('modelo');
let modelo_continuar=document.getElementById('modelo-continuar');
let modelo_volver=document.getElementById('modelo-volver');
let codigo=document.getElementById('codigo');
let codigo_continuar=document.getElementById('codigo-continuar');
let codigo_volver=document.getElementById('codigo-volver');
let descripcion=document.getElementById('descripcion');
let descripcion_continuar=document.getElementById('descripcion-continuar');
let descripcion_volver=document.getElementById('descripcion-volver');
let costo=document.getElementById('costo');
let costo_continuar=document.getElementById('costo-continuar');
let costo_volver=document.getElementById('costo-volver');
let remarque=document.getElementById('remarque');
let remarque_continuar=document.getElementById('remarque-continuar');
let remarque_volver=document.getElementById('remarque-volver');
let precio=document.getElementById('precio');
let precio_continuar=document.getElementById('precio-continuar');
let precio_volver=document.getElementById('precio-volver');
let descuento=document.getElementById('descuento');
let descuento_continuar=document.getElementById('descuento-continuar');
let descuento_volver=document.getElementById('descuento-volver');
let genero=document.getElementById('genero');
let genero_continuar=document.getElementById('genero-continuar');
let genero_volver=document.getElementById('genero-volver');
let fecha_alta=document.getElementById('fecha-alta');
let fecha_alta_continuar=document.getElementById('fecha-alta-continuar');
let fecha_alta_volver=document.getElementById('fecha-alta-volver');
let color=document.getElementById('color');
let color_continuar=document.getElementById('color-continuar');
let color_volver=document.getElementById('color-volver');
let material=document.getElementById('material');
let material_continuar=document.getElementById('material-continuar');
let material_volver=document.getElementById('material-volver');
let fotos=document.getElementById('fotos');
let fotos_continuar=document.getElementById('fotos-continuar');
let fotos_volver=document.getElementById('fotos-volver');
let alerta=document.getElementById('alerta');
let guardado=document.getElementById('guardado');
let guardado_volver=document.getElementById('guardado-volver');

let categoriaCampo=null;
categoria_continuar.addEventListener('click', function () {
    
   categoriaCampo=document.getElementById('categoria-campo').value;
   console.log( categoriaCampo);
  if(categoriaCampo.length === 0){
    alerta.innerText='Debe seleccionar una categoria';
  setTimeout(()=>{
    alerta.innerText='';
  },3000);
  }else{
    if(categoriaCampo === 'Lentes de Contacto' ){
       
        lente_duracion.classList.add('ver');
       
 
    }else{
        colorCristal.classList.add('ver');
        
    }
  }
});
duracion_volver.addEventListener('click', function () {
    lente_duracion.classList.remove('ver');
});
let duracionCampo=null;
duracion_continuar.addEventListener('click', function () {
    duracionCampo=document.getElementById('duracion-campo').value;
    console.log(duracionCampo);
    if(duracionCampo.length === 0){
      
        alerta.innerText='Debe Ingresar la duracion del lente de contacto';
       
        setTimeout(()=>{
          alerta.innerText='';
        },3000);
    }else{
        usos.classList.add('ver');
       
    }

});
usos_volver.addEventListener('click', function () {
    usos.classList.remove('ver');
});
let usosCampo=null;
usos_continuar.addEventListener('click', function () {
usosCampo=document.getElementById('usos-campo').value;
console.log(usosCampo);
    if(usosCampo.length === 0){
       alerta.innerText='Debe ingresar la cantidad de usos que permite el producto';
              
       setTimeout(()=>{
         alerta.innerText='';
       },3000);

    }else{
        
        marca.classList.add('ver');
        
    }
});
colorCristal_volver.addEventListener('click', function () {
    colorCristal.classList.remove('ver')
});
let colorCristalCampo=null;
colorCristal_continuar.addEventListener('click', function () {
    colorCristalCampo=document.getElementById('color-cristal-campo').value;
    console.log(colorCristalCampo);
        if(colorCristalCampo.length === 0){
            alerta.innerText='Debe ingresar el color del cristal';
           
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            
            estilo.classList.add('ver')
        }
   
    });
    estilo_volver.addEventListener('click', function () {
        estilo.classList.remove('ver')
    });
    let estiloCampo=null;
estilo_continuar.addEventListener('click', function () {
    estiloCampo=document.getElementById('estilo-campo').value;
    console.log(estiloCampo);
        if(estiloCampo.length === 0){
            alerta.innerText='Debe ingresar el estilo';
                          
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            alerta.innerText='';
            tamanio.classList.add('ver')
        }
   
    });
    tamanio_volver.addEventListener('click', function () {
        tamanio.classList.remove('ver')
    });
    let tamanioCampo=null;
tamanio_continuar.addEventListener('click', function () {
    tamanioCampo=document.getElementById('tamanio-campo').value;
    console.log(tamanioCampo);
        if(tamanioCampo.length === 0){
          
            alerta.innerText='Debe seleccionar el tamaño';
              
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            marca.classList.add('ver')
        }
   
    });
marca_volver.addEventListener('click', function () {
    marca.classList.remove('ver')
});
let marcaCampo=null;
marca_continuar.addEventListener('click', function () {
    marcaCampo=document.getElementById('marca-campo').value;
    console.log(marcaCampo);
        if(marcaCampo.length === 0){
          
            alerta.innerText='Debe ingresar la Marca';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            modelo.classList.add('ver')
        }
  
    });
modelo_volver.addEventListener('click', function () {
    modelo.classList.remove('ver')
});
let modeloCampo=null;
modelo_continuar.addEventListener('click', function () {
    modeloCampo=document.getElementById('modelo-campo').value;
    console.log(modeloCampo);
        if(modeloCampo.length === 0){
          
            alerta.innerText='Debe ingresar el modelo';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            codigo.classList.add('ver')
        }
   
    });

codigo_volver.addEventListener('click', function () {
    codigo.classList.remove('ver')
});
let codigoCampo=null;
codigo_continuar.addEventListener('click', function () {
   codigoCampo=document.getElementById('codigo-campo').value;
    console.log(codigoCampo);
        if(codigoCampo.length === 0){
          
            alerta.innerText='Debe ingresar el codigo del producto';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            descripcion.classList.add('ver')
        }
 
    });
    descripcion_volver.addEventListener('click', function () {
        descripcion.classList.remove('ver')
    });
    let descripcionCampo=null;
descripcion_continuar.addEventListener('click', function () {
    descripcionCampo=document.getElementById('descripcion-campo').value;
    console.log(descripcionCampo);
        if(descripcionCampo.length === 0){
          
            alerta.innerText='Debe ingresar una descripcion';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            costo.classList.add('ver')
        }
  
    });
    costo_volver.addEventListener('click', function () {
        costo.classList.remove('ver')
    });
    let costoCampo=null;
costo_continuar.addEventListener('click', function () {
    costoCampo=document.getElementById('costo-campo').value;
    console.log(costoCampo);
        if(costoCampo.length === 0){
          
            alerta.innerText='Debe ingresar el costo del producto';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            remarque.classList.add('ver')
        }
  
    });
    remarque_volver.addEventListener('click', function () {
        remarque.classList.remove('ver')
    });
    let remarqueCampo=null;
remarque_continuar.addEventListener('click', function () {
   remarqueCampo=document.getElementById('remarque-campo').value;
    console.log(remarqueCampo);
        if(remarqueCampo.length === 0){
          
            alerta.innerText='Debe ingresar el remarque';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            precio.classList.add('ver')
        }
 
    });
    precio_volver.addEventListener('click', function () {
        precio.classList.remove('ver')
    });
    let precioCampo=null;
precio_continuar.addEventListener('click', function () {
    precioCampo=document.getElementById('precio-campo').value;
    console.log(precioCampo);
        if(precioCampo.length === 0){
          
            alerta.innerText='Debe ingresar el precio de venta';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            descuento.classList.add('ver')
        }
   
    });
    descuento_volver.addEventListener('click', function () {
        descuento.classList.remove('ver')
    });
    let descuentoCampo=null;
descuento_continuar.addEventListener('click', function () {
   descuentoCampo=document.getElementById('descuento-campo').value;
    console.log(descuentoCampo);
        if(descuentoCampo.length === 0){
          
            alerta.innerText='Debe ingresar un descuento';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            genero.classList.add('ver')
        }
  
    });
    genero_volver.addEventListener('click', function () {
        genero.classList.remove('ver')
    });
    let generoCampo=null;
genero_continuar.addEventListener('click', function () {
    generoCampo=document.getElementById('genero-campo').value;
    console.log(generoCampo);
        if(generoCampo.length === 0){
          
            alerta.innerText='Debe seleccionar el genero';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            fecha_alta.classList.add('ver')
        }
  
    });
    fecha_alta_volver.addEventListener('click', function () {
        fecha_alta.classList.remove('ver')
    });
    let fechaAltaCampo=null;
fecha_alta_continuar.addEventListener('click', function () {
   fechaAltaCampo=document.getElementById('fecha-alta-campo').value;
    console.log(fechaAltaCampo);
        if(fechaAltaCampo.length === 0){
          
            alerta.innerText='Debe ingresar la fecha de alta';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            color.classList.add('ver')
        }
   
    });
    color_volver.addEventListener('click', function () {
        color.classList.remove('ver')
    });
    let colorCampo=null;
color_continuar.addEventListener('click', function () {
    colorCampo=document.getElementById('color-campo').value;
    console.log(colorCampo);
        if(colorCampo.length === 0){
          
            alerta.innerText='Debe ingresar el color';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            material.classList.add('ver')
        }
   
    });
    material_volver.addEventListener('click', function () {
        material.classList.remove('ver')
    });
    let materialCampo=null;
material_continuar.addEventListener('click', function () {
     materialCampo=document.getElementById('material-campo').value;
    console.log(materialCampo);
        if(materialCampo.length === 0){
          
            alerta.innerText='Debe ingresar el material';
       
       
       setTimeout(()=>{
         alerta.innerText='';
       },3000);
    
        }else{
            fotos.classList.add('ver')
        }
 
    });
   fotos_volver.addEventListener('click', function () {
        fotos.classList.remove('ver')
    });
   
    fotos_continuar.addEventListener('click', function () {
        guardado.classList.add('ver')
        if(categoriaCampo !== null){
            let titulo_categoria=document.getElementById('titulo-categoria');
            titulo_categoria.innerText='Categoria: ';
            parrafo_categoria.innerText="  "+categoriaCampo;
        }
        if(duracionCampo !== null ){
            let titulo_duracion=document.getElementById('titulo-duracion');
            titulo_duracion.innerText='Duracion: ';
            parrafo_duracion.innerText="  "+duracionCampo;
        }
        if(usosCampo !== null){
            let titulo_usos=document.getElementById('titulo-usos');
            titulo_usos.innerText='Usos: ';
            parrafo_usos.innerText="  "+usosCampo;
        }
        if(colorCristalCampo !== null){
            let titulo_color_cristal=document.getElementById('titulo-color-cristal');
            titulo_color_cristal.innerText='Color del Cristal: ';
            parrafo_color_cristal.innerText="  "+colorCristalCampo;
        }
        if(estiloCampo !== null){
            let titulo_estilo=document.getElementById('titulo-estilo');
            titulo_estilo.innerText='Estilo: ';
            parrafo_estilo.innerText="  "+estiloCampo;
        }
        if(tamanioCampo !== null){
            let titulo_tamanio=document.getElementById('titulo-tamanio');
            titulo_tamanio.innerText='Tamaño: ';
            parrafo_tamanio.innerText="  "+tamanioCampo;
        }
        if(marcaCampo !== null){
            let titulo_marca=document.getElementById('titulo-marca');
            titulo_marca.innerText='Marca: ';
            parrafo_marca.innerText="  "+marcaCampo;
        }
        if(modeloCampo !== null){
            let titulo_modelo=document.getElementById('titulo-modelo');
            titulo_modelo.innerText='Modelo: ';
            parrafo_modelo.innerText="  "+modeloCampo;
        }
        if(codigoCampo !== null){
            let titulo_codigo=document.getElementById('titulo-codigo');
            titulo_codigo.innerText='Codigo: ';
            parrafo_codigo.innerText="  "+codigoCampo;
        }
        if(descripcionCampo !== null){
            let titulo_descripcion=document.getElementById('titulo-descripcion');
            titulo_descripcion.innerText='Descripcion: ';
            parrafo_descripcion.innerText="  "+descripcionCampo;
        }
        if(costoCampo !== null){
            let titulo_costo=document.getElementById('titulo-costo');
            titulo_costo.innerText='Costo: $';
            parrafo_costo.innerText="  "+costoCampo;
        }
        if(remarqueCampo !== null){
            let titulo_remarque=document.getElementById('titulo-remarque');
            titulo_remarque.innerText='Remarque: ';
            parrafo_remarque.innerText="  "+remarqueCampo+'%';
        }
        if(precioCampo !== null){
            let titulo_precio=document.getElementById('titulo-precio');
            titulo_precio.innerText='Precio: $';
            parrafo_precio.innerText="  "+precioCampo;
        }
        if(descuentoCampo !== null){
            let titulo_descuento=document.getElementById('titulo-descuento');
            titulo_descuento.innerText='Descuento: ';
            parrafo_descuento.innerText="  "+descuentoCampo+'%';
        }
        if(generoCampo  !==  null){
            let titulo_genero=document.getElementById('titulo-genero');
            titulo_genero.innerText='Genero: ';
            parrafo_genero.innerText="  "+generoCampo;
        }
        if(fechaAltaCampo !== null){
            let titulo_fecha_alta=document.getElementById('titulo-fecha-alta');
            titulo_fecha_alta.innerText='Fecha de alta: ';
            parrafo_fecha_alta.innerText="  "+fechaAltaCampo;
        }
        if(materialCampo !== null){
            let titulo_material=document.getElementById('titulo-material');
            titulo_material.innerText='Material: ';
            parrafo_material.innerText="  "+materialCampo;
        }
     
        });
        guardado_volver.addEventListener('click', function () {
            guardado.classList.remove('ver')
        });
        /*
 <p id="parrafo-categoria">Categoria</p>    
            <p id="parrafo-duracion">Duracion</p>    
            <p id="parrafo-usos">Usos</p>    
            <p id="parrafo-color-cristal">color cristal</p>    
            <p id="parrafo-estilo">estilo</p>    
            <p id="parrafo-tamanio">tamaño</p>    
            <p id="parrafo-marca">marca</p>    
            <p id="parrafo-modelo">modelo</p>    
            <p id="parrafo-codigo">codigo</p>    
            <p id="parrafo-descripcion">descripcion</p>    
            <p id="parrafo-costo">costo</p>    
            <p id="parrafo-remarque">remarque</p>    
            <p id="parrafo-precio">precio</p>    
            <p id="parrafo-descuento">descuento</p>    
            <p id="parrafo-genero">genero</p>    
            <p id="parrafo-fecha-alta">fecha de alta</p>    
            <p id="parrafo-material">material</p> 
*/

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
/**************************FUNCIONES PARA VISTA PREVIA****************************************/
document.getElementById("file1").onchange = function (e){
    let reader =new FileReader();
    reader.readAsDataURL(e.target.files[0]);
    reader.onload=function(){
        let preview1=document.getElementById('preview1');
        imagen = document.createElement('img');
        imagen.src=reader.result;
        preview1.innerHTML="";
        preview1.append(imagen);
    }
}
document.getElementById("file2").onchange = function (e){
    let reader =new FileReader();
    reader.readAsDataURL(e.target.files[0]);
    reader.onload=function(){
        let preview1=document.getElementById('preview2');
        imagen = document.createElement('img');
        imagen.src=reader.result;
        preview1.innerHTML="";
        preview1.append(imagen);
    }
}
document.getElementById("file3").onchange = function (e){
    let reader =new FileReader();
    reader.readAsDataURL(e.target.files[0]);
    reader.onload=function(){
        let preview1=document.getElementById('preview3');
        imagen = document.createElement('img');
        imagen.src=reader.result;
        preview1.innerHTML="";
        preview1.append(imagen);
    }
}
document.getElementById("file4").onchange = function (e){
    let reader =new FileReader();
    reader.readAsDataURL(e.target.files[0]);
    reader.onload=function(){
        let preview1=document.getElementById('preview4');
        imagen = document.createElement('img');
        imagen.src=reader.result;
        preview1.innerHTML="";
        preview1.append(imagen);
    }
}
/******************variables para la revision final *************/

let parrafo_categoria=document.getElementById('parrafo-categoria');
let parrafo_duracion=document.getElementById('parrafo-duracion');
let parrafo_usos=document.getElementById('parrafo-usos');
let parrafo_color_cristal=document.getElementById('parrafo-color-cristal');
let parrafo_estilo=document.getElementById('parrafo-estilo');
let parrafo_tamanio=document.getElementById('parrafo-tamanio');
let parrafo_marca=document.getElementById('parrafo-marca');
let parrafo_modelo=document.getElementById('parrafo-modelo');
let parrafo_codigo=document.getElementById('parrafo-codigo');
let parrafo_descripcion=document.getElementById('parrafo-descripcion');
let parrafo_costo=document.getElementById('parrafo-costo');
let parrafo_remarque=document.getElementById('parrafo-remarque');
let parrafo_precio=document.getElementById('parrafo-precio');
let parrafo_descuento=document.getElementById('parrafo-descuento');
let parrafo_genero=document.getElementById('parrafo-genero');
let parrafo_fecha_alta=document.getElementById('parrafo-fecha-alta');
let parrafo_material=document.getElementById('parrafo-material');
