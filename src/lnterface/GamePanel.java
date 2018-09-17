package lnterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.ActivationMonitor;

import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener {
    
	public final static Image BACKGROUND = Toolkit.getDefaultToolkit()
			.createImage("./images/backgrounds/game.png");

	 private JPanel panelGame;
	 private JPanel panelInfo;
	 private JList weapons;
	 private JLabel players;
	 private JLabel ammo;
	 private JLabel aux;
	 
	 
	 
	public GamePanel() {
		
		
		setLayout(new BorderLayout());
		
		
		panelGame= new JPanel();
		panelGame.setBackground(new Color(0, 0, 0, 0));
		panelGame.setLayout(null);
		
		panelInfo = new JPanel();
		panelInfo.setBackground(new Color(118, 191, 249));
		
		weapons = new JList<>();
		weapons.setSelectionMode (ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		weapons.setLayoutOrientation (JList.HORIZONTAL_WRAP);
		weapons.setVisibleRowCount (-1);
		
		
		
		JScrollPane listScroller = new JScrollPane (weapons);
		listScroller.setPreferredSize (new Dimension(300	, 250));
		
		
		aux = new JLabel("                    ddasdasdasdgashjdasdasddaskd                                                     ");
		aux.setSize(500,1);
		players = new JLabel("85",SwingConstants.CENTER);
		players.setHorizontalAlignment(JLabel.CENTER);
		players.setForeground(Color.WHITE);
		players.setFont(new Font("Garamond", 1, 18));
		
		ammo = new JLabel("CANTIDAD DE MUNICION: 40 ", SwingConstants.CENTER);
		ammo.setHorizontalAlignment(JLabel.CENTER);
		ammo.setForeground(Color.WHITE);
		ammo.setFont(new Font("Garamond", 1, 18));
		
		
		
		Components();
		
	}
	   public void Components() {
		   
		   
		   weapons.setBounds(100, 30, 200, 100);
		   players.setBounds(100, 400, 200, 100);
		   ammo.setBounds(100, 700, 200, 100);
		   aux.setSize(300,1);
        
		   
		   panelInfo.add(aux);

		  // panelInfo.add(ammo);
		  // panelInfo.add(weapons);
		   //panelInfo.add(players);
		   
		   add(panelGame, BorderLayout.CENTER);
		   add(panelInfo, BorderLayout.EAST);
	   }
	    
	
	
	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(BACKGROUND, -100, 0, null);

		repaint();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
