import robot.Robot
import robot.Direction
import robot.distance.Distance
import robot.distance.DistanceUnit
import robot.time.Time
import robot.time.TimeUnit
import robot.crowd.Crowd
import robot.crowd.CrowdUnit
import robot.SleepingWay
import robot.FightingWay
import robot.Enemy
import robot.Food
import robot.Drawing
import robot.SpeakingTone

myRobot = new Robot()

def binding = new Binding([
	robot: myRobot,
	left: Direction.left,
	right: Direction.right,
	forward: Direction.forward,
	backward: Direction.backward,
	deep: SleepingWay.deep,
	light: SleepingWay.light,
	hard: FightingWay.hard,
	soft: FightingWay.soft,
	EvilRobot: Enemy.EvilRobot,
	MateRobot: Enemy.MateRobot,
	meal: Food.meal,
	dinner: Food.dinner,
	painting: Drawing.painting,
	map: Drawing.map,
	loudly: SpeakingTone.loud,
	lowly: SpeakingTone.low,
	map: Drawing.map,
	move: myRobot.&move,
	jump: myRobot.&jump,
	sleep: myRobot.&sleep,
	fight: myRobot.&fight,
	cook: myRobot.&cook,
	draw: myRobot.&draw,
	say: myRobot.&say,
	h: new Time(1, TimeUnit.hour),
	m: new Time(1, TimeUnit.minute),
	s: new Time(1, TimeUnit.second)
])

Number.metaClass.getCm = {
	new Distance(delegate, DistanceUnit.centimeter)
}

Number.metaClass.getM = {
	new Distance(delegate, DistanceUnit.meter)
}

Number.metaClass.getKm = {
	new Distance(delegate, DistanceUnit.kilometer)
}

Number.metaClass.getYd = {
	new Distance(delegate, DistanceUnit.yard)
}

Number.metaClass.getFt = {
	new Distance(delegate, DistanceUnit.feet)
}

Number.metaClass.getSec = {
	new Time(delegate, TimeUnit.second)
}

Number.metaClass.getMin = {
	new Time(delegate, TimeUnit.minute)
}

Number.metaClass.getHr = {
	new Time(delegate, TimeUnit.hour)
}

Integer.metaClass.getPeople = {
	new Crowd(delegate, CrowdUnit.people)
}

Integer.metaClass.getFamilies = {
	new Crowd(delegate, CrowdUnit.families)
}

shell = new GroovyShell(binding)
shell.evaluate(new File("src/Command.groovy"))

