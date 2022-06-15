package com.practice.action;

import com.practice.service.TutService;

public class TutAction {
	
	private String bestTutorialSite;
	private String language;
	
	public String execute() {
		TutService tutService = new TutService();
//		String bestTutorialSite = tutorialFinderService.getBestTutorialSite();
		setBestTutorialSite(tutService.getBestTutorialSite(getLanguage()));
		System.out.println(bestTutorialSite);
		System.out.println("success");
		return "success";
	}
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
}
