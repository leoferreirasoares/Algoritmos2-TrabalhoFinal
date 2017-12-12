package model;

public class Aluno {
	
	private String id;
	private String name;
	private String email;
	private int age;
	private String gender;
	private String comp;
	private String city;
	
	public Aluno(String id, String name, String email, int age, String gender, String comp, String city) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.comp = comp;
		this.city = city;
	}

	public Aluno(String name2, String email2, int idade, String cidade) {
		this.name = name2;
		this.email = email2;
		this.age = idade;
		this.city = cidade;
	}

	public String getId() {
		return id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getComp() {
		return comp;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender
				+ ", comp=" + comp + ", city=" + city + "]";
	}

}
