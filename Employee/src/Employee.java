import java.time.Instant;

public class Employee {
	private boolean managerFlag;
	private String name;
	private Instant dateHired;
	private int id;
	private boolean partTimeFlag;
	
	public Employee() {}
	
	public boolean isManagerFlag() {
		return managerFlag;
	}
	public void setManagerFlag(boolean managerFlag) {
		this.managerFlag = managerFlag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instant getDateHired() {
		return dateHired;
	}
	public void setDateHired(Instant dateHired) {
		this.dateHired = dateHired;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isPartTimeFlag() {
		return partTimeFlag;
	}
	public void setPartTimeFlag(boolean partTimeFlag) {
		this.partTimeFlag = partTimeFlag;
	}

}
