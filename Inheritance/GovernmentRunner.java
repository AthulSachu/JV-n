public class GovernmentRunner {
	public static void main(String[] args) {
		Minister minister = new Minister("Lotta", 25, 1000000);
		Minister educationMinister = new Minister("Sumanth", 25, 5000000);
		Minister[] ministerArr = {minister, educationMinister};
		Mla mla = new Mla();
		Speaker speaker = new Speaker();

		StateGovernment state = new StateGovernment(250, "Ration Card", ministerArr, mla, speaker, 29, 9.0f);

		state.printDetails();
	}
}