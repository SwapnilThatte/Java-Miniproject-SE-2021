import javax.swing.*;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test implements ActionListener {

    JFrame window;
    JTextPane textPane;
    JMenuBar menuBar;
    JMenu menuFile, menuEdit;
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit, iCopy, iCut, iPaste, iUndo, iRedo;
    Function_File file = new Function_File(this);


    public static void main(String[] args) {
        new Test();
    }

    public Test() {

        createWindow();
        window.setVisible(true);
        createTextPane();
        createMenuBar();
        createFileMenu();
        createEditMenu();
    }

    public void createWindow() {
        window = new JFrame("Notepad");
        window.setSize(450, 450);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createTextPane() {
        textPane = new JTextPane();
        window.getContentPane().add(textPane);
        window.revalidate();
    }

    public void createMenuBar() {
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);
        menuFile = new JMenu("File");
        menuBar.add(menuFile);
        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);
    }

    public void createFileMenu() {
        iNew = new JMenuItem("New");
        menuFile.add(iNew);
        iNew.addActionListener(this);
        iNew.setActionCommand("New");

        iOpen = new JMenuItem("Open");
        menuFile.add(iOpen);
        iOpen.addActionListener(this);
        iOpen.setActionCommand("Open");

        iSave = new JMenuItem("Save");
        menuFile.add(iSave);
        iSaveAs = new JMenuItem("SaveAs");
        menuFile.add(iSaveAs);
        iExit = new JMenuItem("Exit");
        menuFile.add(iExit);
    }

    public void createEditMenu() {
        iCopy = new JMenuItem("Copy");
        menuEdit.add(iCopy);
        iCut = new JMenuItem("Cut");
        menuEdit.add(iCut);
        iPaste = new JMenuItem("Paste");
        menuEdit.add(iPaste);
        iUndo = new JMenuItem("Undo");
        menuEdit.add(iUndo);
        iRedo = new JMenuItem("Redo");
        menuEdit.add(iRedo);
    }


    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        switch (command) {
            case "New":
                file.newfile();
                break;
            case "Open":
                file.open();
                break;

        }


    }
}
