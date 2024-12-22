package Task1;
import java.util.function.Function;

class ConvertTempToF  implements Function<Double, Double>{
	@Override
	public Double apply(Double value){
		value = (value - 32) *5/9;
		return value;
	}
	
}