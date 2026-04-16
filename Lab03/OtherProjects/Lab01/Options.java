package Lab03.OtherProjects.Lab01;

import javax.swing.JOptionPane;

public class Options {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "do you want to change the first class ticket?");
        JOptionPane.showMessageDialog(null, "You have chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}