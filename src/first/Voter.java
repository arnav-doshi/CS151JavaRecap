package first;

public class Voter extends Utility{
	
	public final int voterId;
	public String name;
	public boolean hasVoted; 
	
	private String firstName;
	private String lastName;
	
	public Voter(int voterId, String name, boolean hasVoted) {
		this.voterId = voterId;
		this.name = name;
		this.hasVoted = hasVoted;
		
	}
	
	public void setVoterName(String name) {
		String first = name.substring(0, name.indexOf(""));
		String last = name.substring(name.indexOf(""));
		
		firstName = first;
		lastName = last;
	}
	
	public String getName() {
		String first = firstName.toUpperCase();
		String last = lastName.toUpperCase();
		
		return first + last;
	}
	
	public void printInfo() {
		printVoter(this);
	}

}
