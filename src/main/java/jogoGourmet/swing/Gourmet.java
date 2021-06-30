package jogoGourmet.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Gourmet implements ActionListener {

	private No cabeca;
	private boolean jogando;

	public void inicializa() {
		this.cabeca = this.cabeca == null ? new No("massa", new No("Lasanha"), new No("Bolo de Chocolate"))
				: this.cabeca;
		this.jogando = true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		this.inicializa();

		Object[] options = { "Sim", "Não" };

		No noAtual = this.cabeca;

		while (jogando) {
			String pergunta = "O prato que você pensou é " + noAtual.getTexto() + "?";

			int resposta = JOptionPane.showOptionDialog(null, pergunta, "Confirm", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			if (resposta == 0 && noAtual.simIsNull()) {

				JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogo Gourmet", 1);
				jogando = false;

			} else if (resposta == 1 && noAtual.naoIsNull()) {
				String prato = JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Desisto",
						JOptionPane.QUESTION_MESSAGE);

				String texto = noAtual.getTexto();

				String qualidade = JOptionPane.showInputDialog(prato + " é _________mas " + texto + " não.");
				noAtual.setTexto(qualidade);
				noAtual.setSim(new No(prato));

				noAtual.setNao(new No(texto));
				jogando = false;
			}

			noAtual = resposta == 0 ? noAtual.getSim() : noAtual.getNao();

		}
	}

}
