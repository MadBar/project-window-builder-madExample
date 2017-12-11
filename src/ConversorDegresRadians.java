
public class ConversorDegresRadians {
	public double convertToDegree(double radians) {

		//degrees = radians * (180/pi)
		
		double result = radians *(180/Math.PI);
		System.out.println("Method: "+radians+"+ radians, to degrees is: "+result );

		
		return Math.round((result)*100)/100.00;
//		return result;
	}
	
	public double convertToRadians(double degree) {
		
		double result = degree *(Math.PI/180);
		System.out.println("Method: "+degree+"+ degree, to radians is: "+result );

		
		return Math.round((result)*100)/100.00;

//		return result;
	}
}
