package robot

class Robot {
	def move(dir) {
		print "Moving $dir "
		this
	}
	
	def move(info, dir) {
		print "Moving $dir at ${info.at}"
	}
	
	def at (speed) {
		print "at $speed"
	}
	
	def jump(dir, distance) {
		print "Jumping $dir $distance\n"
	}
	
	def sleep(way) {
		print "Sleeping $way "
		this
	}
	
	def during(time) {
		print "during $time\n"
	}
	
	def fight(way) {
		print "Ready to fight $way "
		this
	}
	
	def against(enemy) {
		print "against $enemy\n"
	}
	
	def cook(food) {
		print "Cooking $food "
		this
	}
	
	def to(people) {
		print "to $people"
	}
	
	def draw(info, drawing) {
		print "Drawing $drawing of size ${info.width} x ${info.height}\n"
	}
	
	def say(SpeakingTone tone) {
		if (tone == tone.loud)
			print "ROBOT YELLS: "
		if (tone == tone.low)
			print "Robot whispers: "
		this
	}
	
	def sentence(s) {
		print s+"\n"
	}

}
