package com.ramos;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class PullupBaseMethor extends UiAutomatorTestCase {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public UiObject getObjectById(String id){
		return new UiObject(new UiSelector().resourceId(id));	
	}
	
	
}
