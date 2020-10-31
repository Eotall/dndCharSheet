package characterModel;

import java.util.LinkedList;
import java.util.Observable;
import java.util.HashMap;
//import java.util.Map;

public class Character extends Observable {
	private String name;
	private Race race;
	private Background background;
	private HashMap<AbilityName, Ability> abilities;
	private HashMap<ProficiencyObject, Boolean> proficiencies;
	private CharacterImage[] levelImage;
	//private HashMap<String, Feature> features; 
	private LinkedList<Feature> features;
	
	public Character(String name) {
		this.name = name;
		abilities = new HashMap<AbilityName, Ability>();
		genAbilities();
		proficiencies = new HashMap<ProficiencyObject, Boolean>();
		levelImage = new CharacterImage[20];
		genImages();
		//features = new HashMap<String, Feature>();
		features = new LinkedList<Feature>();
	}
	
	private void genImages() {
		for (int i = 0; i < levelImage.length; i++) {
			levelImage[i] = new CharacterImage(this, i);
		}
	}
	
	private void genAbilities() {
		abilities.put(AbilityName.STRENGTH, new Ability(10));
		abilities.put(AbilityName.DEXTERITY, new Ability(10));
		abilities.put(AbilityName.CONSTITUTION, new Ability(10));
		abilities.put(AbilityName.INTELLIGENCE, new Ability(10));
		abilities.put(AbilityName.WISDOM, new Ability(10));
		abilities.put(AbilityName.CHARISMA, new Ability(10));
	}
	
	
	public void setAbilityScore(AbilityName ability, int score) {
		abilities.put(ability, new Ability(score));
	}
	
	public void addFeature(Feature f) {
		//features.put(f.getName(), f);
		features.remove(f);
		features.add(f);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public HashMap<AbilityName, Ability> getAbilities() {
		return abilities;
	}
	
	public HashMap<ProficiencyObject, Boolean> getProficiencies() {
		return proficiencies;
	}

	public CharacterImage getLevelImage(int i) {
		CharacterImage output = null;
		try {
			output = levelImage[i];
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
		return output;
	}

	/*public HashMap<String, Feature> getFeatures() {
		return features;
	}*/
	
	public LinkedList<Feature> getFeatures() {
		return features;
	}
	
	
	public void build(int level) {
		race.build(this);
		background.build(this);
		try {
			getLevelImage(level).build(this);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Level index out of bounds (standard legal input 1-20)");
		}
		
		
		
		for (Feature f : features) {
			f.execute(this);
		}
		/*for (Map.Entry<String, Feature> entry : features.entrySet()) {
			entry.getValue().execute(this);;
		}*/
	}
}
