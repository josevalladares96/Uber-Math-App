import java.util.ArrayList;

public class UberMath{
	private double mpg;
	private double gallonSize;
	private double commuteDays;

	public double getMpg() 
	{
		return mpg;
	}

	public void setMpg(double mpg) 
	{
		this.mpg = mpg;
	}

	public double getGallonSize() 
	{
		return gallonSize;
	}

	public void setGallonSize(double gallonSize) 
	{
		this.gallonSize = gallonSize;
	}

	public double getCommuteDays()
	{
		return commuteDays;
	}

	public void setCommuteDays(double commuteDays)
	{
		this.commuteDays = commuteDays;
	}


	//totalMiles() computes total miles per full gallon
	public double totalMiles(double mpg, double gallonSize)
	{
		double totalMiles = mpg*gallonSize;
		return totalMiles;
	}//end of totalMiles()


	/*ruCommute() does the following:
	 *takes in how many days are dedicated to commuting to school per week
	 *computes how many miles are left over in a "full" tank after commuting per school week 
	 *then returns the amount of miles left in that former full tank
	 */
	public double ruCommute(double commuteDays)
	{
		//commute from my house to Rutgers is about 32-34 miles approximately
		double commuteMiles = 68.0;
		double ruMiles = commuteMiles * commuteDays;

		double leftOverMiles = totalMiles(mpg, gallonSize) - ruMiles;
		return leftOverMiles;
	}//end of ruCommute()


	//workMileLimit() computes the daily mile limit according to how many days are dedicated to commuting, before having to fill tank up
	public double workMileLimit()
	{
		double workDays = 5.0;
		double workMileLimit = ruCommute(commuteDays) / workDays;
		
		return workMileLimit;
	}//end of workMileLimit()


	public double currentProfit(ArrayList<Double> profit)
	{
		double totalProfit = 0;
		
		for (int i = 0; i < profit.size(); i++)
		{
			totalProfit += profit.get(i);
		}

		return totalProfit;
	}


	public double currentMiles(ArrayList<Double> miles)
	{
		double totalMiles = 0;

		for (int n = 0; n < miles.size(); n++)
		{
			totalMiles += miles.get(n);
		}

		return totalMiles;
	}


	public double mileCompletion(ArrayList<Double> miles)
	{
		double currentMiles = 0;

		for (int n = 0; n < miles.size(); n++)
		{
			currentMiles += miles.get(n);
		}
		double mileCompletion = (currentMiles / 100) * 100;

		return mileCompletion;
	}
}

