import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Sudoku {
    private JPanel panel1;
    private JLabel sizeLabel;
    private JButton plusButton;
    private JButton minusButton;
    private JLabel label1;
    private JTextField textField1;
    private JTextField a4TextField;
    private JLabel lengthLabel;

    private int currentSize = 4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku");
        frame.setContentPane(new Sudoku().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Sudoku() {
        plusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (currentSize >= 16){
                    return;
                }
                currentSize++;
                a4TextField.setText(String.valueOf(currentSize));
            }
        });
        minusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (currentSize <= 4){
                    return;
                }
                currentSize--;
                a4TextField.setText(String.valueOf(currentSize));
            }
        });
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                lengthLabel.setText(String.valueOf(textField1.getText().length()+1));
            }
        });
    }
}
