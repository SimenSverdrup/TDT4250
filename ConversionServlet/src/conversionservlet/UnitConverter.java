package conversionservlet;

public class UnitConverter { //values are x/1meter
	String fromUnit, toUnit;
	static double INCHES = 0.0254001;
	static double FEET = 0.3048;
	static double MILES = 1609.35;
	static double MILLIMETERS = 0.001;
	static double CENTIMETERS = 0.01;
	static double METERS = 1;
	static double KILOMETERS = 1000;
	private double val, meters, converted;
 
	public UnitConverter(String fromUnit, String toUnit) {
		this.fromUnit = fromUnit;
		this.toUnit = toUnit;
	}
		
	public double toMeters(double val) 
	 {
	  if(fromUnit.equals("in"))
	  {
	   meters = (val*INCHES);
	  }
	  else if(fromUnit.equals("ft"))
	  {
	   meters = (val*FEET);
	  }
	  else if(fromUnit.equals("mi"))
	  {
	   meters = (val*MILES);
	  }
	  else if(fromUnit.equals("mm"))
	  {
	   meters = (val*MILLIMETERS);
	  }
	  else if(fromUnit.equals("cm"))
	  {
	   meters = (val*CENTIMETERS);
	  }
	  else if(fromUnit.equals("m"))
	  {
	   meters = (val*METERS);
	  }
	  else
	  {
	   meters = (val*KILOMETERS);
	  }
	  return meters;
	 }
	 
	 public double fromMeters(double meters) 
	 {
	  if(fromUnit.equals("in"))
	  {
	   converted = Math.round(meters*39.369923740457715);
	  }
	  else if(fromUnit.equals("ft")) 
	  {
	   converted = Math.round(meters*3.280839895013123);
	  }
	  else if(fromUnit.equals("mi"))
	  {
	   converted = Math.round(meters*0.0006213688756330196);
	  }
	  else if(fromUnit.equals("mm")) 
	  {
	   converted = Math.round(meters*1000);
	  }
	  else if(fromUnit.equals("cm")) 
	  {
	   converted = Math.round(meters*100);
	  }
	  else if(fromUnit.equals("m")) 
	  {
	   converted = Math.round(meters*1);;
	  }
	  else 
	  {
	   converted = Math.round(meters*0.001);
	  }
	  return converted;
	 }	
}
