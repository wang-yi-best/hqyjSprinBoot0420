/**
　 * <p>Title: Country.java</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 
　 * @version 1.0
*/ 
package com.wangyi.springBoot.modules.test.entity;

/**
　 * <p>Title: Country</p>
　 * <p>Description: </p>
　 * @author yi.wang
　 * @date 2020年4月23日 上午9:30:34 
*/
public class Country {
	private int countryId;
	private String countryName;
	private String localCountryName;
	private String countryCode;
	private String countryCode2;
	private String continent;
	private String region;
	private float surfaceArea;
	private int indepYear;
	private int population;
	private float lifeExpectancy;
	private float gnp;
	private String governmentForm;
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getLocalCountryName() {
		return localCountryName;
	}
	public void setLocalCountryName(String localCountryName) {
		this.localCountryName = localCountryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryCode2() {
		return countryCode2;
	}
	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public float getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public int getIndepYear() {
		return indepYear;
	}
	public void setIndepYear(int indepYear) {
		this.indepYear = indepYear;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public float getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public float getGnp() {
		return gnp;
	}
	public void setGnp(float gnp) {
		this.gnp = gnp;
	}
	public String getGovernmentForm() {
		return governmentForm;
	}
	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", localCountryName="
				+ localCountryName + ", countryCode=" + countryCode + ", countryCode2=" + countryCode2 + ", continent="
				+ continent + ", region=" + region + ", surfaceArea=" + surfaceArea + ", indepYear=" + indepYear
				+ ", population=" + population + ", lifeExpectancy=" + lifeExpectancy + ", gnp=" + gnp
				+ ", governmentForm=" + governmentForm + "]";
	}
	
	
}
