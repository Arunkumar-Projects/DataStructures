package com.java4u.ds.priorityqueue;

public class Task {
	private String job;
	private int priority;

	public Task(String job, int priority) {
		super();
		this.job = job;
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Job Name : " + job + "\nPriority : " + priority;
	}
}
