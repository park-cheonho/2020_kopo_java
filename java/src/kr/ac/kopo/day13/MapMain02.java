package kr.ac.kopo.day13;

import java.util.HashMap;
import java.util.Map;

class Member {
	private String name;
	private String phone;
	
	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}
	
	/*
	@Override
	public String toString() {
		return "name : " + this.name + ", phone : " + this.phone;
	}
	
	@Override
	public boolean equals(Object obj) {

		Member m = (Member)obj;
		if(this.name.equals(m.name) && this.phone.equals(m.phone)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.phone.hashCode();
	}
	*/
	
}

class Car {
	private String name;
	private String id;
	
	public Car(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> list = new HashMap<>();
		
		list.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "34거1456"));
		list.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "63나8843"));
		
		list.put(new Member("홍길동", "010-1111-2222"), new Car("K7", "53소3423"));
		
		System.out.println("등록된 차량대수 : " + list.size() + "대");
		Member m = new Member("홍길동", "010-1111-2222");
		System.out.println(m);
		
		/*
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		System.out.println("m == m2 : " + (m == m2));
		System.out.println("equals() : " + m.equals(m2));
		System.out.println("m  hashcode() : " + m.hashCode());
		System.out.println("m2 hashcode() : " + m2.hashCode());
		
		String str = "Hello world";
		String str2 = new String("Hello world");
		
		System.out.println("str == str2 : " + (str == str2));
		System.out.println("str equals() : " + str.equals(str2));
		System.out.println("str hashcode()  : " + str.hashCode());
		System.out.println("str2 hashcode() : " + str2.hashCode());
		*/

	}
}












