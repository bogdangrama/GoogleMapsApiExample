<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<title>ASE to DB Map</title>
		<meta name="viewport" content="initial-scale=1.0">
		<meta charset="utf-8">
		<style>
			html, body {
				height: 80%;
				margin: 20;
				padding: 20;
			}
			
			#map {
				height: 100%;
			}
		 </style>
	</head>
	<body>
		<div id="map"></div>
			<script>
		      var map;
		      function initMap() {
		    	 
		    	  var asePosition = {lat: ${aseLatitude}, lng: ${aseLongitude}};
		   		  var dbPosition = {lat: ${dbLatitude}, lng: ${dbLongitude}};

		    	  var map = new google.maps.Map(document.getElementById('map'), {
		    	    center: dbPosition,
		    	    zoom: 7
		    	  });

		    	  var directionsDisplay = new google.maps.DirectionsRenderer({
		    	    map: map
		    	  });

		    	  // Set destination, origin and travel mode.
		    	  var request = {
		    	    destination: dbPosition,
		    	    origin: asePosition,
		    	    travelMode: google.maps.TravelMode.DRIVING
		    	  };

		    	  // Pass the directions request to the directions service.
		    	  var directionsService = new google.maps.DirectionsService();
		    	  directionsService.route(request, function(response, status) {
		    	    if (status == google.maps.DirectionsStatus.OK) {
		    	      // Display the route on the map.
		    	      directionsDisplay.setDirections(response);
		    	    }
		    	  });
		      }
		    </script>
		    
		<script	src="${googleKeyUrl}" async defer></script>
	</body>
</html>
