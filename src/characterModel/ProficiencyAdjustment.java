package characterModel;

public class ProficiencyAdjustment implements Feature {
	private ProficiencyObject obj;
	private boolean bool;
	private static int counter = 0; //TODO - full�sning med getName()
	
	public ProficiencyAdjustment (ProficiencyObject obj, Boolean bool) {
		this.obj = obj;
		this.bool = bool;
	}

	@Override
	public String getName() {
		return "ProficiencyAdjustment" + counter;
	}

	@Override
	public void execute(Character c) {
		var prof = c.getProficiencies();
		prof.put(obj, bool);
	}

	@Override
	public boolean equals(Feature other) {
		return false;
	}
}
