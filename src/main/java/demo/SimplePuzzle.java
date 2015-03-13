package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SimplePuzzle implements Runnable {
	public static void main(String[] args){
		EventQueue.invokeLater(new SimplePuzzle());
	}
	
	public void run() {
		this.setLookAndFeel();
		
		PuzzleBoard board = new PuzzleBoard();
		
		PuzzleWindow pw = new PuzzleWindow();
		pw.add(board);
		pw.setVisible(true);
		

//		
////		Balls balls = new Balls();
////		frame.add(balls);
//		frame.setVisible(true);
//
////		new Thread(new BounceEngine(balls)).start();

	}

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException ex) {
		} catch (InstantiationException ex) {
		} catch (IllegalAccessException ex) {
		} catch (UnsupportedLookAndFeelException ex) {
		}
	}

}


