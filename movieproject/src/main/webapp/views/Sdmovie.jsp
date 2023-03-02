<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.header_logo
{
 position: absolute;
	top: 0px;
    left: 0px;
    width: 1920px;
    height: 100px;
    background: #0F1924 no-repeat padding-box;
    opacity: 1;
}
.content_right
{
	position: relative;
	top: 24px;
    left: 150px;
	width: 134px;
	height: 53px;
	border: 3px solid #FFFFFF;
	opacity: 1;
}
h4
{
	color: #FAFAFA;
	top: 9px;
    position: relative;
	text-align: center;
}
/*.content_icon1 
{
	position: absolute;
	top: 25px;
	bottom: 25px;
	left: 1000px;
	bottom: 25px;
	right: 458px;
	width: 147px;
    height: 50px;
	text-align: left;
	
	letter-spacing: 0px;
	font-family: Roboto;
    background: #FFFFFF 0% 0% no-repeat padding-box;
	border: 1px solid #707070;
	border-radius: 3px;
	opacity: 1;
}*/
.content_icon1 #first_button
{
	position: absolute;
	top: 25px;
	bottom: 25px;
	left: 1000px;
	bottom: 25px;
	right: 458px;
    width: 147px;
    height: 50px;
    border: 1px solid #707070;
    cursor: pointer;
    background-color: #0F1924; 
    border: none;
    font-size: 25px; 
    color: #FFFFFF;
}
.content_icon2
{
	position: absolute;
	top: 25px;
	bottom: 25px;
	left: 1168px;
	bottom: 25px;
	right: 305px;
	width: 147px;
    height: 50px;
	text-align: left;
	font-size: 25px;
	letter-spacing: 0px;
	font-family: Roboto;
    background: #FFFFFF 0% 0% no-repeat padding-box;
	border: 1px solid #707070;
	border-radius: 3px;
	opacity: 1;
}
.content_icon2 #second_button
{
   background-color: #FFFFFF;
   width: 147px;
   height: 50px;
   border: 1px solid #707070;
   cursor: pointer;
   
}
.content_icon3
{
  position: absolute;
	top: 25px;
	bottom: 25px;
	left: 1364px;
	bottom: 25px;
	right: 109px;
	width: 147px;
    height: 50px;
	text-align: left;
	font-size: 25px;
	letter-spacing: 0px;
	font-family: Roboto;
    background: #FFFFFF 0% 0% no-repeat padding-box;
	color: #F8FCFF;
    opacity: 1;
    border-radius: 3px;
}
.content_icon3 #third_button
{

}
</style>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="header">
			<div class="header_logo">
				<div class="content_right">
					<h4>SD Show</h4>
				</div>
				<div class="content_icon1">
						<a href=""> <button id="first_button"> Admin </button></a>
				</div>
				<div class="content_icon2">
						<a href=""> <button id="second_button">Login</button></a>
				</div>
				<div class="content_icon3">
						<a href=""> <button id="third_button">Register</button></a>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>