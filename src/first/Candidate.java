package first;


public class Candidate extends Utility{
	
	public final int candidateId;
	public String name;
	public String party;
	
	private String firstName;
	private String lastName;
	
	
	public Candidate(int candidateId, String name, String party) {
		this.candidateId = candidateId;
		this.name = name;
		this.party = party;
		
	}
	
	public void setCandidateName(String name) {
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
		printCandidate(this);
	}

}
