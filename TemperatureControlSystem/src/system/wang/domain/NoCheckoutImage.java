package system.wang.domain;

import java.sql.Date;
import java.sql.Time;

public class NoCheckoutImage {
	
	private long ID;
	private String image_name;
	private String image_num;
	private String power_company_province;
	private String power_company_cityorcounty;
	private String suborlineorzone_name;
	private String location_detail;
	private String location_nature;
	private String original_image_path;
	private String ccd_image_path;
	private String matrix_path;
	private Date production_date;
	private Date run_date;
	private Date detection_date;
	private Time detection_date_detail;
	private Date report_date;
	private String instrument_model;
	private long instrument_num;
	private String reporter;
	private String principal;
	private String inspector;
	private String reviewer;
	private String auditor;
	private float rated_current;
	private float load_current;
	private float voltage_level;
	private String weather;
	private float E;
	private float wind_speed;
	private float DST;
	private float im_h_tm;
	private float im_l_tm;
	private float TATM;
	private float RH;
	private String device_name;
	private String device_type;
	private long device_ID;
	private String interval_name;
	private String test_unit;
	private String test_nature;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public String getImage_num() {
		return image_num;
	}
	public void setImage_num(String image_num) {
		this.image_num = image_num;
	}
	public String getPower_company_province() {
		return power_company_province;
	}
	public void setPower_company_province(String power_company_province) {
		this.power_company_province = power_company_province;
	}
	public String getPower_company_cityorcounty() {
		return power_company_cityorcounty;
	}
	public void setPower_company_cityorcounty(String power_company_cityorcounty) {
		this.power_company_cityorcounty = power_company_cityorcounty;
	}
	public String getSuborlineorzone_name() {
		return suborlineorzone_name;
	}
	public void setSuborlineorzone_name(String suborlineorzone_name) {
		this.suborlineorzone_name = suborlineorzone_name;
	}
	public String getLocation_detail() {
		return location_detail;
	}
	public void setLocation_detail(String location_detail) {
		this.location_detail = location_detail;
	}
	public String getLocation_nature() {
		return location_nature;
	}
	public void setLocation_nature(String location_nature) {
		this.location_nature = location_nature;
	}
	public String getOriginal_image_path() {
		return original_image_path;
	}
	public void setOriginal_image_path(String original_image_path) {
		this.original_image_path = original_image_path;
	}
	public String getCcd_image_path() {
		return ccd_image_path;
	}
	public void setCcd_image_path(String ccd_image_path) {
		this.ccd_image_path = ccd_image_path;
	}
	public String getMatrix_path() {
		return matrix_path;
	}
	public void setMatrix_path(String matrix_path) {
		this.matrix_path = matrix_path;
	}
	public Date getProduction_date() {
		return production_date;
	}
	public void setProduction_date(Date production_date) {
		this.production_date = production_date;
	}
	public Date getRun_date() {
		return run_date;
	}
	public void setRun_date(Date run_date) {
		this.run_date = run_date;
	}
	public Date getDetection_date() {
		return detection_date;
	}
	public void setDetection_date(Date detection_date) {
		this.detection_date = detection_date;
	}
	public Time getDetection_date_detail() {
		return detection_date_detail;
	}
	public void setDetection_date_detail(Time detection_date_detail) {
		this.detection_date_detail = detection_date_detail;
	}
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public String getInstrument_model() {
		return instrument_model;
	}
	public void setInstrument_model(String instrument_model) {
		this.instrument_model = instrument_model;
	}
	public long getInstrument_num() {
		return instrument_num;
	}
	public void setInstrument_num(long instrument_num) {
		this.instrument_num = instrument_num;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getInspector() {
		return inspector;
	}
	public void setInspector(String inspector) {
		this.inspector = inspector;
	}
	public String getReviewer() {
		return reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	public float getRated_current() {
		return rated_current;
	}
	public void setRated_current(float rated_current) {
		this.rated_current = rated_current;
	}
	public float getLoad_current() {
		return load_current;
	}
	public void setLoad_current(float load_current) {
		this.load_current = load_current;
	}
	public float getVoltage_level() {
		return voltage_level;
	}
	public void setVoltage_level(float voltage_level) {
		this.voltage_level = voltage_level;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public float getE() {
		return E;
	}
	public void setE(float e) {
		E = e;
	}
	public float getWind_speed() {
		return wind_speed;
	}
	public void setWind_speed(float wind_speed) {
		this.wind_speed = wind_speed;
	}
	public float getDST() {
		return DST;
	}
	public void setDST(float dST) {
		DST = dST;
	}
	public float getIm_h_tm() {
		return im_h_tm;
	}
	public void setIm_h_tm(float im_h_tm) {
		this.im_h_tm = im_h_tm;
	}
	public float getIm_l_tm() {
		return im_l_tm;
	}
	public void setIm_l_tm(float im_l_tm) {
		this.im_l_tm = im_l_tm;
	}
	public float getTATM() {
		return TATM;
	}
	public void setTATM(float tATM) {
		TATM = tATM;
	}
	public float getRH() {
		return RH;
	}
	public void setRH(float rH) {
		RH = rH;
	}
	public String getDevice_name() {
		return device_name;
	}
	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public long getDevice_ID() {
		return device_ID;
	}
	public void setDevice_ID(long device_ID) {
		this.device_ID = device_ID;
	}
	public String getInterval_name() {
		return interval_name;
	}
	public void setInterval_name(String interval_name) {
		this.interval_name = interval_name;
	}
	public String getTest_unit() {
		return test_unit;
	}
	public void setTest_unit(String test_unit) {
		this.test_unit = test_unit;
	}
	public String getTest_nature() {
		return test_nature;
	}
	public void setTest_nature(String test_nature) {
		this.test_nature = test_nature;
	}
	
}
