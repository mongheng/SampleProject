<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<title>Insert title here</title>
</head>

<body>
<h1>Popup Add</h1>
<input type='button' id='btn' value='Close' onclick="refreshParentAndCloseChild();"/>
<script type="text/javascript">
 function refreshParentAndCloseChild(){

	window.opener.location.href = window.opener.location.href;
	alert(window.opener.location.href);
	if (window.opener.progressWindow){
		window.opener.progressWindow.close();
	}
	window.close();
 }
 
 $(document).ready(function () {
     $('#btn').click(function () {
         window.opener.location.reload(true);
         window.close();
     });
 });
</script>
</body>
</html>