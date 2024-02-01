package inClassExercise;

public class Voter {
	
	private final int voterId; // should be final
	private String name;
	private boolean hasVoted; 


	public Voter(int voterId, String name, boolean hasVoted) {
		this.voterId = voterId;
		this.name = name;
		this.hasVoted = hasVoted;
	}

}
