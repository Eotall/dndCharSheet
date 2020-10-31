package characterModel;

public class Ability {
	private int score;
	private int modifier;
	private int maxBound;
	
	public Ability(int score) {
		this.score = score;
		maxBound = 20;
		calcMod();
	}
	
	private void calcMod() {
		modifier = (score-(score%2)-10)/2;
	}
	
	public int score() {
		return score;
	}
	
	public int mod() {
		return modifier;
	}
	
	public void increase() throws AbilityIncreaseException {
		if (score < maxBound) {
			score++;
			calcMod();
		} else {
			throw new AbilityIncreaseException(this.toString() + ":" + Integer.toString(score+1));
		}
	}
	
	public void adjust(int adj) throws AbilityIncreaseException {
		if (score + adj >= 0 || score + adj <= maxBound) {
			score += adj;
			calcMod();
		} else {
			throw new AbilityIncreaseException(this.toString() + ":" + Integer.toString(score+adj));
		}
	}
	
	public void setMaxBound(int newMax) {
		maxBound = newMax;
	}
}
