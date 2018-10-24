package model;

public enum MeasureType {
	TEMPERATURE("Temperature", "°C"), 
	PRESSURE("Pressure", "bars"), 
	RADIATION("Radiation", "Sv");

	private String label;
	private String unit;

	MeasureType(String label, String unit){
		this.label = label;
		this.unit = unit;
	}

	public String getLabel() {
		return label;
	}

	public String getUnit() {
		return unit;
	}
}
