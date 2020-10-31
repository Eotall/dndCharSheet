package characterModel;

public class AbilityAdjustment implements Feature {
	private AbilityName ability;
	private int adj;
	private static int counter = 0; //TODO - fullösning med getName()
	
	public AbilityAdjustment (AbilityName ability, int adj) {
		this.ability = ability;
		this.adj = adj;
		counter++;
	}

	@Override
	public String getName() {
		return "AbilityAdjustment" + counter;
	}

	@Override
	public void execute(Character c) {
		try {
			c.getAbilities().get(ability).adjust(adj);
		} catch (AbilityIncreaseException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean equals(Feature other) {
		return false;
	}
}
