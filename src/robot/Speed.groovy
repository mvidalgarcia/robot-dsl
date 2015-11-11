package robot

import groovy.transform.TupleConstructor
import robot.distance.Distance
import robot.time.Time;;;

@TupleConstructor
class Speed {
	Distance distance
	Time time
	
	String toString() {
		"$distance/$time\n"
	}

}
