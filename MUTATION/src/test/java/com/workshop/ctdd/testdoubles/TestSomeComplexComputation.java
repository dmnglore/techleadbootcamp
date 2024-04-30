package com.workshop.ctdd.testdoubles;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

/**
 * Unit test for TestSomeComplexComputation.
 */
public class TestSomeComplexComputation

{
	@Test
	public void testComputeWithOddSeed()    
	{
		SomeComplexComputation Computation = new SomeComplexComputation(new Algorithm());

		Assert.assertEquals(1, Computation.compute(1));
	}


	@Test
	public void testComputeWithEvenSeed() {

		SomeComplexComputation Computation = new SomeComplexComputation(new Algorithm());

		Assert.assertEquals(1, Computation.compute(2));
		//Assert.assertEquals(9, Computation.compute(4));


	}


	@Test
	public void testComputeWithEvenSeedShouldCallStrategyA() {

		Algorithm mockAlgo = Mockito.mock(Algorithm.class);

		SomeComplexComputation Computation = new SomeComplexComputation(mockAlgo);
		Computation.compute(2);
		verify(mockAlgo,times(1)).StrategyA_TimeConsumingComputation(1);   	

	}



	@Test
	public void testComputeWithOddSeedShouldCallStrategyB() {
		
		Algorithm mockAlgo = Mockito.mock(Algorithm.class);

		SomeComplexComputation Computation = new SomeComplexComputation(mockAlgo);
		Computation.compute(1);
		verify(mockAlgo,times(1)).StrategyB_TimeConsumingComputation(1);   

	}
}
