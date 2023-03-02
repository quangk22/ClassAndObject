package advance.dev;

public class Student {
	public String name;
	public int age;
	public String add;
	public String phone;
	public double diemTB;

	Student(String name, int age, String add, String phone, double diemTB) {
		// TODO Auto-generated method stub
		this.name = name;
		this.age = age;
		this.add = add;
		this.phone = phone;
		this.diemTB = diemTB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
}
