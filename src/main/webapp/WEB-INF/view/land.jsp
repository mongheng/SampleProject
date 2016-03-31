<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<c:url var="findProductForCat" value="/products_ajax"/>
<c:url var="findCcc" value="/ccc_ajax"/>
<title>Insert title here</title>
</head>
<script type="text/javascript">
$(document).ready(
		 function() {

		  $('#product_list_d').change(
		    function() {
		    //we can use get() method instead of getJSON() method.
		     $.getJSON('${findCcc}', {
		      productId : $(this).val(),
		      ajax : 'true'
		     }, function(data) {
		      var html = '<option value="">Select Ccc</option>';
		      var len = data.length;
		      
		      for ( var i = 0; i < len; i++) {
		       html += '<option value="' + data[i].cid + '">'
		         + data[i].cname + '</option>';
		      }
		      html += '</option>';
		   
		      $('#ccc_list_d').html(html);
		     });
		    });

		});
		
$(document).ready(
		 function() {
	
		  $('#category_list_d').change(
		    function() {
		    //we can use get() method instead of getJSON() method.
		     $.getJSON('${findProductForCat}', {
		      categoryId : $(this).val(),
		      ajax : 'true'
		     }, function(data) {
		      var html = '<option value="">Select Product</option>';
		      var len = data.length;
		      
		      for ( var i = 0; i < len; i++) {
		       html += '<option value="' + data[i].productId + '">'
		         + data[i].productName + '</option>';
		      }
		      html += '</option>';
		   
		      $('#product_list_d').html(html);
		     });
		    });

		});
		
		
$(document).ready(function(){$("#product_list_d").change(onSelectChange);});

function onSelectChange(){
	var selected = $("#product_list_d option:selected");
	var output = "";
	if (selected.val() != 0) {
		output = "You selected City " + selected.text();
	}
	$("#output").html(output);
}
</script>
<body>
<h3>Land Redirect</h3>
<form action="getCateAndPro" method="post">
    		<pre>
    			<select class="select-width" id="category_list_d" name="category_list_d">
    				<option value="">Select Category</option>
    				<c:forEach var="catList" items="${category_lst}">
    					<option value="${catList.categoryId}">${catList.categoryName}</option>
    				</c:forEach>
    			</select>
    			<select class="select-width" id="product_list_d" name="product_list_d">
					<option value="">Select Product</option> 
				</select>
				<select class="select-width" id="ccc_list_d" name="ccc_list_d">
					<option value="">Select CCC</option> 
				</select>
    			<input type="submit" name="GET">
    		</pre>
</form>
<div id="output"></div>
</body>
</html>