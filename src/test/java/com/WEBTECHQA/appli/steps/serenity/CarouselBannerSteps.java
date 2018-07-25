package com.WEBTECHQA.appli.steps.serenity;


import com.WEBTECHQA.appli.pages.CarouselBannerPage;

import net.thucydides.core.annotations.Step;


public class CarouselBannerSteps 
{

	CarouselBannerPage CBpage;
	
	@Step
    public void is_the_home_page()
	{
		CBpage.open();
		
		
    }
	
	@Step
    public void eyes_open()
	{
		CBpage.precondition();
		CBpage.postcondition();
    }
	
	
}