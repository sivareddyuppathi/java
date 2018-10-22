package com.nacre.Collections_1;

 class ReminingScore implements Comparable<ReminingScore>{
		String name;
		int score;
		public ReminingScore(String name, int score) {
			super();
			this.name = name;
			this.score = score;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public String toString() {
			return "ReminingScore [name=" + name + ", score=" + score + "]";
		}
		
		@Override
		public int compareTo(ReminingScore rs) {
			if(this.score-rs.score < 0)
				return -1;
			if(this.score-rs.score > 0)
				return 1;
			return 0;
		}
		
}
