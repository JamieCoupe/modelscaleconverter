package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ModelScaleConverter;

public class ModelScaleConverterTest {

	@Test
	public void test_WhenOneFootIsEnteredFourMilimeterIsReturnedIfOOGauge() {
		float expectedMeasurement = 4;
		float actualMeasurement = ModelScaleConverter.convertFeetToScaleMM("OO", 1f, 0f,0);
		assertEquals(expectedMeasurement, actualMeasurement, 0.001);
	}

	@Test
	public void test_WhenOneFootIsEnteredTwoMilimeterIsReturnedIfNGauge() {
		float expectedMeasurement = 2;
		float actualMeasurement = ModelScaleConverter.convertFeetToScaleMM("N", 1f, 0f,0);
		assertEquals(expectedMeasurement, actualMeasurement, 0.001);
	}

	@Test
	public void test_WhenSixInchesAreEnteredTwoMilimetersIsReturnedIfOOGauge() {
		float expectedMeasurement = 2;
		float actualMeasurement = ModelScaleConverter.convertFeetToScaleMM("OO", 0f, 6f,0);
		assertEquals(expectedMeasurement, actualMeasurement, 0.001);
	}
	
	@Test
	public void test_WhenOneFootSixInchesAreEnteredTwoMilimetersIsReturnedIfOOGauge() {
		float expectedMeasurement = 6;
		float actualMeasurement = ModelScaleConverter.convertFeetToScaleMM("OO", 1f, 6f,0f);
		assertEquals(expectedMeasurement, actualMeasurement, 0.001);
	}
	
	@Test
	public void test_WhenOneFootSixInchesAreEnteredTwoMilimetersIsReturnedIfNGauge() {
		float expectedMeasurement = 3;
		float actualMeasurement = ModelScaleConverter.convertFeetToScaleMM("N", 1f, 6f,0f);
		assertEquals(expectedMeasurement, actualMeasurement, 0.001);
	}
	
	@Test
	public void test_WhenOneEigthInchesAreEnteredBelowIsReturnedIfOOGauge() {
		float expectedMeasurement = 0.041666668f;
		float actualMeasurement = ModelScaleConverter.convertFeetToScaleMM("oo", 0f, 0f, 1/8f);
		assertEquals(expectedMeasurement, actualMeasurement, 0.001);
	}

}
