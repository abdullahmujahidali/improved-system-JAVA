import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestOrange {

   public static void main(String[] args) {
       Orange orangeA = new Orange();
       System.out.println("An object orangeA of class Orange has been created");
      
       JFrame f = new JFrame();
       String input=(JOptionPane.showInputDialog(f,"Input a value for size (>0)"));
       float size = Float.parseFloat(input);
      
       if(size <= 0)
           JOptionPane.showMessageDialog(f,"Input a value for size (>0)");
       else {
           orangeA.setSize(size);
           JOptionPane.showMessageDialog(f,orangeA.category());
       }
          
   }

}
