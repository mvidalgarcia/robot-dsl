package robot.time

import groovy.transform.TupleConstructor;

@TupleConstructor
class Time {
	double amount
	TimeUnit timeUnit
	
	String toString() {
		"$amount $timeUnit"
	}

}
