$(document).ready(function() {
	
	ajaxGet();
	
	// DO GET
	function ajaxGet(){
		$.ajax({
			type : "GET",
			url : window.location + "productAPI/products",
			success: function(result){
				$.each(result, function(i, customer){
					
					var updateUrl=window.location + "productAPI/product/" + customer.productId;
					
					// render a customer data form
					var customerInfo = '<form id=custform_' + customer.productId + ' class="form-inline" style="margin-top:20px;margin-bottom:20px">' +
											'<div class="form-group">'	+
										 		'<label style="margin-left:10px; margin-right:5px">Id: </label>'	+
										 		'<input name="customerId" type="text" class="form-control" value=' + customer.productId + '>' +
										 	'</div>' +
										 	'<div class="form-group">'	+
										 		'<label style="margin-left:10px; margin-right:5px">Name: </label>'	+
										 		'<input name="name" type="text" class="form-control"  value=' + customer.productName + ' >' +
										 	'</div>' +
										 	
										 	'<div class="form-group">'	+
									 		'<label style="margin-left:10px; margin-right:5px">price: </label>'	+
									 		'<input name="customerId" type="text" class="form-control" value=' + customer.price + '>' +
									 	'</div>' +
										 	
										  	
										  	'<button type="submit" class="btn btn-default" style="margin-left:10px">Select</button>'
										'</form>';
					
					$('#customerlist .list-group').append(customerInfo)
					
					// default fill data of the first customer to update-form
					if(i==0){
						$("#updateFormCustId").val(customer.productId);
						$("#updateFormName").val(customer.productName);
						$("#updateFormAge").val(customer.price);
					}
					
		        });
				console.log("Success: ", result);
			},
			error : function(e) {
				$("#customerlist").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
})
