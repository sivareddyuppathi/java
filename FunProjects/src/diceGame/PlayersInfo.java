package diceGame;

public class PlayersInfo {
	int id;
	String fName;
	String sName;
	double age;
	double dOB;
	//int previousWins;
	public PlayersInfo(int id, String fName, String sName, double age, double dOB) {
		//super();
		this.id = id;
		this.fName = fName;
		this.sName = sName;
		this.age = age;
		this.dOB = dOB;
	}
	@Override
	public String toString() {
		return "PlayersInfo [id=" + id + ", fName=" + fName + ", sName=" + sName + ", age=" + age + ", dOB=" + dOB
				+ "]";
	}
	

}
