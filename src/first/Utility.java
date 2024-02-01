package first;

public class Utility {
	
	public static void printCandidate(Candidate cand) {
		System.out.println("Candidate ID: " + cand.candidateId);
		System.out.println("Name: " + cand.getName());
		System.out.println("Party: " + cand.party);
	}
	
	public static void printVoter(Voter vot) {
		System.out.println("Voter ID: " + vot.voterId);
		System.out.println("Name: " + vot.getName());
		System.out.println("Has Voted: " + vot.hasVoted);
	}

}
