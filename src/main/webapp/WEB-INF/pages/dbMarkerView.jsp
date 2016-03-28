<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<title>DB Marker</title>
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
		    	  var myLatLng = {lat: ${aseLatitude}, lng: ${aseLongitude}};

		    	  // Create a map object and specify the DOM element for display.
		    	  var map = new google.maps.Map(document.getElementById('map'), {
		    	    center: myLatLng,
		    	    scrollwheel: false,
		    	    zoom: 4
		    	  });

		    	  // Create a marker and set its position.
		    	  var marker = new google.maps.Marker({
		    	    map: map,
		    	    position: myLatLng,
		    	    title: 'Hello World!'
		    	  });
		      }
		    </script>
		    
		<script	src="${googleKeyUrl}" async defer></script>
	</body>
</html>
