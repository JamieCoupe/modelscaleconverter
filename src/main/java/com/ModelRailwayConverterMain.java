package com;

public class ModelRailwayConverterMain {

	private static final float FEET_TO_CONVERT = 0f;
	private static final float INCHES_TO_CONVERT = 1f;
	private static final float FRACTION_OF_INCHES_TO_CONVERT = 1/8;
	private static final String SCALE_TO_CONVERT = "oo";

	public static void main(String[] args) {
		System.out.println(ModelScaleConverter.convertFeetToScaleMM(SCALE_TO_CONVERT, FEET_TO_CONVERT, INCHES_TO_CONVERT,
				FRACTION_OF_INCHES_TO_CONVERT));
	}

}
