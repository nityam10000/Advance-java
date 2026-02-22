package com.hiberadv;

public interface SomeoneInter {
	void saveSomeone(Someone s);
	void updateSomeoneName(int id, String name);
	void updateStudentPhone(int id, int phone);
	void deleteStudent(int id);
	void findStudent(int id);
	void findall();
}
