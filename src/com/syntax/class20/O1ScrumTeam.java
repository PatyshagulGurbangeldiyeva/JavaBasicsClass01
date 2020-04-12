package com.syntax.class20;

public class O1ScrumTeam extends O1Employee {
	String ceremonies;
	void attendMeetings() {
		System.out.println("Scrum team attends to "+ceremonies);
	}

}

class ProductOwner extends O1ScrumTeam{
	void prioritizingBacklog() {
		System.out.println("PO prioritize product backlog");
	}
}
class ScrumMaster extends O1ScrumTeam{
	void navigateTeam() {
		System.out.println("Scrum master faciliates Scrum team");
	}
}
class Developer extends O1ScrumTeam{
	void coding() {
	System.out.println("Developers write codes");
}
}
class Tester extends O1ScrumTeam{
	void testing() {
	System.out.println("Testers ensure quality of coding");
}
}

