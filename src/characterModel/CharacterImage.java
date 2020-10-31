package characterModel;

import java.util.LinkedList;
/*import java.util.HashMap;
import java.util.Map;*/

public class CharacterImage {
	private int levels;
	private DndClass[] classes;
	private int classPointer;
	//private HashMap<String, Feature> features;
	private LinkedList<Feature> features;
	
	public CharacterImage(Character character, int levels) {
		this.levels = levels;
		reset();
	}
	
	public void addClass(DndClass dndClass) {
		try {
			classes[classPointer++] = dndClass;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("No more free levels");
		}
	}
	
	
	public void build(Character character) {
		for (DndClass c : classes) {
			for (Feature f : c.getFeatures()) {
				features.add(f);
			}
		}
		for (Feature f : features) {
			character.addFeature(f);
		}
		/*
		for (Class c : classes) {
			for (Map.Entry<String, Feature> entry : c.getFeatures().entrySet()) {
			    features.put(entry.getKey(), entry.getValue());
			}
		}
		for (Map.Entry<String, Feature> entry : features.entrySet()) {
			character.getFeatures().put(entry.getKey(), entry.getValue());
		}*/
	}
	
	public void reset() {
		classes = new DndClass[levels];
		classPointer = 0;
		//features = new HashMap<String, Feature>();
		features = new LinkedList<Feature>();
	}

}
