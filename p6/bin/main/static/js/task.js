$(document).ready(function() {	
	$(".btn").click(function(){
		var id=$(".number").val();
		$.ajax({
	        url: "/task/"+id
	    }).then(function(data) {
	    	$(".id").text("主题"+data.id);
	    	$(".message").text(data.message);
	    });
	});    
});
