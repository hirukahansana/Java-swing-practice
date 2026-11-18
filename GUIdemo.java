import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIdemo{
    private JFrame frame;
    private JButton button;
    private int height;
    private int width;

public GUIdemo(int w, int h){
    frame = new JFrame();
    button = new JButton("Click me");
    width=w;
    height=h;
}
public void GUIsetup(){
    frame.setSize(width,height);
    frame.setTitle("GUIDEMO");
    frame.add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
public void ButtonListnerssetup(){
    ActionListener buttonlistner = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            System.out.println("Click !");
        }
    };
    button.addActionListener(buttonlistner);
}
}