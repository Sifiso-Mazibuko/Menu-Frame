
package za.ac.tut.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFrame extends JFrame{
    
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu viewMenu;
    private JMenu editorViewSubMenu;
    private JMenu splitViewSubMenu;
    
    private JMenuItem newProjectMenuItem;
    private JMenuItem newFileMenuItem;
    private JMenuItem openProjectMenuItem;
    private JMenuItem openRecentProjectMenuItem;
    private JMenuItem closeAllProjectMenuItem;
    
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;
    
    private JMenuItem sourceMenuItem;
    
    private JMenuItem horizontalMenuItem;
    private JMenuItem verticalMenuItem;
    private JMenuItem clearMenuItem;

    public MenuFrame() {
        
        setTitle("Menu Frame");
        setSize(700, 800);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        //create a menu bar
        
        menuBar = new JMenuBar();
        
        //menus
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        editorViewSubMenu = new JMenu("Editors");
        splitViewSubMenu = new JMenu("Split");
        
        //file menu items=========================
        
        newProjectMenuItem = new JMenuItem("New Project...");
        newFileMenuItem = new JMenuItem("New File...");
        openProjectMenuItem = new JMenuItem("Open Project...");
        openRecentProjectMenuItem = new JMenuItem("Open Recent Project...");
        closeAllProjectMenuItem = new JMenuItem("Close All Project...");
        
        //edit menu Items===========================
        
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem = new JMenuItem("Copy");
        pasteMenuItem = new JMenuItem("Paste");
     
        //view menuItems===========================
        
        sourceMenuItem = new JMenuItem("Source");
        
        horizontalMenuItem = new JMenuItem("Horizontally");
        verticalMenuItem = new JMenuItem("Vertically");
        clearMenuItem = new JMenuItem("Clear");
        
//================================================================================================================
              
        //========Add File items to the Menu======
        
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(openRecentProjectMenuItem);
        fileMenu.add(closeAllProjectMenuItem);
        
        //========Add Edit items to the Menu=======
        
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        
        //=======Add View Items to the Menu====
        
        viewMenu.add(editorViewSubMenu);
        viewMenu.add(splitViewSubMenu);
        
        editorViewSubMenu.add(sourceMenuItem);
        splitViewSubMenu.add(horizontalMenuItem);
        splitViewSubMenu.add(verticalMenuItem);
        splitViewSubMenu.add(clearMenuItem);
        
        
        //ADDING ALL THE MAIN MENUS TO THE BAR(grouping element)
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        //ADD THE BAR TO THE FRAME
        
        setJMenuBar(menuBar);
        
        //set Frame to be visible
        
        setVisible(true);
    }
    
    
}
