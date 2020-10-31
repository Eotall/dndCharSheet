package characterModel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class DndClass {
	protected String className;
	protected int level;
	protected HashMap<Integer, LinkedList<Feature>> features;
	
	public DndClass (DndClassBuilder cb) {
		this.className = cb.className;
		this.level = cb.level;
		this.features = cb.features;
	}
	
	public String getClassName() {
		return className;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int i) {
		level = i;
	}
	
	public LinkedList<Feature> getFeatures() {
		return getFeaturesToLevel(level);
	}
	
	public LinkedList<Feature> getFeaturesToLevel(int bound) {
		LinkedList<Feature> output = new LinkedList<Feature>();
		for (Map.Entry<Integer, LinkedList<Feature>> entry : features.entrySet()) {
			if (entry.getKey() <= bound) {
				for (Feature f : entry.getValue()) {
					output.remove(f);
					output.add(f);
				}
			}
		}
		return output;
	}
}
