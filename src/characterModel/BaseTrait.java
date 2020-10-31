package characterModel;

import java.util.LinkedList;
//import java.util.HashMap;

public abstract class BaseTrait implements DataObject {
	//protected HashMap<String, Feature> features;
	protected LinkedList<Feature> features;
	
	public BaseTrait () {
		features = new LinkedList<Feature>();
	}
	
	public LinkedList<Feature> getFeatures() {
		return features;
	}
	
	/*public HashMap<String, Feature> getFeatures() {
		return features;
	}*/
}
