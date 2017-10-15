package com.jtrent238.ignchanger.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import net.minecraft.client.Minecraft;
import net.minecraftforge.event.entity.player.PlayerEvent;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * @author  Administrator
 * @created October 15, 2017
 */
public class GUIChangeIGN extends JFrame 
{
static GUIChangeIGN theGUIChangeIGN;

JPanel pnPanel0;
JTextField tfText0;
JButton btBut0;
JLabel lbLabel0;
/**
 */
public static void main( String args[] ) 
{
   try 
   {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
   }
   catch ( ClassNotFoundException e ) 
   {
   }
   catch ( InstantiationException e ) 
   {
   }
   catch ( IllegalAccessException e ) 
   {
   }
   catch ( UnsupportedLookAndFeelException e ) 
   {
   }
   theGUIChangeIGN = new GUIChangeIGN();
} 

/**
 */
public GUIChangeIGN() 
{
   super( "TITLE" );

   pnPanel0 = new JPanel();
   GridBagLayout gbPanel0 = new GridBagLayout();
   GridBagConstraints gbcPanel0 = new GridBagConstraints();
   pnPanel0.setLayout( gbPanel0 );

   tfText0 = new JTextField( );
   gbcPanel0.gridx = 5;
   gbcPanel0.gridy = 1;
   gbcPanel0.gridwidth = 12;
   gbcPanel0.gridheight = 1;
   gbcPanel0.fill = GridBagConstraints.BOTH;
   gbcPanel0.weightx = 1;
   gbcPanel0.weighty = 1;
   gbcPanel0.anchor = GridBagConstraints.CENTER;
   gbPanel0.setConstraints( tfText0, gbcPanel0 );
   pnPanel0.add( tfText0 );

   btBut0 = new JButton( "Change IGN"  );
   gbcPanel0.gridx = 9;
   gbcPanel0.gridy = 3;
   gbcPanel0.gridwidth = 4;
   gbcPanel0.gridheight = 1;
   gbcPanel0.fill = GridBagConstraints.BOTH;
   gbcPanel0.weightx = 1;
   gbcPanel0.weighty = 0;
   gbcPanel0.anchor = GridBagConstraints.SOUTH;
   gbPanel0.setConstraints( btBut0, gbcPanel0 );
   pnPanel0.add( btBut0 );

   lbLabel0 = new JLabel( "IGN Changer By: jtrent238"  );
   gbcPanel0.gridx = 8;
   gbcPanel0.gridy = 4;
   gbcPanel0.gridwidth = 6;
   gbcPanel0.gridheight = 1;
   gbcPanel0.fill = GridBagConstraints.BOTH;
   gbcPanel0.weightx = 1;
   gbcPanel0.weighty = 1;
   gbcPanel0.anchor = GridBagConstraints.NORTH;
   gbPanel0.setConstraints( lbLabel0, gbcPanel0 );
   pnPanel0.add( lbLabel0 );
   
   //setDefaultCloseOperation( EXIT_ON_CLOSE );

   setContentPane( pnPanel0 );
   pack();
   setVisible( true );
   
   
   
   btBut0.addActionListener(new ActionListener()
   {
	    @Override
	    public void actionPerformed(ActionEvent e)
	    {
	    	
	    	changePlayerIGN(null);
	    	
	        if(tfText0.getText().toString() == ""){
	        	System.out.println("ERROR: NO IGN PROVIDED!!!");
	        }
	        else{
	        	System.out.println("IGN Changed to: " + tfText0.getText().toString());
	        }
	        
	    }
	});
}

protected void changePlayerIGN(PlayerEvent event) {
	
	event.entityPlayer.getDisplayName();

	
} 


} 
