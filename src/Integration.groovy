import robot.Robot
import robot.Direction
import robot.Distance
import robot.DistanceUnit
import robot.TimeUnit

myRobot = new Robot()

def binding = new Binding([
	robot: myRobot,
	left: Direction.left,
	right: Direction.right,
	forward: Direction.forward,
	backward: Direction.backward,
	move: myRobot.&move,
	h: TimeUnit.h,
	m: TimeUnit.m,
	s: TimeUnit.s
])

Integer.metaClass.getCm = {
	new Distance(delegate, DistanceUnit.centimeter)
}

Integer.metaClass.getM = {
	new Distance(delegate, DistanceUnit.meter)
}

Integer.metaClass.getKm = {
	new Distance(delegate, DistanceUnit.kilometer)
}

shell = new GroovyShell(binding)
shell.evaluate(new File("src/Command.groovy"))

