package robot

enum TimeUnit {
	h('hour', 1),
	m('minute', 60),
	s('second', 3600)
	
	String name
	double multiplier
	
	TimeUnit(String name, double mult) {
		this.name = name
		this.multiplier = mult
	}
	
	String toString() {
		name
	}

}
