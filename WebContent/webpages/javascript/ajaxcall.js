
function AjaxCall()
{
var tailText = document.getElementById("responsediv").value;
var xmlhttp;
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
	  var responseText = JSON.parse(xmlhttp.responseText);
	  document.getElementById("frame").value = responseText.frame;
	  document.getElementById("responsediv").innerHTML=tailText + responseText.tailOutput;
	  document.getElementById("responsediv").value=tailText + responseText.tailOutput;
	  var height = document.getElementById("responsediv").scrollHeight;
	  var incr = height - 50;
	  for(incr=(height-50);incr<height;incr++)
		  document.getElementById("responsediv").scrollTop = incr++; 
    }
  }
var frame = document.getElementById("frame").value;
xmlhttp.open("get","/servlet/HelloWorld?actionid=20&frame="+frame,true);
xmlhttp.send();
}

function ajaxGetBranchList()
{
var xmlhttp;
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
	if (xmlhttp.readyState==4 && xmlhttp.status==200){
	  insertRow(buildproc,xmlhttp.responseText);
    }
  }
xmlhttp.open("get","/servlet/HelloWorld?actionid=15",true);
xmlhttp.send();
}

function initBuild()
{
var xmlhttp;
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
	if (xmlhttp.readyState==4 && xmlhttp.status==200){
	  alert("build started");
    }
  }
xmlhttp.open("get","/servlet/HelloWorld?actionid=19",true);
xmlhttp.send();
}
