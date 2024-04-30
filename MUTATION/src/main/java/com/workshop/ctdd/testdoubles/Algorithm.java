package com.workshop.ctdd.testdoubles;

public class Algorithm {

	public int StrategyA_TimeConsumingComputation(int seed) {

		//complex computation  

		return seed*seed;
	}

	public int StrategyB_TimeConsumingComputation(int seed) {

		//complex computation 

		return ((seed+seed)-1);
	}

}
