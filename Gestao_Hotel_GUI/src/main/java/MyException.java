//Lucas Gabriel Costa
import javax.swing.JOptionPane;

//Lucas Gabriel Costa
public class MyException extends Exception {

    public MyException(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}