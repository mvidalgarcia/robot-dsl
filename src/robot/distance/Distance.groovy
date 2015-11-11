package robot.distance

import groovy.transform.TupleConstructor
import robot.Speed
import robot.time.Time;;;;

@TupleConstructor
class Distance {
	double amount
	DistanceUnit unit
	
	String toString() {
		"$amount $unit"
	}
	
	Speed div(Time t) {	
		new Speed(this, t)
	}
}
