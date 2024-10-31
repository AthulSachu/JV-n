public class Government {
	int noOfPosition;
	String rules;
	Minister[] minister;
	Mla mla;
	Speaker speaker;

	public Government(int noOfPosition,String rules,Minister[] minister,Mla mla,Speaker speaker) {
		this.noOfPosition=noOfPosition;
		this.rules=rules;
		this.minister=minister;
		this.mla=mla;
		this.speaker=speaker;
	}

	public Government() {

	}
}