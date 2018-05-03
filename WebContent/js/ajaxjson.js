 	$(function(){
  		$("#txtName").blur(function(){
  			$.post("ajax.do",{'name1':$("#txtName").val()},
  					function(data){
  				alert(data);
  			});
  		});
  	}); 
//   	$(function(){
//  		$("#btn").click(function(){
//  			$.post("json.do",
//  					function(data){
//  				alert(data);
//  			});
//  		});
//  	}); 
  	
   	$(function(){
  		$("#btn").click(function(){
  			$.post("json.do",function(data){
  				var html="";
  				for(var i=0;i<data.length;i++){
  					html+="<tr><td>"+data[i].id+"</td><td>"+data[i].name+"</td><td>"+data[i].pwd+"</td></tr>"
  				}
  				$("#content").html(html);
  			});
  		});
  	});