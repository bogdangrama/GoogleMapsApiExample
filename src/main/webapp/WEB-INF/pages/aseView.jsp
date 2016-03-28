<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<title>Ase Map</title>
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
		        map = new google.maps.Map(document.getElementById('map'), {
		          center: {lat: ${latitude}, lng: ${longitude}},
		          zoom: 18
		          //mapTypeId: google.maps.MapTypeId.SATELLITE,
		          //zoom: 20
		        });
		      }
		    </script>
		    
		<script	src="${googleKeyUrl}" async defer></script>
	</body>
</html>
