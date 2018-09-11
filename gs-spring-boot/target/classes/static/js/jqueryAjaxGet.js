
$(document).ready(function() {
	
	/*
	$.ajaxSetup{
		cache:false;
	}
	*/
display();




// Do DELETE a Customer via JQUERY AJAX
	$(document).on("click","#delete",function() {
		
		var jobDescId = $(this).parent().find('input').val();
		var workingObject = $(this);
		
		$.ajax({
			type : "DELETE",
			url : window.location + "jobDesc/deleteJobRequestListId/" + jobDescId,
			success: function(resultMsg){
				$("#resultMsgDiv").html("<p style='text-align:centre; background-color:#67597E; color:white; padding:20px 20px 20px 20px'>" +
											"JobDescription with Id: " + jobDescId + " is Deleted successfully!"  +
										"</p>");
				
				workingObject.closest("tr").remove();
				
				// re-css for table
				$( "#example tbody tr:odd" ).addClass("info");
				$( "#example tbody tr:even" ).addClass("success");
			},
			error : function(e) {
				alert("ERROR: ", e);
				console.log("ERROR: ", e);
			}
		});
	});
	
	
	
	
$(document).on("click","#view",function() {
		
		var jobDescId = $(this).parent().find('input').val();
		var workingObject = $(this);
		
		
		
		
		
			$.ajax({
				type : "GET",
				url :"http://localhost:8888/jobDesc/getJobRequestList/"+jobDescId ,
				success: function(result){
					
					
					console.log(result.jobDescId);
					
					
						/*$("#jobDescId").append(result.jobDescId);
						$("#makerId").append(result.jobDescMakerId);
						$("#checkerId").append(result.jobDescCheckerId);
						$("#raisedonDate").append(result.jobDescRaisedOnDate);
						$("#approveRejectDate").append(result.approveRejectDate);
						$("#experience").append(result.jobDescExperience);
						$("#skill_mand").append(result.jobDescSkillsSetMandatory);
						$("#skill_opt").append(result.jobDescSkillsSetOptional);
						$("#profile").append(result.jobDescProfile);
						$("#qualification").append(result.jobDesQualification);
						$("#expected_doj").append(result.jobDescExpectedDateOfJoining);
						$("#no_of_candidates").append(result.jobDescNumberOfCandidates);
						$("#certification").append(result.jobDescCertification);
						$("#responsibility").append(result.jobDescResponsibility);
						$("#project").append(result.jobDescProject);
						$("#status").append(result.jobDescStatus);
						$("#budget").append(result.jobDescBudget);
						$("#comments").append(result.jobDescComments);*/
					
					
					
					$("#raisedonDate").append(result.jobDescRaisedOnDate);
					$("#jobDescId").append(result.jobDescId);
				    $("#profile").append(result.jobDescProfile);
				    $("#project").append(result.jobDescProject);
			        $("#experience").append(result.jobDescExperience);			
					$("#qualification").append(result.jobDesQualification);
					$("#certification").append(result.jobDescCertification);
					$("#skill_mand").append(result.jobDescSkillsSetMandatory);	
					$("#skill_opt").append(result.jobDescSkillsSetOptional);
					$("#responsibility").append(result.jobDescResponsibility);
					$("#expected_doj").append(result.jobDescExpectedDateOfJoining);	
					
				

		},
		error: function(e){
			alert("ERROR: ", e);
			console.log("ERROR: ", e);
		}
	});
		
		
		
});






$(document).on("click","#edit",function() {
	
	var jobDescId = $(this).parent().find('input').val();
	var workingObject = $(this);
	
	
	
	
	
		$.ajax({
			type : "GET",
			url :"http://localhost:8888/jobDesc/getJobRequestList/"+jobDescId ,
			success: function(result){
				
				
				console.log(result.jobDescId);
				
				
		    $("#Date1").val(result.jobDescRaisedOnDate);
		    $("#Profile1").val(result.jobDescProfile);
		    $("#Project1").val(result.jobDescProject);
	        $("#Experience1").val(result.jobDescExperience);			
			$("#Qualification1").val(result.jobDesQualification);
			$("#Certification1").val(result.jobDescCertification);
			$("#Skill_Set_Mandetory1").val(result.jobDescSkillsSetMandatory);	
			$("#Skill_Set_Optional1").val(result.jobDescSkillsSetOptional);
			$("#Job_Responsibility1").append(result.jobDescResponsibility);
			$("#Expected_Date_of_joining1").val(result.jobDescExpectedDateOfJoining);		
					
			
				
					
			

	},
	error: function(e){
		alert("ERROR: ", e);
		console.log("ERROR: ", e);
	}
});
	
	
	
});
	
		
	
})


/*function viewData(){
	
	
	var jobDescId = $(this).parent().find('input').val();
	var workingObject = $(this);
	
	
	
	
	
		$.ajax({
			type : "GET",
			url :"http://localhost:8888/jobDesc/getJobRequestList/"+jobDescId ,
			success: function(result){
				console.log(result.jobDescId);
				
				
					$("#jobDescId").append(result.jobDescId)
					$("#makerId").append(result.jobDescMakerId)
					$("#checkerId").append(result.jobDescCheckerId)
					$("#raisedonDate").append(result.jobDescRaisedOnDate)
					$("#approveRejectDate").append(result.jobDescApprovedRejectDate)
					$("#experience").append(result.jobDescExperience)
					$("#skill_mand").append(result.jobDescSkillsSetMandatory)
					$("#skill_opt").append(result.jobDescSkillsSetOptional)
					$("#profile").append(result.jobDescProfile)
					$("#qualification").append(result.jobDesQualification)
					$("#expected_doj").append(result.jobDescExpectedDateOfJoining)
					$("#no_of_candidates").append(result.jobDescNumberOfCandidates)
					$("#certification").append(result.jobDescCertification)
					$("#responsibility").append(result.jobDescResponsibility)
					$("#project").append(result.jobDescProject)
					$("#status").append(result.jobDescStatus)
					$("#budget").append(result.jobDescBudget)
					$("#comments").append(result.jobDescComments)

	}
});
	
	
	
}*/








function myFunctionUpdate(){
	
	var jobDescId = $(this).parent().find('input').val();
	var workingObject = $(this);
	
	var jobDescRaisedOnDate=$("#Date").val();
	var jobDescProfile=$("#Profile").val();
	var jobDescProject=$("#Project").val();
	var jobDescExperience=$("#Experience").val();
	var jobDesQualification=$("#Qualification").val();
	var jobDescCertification=$("#Certification").val();
	var jobDescSkillsSetMandatory=$("#Skill_Set_Mandetory").val();
	var jobDescSkillsSetOptional=$("#Skill_Set_Optional").val();
	var jobDescResponsibility=$("#Job_Responsibility").val();
	var jobDescExpectedDateOfJoining=$("#Expected_Date_of_joining").val();
	
	
	var obj = {
			"jobDescRaisedOnDate": jobDescRaisedOnDate,
			"jobDescProfile":jobDescProfile,
			"jobDescProject":jobDescProject,
			"jobDescExperience":jobDescExperience,
			"jobDesQualification":jobDesQualification,
			"jobDescCertification":jobDescCertification,
			"jobDescSkillsSetMandatory":jobDescSkillsSetMandatory,
			"jobDescSkillsSetOptional":jobDescSkillsSetOptional,
			"jobDescResponsibility":jobDescResponsibility,
			"jobDescExpectedDateOfJoining":jobDescExpectedDateOfJoining
			};
	
	
var objJson=JSON.stringify(obj);

	$.ajax({
		url :window.location + '/updateJobRequestListId/'+jobDescId,
		type : 'PUT',
		data : objJson,
		contentType: "application/json",
		dataType: 'json',
		success : function(txt) {
			  var x= JSON.stringify(txt);//END OF  ADD METHOD 
			 
			  
			  
			  
			  
			  // display();
			  
			  //location.reload();
			  
			  $( "#example tbody tr:odd" ).addClass("info");
			  $( "#example tbody tr:even" ).addClass("success");
				
		},
		error : function(e) {
			alert("ERROR: ", e);
			console.log("ERROR: ", e);
		}



		});
}









function display(){
	console.log("display called")
	$.ajax({
		type : "GET",
		url : window.location + "jobDesc/getJobRequestListHome",
		success: function(result){
			$.each(result, function(index, JobDecBo){
				
				var customerRow = '<tr>' +
									'<td>'+ JobDecBo.jobDescId+  '</td>' +
									
									'<td>'  + JobDecBo.jobDescProfile+  '</td>' +
									
									'<td>' + JobDecBo.jobDescEmployee+'</td>' +
									
									'<td>' + JobDecBo.jobDescRaisedOnDate+'</td>' +
									
									'<td>'  + JobDecBo.jobDescStatus+  '</td>' +
						
									
									'<td class="text-center">' +
						        	   
								    '<input type="hidden" value=' + JobDecBo.jobDescId + '>' +
							        	 
				        	
				 '<a href="#" id="view" style="color: #2196F3;" title="View" data-toggle="modal" data-target="#myModal1" onclick="viewData()">'+
				    '<i class="material-icons">&#xE417;</i>'+
				 '</a>'+
				'<a href="" id="edit" style="color: #FFC107;" title="Edit"  data-toggle="modal" data-target="#myModal2">'+
				  '<i class="material-icons">&#xE254;</i>'+
				'</a>'+
				'<a	href="#" id="delete" style="color: #ff5b5b;" title="Delete"	data-toggle="tooltip">'+
				  '<i class="material-icons">&#xE872;</i>'+
				'</a>'+
								   
						        	/*'<a id="edit">' +
			          				'<span class="glyphicon glyphicon-pencil"></span>' +
			          				'</a>&nbsp;&nbsp;' +
			          		
			          				
			          				
			          				
			          				
			          				'<a id="delete">' +
									'<span class="glyphicon glyphicon-remove" ></span>' +
				        			'</a>&nbsp;&nbsp;' +*/
				        			
				        			
				        			
						        '</td>' +
						        
						       
						   
									
								  '</tr>';
				
				$('#example tbody').append(customerRow);
				
	        });
			
			$( "#example tbody tr:odd" ).addClass("info");
			$( "#example tbody tr:even" ).addClass("success");
			
		},
		error : function(e) {
			alert("ERROR: ", e);
			console.log("ERROR: ", e);
		}
	});	
}










function addJobDescRecq(){
	
	
	var jobDescRaisedOnDate=$("#Date").val();
	var jobDescProfile=$("#Profile").val();
	var jobDescProject=$("#Project").val();
	var jobDescExperience=$("#Experience").val();
	var jobDesQualification=$("#Qualification").val();
	var jobDescCertification=$("#Certification").val();
	var jobDescSkillsSetMandatory=$("#Skill_Set_Mandetory").val();
	var jobDescSkillsSetOptional=$("#Skill_Set_Optional").val();
	var jobDescResponsibility=$("#Job_Responsibility").val();
	var jobDescExpectedDateOfJoining=$("#Expected_Date_of_joining").val();
	
	console.log(jobDescRaisedOnDate+" "+jobDescProfile+" "+jobDescProject+""+jobDescExperience+""+jobDesQualification+""+jobDescCertification+""+jobDescCertification+""+jobDescSkillsSetMandatory+""+jobDescSkillsSetOptional+""+jobDescResponsibility+""+jobDescExpectedDateOfJoining);

	//var obj = {"productId": productId, "productName":productName, "price":price};
	
	var obj = {
			"jobDescRaisedOnDate": jobDescRaisedOnDate,
			"jobDescProfile":jobDescProfile,
			"jobDescProject":jobDescProject,
			"jobDescExperience":jobDescExperience,
			"jobDesQualification":jobDesQualification,
			"jobDescCertification":jobDescCertification,
			"jobDescSkillsSetMandatory":jobDescSkillsSetMandatory,
			"jobDescSkillsSetOptional":jobDescSkillsSetOptional,
			"jobDescResponsibility":jobDescResponsibility,
			"jobDescExpectedDateOfJoining":jobDescExpectedDateOfJoining
			};
	
	

	console.log(obj);

	// Convert dat
	var objJson=JSON.stringify(obj);
                
                
	$.ajax({
		url : 'http://localhost:8888/jobDesc/addJobDecReq',
		type : 'POST',
		data : objJson,
		contentType: "application/json",
		dataType: 'json',
		success : function(txt) {
			  var x= JSON.stringify(txt);//END OF  ADD METHOD 
			 
			  
			  
			  
			  
			  // display();
			  
			  location.reload();
			  
	/*		  $.ajax({
					type : "GET",
					url : window.location + "jobDesc/getJobRequestListHome",
					success: function(result){
						$.each(result, function(index, JobDecBo){
							
							var customerRow = '<tr>' +
												'<td>'+ JobDecBo.jobDescId+  '</td>' +
												
												'<td>'  + JobDecBo.jobDescProfile+  '</td>' +
												
												'<td>' + JobDecBo.jobDescEmployee+'</td>' +
												
												'<td>' + JobDecBo.jobDescRaisedOnDate+'</td>' +
												
									
												
												'<td class="text-center">' +
									        	'<input type="hidden" value=' + JobDecBo.jobDescId + '>' +
									        	'<a>' +
									        	'<span class="glyphicon glyphicon-eye-open"></span>' +
									        	'</a>&nbsp;&nbsp;&nbsp;' +
									        	'<a>' +
						          				'<span class="glyphicon glyphicon-pencil"></span>' +
						          				'</a>&nbsp;&nbsp;&nbsp;' +
						          				'<a>' +
												'<span class="glyphicon glyphicon-remove"></span>' +
							        			'</a>&nbsp;&nbsp;&nbsp;' +
							        			
							        			
							        			
									        '</td>' +
									        
											'<td>'  + JobDecBo.jobDescStatus+  '</td>' +
												
											  '</tr>';
							
							$('#example tbody').append(customerRow);
							
				        });
						
						$( "#example tbody tr:odd" ).addClass("info");
						$( "#example tbody tr:even" ).addClass("success");
					},
					error : function(e) {
						alert("ERROR: ", e);
						console.log("ERROR: ", e);
					}
				});	*/			console.log(x);

		}

		
	});

}


