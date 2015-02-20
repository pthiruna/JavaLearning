<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script type="text/javascript" src="./js/jquery-1.11.2.js"></script>
<script type="text/javascript">

var canvas;
var context;
var circleDefRadius=30;
var heightDef=100;
var textShiftDef=5;

var drawCircle = function(centerX,centerY) {
	var radius =circleDefRadius;
	context.beginPath();
    context.arc(centerX, centerY, radius, 0, 2 * Math.PI, false);
    context.fillStyle = 'yellow';
    context.fill();
    context.lineWidth = 1;
    context.strokeStyle = '#003300';
    context.stroke();
}

var drawLine = function(x1,y1,x2,y2) {
	context.beginPath();
    context.moveTo(x1, y1);
    context.lineTo(x2, y2);
    context.stroke();
	
}

var addText = function (x,y,text) {
	context.font = '15pt Calibri';
    context.fillStyle = 'blue';
    context.fillText(text,x-textShiftDef,y);
}

var displayNode = function (jsonObject,curHeight,isLeft,parentLocMulti) {
	
		
	drawCircle(canvas.width*parentLocMulti,curHeight*heightDef);
	addText(canvas.width*parentLocMulti,curHeight*heightDef,jsonObject.value);
	if (curHeight >1) {
		if (isLeft) {
			drawLine((canvas.width*parentLocMulti),curHeight*heightDef-circleDefRadius, (canvas.width*(parentLocMulti+(1/(Math.pow(2,curHeight)))))-circleDefRadius ,(curHeight-1)*heightDef)
		}else {
			drawLine((canvas.width*parentLocMulti),curHeight*heightDef-circleDefRadius, (canvas.width*(parentLocMulti-(1/(Math.pow(2,curHeight)))))+circleDefRadius  ,(curHeight-1)*heightDef)	
		}
	}
	
	
	
	
	if (jsonObject.leftNode != null) {
		displayNode(jsonObject.leftNode,curHeight+1,true,parentLocMulti-(1/(Math.pow(2,curHeight+1))));
	}
	if (jsonObject.rightNode !=null) {

		displayNode(jsonObject.rightNode,curHeight+1,false,parentLocMulti+(1/(Math.pow(2,curHeight+1))));
		
	}
	
	
	
	 
	 
	
};

$(document).ready(function () {
	

		 $.ajax({
             dataType : 'json',
             url : 'rest/Module/DisplayTree?methodToInvoke=<%=request.getParameter("methodToInvoke") %>',
             type : 'GET',
             success : function(data) {

              for (var i=0;i<data.length;i++) {
            	  
            	  $("#result").append("<br><br><h2>"+data[i].title + " </h2><br><canvas id='canvas"+i+"' width='200' height='100' style='border:1px solid #000000;'></canvas>");
            	  
            	  canvas = document.getElementById("canvas"+i);
            	  context = canvas.getContext("2d");

            		canvas.width=1200;
            		canvas.height=800;
            		
            	  
            	  displayNode(data[i].rootNode,1,false,(1/2));
            	  
              }
              
               
               
             

             },
             error: function (xhr, ajaxOptions, thrownError) {
                 alert(xhr.status);
                 alert(thrownError);
               }
		 	
         });
	
	
	
});

</script>



</head>
<body>
<%= request.getParameter("methodToInvoke") %> 

<div id="result">




</div>

</body>
</html>