<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<title>InstruMental</title>

<style>
.p-4{
		width:35%;
		height:100vh;
		text-align:center;
		opacity:0.98;
		position:absolute;
		z-index:2;
	
}
.text-white {
border-bottom:1px solid white;
margin-bottom:1em;

}
#elements{
height:95%;
display:grid;

grid-template-columns:repeat(2, 50%);
grid-template-rows:repeat(6, 5vh);
}
#elements > div{
	color:white;
	

}
#elements > div:nth-child(1) , div:nth-child(2), div:nth-child(3),div:nth-child(4), div:nth-child(5),div:nth-child(6){
	grid-column:1/2;
	border-left:1px solid lightgray;
	
}

#elements > div:nth-child(1){
grid-row:1/2;
}
#elements > div:nth-child(2){
grid-row:2/3;
}

#elements > div:nth-child(3){
grid-row:3/4;
}
#elements > div:nth-child(4){
grid-row:4/5;
}
#elements > div:nth-child(5){
grid-row:5/6;
}
#elements > div:nth-child(6){
grid-row:6/7;
}


#elements > div:nth-child(7){
grid-row:1/2;
}
#elements > div:nth-child(8){
grid-row:2/3;
}

#elements > div:nth-child(9){
grid-row:3/4;
}
#elements > div:nth-child(10){
grid-row:4/5;
}
#elements > div:nth-child(11){
grid-row:5/6;
}
#elements > div:nth-child(12){
grid-row:6/7;
}





a{
	color:white;
	text-decoration:none;
}
a:hover{
  filter:brigness(1.5);
  	color:white;
}



img, a {
  pointer-events: none;
}



elements > div {
	display:block;
}

#elements > div:nth-child(7),div:nth-child(8),div:nth-child(9),div:nth-child(10),div:nth-child(11),div:nth-child(12){
	grid-column:2/3;
	border-right:1px solid lightgray;
	
	
}



#carouselExampleIndicators{
   width:100%;
   height:45vh;
}
.carousel-item > img{
   object-fit: cover; /*Se supone que debería ajustar el elemento img al contenedor previniendo un desbordamiento */
   height:45vh;
 
   
</style>
</head>
<body>


  <nav class="navbar navbar-dark bg-dark">
   <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
  </nav>
  

  <div class="pos-f-t">
  <div class="collapse" id="navbarToggleExternalContent">
    <div class="bg-dark p-4">
    
      <h5 class="text-white h4">Nuestros Productos</h5>
   
   		<div id="elements">
   		
   			<div><a  href="">Guitarras y bajos</a>  </div>
     
     
     	<div><a  href="">Baterías y percusión</a></div>
     	
     		<div><a  href="">Teclados</a></div>
     		
     		<div><a  href="">Equipo de estudio y recording</a></div>
     		
     			<div><a  href="">Software</a></div>
     			<div><a  href="">Equipos de PA / sonorización</a></div>
     			<div><a  href="">Iluminación y escenario</a></div>
     			<div><a  href="">Equipo DJ</a></div>
     			
     			<div><a  href="">Video Podcast</a></div>
     			<div><a  href="">Micrófonos</a></div>
     			<div><a  href="">Instrumentos de viento</a></div>
     			<div><a  href="">Cables y conectores</a></div>
     			
     			
     			
     		
   		</div>
  
    </div>
  </div>

</div>

<main>


  

        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img class="d-block w-100" src="./img/banner.png" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="./images/slider1.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="./images/slider2.jpg" alt="Third slide">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>





</main>














</body>
</html>