package characterModel;

import java.util.ArrayList;
//import java.util.Map;

public abstract class Race extends BaseTrait {
	protected ArrayList<AbilityAdjustment> abilityAdjustments;
	
	public Race () {
		super();
	}
	
	public void build(Character c) {
		for (AbilityAdjustment adj : abilityAdjustments) {
			c.addFeature(adj);
		/*for (Map.Entry<String, Feature> entry : getFeatures().entrySet()) {
			c.addFeature(entry.getValue());
		}*/
		for (Feature f : getFeatures()) {
			c.addFeature(f);
		}
		}
	}
}
