/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JNotepad;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 *
 * @author ADMIN
 */
public class JNotepad extends JFrame {

    private JMenuBar menuBar;
    private JMenu mFile, mEdit, mFormat, mView, mHelp;
    private JMenuItem itemNew, itemOpen, itemSave, itemSaveAs, itemPageSetup, itemPrint, itemExit;
    private JMenuItem itemFont;
    private JCheckBoxMenuItem itemWrap;
    private JTextArea txteditor;
             
    public JNotepad(String title) {
        super(title);
        createMenu();
      processEvent();
        createGUI();
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void createMenu() {
        // tạo đối tượng thực đơn 
        menuBar = new JMenuBar();
        menuBar.add(mFile = new JMenu("File"));
        menuBar.add(mEdit = new JMenu("Edit"));
        menuBar.add(mFormat = new JMenu("Fomat"));
        menuBar.add(mView = new JMenu("View"));
        menuBar.add(mHelp = new JMenu("Help"));
        //edit
        mEdit.add(itemNew = new JMenuItem("Undo"));
        mEdit.add(itemOpen = new JMenuItem("Cut"));
        mEdit.add(itemSave = new JMenuItem("Coppy"));
        mEdit.add(itemSaveAs = new JMenuItem("Paste"));
        mEdit.add(itemPageSetup = new JMenuItem("Delete"));
        mEdit.add(itemPrint = new JMenuItem("Seach with Bing"));
         mEdit.add(itemNew = new JMenuItem("Find"));
        mEdit.add(itemOpen = new JMenuItem("Find next"));
         mEdit.add(itemNew = new JMenuItem("Replace"));
        mEdit.add(itemOpen = new JMenuItem("Go To"));
          mEdit.add(itemOpen = new JMenuItem("Select ALL"));
        mEdit.add(itemOpen = new JMenuItem("Go To"));
       
        
        
        
        
        
        mEdit.add(new JSeparator());
        mEdit.addSeparator();
        mEdit.add(itemExit = new JMenuItem("Exit..."));
        // tạo các item cho menufile       
        mFile.add(itemNew = new JMenuItem("New"));
        mFile.add(itemOpen = new JMenuItem("Open..."));
        mFile.add(itemSave = new JMenuItem("Save"));
        mFile.add(itemSaveAs = new JMenuItem("Save AS..."));
        mFile.add(itemPageSetup = new JMenuItem("page Setup ..."));
        mFile.add(itemPrint = new JMenuItem("Print..."));
        mFile.add(new JSeparator());
        mFile.addSeparator();
        mFile.add(itemExit = new JMenuItem("Exit..."));
     
       
        itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));
       itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
         itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
           itemSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK+KeyEvent.SHIFT_DOWN_MASK));
             itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
               itemPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
        
        // toạ phím nóng 
        mFormat.add(itemWrap= new JCheckBoxMenuItem("Word Wrap",true));
        mFormat.add(itemFont= new JCheckBoxMenuItem("Font",true));
        
         setJMenuBar(menuBar);

    }

    public static void main(String[] args) {
        JNotepad app = new JNotepad("demo");
        app.setVisible(true);
    }

    private void createGUI() {
        txteditor = new JTextArea();
        JScrollPane scrollpane = new JScrollPane(txteditor);
        add(scrollpane);
        txteditor.setLineWrap(true);
        txteditor.setFont(new Font("Arial",Font.PLAIN,20));
        
    }
    private void processEvent(){
        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you to exit?")==JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

   
}
