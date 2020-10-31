package characterModel;

import java.util.HashMap;
import java.util.LinkedList;

public class DndClassBuilder {
	public String className;
	public int level;
	public HashMap<Integer, LinkedList<Feature>> features;

	public DndClassBuilder(String className) {
		this.className = className;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void addFeature(int level, Feature f) {
		if (features.containsKey(level)) {
			features.get(level).add(f);
		} else {
			LinkedList<Feature> list = new LinkedList<Feature>();
			list.add(f);
			features.put(level, list);
		}
	}
}
