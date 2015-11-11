package robot.crowd

enum CrowdUnit {
	people('people'),
	families('families')
	
	String name
	
	CrowdUnit(String name) {
		this.name = name
	}
	
	String toString() {
		name
	}

}
