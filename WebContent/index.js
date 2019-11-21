addEventListener('load', function() {
    
    var customerLogin = function(user, ev) {
        var customer = JSON.stringify(user);

        var xhr = new XMLHttpRequest();

        xhr.open('GET', '../eatm/rest/customerLogin');
        xhr.setRequestHeader('Content-type', 'application/json');
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status < 400) {
            	var vendors = JSON.parse(xhr.responseText);
            	console.log(vendors);
            	displayVendorList(vendors);
            	
            }
        };
        console.log(customer)
        xhr.send(null);
        

    };

    $("#customerLogin").click(function(ev) {
        ev.preventDefault();

    		var fName = $("#firstName").val();
    		var lName = $("#lastName").val();
    		console.log(fName);
    		console.log(lName);
    		var user = {
    				firstName : fName,
    				lastName : lName
    		
    		}
    	  alert( user.firstName + " " + user.lastName );
    	  customerLogin(user,ev);
    	});
    
    displayVendorList = function(vendors, ev){
    	$(".container").empty();
    	
    	for(var i = 0; i < vendors.length; i++){
    		var companyName = $("<p></p>").text(vendors[i].companyName);
    		var location = $("<p></p>").text(vendors[i].location);
    		var break1 = $("<b></b>");
    		var menuHeader = $("<p></p>").text("MENU");
    		var break2 = $("<b></b>");
    		$("body").append(companyName, location, break1, menuHeader, break2);
        	for(var j = 0; j < vendors[i].menu.menuItems.length; j++){
    		var menuItem = $("<p></p>").text(vendors[i].menu.menuItems[j].menuItemNameName);
    		$("body").append(menuItem);
        	}
        	var break3 = $("<b></b>");
        	$("body").append(break3, "***************************************");
        	
    	}
    };
});



