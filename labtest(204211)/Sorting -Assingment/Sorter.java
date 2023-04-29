public class Sorter{
	Strategy strategy;
	
	Sorter()
	{
		strategy=null;
	}
	
	double[] Sort(double arr[], Strategy strategy)
	{
		return strategy.sort_strategy(arr);
	}
	double[] Sort(double arr[])
	{
		return strategy.sort_strategy(arr);
	}
	
	void setStrategy(Strategy strategy)
	{
		this.strategy=strategy;
	}
	 void display(double arr[])
	 {
	 	for(int i=0 ; i<arr.length ; i++)
	       	System.out.println(arr[i]);
	 }
	public double[] main(String[] args)
	{
	       Sorter sorter = new Sorter();
	       double temp[] = {24,65,87,97,67}};
	       double output[] = sorter.Sort(temp, new Bubble());
	       return(output);
	       

	       double values[] = {24,65,87,97,67}};
	       double output1[] = sorter.Sort(values, new Merge());
	       sorter.display(output1);
	       System.out.println("----");
	      
          double values[] = {24,65,87,97,67}};
	      double output1[] = sorter.Sort(values, new Insertion());
	      sorter.display(output1);
	} 
	       
	       
}

