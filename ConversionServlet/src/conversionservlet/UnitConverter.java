package conversionservlet;

public class UnitConverter { //values are x/1meter
	String fromUnit, toUnit;
	static double FEET = 0.3048;
	static double MILES = 1609.35;
	static double INCHES = 0.0254;
	static double KILOMETERS = 1000;
	static double METERS = 1;
	static double CENTIMETERS = 0.01;
	static double MILLIMETERS = 0.001;
	private double value, converted;
 
	public UnitConverter(String fromUnit, String toUnit, double value) {
		this.fromUnit = fromUnit.toUpperCase();
		this.toUnit = toUnit.toUpperCase();
		this.value = value;
	}
	
	public double convert() {
		  if (((fromUnit.equals("METER")) || fromUnit.equals("METERS"))) {
			  return fromMeters(value);
		  }
		  else if (((toUnit.equals("METER")) || toUnit.equals("METERS"))) {
			  return toMeters(value);
		  }
		  else {
			  return -1;
		  }
	}
		
	public double toMeters(double val) {
	  if (((fromUnit.equals("INCHES")) || fromUnit.equals("INCH"))) {
		  converted = (val*INCHES); 
	  }
	  else if (((fromUnit.equals("FT")) || fromUnit.equals("FEET"))) {
		  converted = (val*FEET);
	  }
	  else if ((fromUnit.equals("MILES") || fromUnit.equals("MILE"))) {
		  converted = (val*MILES);
	  }
	  else if ((fromUnit.equals("MM") || fromUnit.equals("MMS"))) {
		  converted = (val*MILLIMETERS);
	  }
	  else if ((fromUnit.equals("CM") || fromUnit.equals("CMS"))) {
		  converted = (val*CENTIMETERS);
	  }
	  else if ((fromUnit.equals("M") || fromUnit.equals("METER"))) {
		  converted = (val*METERS);
	  }
	  else if ((fromUnit.equals("KM") || fromUnit.equals("KMS"))) {
		  converted = (val*KILOMETERS);
	  }
	  else {
		  converted = -1;
	  }
	  return converted;
	 }
	 
	 public double fromMeters(double meters) {
		 if (((fromUnit.equals("INCHES")) || fromUnit.equals("INCH"))) {
			 converted = Math.round(meters*39.369923740457715);
		 }
		 else if (((fromUnit.equals("FT")) || fromUnit.equals("FEET"))) {
			 converted = Math.round(meters*3.280839895013123);
		 }
		 else if ((fromUnit.equals("MILES") || fromUnit.equals("MILE"))) {
			 converted = Math.round(meters*0.0006213688756330196);
		 }
		 else if ((fromUnit.equals("MM") || fromUnit.equals("MMS"))) {
			 converted = Math.round(meters*1000);
		 }
		 else if ((fromUnit.equals("CM") || fromUnit.equals("CMS"))) {
			 converted = Math.round(meters*100);
		 }
		 else if ((fromUnit.equals("M") || fromUnit.equals("METER"))) {
			 converted = Math.round(meters*1);;
		 }
		 else if ((fromUnit.equals("KM") || fromUnit.equals("KMS"))) {
			 converted = Math.round(meters*0.001);
		 }
		 else {
			 converted = -1;
		 }
		 return converted;
	 }	
}
