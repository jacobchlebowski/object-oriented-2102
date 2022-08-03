import java.util.LinkedList;
public class Planning {
	
	public double rainfall(LinkedList<Double> DRR) {
		double total = 0;
		LinkedList<Double> nonNegative = new LinkedList<Double>();
	
		for(double num : DRR) {
			if(num == -999){
				if(nonNegative.isEmpty()) {
					return -1;
				}
				return total/nonNegative.size();
			}
			else if(num > 0) {
				total = num + total;
				nonNegative.add(num);
			}
		}
		if(nonNegative.isEmpty()) {
			return -1;
		}
		return total/nonNegative.size();
	}
}
