package com.practice.service;

public class TutService {
	public String getBestTutorialSite(String language) {
		if(language.equals("java")) {
			return "Java is good";
		}
		else {
			return "language not supported";
		}
		
	}
}
