package com.reviewSessions;

public class ClassA {

	public static void main(String[] args) {
		ClassA task = new ClassA();
		task.main();
		task.maria();
		int addition = task.maria(30, 19);
		System.out.println(addition);
		String job = task.maria("Testing");
		System.out.println(job);
		String career = task.maria("Automatated Tester", 120000);
		System.out.println(career);

	}

	public static void main() {
		System.out.println("I am trying to code");
	}

	public int maria(int num1, int num2) {
		int addition = num1 + num2;
		return addition;
	}

	public void maria() {
		System.out.println("My name is Maria");
	}

	public String maria(String job) {

		return job;
	}

	public String maria(String job, int salary) {
		System.out.println("I want a career as an ");
		return job;

	}

}