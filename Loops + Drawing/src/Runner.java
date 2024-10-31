import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        
		 int x1=0;
	        int y1= 0;
	        int x2 = 0;
	        int y2=600;
	        int counter0 = 0;
	        while(counter0<150) {
	        	g2.drawLine(x1, y1, x2, y2);
	        	x1+=10;
	        	y2-=10;
	        	counter0++;
	        }
	        
	        int x3=800;
	        int y3= 0;
	        int x4 = 800;
	        int y4=600;
	        int counter = 0;
	        while(counter<150) {
	        	g2.drawLine(x3, y3, x4, y4);
	        	x3-=10;
	        	y4-=10;
	        	counter++;
	        }
			
			int x5 = 0;
			int y5 = 0;
			 int x6 = 0;
			 int y6 = 600;
		
			 for(int county=0;county<150;county++) {
				 g2.drawLine(x5, y5, x6, y6);
				 y5+=10;
				 x6+=10;
				 county++;
			 }
			int x7 = 800;
			int y7 = 0;
			int x8 = 800;
			int y8 = 600;
			
			for(int county1=0;county1<150;county1++) {
				g2.drawLine(x7, y7, x8, y8);
				y7+=10;
				x8-=10;
				county1++;
			}}
        
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		//g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		//g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		//g2.drawLine(765/2, 10, 765/2,550 );
		
		
		//4) small rectangles on top-left
		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		/*
		
		 int lines = 1;
		 while(lines<100) {
			 int red = (int)(Math.random()* (255 - 0 + 1 ) ) + 0;
			 int green = (int)(Math.random()* (255 - 0 + 1 ) ) + 0;
			 int blue = (int)(Math.random()* (255 - 0 + 1 ) ) + 0;
			 g2.setColor(new Color(red, green, blue));
			 
			 int x1 = (int)(Math.random()* (370 - 30 + 1 ) ) + 30;
			 int y1 = (int)(Math.random()* (250 - 30 + 1) ) + 30;
			 int x2 = (int)(Math.random()* (370 - 30 + 1 ) ) + 30;
			 int y2 = (int)(Math.random()* (250 - 30 + 1) ) + 30;
			 g2.drawLine(x1,y1,x2,y2);
			 lines++;
		 }
		 int squares = 1;
		 while(squares<100) {
			 int red = (int)(Math.random()* (255 - 0 + 1 ) ) + 0;
			 int green = (int)(Math.random()* (255 - 0 + 1 ) ) + 0;
			 int blue = (int)(Math.random()* (255 - 0 + 1 ) ) + 0;
			 g2.setColor(new Color(red, green, blue));
			 
			 int x1 = (int)(Math.random()* (700 - 390 + 1 ) ) + 400;
			 int y1 = (int)(Math.random()* (200 - 30 + 1) ) + 30;
			 int w = 50;
			 int h = 50;
			 g2.fillRect(x1,y1,w,h);
			 squares++;
		 }
		 int circles = 1;
		 while(circles<100) {
			 int red = (int)(Math.random()* (255 - 0 + 1 ) ) + 0;
			 int green = (int)(Math.random()* (255 - 0 + 1 ) ) + 0;
			 int blue = (int)(Math.random()* (255 - 0 + 1 ) ) + 0;
			 g2.setColor(new Color(red, green, blue));
			 
			 int x1 = (int)(Math.random()* (180 - 30 + 1 ) ) + 30;
			 int y1 = (int)(Math.random()* (350 - 280 + 1) ) + 280;
			 int w = (int)(Math.random()* (200 - 0 + 1 ) ) + 0;
			 int h = w;
			 g2.drawOval(x1,y1,w,h);
			 circles++;
		 }
		    g2.setColor(new Color(255,255,0));
		 	g2.fillRect(500,350,100,100);
		 	g2.setColor(new Color(255,0,0));
		 	g2.fillRect(550, 400, 100, 100);
		 	g2.setColor(new Color(0, 128,0));
		 	g2.setColor(new Color(0,0,255));
		 	//g2.fillPolygon(null);
		 	
		 	
	}
	*/
	
	

	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
