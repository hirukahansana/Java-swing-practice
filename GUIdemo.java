import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIdemo{
    private JFrame frame;
    private JButton button1;
    private JButton button2;
    private JLabel label;
    private JTextField input;
    private int height;
    private int width;

public GUIdemo(int w, int h){
    frame = new JFrame();
    label = new JLabel("Hello");
    input = new JTextField(10);
    button1 = new JButton("Button 1");
    button2= new JButton("Button 2");
    width=w;
    height=h;
}
public void GUIsetup(){
    Container cp = frame.getContentPane();
    FlowLayout flow = new FlowLayout();
    frame.setSize(width,height);
    frame.setTitle("GUIDEMO");
    cp.setLayout(flow);
    cp.add(input);
    cp.add(label);
    cp.add(button1);
    cp.add(button2);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
public void ButtonListnerssetup(){
    ActionListener buttonlistner = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            if (ae.getSource()==button1){
                 System.out.println("Beep");
            }else if (ae.getSource()==button2){
                 System.out.println("Boop");
            }
           
        }
    };
    

    button1.addActionListener(buttonlistner);
    button2.addActionListener(buttonlistner);
}
}