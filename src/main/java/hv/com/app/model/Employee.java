package hv.com.app.model;

public class Employee {
	private int id;
	private int deptId;
	private int salaryId;
	private int positionId;
	private int roleId;
	private String name;
	private String code;
	private String phone;
	private String address;
	private String birthday;
	private String joinDate;
	private String email;
	private String description;
	private boolean isPass;
	
	public Employee(int id, int deptId, int salaryId, int positionId,
			int roleId, String name, String code, String phone, String address,
			String birthday, String joinDate, String email, String description) {
		this.id = id;
		this.deptId = deptId;
		this.salaryId = salaryId;
		this.positionId = positionId;
		this.roleId = roleId;
		this.name = name;
		this.code = code;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.joinDate = joinDate;
		this.email = email;
		this.description = description;
	}
	
	public Employee() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public int getPositionId() {
		return positionId;
	}
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPass() {
		return isPass;
	}
	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", deptId=" + deptId + ", salaryId="
				+ salaryId + ", positionId=" + positionId + ", roleId="
				+ roleId + ", name=" + name + ", code=" + code + ", phone="
				+ phone + ", address=" + address + ", birthday=" + birthday
				+ ", joinDate=" + joinDate + ", email=" + email
				+ ", description=" + description + "]";
	}
}
