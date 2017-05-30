package java8codesamples;


class employee {
	private int age;
	private String name;
	
	public employee(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "employee [age=" + age + ", name=" + name + "]";
	}
	
	
}
public class ObjectComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e1 = new employee(2, "pascal");
		employee e2 = new employee(2, "pascall");

		if (e1.equals(e2))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
