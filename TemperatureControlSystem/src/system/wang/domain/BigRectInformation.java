package system.wang.domain;

public class BigRectInformation {
	private int ID;
	private float start_point_x;
	private float start_point_y;
	private float end_point_x;
	private float end_point_y;
	private float high_tm;
	private float low_tm;
	private float avg_tm;
	private float re_tm;
	private String rect_name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public float getStart_point_x() {
		return start_point_x;
	}
	public void setStart_point_x(float start_point_x) {
		this.start_point_x = start_point_x;
	}
	public float getStart_point_y() {
		return start_point_y;
	}
	public void setStart_point_y(float start_point_y) {
		this.start_point_y = start_point_y;
	}
	public float getEnd_point_x() {
		return end_point_x;
	}
	public void setEnd_point_x(float end_point_x) {
		this.end_point_x = end_point_x;
	}
	public float getEnd_point_y() {
		return end_point_y;
	}
	public void setEnd_point_y(float end_point_y) {
		this.end_point_y = end_point_y;
	}
	public float getHigh_tm() {
		return high_tm;
	}
	public void setHigh_tm(float high_tm) {
		this.high_tm = high_tm;
	}
	public float getLow_tm() {
		return low_tm;
	}
	public void setLow_tm(float low_tm) {
		this.low_tm = low_tm;
	}
	public float getAvg_tm() {
		return avg_tm;
	}
	public void setAvg_tm(float avg_tm) {
		this.avg_tm = avg_tm;
	}
	public float getRe_tm() {
		return re_tm;
	}
	public void setRe_tm(float re_tm) {
		this.re_tm = re_tm;
	}
	public String getRect_name() {
		return rect_name;
	}
	public void setRect_name(String rect_name) {
		this.rect_name = rect_name;
	}

}
