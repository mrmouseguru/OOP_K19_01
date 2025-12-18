package oop_k19_1.client;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author phuoc
 */
public class MultiplyForm extends JFrame{
    //state
   private JLabel lblSo1;
    private JLabel lblSo2;
    private JTextField txtSo1, txtSo2;
    private JButton btnTinh;
    
    //constructor
    public MultiplyForm(){
        setTitle("Nhân 2 số");
        setSize(400, 400);
    }
    
    //behavior
    public void display(){
        setVisible(true);
    }
    
}
