package jogoGourmet.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class App {
    
	public static void main( String[] args )
    {
		
		JFrame j = new JFrame();				
		j.setLayout(new GridLayout(2,1));
		j.setSize(290, 130);
    	j.setLocationRelativeTo(null);    	
    	
    	j.setTitle("Jogo Gourmet");
    	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel texto = new JLabel("Pense em um prato que gosta");
		
    	texto.setHorizontalAlignment(SwingConstants.CENTER);
    	j.add(texto);
    	
    	JButton botao = new JButton("Ok");
    	
    	botao.setBounds(110, 0, 55, 25);
    	
    	Gourmet start = new Gourmet();
    	botao.addActionListener(start);
    	
    	JPanel painel = new JPanel();
    	
    	painel.add(botao);
    	j.add(painel);
    	painel.setVisible(true);
    	
    	j.setVisible(true);
    	  	
    }
}
