package lnterface;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

	public MainWindow() {

		setLayout(new BorderLayout());

		setTitle("Fortnite");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1280, 768);
		setResizable(false);

		setVisible(true);

	}

	public static void main(String[] args) {

		MainWindow window = new MainWindow();

	}

}
