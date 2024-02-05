import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Jframe {
    private JPanel panel1;
    private JButton calculateButton;
    private JLabel Label;
    private JCheckBox checkBox1;
    private JLabel Label2;
    private JTextField textField1;
    private JLabel outLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jframe");
        frame.setContentPane(new Jframe().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Jframe() {
        calculateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                double a;
                if (!checkBox1.isSelected()){
                    return;
                }
                try{
                    a = Double.parseDouble(textField1.getText());
                } catch (Exception exc){
                    return;
                }
                outLabel.setText(("A szám háromszorosa: "+a*3));
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox cb = (JCheckBox) e.getSource();
                calculateButton.setEnabled(cb.isSelected());
            }
        });
    }
}
