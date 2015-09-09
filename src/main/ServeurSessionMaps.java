package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

public class ServeurSessionMaps {
	public static void main(String[] args)
	{
		final Browser browser = new Browser();
		BrowserView browserView = new BrowserView(browser);
		
		JFrame frame = new JFrame("map.html");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(browserView, BorderLayout.CENTER);
		frame.setSize(900, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		browser.loadURL("map.html");
	}
}