package com.netctoss.sys.tariffmag.beans;

public class Tariff {
	private Long id;
	private String tariffName;
	private String tariffType;
	private Long basicTime;
	private Double basicCharge;
	private Double perCharge;
	private String explains;
	private int state;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTariffName() {
		return tariffName;
	}
	public void setTariffName(String tariffName) {
		this.tariffName = tariffName;
	}
	public String getTariffType() {
		return tariffType;
	}
	public void setTariffType(String tariffType) {
		this.tariffType = tariffType;
	}
	public Long getBasicTime() {
		return basicTime;
	}
	public void setBasicTime(Long basicTime) {
		this.basicTime = basicTime;
	}
	public Double getBasicCharge() {
		return basicCharge;
	}
	public void setBasicCharge(Double basicCharge) {
		this.basicCharge = basicCharge;
	}
	public Double getPerCharge() {
		return perCharge;
	}
	public void setPerCharge(Double perCharge) {
		this.perCharge = perCharge;
	}
	public String getExplains() {
		return explains;
	}
	public void setExplains(String explains) {
		this.explains = explains;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Tariff() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tariff [id=" + id + ", tariffName=" + tariffName + ", tariffType=" + tariffType + ", basicTime="
				+ basicTime + ", basicCharge=" + basicCharge + ", perCharge=" + perCharge + ", explains=" + explains
				+ ", state=" + state + "]";
	}
	
	
}
