document.getElementById("file1").onchange = function (e) {
    let reader = new FileReader();
    reader.readAsDataURL(e.target.files[0]);
    reader.onload = function () {
        let preview1 = document.getElementById('vanhouten');
        let div=document.getElementById("div-foto");
        div.classList.add("vanhouten2")
        preview1.setAttribute("src",reader.result);
       

    }
}