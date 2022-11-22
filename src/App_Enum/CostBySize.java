package App_Enum;

public enum CostBySize {
	SMALL(10), MEDIUM(14), LARGE(16);
	
	private final int value;
		
	CostBySize(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
