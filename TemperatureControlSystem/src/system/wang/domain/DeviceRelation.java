package system.wang.domain;

public class DeviceRelation {
	private long ID;
	private long fatherID;
	private long sonID;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public long getFatherID() {
		return fatherID;
	}
	public void setFatherID(long fatherID) {
		this.fatherID = fatherID;
	}
	public long getSonID() {
		return sonID;
	}
	public void setSonID(long sonID) {
		this.sonID = sonID;
	}
	
}
