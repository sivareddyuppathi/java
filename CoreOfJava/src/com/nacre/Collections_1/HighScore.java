package com.nacre.Collections_1;

public class HighScore implements Comparable<HighScore> {
	
	String name;
	int score;
	public HighScore(String name, int score) {
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
		return "BatsmenName : " + name +"      " +" Runs : " + score;
	}
	@Override
	public int compareTo(HighScore o) {

		if (this.score - o.score > 0)
			return -1;
		else if (this.score - o.score < 0)
			return 1;
		return 0;
	}
	public int compareTo1(HighScore r) {

		if (this.score - r.score < 0)
			return -1;
		else if (this.score - r.score > 0)
			return 1;
		return 0;
	}

}
