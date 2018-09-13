package lnterface;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

	private InitialPanel initial;

	public MainWindow() {

		setLayout(new BorderLayout());

		setTitle("Fortnite");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1280, 768);
		setResizable(false);

		initial = new InitialPanel(this);

		// Icon Application
		Image icon = Toolkit.getDefaultToolkit().createImage("./images/logos/logo2.jpg");

		setIconImage(icon);

		add(initial, BorderLayout.CENTER);

		setVisible(true);

	}
	
	
	public void refresh() {
		
	invalidate();
	revalidate();
	repaint();
		
		
	}
	
	
	public InitialPanel getInitialPanel() {
		
	return initial;	
		
	}

	public static void main(String[] args) {

		MainWindow window = new MainWindow();

	}

}
