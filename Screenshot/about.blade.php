	@extends('layout')
	@section('content')
	<link href="https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap" rel="stylesheet"> 
	<link href="https://fonts.googleapis.com/css?family=Bebas+Neue&display=swap" rel="stylesheet"> 
	<link href="https://fonts.googleapis.com/css?family=Montserrat=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Ma+Shan+Zheng&display=swap" rel="stylesheet"> 

	



      
 
<style>

.mastheadssy {
  height: 50vh;
  min-height: 300px;
  background-image: url('/images/e.jpg');
   background-size: cover;
  background-position: center;
  background-repeat: no-repeat;

}
.imgcover {
   background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
  color: white;
  font-weight: bold;
  border: 3px solid #f1f1f1;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  width: 40%;
  padding: 20px;
  text-align: center;
  font-family: 'Ma Shan Zheng', cursive;
}
section {
    padding-top: 4rem;
    padding-bottom: 5rem;
    background-color: #f1f4fa;
}
.wrap {
    display: flex;
    background: white;
    padding: 1rem 1rem 1rem 1rem;
    border-radius: 0.5rem;
    box-shadow: 7px 7px 30px -5px rgba(0,0,0,0.1);
    margin-bottom: 2rem;
}

.wrap:hover {
    background: linear-gradient(135deg,#6394ff 0%,#0a193b 100%);
    color: white;
}

.ico-wrap {
    margin: auto;
}

.mbr-iconfont {
    font-size: 4.5rem !important;
    color: #313131;
    margin: 1rem;
    padding-right: 1rem;
}
.vcenter {
    margin: auto;
}

.mbr-section-title3 {
    text-align: left;
}
h2 {
    margin-top: 0.5rem;
    margin-bottom: 0.5rem;
}
.display-5 {
    font-family: 'Source Sans Pro',sans-serif;
    font-size: 1.4rem;
}
.mbr-bold {
    font-weight: 700;
}

 p {
    padding-top: 0.5rem;
    padding-bottom: 0.5rem;
    line-height: 25px;
}
.display-6 {
    font-family: 'Source Sans Pro',sans-serif;
    font-size: 1re}
</style>
<header class="mastheadssy">
<div class="container h-100">
    <div class="row h-100 align-items-center">
      <div class="col-12 text-center">
 <div class="imgcover">

 
  <h1 style="font-size:50px">About</h1>
 
</div>

</div>
</div>
</div>
</header>

<div class="container">
  <div class="w3-row w3-padding-64" id="about">
    <div class="w3-col m6 w3-padding-large w3-hide-small">
     <img src="/images/f.jpg" class="w3-round w3-image w3-opacity-min" alt="Table Setting" style="width:450px; height:600px";>
    </div>

    <div class="w3-col m6 w3-padding-large">
      <h1 class="w3-center">Multitech Trade Circle</h1><br>
      <h5 class="w3-center">"Light for your delight"</h5>
      <p class="w3-large">Established in 2001A.D by Mr.`Arun Jalan ,Multitech Trade circle Pvt ltd has been one of the leading business houses in Nepal in the electrical business. With over two decades of service in the industry we believe in creating awareness, building trust and developing relations with our clients. Having an experienced team and representing many multinational companies for Nepal has been a privilege to us. Our team solely believes in providing best facilities and world class experience in the lighting and electrical field. We offer a wide range of products from commercial items such as Cables, Mcb&Mccb, Distribution board, Lights, switches, Fans, lighting protector, emergency and exit signs to Hospitality items such as RFID Door Locks, shoe shiner, hand dryers and many more. We also offer complete MEP solution i.e, Mechanical, Electrical & Plumbing services with our Sister company 3S Temple Projects Pvt ltd.

    </div>
  </div>
</div>
<section>
<div class="container">

  
    <div class="row mbr-justify-content-center">

            <div class="col-lg-6 mbr-col-md-10">
                <div class="wrap">
                    <div class="ico-wrap">
                        <span class="mbr-iconfont fa fa-volume-control-phone"></span>
                    </div>
                    <div class="text-wrap vcenter">
                        <h2 class="mbr-fonts-style mbr-bold mbr-section-title3 display-5">Delivering  <span>satisfaction through service.</span></h2>
                        <p class="mbr-fonts-style text1 mbr-text display-6">Our team has and always will be customer driven and believes in 100% customer satisfaction through service.
</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-6 mbr-col-md-10">
                <div class="wrap">
                    <div class="ico-wrap">
                        <span class="mbr-iconfont fa-calendar fa"></span>
                    </div>
                    <div class="text-wrap vcenter">
                        <h2 class="mbr-fonts-style mbr-bold mbr-section-title3 display-5">Managing
                            <span> over 17+ companies for Nepal.</span>
                        </h2>
                        <p class="mbr-fonts-style text1 mbr-text display-6">A pioneer in the electrical field and representing over 17+ multinational companies for Nepal. </p>
                    </div>
                </div>
            </div>
            <div class="col-lg-6 mbr-col-md-10">
                <div class="wrap">
                    <div class="ico-wrap">
                        <span class="mbr-iconfont fa fa-product-hunt"></span>
                    </div>
                    <div class="text-wrap vcenter">
                        <h2 class="mbr-fonts-style mbr-bold mbr-section-title3 display-5">Over 
                            <span>300+ range of products.</span>
                        </h2>
                        <p class="mbr-fonts-style text1 mbr-text display-6">Offering a wide range of products to our customers and delivering happiness through Lights.</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-6 mbr-col-md-10">
                <div class="wrap">
                    <div class="ico-wrap">
                        <span class="mbr-iconfont fa-globe fa"></span>
                    </div>
                    <div class="text-wrap vcenter">
                        <h2 class="mbr-fonts-style mbr-bold mbr-section-title3 display-5">More <span>than 150+ dealers across the country.</span></h2>
                        <p class="mbr-fonts-style text1 mbr-text display-6">Dealers in all provinces of the country from East to West, providing quality all across the county.</p>
                    </div>
                </div>
            </div>

            

            
        </div>

</div>
</section>




	@endsection