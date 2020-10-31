package characterModel;

public class DescriptiveFeatureBuilder {
	private String name;
	private String description;
	private String summary;
	
	public DescriptiveFeatureBuilder(String name) {
		this.name = name;
	}
	
	public void setDesc(String desc) {
		this.description = desc;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
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
	
	public DescriptiveFeature build() {
		return new DescriptiveFeature(this);
	}

}
