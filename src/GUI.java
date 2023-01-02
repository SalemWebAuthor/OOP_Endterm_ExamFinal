import javax.swing.*;
import java.awt.*;

class GUI extends AbstractGUI {
    public GUI(String type, String material, double weight, double basePrice,double wholesale,double retail) {
        super(type, material, weight, basePrice,wholesale,retail);
    }

    @Override
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Jewelry Price");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelname = new JPanel();
        panelname.setBounds(0, 0, 300,30);
        panelname.setBackground(Color.YELLOW);

        JPanel panel = new JPanel();
        panel.setBounds(0, 30, 300, 30);
        panel.setBackground(Color.LIGHT_GRAY);


        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 60, 300, 100);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));

        JPanel paneltry = new JPanel();
        paneltry.setBounds(0, 60, 300, 30);
        paneltry.setBackground(Color.red);

        JLabel labelname = new JLabel("Forever Gems");
        JLabel label = new JLabel(material);
        JLabel labeltwo = new JLabel(type);
        JLabel labelthree = new JLabel("Base Price: ₱" + String.valueOf(basePrice));

        JLabel labelfour = new JLabel("WholeSale Price: ₱" + String.valueOf(wholesale));

        JLabel labelfive = new JLabel("Retail Price: ₱" + String.valueOf(retail));

        panelname.add(labelname);
        panel.add(label);
        panel.add(labeltwo);
        panel2.add(labelthree);
        panel2.add(labelfour);
        panel2.add(labelfive);

        frame.setSize(300, 180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(panelname);
        frame.add(panel);
        frame.add(panel2);
        frame.add(paneltry);
    }
}