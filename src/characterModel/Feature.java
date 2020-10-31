package characterModel;

public interface Feature {
	String getName();
	void execute(Character c);
	boolean equals(Feature other);
}
