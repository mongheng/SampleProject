<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
		<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
		<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
		<link rel="stylesheet" href="css/calendar.css">
		<link type="text/css" href="<c:url value="/resource/stylesheet.css"/>" rel="stylesheet">
    </head>
    <body>
    	<form action="home" method="get">
    		<pre>
    			Car Name: <input type="text" name="carname">
    			Car Reg: <input type="text" name="regnumber">
    			Car Date of Added: <input type="text" name="dateofadded" id="dateofadded">
    			Car Model Year:<input type="text" name="modelyear" id="modelyear"><input type="button" name="add" id="add" value="+" onclick="popupAdd();">
    			Car Availability Flag: <input type="text" name="availabilityflag" id="availabilityflag">
    			<input type="submit" name="Add">
    		</pre>
    	</form>
        <h1>Hello World!</h1><br>
        <a href="home">Home</a>
        
        <script type="text/javascript">
        	$(document).ready(function(){$(function(){$("#dateofadded").datepicker();});});
        	$(document).ready(function(){$(function(){$("#modelyear").datepicker();});});
        	
        	var popupWindow = null;
        	function popupAdd(){
        		popupWindow = window.open("new", "PopupWindow", "directories=no, status=no, menubar=no, scrollbars=yes, resizable=no,width=600, height=280,top=200,left=200")
        		popupWindow.focus();
        	}
        </script>
    </body>
</html>
