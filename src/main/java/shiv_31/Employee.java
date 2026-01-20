package shiv_31;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< Updated upstream

@Entity(name="empp")
=======
import jakarta.persistence.OneToOne;

@Entity(name = "empp")
>>>>>>> Stashed changes
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int salary;
<<<<<<< Updated upstream
	
	
=======
>>>>>>> Stashed changes
	
	@OneToOne
	private Address address;

	public Employee() {
		super();
	}

<<<<<<< Updated upstream


	public Employee( String name, String gender, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
=======
	public Employee(String name, String gender, int salary) {
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	

	public Address getAddress() {
		return address;
>>>>>>> Stashed changes
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", address="
				+ address + "]";
	}

	

}	