package kr.co.mlec.day11;

import java.io.Serializable;

/*
 	�⺻������ ����Ű		: alt + shift + s ������, c
 	�Ű����������� ����Ű	: alt + shift + s ������, o
 	getter / setter	: alt + shift + s ������, r
 	toString()		: alt + shift + s ������, s
 	override		: alt + shift + s ������, v
 */

public class UserInfo implements Serializable{	// ��ü ����ȭ ��Ŵ (object������ �ѹ��� ��������)
	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	private 			String name;
	private transient 	int		age;	// trasient ��ü ����ȭ ����
	private 			String addr;
	
	public UserInfo() {
		
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}}
