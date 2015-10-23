package com.ramos;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.ramos.UiAutomatorHelper;

public class PullupMenu extends PullupBaseMethor {

	/**
	 * @param args
	 * @throws UiObjectNotFoundException 
	 */
	public void testPullupMenu() throws UiObjectNotFoundException{
		
//		进入与退出上拉菜单
		UiDevice.getInstance().swipe(540, 1918, 540, 1318, 50);
		sleep(1000);
		//getObjectById("com.android.systemui:id/arrow_down").click();
		
//		开关WLAN
		
		
		

	}
	
	
	public static void main(String[] args) {
		String jarName, testClass, testName, androidId;
		jarName="PullupMenu"; 
		testClass="com.ramos.PullupMenu";
		testName="testPullupMenu";
		androidId="1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);
	}

}
