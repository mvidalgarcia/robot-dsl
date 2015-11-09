package robot

import groovy.transform.TupleConstructor;

@TupleConstructor
class Distance {
	double amount
	DistanceUnit unit
	
	String toString() {
		"$amount $unit"
	}
	
	def div(time) {
		
		print "at $this per $time"
	}
}
