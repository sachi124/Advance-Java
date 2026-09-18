import java.awt.*;
class MenuExample
{

    MenuExample() {
        Frame f = new Frame("Sachin Bista NoteWrite");
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("File");
        Menu menu1 = new Menu("Edit");
        Menu menu2 = new Menu("View");
        Menu subMenu = new Menu("Zoom");
        MenuItem i1 = new MenuItem("New Tab");
        MenuItem i2 = new MenuItem("New Window");
        MenuItem i3 = new MenuItem("Open");
        MenuItem i4 = new MenuItem("Save");
        MenuItem i5 = new MenuItem("Save As");
        MenuItem i6 = new MenuItem("Close Tab");
        MenuItem i7 = new MenuItem("Copy");
        MenuItem i8 = new MenuItem("Paste");
        MenuItem i9 = new MenuItem("Cut");
        MenuItem i10 = new MenuItem("Delete");
        MenuItem i11 = new MenuItem("Zoom In");
        MenuItem i12 = new MenuItem("Zoom Out");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menu.add(i6);
        menu1.add(i7);
        menu1.add(i8);
        menu1.add(i9);
        menu1.add(i10);
        subMenu.add(i11);
        subMenu.add(i12);

        
        mb.add(menu);
        mb.add(menu1);
        mb.add(menu2);
        menu2.add(subMenu);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
public static void main(String[] args) {
    new MenuExample();
}   
}