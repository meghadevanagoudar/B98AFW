  package generic;

import com.aventstack.extentreports.ExtentReports;

public interface IAutoConst {
	//all variables present in interface are public static final
	ExtentReports extent=new ExtentReports();
	String CONFIG_PATH ="./config.properties";
	String XL_PATH="./data/input.xlsx";
	String BROWSER="CHROME";
	String GRID="NO";
	String GRID_URL=" https://oauth-meghadevanagoudar25-42531:808bf474-cfc2-46eb-b2f6-4b8056ed53b2@ondemand.eu-central-1.saucelabs.com:443/wd/hub\"";
}
