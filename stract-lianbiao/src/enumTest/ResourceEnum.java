package enumTest;

public enum ResourceEnum {
	INSTANCE;
	private Resuroce instance;
	ResourceEnum(){
		instance = new Resuroce();
	}
	public Resuroce getInstance(){
		return instance;
	}
}
