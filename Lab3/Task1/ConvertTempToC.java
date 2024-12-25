package Task1;
import java.util.function.Function;

class ConvertTempToC  implements Function<Double, Double>{
	@Override
	public Double apply(Double value){
		value = (value * 9/5) + 32;
		return value;
	}
	
}