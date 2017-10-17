package system.wang.domain;

import java.sql.Date;
import java.sql.Time;

public class CheckoutImage {
	
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
	private String defect_part;
	private String defect_type;
	private String trouble_rank;
	private String diagnose_analyse;
	private String processing_way;
	private String tem_info;
	private String r1_name;
	private String r2_name;
	private String r3_name;
	private String r4_name;
	private String r5_name;
	private String phase11_name;
	private String phase12_name;
	private String phase13_name;
	private String phase14_name;
	private String phase15_name;
	private float high_tm1;
	private float high_tm2;
	private float high_tm3;
	private float high_tm4;
	private float high_tm5;
	private float low_tm1;
	private float low_tm2;
	private float low_tm3;
	private float low_tm4;
	private float low_tm5;
	private float re_tm1;
	private float re_tm2;
	private float re_tm3;
	private float re_tm4;
	private float re_tm5;
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
	public String getDefect_part() {
		return defect_part;
	}
	public void setDefect_part(String defect_part) {
		this.defect_part = defect_part;
	}
	public String getDefect_type() {
		return defect_type;
	}
	public void setDefect_type(String defect_type) {
		this.defect_type = defect_type;
	}
	public String getTrouble_rank() {
		return trouble_rank;
	}
	public void setTrouble_rank(String trouble_rank) {
		this.trouble_rank = trouble_rank;
	}
	public String getDiagnose_analyse() {
		return diagnose_analyse;
	}
	public void setDiagnose_analyse(String diagnose_analyse) {
		this.diagnose_analyse = diagnose_analyse;
	}
	public String getProcessing_way() {
		return processing_way;
	}
	public void setProcessing_way(String processing_way) {
		this.processing_way = processing_way;
	}
	public String getTem_info() {
		return tem_info;
	}
	public void setTem_info(String tem_info) {
		this.tem_info = tem_info;
	}
	public String getR1_name() {
		return r1_name;
	}
	public void setR1_name(String r1_name) {
		this.r1_name = r1_name;
	}
	public String getR2_name() {
		return r2_name;
	}
	public void setR2_name(String r2_name) {
		this.r2_name = r2_name;
	}
	public String getR3_name() {
		return r3_name;
	}
	public void setR3_name(String r3_name) {
		this.r3_name = r3_name;
	}
	public String getR4_name() {
		return r4_name;
	}
	public void setR4_name(String r4_name) {
		this.r4_name = r4_name;
	}
	public String getR5_name() {
		return r5_name;
	}
	public void setR5_name(String r5_name) {
		this.r5_name = r5_name;
	}
	public String getPhase11_name() {
		return phase11_name;
	}
	public void setPhase11_name(String phase11_name) {
		this.phase11_name = phase11_name;
	}
	public String getPhase12_name() {
		return phase12_name;
	}
	public void setPhase12_name(String phase12_name) {
		this.phase12_name = phase12_name;
	}
	public String getPhase13_name() {
		return phase13_name;
	}
	public void setPhase13_name(String phase13_name) {
		this.phase13_name = phase13_name;
	}
	public String getPhase14_name() {
		return phase14_name;
	}
	public void setPhase14_name(String phase14_name) {
		this.phase14_name = phase14_name;
	}
	public String getPhase15_name() {
		return phase15_name;
	}
	public void setPhase15_name(String phase15_name) {
		this.phase15_name = phase15_name;
	}
	public float getHigh_tm1() {
		return high_tm1;
	}
	public void setHigh_tm1(float high_tm1) {
		this.high_tm1 = high_tm1;
	}
	public float getHigh_tm2() {
		return high_tm2;
	}
	public void setHigh_tm2(float high_tm2) {
		this.high_tm2 = high_tm2;
	}
	public float getHigh_tm3() {
		return high_tm3;
	}
	public void setHigh_tm3(float high_tm3) {
		this.high_tm3 = high_tm3;
	}
	public float getHigh_tm4() {
		return high_tm4;
	}
	public void setHigh_tm4(float high_tm4) {
		this.high_tm4 = high_tm4;
	}
	public float getHigh_tm5() {
		return high_tm5;
	}
	public void setHigh_tm5(float high_tm5) {
		this.high_tm5 = high_tm5;
	}
	public float getLow_tm1() {
		return low_tm1;
	}
	public void setLow_tm1(float low_tm1) {
		this.low_tm1 = low_tm1;
	}
	public float getLow_tm2() {
		return low_tm2;
	}
	public void setLow_tm2(float low_tm2) {
		this.low_tm2 = low_tm2;
	}
	public float getLow_tm3() {
		return low_tm3;
	}
	public void setLow_tm3(float low_tm3) {
		this.low_tm3 = low_tm3;
	}
	public float getLow_tm4() {
		return low_tm4;
	}
	public void setLow_tm4(float low_tm4) {
		this.low_tm4 = low_tm4;
	}
	public float getLow_tm5() {
		return low_tm5;
	}
	public void setLow_tm5(float low_tm5) {
		this.low_tm5 = low_tm5;
	}
	public float getRe_tm1() {
		return re_tm1;
	}
	public void setRe_tm1(float re_tm1) {
		this.re_tm1 = re_tm1;
	}
	public float getRe_tm2() {
		return re_tm2;
	}
	public void setRe_tm2(float re_tm2) {
		this.re_tm2 = re_tm2;
	}
	public float getRe_tm3() {
		return re_tm3;
	}
	public void setRe_tm3(float re_tm3) {
		this.re_tm3 = re_tm3;
	}
	public float getRe_tm4() {
		return re_tm4;
	}
	public void setRe_tm4(float re_tm4) {
		this.re_tm4 = re_tm4;
	}
	public float getRe_tm5() {
		return re_tm5;
	}
	public void setRe_tm5(float re_tm5) {
		this.re_tm5 = re_tm5;
	}
	
}
