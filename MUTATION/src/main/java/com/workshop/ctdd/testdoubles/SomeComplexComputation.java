package com.workshop.ctdd.testdoubles;


public class SomeComplexComputation   
{
	Algorithm algo;

	public SomeComplexComputation(Algorithm algo) {
		super();
		this.algo =algo;
	}	

	int compute(int seed) {

		int result =0;

		if((seed % 2) == 0) {

			result =algo.StrategyA_TimeConsumingComputation(seed-1);
		}
		else {
			result =algo.StrategyB_TimeConsumingComputation(seed);
		}

		return result;
	}
}
