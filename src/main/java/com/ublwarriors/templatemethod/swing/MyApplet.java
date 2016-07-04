package com.ublwarriors.templatemethod.swing;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	String message;
	
	public void init()
	{
		message = "Hello World, I'm alive!";
		repaint();
	}
	@Override
	public void start() {
		message = "Now, I'm starting up...";
		repaint();
	}
	@Override
	public void stop() {
		message = "Oh, now I am being stopped...";
		repaint();
	}
	@Override
	public void destroy() {
		
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(message, 5, 15);
	}
	
	
}
