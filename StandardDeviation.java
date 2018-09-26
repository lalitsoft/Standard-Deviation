package com.lalitsoft.arrays;

class StandardDeviation
{
	public static void main(String args[])
	{
		double[] x={1,4,7,2,6};
		double[] y=new double[x.length];
		double mean=mean(x);
		System.out.println("\n\nMean : "+mean);

		for(int i=0;i<x.length;i++)
		{
			y[i]=(x[i]-mean)*(x[i]-mean);
		}

		double variance=mean(y);
		System.out.println("\n\nVariance : "+variance);
		
	
		double standardd=Math.sqrt(variance);
		System.out.println("\n\nStandard Deviation : "+standardd);

	}

	static double mean(double[] x)
	{
		double sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		double mean=(sum/(x.length));
		return mean;
	}

}