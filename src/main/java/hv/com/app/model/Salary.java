package hv.com.app.model;

public class Salary {
	private int id;
	private int userId;
	private int probationSalary;
	private int officialSalary;
	private int updateBy;
	private String lastUpdateDate;
	
	public Salary(int id, int userId, int probationSalary, int officialSalary, int updateBy, String lastUpdateDate) {
		this.id = id;
		this.userId = userId;
		this.probationSalary = probationSalary;
		this.officialSalary = officialSalary;
		this.updateBy = updateBy;
		this.lastUpdateDate = lastUpdateDate;
	}
	
	public Salary() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProbationSalary() {
		return probationSalary;
	}
	public void setProbationSalary(int probationSalary) {
		this.probationSalary = probationSalary;
	}
	public int getOfficialSalary() {
		return officialSalary;
	}
	public void setOfficialSalary(int officialSalary) {
		this.officialSalary = officialSalary;
	}
	public int getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(int updateBy) {
		this.updateBy = updateBy;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
}
