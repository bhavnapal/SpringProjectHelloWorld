$(document).ready(function() {
	
	$(document).on('submit', 'form', function (e) {
		event.preventDefault();
		fillDetailsToUpdateForm($(this));
	})
	
	$("#customizedForm").submit(function(){
		event.preventDefault();
		ajaxPut();
	});
	
	function fillDetailsToUpdateForm(object){
		var custId = $(object).find("input[name='customerId']").val();
		var name = $(object).find("input[name='name']").val();
		var age = $(object).find("input[name='age']").val();
		
		$("#updateFormCustId").val(custId);
		$("#updateFormName").val(name);
		$("#updateFormAge").val(age);
	}
	
	/*
	 * AJAX PUT updated-form
	 */
    function ajaxPut(){
    	// PREPARE FORM DATA
    	var formData = {
    			id: $("#updateFormCustId").val(),
    			name : $("#updateFormName").val(),
    			age : $("#updateFormAge").val()   			
    	}
    	
    	var id = $("#updateFormCustId").val();
    	
    	console.log("formData before PUT: " + formData);
    	
    	// DO PUT
    	$.ajax({
			type : "PUT",
			contentType : "application/json",
			url : window.location + "productAPI/product/" +id,
			data : JSON.stringify(formData),
			dataType : 'json',
			
			// SUCCESS response
			success : function(customer) {
				// Create successful message
				$("#putResultDiv").html("<p style='background-color:#67597E; color:white; padding:20px 20px 20px 20px'>" + 
											"Put Successfully! <br>" +
											"--> {id: " + customer.productId +
												"name: " + customer.productName +
												", age: " + customer.price +
												"}</p>");
				
				// Again fill data to Update-Form
				$("#updateFormCustId").val(customer.id);
				$("#updateFormName").val(customer.name);
				$("#updateFormAge").val(customer.age);
				
				// Update name of the updated customer on Customer List
				$('#custform_' + customer.id).find("input[name='name']").val(customer.name);
				$('#custform_' + customer.id).find("input[name='age']").val(customer.age);
				
			},
			
			// ERROR response 
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    }
})

