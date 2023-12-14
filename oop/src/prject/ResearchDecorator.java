package prject;


class ResearcherDecorator extends UserDecorator {
	 public ResearcherDecorator(User user) {
	     super(user);
	 }
	
	 public void publishPaper() {
	       System.out.println("Researcher " + user.getUserId() + " publishes a paper.");
	 }
	
	 public void calculateHIndex() {
	
	     System.out.println("Researcher " + user.getUserId() + " calculates H-Index.");
	 }
	

}