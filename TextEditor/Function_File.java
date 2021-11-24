import java.awt.*;

public class Function_File {
    Test test;

    public Function_File(Test test) {
        this.test = test;
    }

    public void newfile() {
        test.textPane.setText(" ");
        test.window.setTitle("New");
    }
public void open(){
        FileDialog fd =new FileDialog(test.window,"Open",FileDialog.LOAD);
        fd.setVisible(true);
}
}
