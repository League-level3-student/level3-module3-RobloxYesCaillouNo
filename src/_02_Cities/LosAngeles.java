package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double taxes = growthRate * population * (growthRate * 0.5);
		
		return taxes;
	}
	
}
