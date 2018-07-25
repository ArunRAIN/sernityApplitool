package com.WEBTECHQA.appli.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.WEBTECHQA.appli.steps.serenity.CarouselBannerSteps;

import net.thucydides.core.annotations.Steps;


public class CarouselBannerDefinition 
{
	@Steps
	CarouselBannerSteps CBStep;

	@Given("User on the home page")
    public void Useronthehomepage() 
	{
		 CBStep.is_the_home_page();
		 CBStep.eyes_open();
		 
	}
    
}