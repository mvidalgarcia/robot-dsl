package robot

class Robot {
	def move(dir) {
		print "Moving $dir "
		this
	}
	
	def at (vel) {
		//print "at $vel"
		this
	}
	
//	String direction = "left";
//	String distance = "20";
//	String distanceUnit = "km";
//	String timeUnit = "h";
//
//	String uri = String.format("http://robotmanager.azurewebsites.net/api/move?direction=%s&distance=%s&distanceUnit=%s&timeUnit=%s",
//		direction, distance, distanceUnit, timeUnit);
//	URL url = new URL(uri);
//	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//	connection.setRequestMethod("GET");
//	connection.setRequestProperty("Accept", "application/json");
//
//	BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
//	String output = br.readLine().split(":")[1].replace("}", "").replace("\"", "");
//	System.out.println(output);

}
