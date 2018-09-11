/*// DO POST
$(document).ready(function() {
		
		// SUBMIT FORM
	    $("#customerForm").submit(function(event) {
			// Prevent the form from submitting via the browser.
			event.preventDefault();
			ajaxPost();
		});
	    
	    
	    function ajaxPost(){
	    	
	    	// PREPARE FORM DATA
	    	var formData = {
	    		ProductId :$("#pid").val(),
	    		ProductName :$("#pname").val(),
	    		Price :$("#price").val()
	    	}
	    	
$.ajax({
	type :"POST",
	contentType :"application/json",
	url :"http://localhost:8888/productAPI/product",
	data :JSON.stringify(formData),
	dataType :'json',
	success : function(result) {
		if(result.status == "Done"){
			$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
					"Post Successfully! <br>" +
					"---> Customer's Info: productId = " + 
					result.data.ProductId + " ,productName = " + result.data.ProductName + " ,price = " + result.data.Price + "</p>");
		}else{
			$("#postResultDiv").html("<strong>Error</strong>");
		}
		console.log(result);
	},
	error : function(e) {
		alert("Error!")
		console.log("ERROR: ", e);
	}
});

// Reset FormData after Posting
resetData();

}

function resetData(){
	$("#pid").val(),
	$("#pname").val(),
	$("#price").val()
}
})



































function addProduct(){
	var productId=$("#pid").val();
	var productName=$("#pname").val();
	var price=$("#price").val();
	console.log(productId+" "+productName+" "+price);

	var obj = {"productId": productId, "productName":productName, "price":price};

	console.log(obj);

	var objJson=JSON.stringify(obj);
                
                
	$.ajax({
		url : 'http://localhost:8888/productAPI/product',
		type : 'POST',
		data : objJson,
		contentType: "application/json",
		dataType: 'json',
		success : function(txt) {
			  var x= JSON.stringify(txt);
  
			console.log(x);
		}

		
	}
	);

}*/