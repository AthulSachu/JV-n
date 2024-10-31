public class StateGovernment extends Government {
	int noOfDistricts;
	float gst;

	public StateGovernment(int noOfPosition, String rules, Minister[] minister, Mla mla, Speaker speaker, int noOfDistricts, float gst) {
		// this.noOfPosition = noOfPosition; 
		// this.rules = rules; 
		// this.minister = minister; 
		// this.mla = mla; 
		// this.speaker = speaker;
		super(noOfPosition, rules, minister, mla, speaker); 
		this.noOfDistricts = noOfDistricts; 
		this.gst = gst;
	}

	public void printDetails() {
		for(int i=0; i<minister.length; i++) {
			System.out.println("Minister Details");
			minister[i].printDetails();
		}

		System.out.println("Mla is "+mla);
		System.out.println("Speaker is "+speaker);
		System.out.println("No. of position is "+noOfPosition);
		System.out.println("Rules is "+rules);
		System.out.println("No. of District "+noOfDistricts);
		System.out.println("Gst "+gst);
	}
}