package com;

public class ModelScaleConverter {

	private static final int DEFAULT_RETURN_VALUE = 0;
	private static final int INCH_CONVERTER = 12;
	private static final int N_GAUGE_MULTIPLYER = 2;
	private static final int DOUBLE_O_GAUGE_MULTIPLYER = 4;
	private static final String N_GAUGE = "N";
	private static final String DOUBLE_O_GAUGE = "OO";

	public static float convertFeetToScaleMM(String scale, float feetToConvert, float inchesToConvert,
			float fractionOfInchesToConvert) {
		float inchesAsDecimal = convertToDecimalFeet(inchesToConvert + fractionOfInchesToConvert);
		return convertByScale(scale, feetToConvert, inchesAsDecimal);

	}

	private static float convertByScale(String gauge, float feetToConvert, float inchesAsDecimal) {
		if (gauge.equalsIgnoreCase(DOUBLE_O_GAUGE)) {
			return convertFeetToOOGaugeMM(feetToConvert, inchesAsDecimal);
		} else if (gauge.equalsIgnoreCase(N_GAUGE)) {
			return convertFeetToNGaugeMM(feetToConvert, inchesAsDecimal);
		}
		return DEFAULT_RETURN_VALUE;
	}

	private static float convertFeetToNGaugeMM(float feetToConvert, float inchesAsDecimal) {
		return addDecimalToFeet(feetToConvert, inchesAsDecimal) * N_GAUGE_MULTIPLYER;
	}

	private static float convertFeetToOOGaugeMM(float feetToConvert, float inchesAsDecimal) {
		return addDecimalToFeet(feetToConvert, inchesAsDecimal) * DOUBLE_O_GAUGE_MULTIPLYER;
	}

	private static float addDecimalToFeet(float feetToConvert, float inchesAsDecimal) {
		return feetToConvert + inchesAsDecimal;
	}

	private static float convertToDecimalFeet(float inchesToConvert) {
		return inchesToConvert / INCH_CONVERTER;
	}

}
