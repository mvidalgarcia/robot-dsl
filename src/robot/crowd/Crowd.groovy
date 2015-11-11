package robot.crowd

import groovy.transform.TupleConstructor;

@TupleConstructor
class Crowd {
	double amount
	CrowdUnit crowdUnit
	
	String toString() {
		"$amount $crowdUnit\n"
	}

}
