package characterModel;

import java.util.ArrayList;
//import java.util.Map;

public abstract class Background extends BaseTrait {
	protected ArrayList<ProficiencyAdjustment> proficiencyAdjustments;
	
	public Background () {
		super();
	}
	
	public void build(Character c) {
		for (ProficiencyAdjustment adj : proficiencyAdjustments) {
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
