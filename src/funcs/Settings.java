package funcs;

public class Settings {
	public static final String HELP_DOCUMENT = """

		--- Java E6B v0.1 ---
<[FUNCTION] ([PARAMS ...]) -> [RESULT]>
CTF ( C ) -> F
CWC ( TC WD KTS ) -> CWC
DA ( PA OAT ) -> DA 
FTC ( F ) -> C
FUEL ( HH MM GPH ) -> G
GS ( TC TA WD KTS ) -> GS
HWC ( TC WD KTS ) -> HWC
NM ( SM ) -> NM
PA ( A ALT ) -> PA
SM ( NM ) -> SM
TWC ( TC WD WS ) -> TWC
TIME ( GS D ) -> TIME
TAS ( CAS PA OAT ) -> TAS
WCA ( TAS TC WD KTS ) -> WCA
""";

	public static final String INVALID_PARAMS_ERROR = "Invalid Params : ";
	public static final String DIVIDE_BY_ZERO_ERROR = "Zero Division : ";

	public static final Double CELCIUS_TO_KELVIN_FACTOR = 273.15d;
	public static final Double DEFAULT_TIME = 0d;
	public static final Double DENSITY_CHANGE_FACTOR = 120d;
	public static final Double FEET_TO_METERS_FACTOR = 0.3048d;
	public static final Double GRAVITY_ACCELERATION = 9.81d;
	public static final Double MAX_RADIAL = 360d;
	public static final Double NAUTICAL_MILES_TO_STATUTE_MILES_FACTOR = 1.15078d;
	public static final Double SPECIFIC_GAS = 287.0d;
	public static final Double STANDARD_AIR_DENSITY = 1.225d;
	public static final Double STANDARD_PRESSURE = 29.92d;
	public static final Double STANDARD_TEMPERATURE_C = 15d; 
	public static final Double TEMPERATURE_LAPSE_RATE_CPF = 2d;
	public static final Double TEMPERATURE_LAPSE_RATE_KPM = 0.0065d;
	public static final Double TEMPERATURE_LAPSE_RATE_PER_FEET = 1000d;
	public static final Double WIND_CORRECTION_ANGLE_APROX_FACTOR = 90d;

	public static final String ALTIMETER_SETTING_CODE = "ALT";
	public static final String CALIBRATED_AIRPSEED_CODE = "CAS";
	public static final String CELCIUS_CODE = "C";
	public static final String CELCIUS_TO_FAHRENHEIT_CODE = "CTF";
	public static final String CROSS_WIND_COMPONENT_CODE = "CWC";
	public static final String DENSITY_ALTITUDE_CODE = "DA";
	public static final String DISTANCE_CODE = "D";
	public static final String FAHRENHEIT_CODE = "F";
	public static final String FAHRENHEIT_TO_CECLIUS_CODE = "FTC";
	public static final String FUEL_CODE = "FUEL";
	public static final String GALLONS_CODE = "GAL";
	public static final String GALLONS_PER_HOUR_CODE = "GPH";
	public static final String GROUND_SPEED_CODE = "GS";
	public static final String HEAD_WIND_COMPONENT_CODE = "HWC";
	public static final String HELP_CODE = "HELP";
	public static final String HOURS_CODE = "HH";
	public static final String INDICATED_AIRPSEED_CODE = "IAS";
	public static final String MINUTES_CODE = "MM";
	public static final String NAUTICAL_MILES_CODE = "NM";
	public static final String OUTSIDE_AIR_TEMPERATURE_CODE = "OAT";
	public static final String PRESSURE_ALTITUDE_CODE = "PA";
	public static final String STATUTE_MILES_CODE = "SM";
	public static final String TAIL_WIND_COMPONENT_CODE = "TWC";
	public static final String TIME_CODE = "TIME";
	public static final String TRUE_AIRSPEED_CODE = "TAS";
	public static final String TRUE_ALTITUDE_CODE = "A";
	public static final String TRUE_COURSE_CODE = "TC";
	public static final String WIND_CORRECTION_ANGLE_CODE = "WCA";
	public static final String WIND_DIRECTION_CODE = "WD"; 
	public static final String WIND_SPEED_CODE = "KTS";
}
