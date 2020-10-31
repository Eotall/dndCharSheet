package characterModel;

public class DescriptiveFeature implements Feature {
	private String name;
	private String description;
	private String summary;
	
	public DescriptiveFeature(DescriptiveFeatureBuilder builder) {
		this.name = builder.getName();
		this.description = builder.getDesc();
		this.summary = builder.getSummary();
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return description;
	}
	
	public String getSummary() {
		return summary;
	}

	@Override
	public void execute(Character c) {
	}
	
	@Override
	public boolean equals(Feature other) {
		if (name.compareTo(other.getName()) == 0) {
			return true;
		}
		return false;
	}
}
