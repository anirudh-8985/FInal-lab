Public class sorter{
Strategy strategy;
sort(double[])
{}
sort (double[])
set Strategy (Strategy enum)
{
}
Public static void main(String[] args)
{
Sorter sorter = new sorter();
Arraylist output = sorter.sort([1,3,-1,5,100,12,13]);
System.out.println(output);
}

Sorter()
	{
		strategy = null;
	}

	double[] Sort(double arr[] , Strategy strategy)
	{
		return strategy.sortstrategy(arr);

	}

	double[] Sort(double arr[])
	{
		return strategy.sortstrategy(arr);
	}

	void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;

	}
      
		
	public static void main(String[] args)
	{
		Sorter sorter = new Sorter();
		double temp[] = {1,3,-1,5,100,12,13};

		double output[] = sorter.Sort(temp,new Bubble());

		for(int i =0 ; i < output.length ; i++ )
		{
			System.out.println(output[i]);
		}
		

  }

