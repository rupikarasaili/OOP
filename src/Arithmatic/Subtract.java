package Arithmatic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Subtract extends JFrame implements ActionListener {
    JButton jb1;
    JTextField first, second;
    JLabel lbl;
    Main ld = new Main();
    Subtract() {

        first = new JTextField();
        first.setBounds(90, 50, 150, 30);
        add(first);

        second = new JTextField();
        second.setBounds(90, 80, 150, 30);
        add(second);

        lbl = new JLabel("Result :");
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);

        jb1 = new JButton("-");
        jb1.setBounds(90, 200, 100, 30);
        add(jb1);

        jb1.addActionListener(this);
        setLayout(null);
        setSize(600, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(jb1)) {
            if (e.getSource().equals(jb1)) {
                ld.setFirst(Integer.parseInt(first.getText()));
                ld.setSecond(Integer.parseInt(second.getText()));
                lbl.setText(String.valueOf(ld.Subraction()));
            }
        }}public static void main(String args[]) {
        new Subtract().setVisible(true);

    }
}