package viewLayer;

import businessLayer.BaseProduct;
import businessLayer.MenuItem;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddProductView extends JFrame {

    private JPanel contentPane;
    private JLabel lbNewLabel;
    private JTextField title;
    private JTextField raiting;
    private JTextField price;
    private JTextField fragrance;
    private JTextField volume;
    private JTextField alcohol;
    private JTextField intensity;
    private JLabel titleLb;
    private JLabel raitingLb;
    private JLabel priceLb;
    private JLabel fragranceLb;
    private JLabel volumeLb;
    private JLabel alcoholLb;
    private JLabel intensityLb;
    private JButton addButton;

    public AddProductView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.yellow);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lbNewLabel = new JLabel("Adauga produs nou in Meniu");
        lbNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lbNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbNewLabel.setBounds(121, 36, 240, 31);
        lbNewLabel.setForeground(Color.blue);
        contentPane.add(lbNewLabel);

        titleLb = new JLabel("Titlu:");
        titleLb.setFont(new Font("Times New Roman", Font.BOLD, 16));
        titleLb.setBounds(55, 78, 56, 22);
        titleLb.setForeground(Color.blue);
        contentPane.add(titleLb);

        title = new JTextField();
        title.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        title.setBounds(121, 81, 240, 19);
        title.setBackground(Color.orange);
        contentPane.add(title);
        title.setColumns(10);

        raitingLb = new JLabel("Raiting:");
        raitingLb.setFont(new Font("Times New Roman", Font.BOLD, 16));
        raitingLb.setBounds(55, 118, 56, 22);
        raitingLb.setForeground(Color.blue);
        contentPane.add(raitingLb);

        raiting = new JTextField();
        raiting.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        raiting.setBounds(121, 121, 78, 19);
        raiting.setBackground(Color.orange);
        contentPane.add(raiting);
        raiting.setColumns(10);

        priceLb = new JLabel("Pret:");
        priceLb.setFont(new Font("Times New Roman", Font.BOLD, 16));
        priceLb.setBounds(217, 118, 56, 22);
        priceLb.setForeground(Color.blue);
        contentPane.add(priceLb);

        price = new JTextField();
        price.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        price.setColumns(10);
        price.setBounds(283, 121, 78, 19);
        price.setBackground(Color.orange);
        contentPane.add(price);

        fragranceLb = new JLabel("Aroma:");
        fragranceLb.setFont(new Font("Times New Roman", Font.BOLD, 16));
        fragranceLb.setBounds(55, 150, 70, 22);
        fragranceLb.setForeground(Color.blue);
        contentPane.add(fragranceLb);

        fragrance = new JTextField();
        fragrance.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        fragrance.setColumns(10);
        fragrance.setBounds(121, 153, 78, 19);
        fragrance.setBackground(Color.orange);
        contentPane.add(fragrance);

        volumeLb = new JLabel("Volum:");
        volumeLb.setFont(new Font("Times New Roman", Font.BOLD, 16));
        volumeLb.setBounds(217, 150, 56, 22);
        volumeLb.setForeground(Color.blue);
        contentPane.add(volumeLb);

        volume = new JTextField();
        volume.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        volume.setColumns(10);
        volume.setBounds(283, 153, 78, 19);
        volume.setBackground(Color.orange);
        contentPane.add(volume);

        alcoholLb = new JLabel("Alcool:");
        alcoholLb.setFont(new Font("Times New Roman", Font.BOLD, 16));
        alcoholLb.setBounds(55, 182, 56, 22);
        alcoholLb.setForeground(Color.blue);
        contentPane.add(alcoholLb);

        alcohol = new JTextField();
        alcohol.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        alcohol.setColumns(10);
        alcohol.setBounds(121, 185, 78, 19);
        alcohol.setBackground(Color.orange);
        contentPane.add(alcohol);

        intensityLb = new JLabel("Intensitate:");
        intensityLb.setFont(new Font("Times New Roman", Font.BOLD, 16));
        intensityLb.setBounds(217, 182, 70, 22);
        intensityLb.setForeground(Color.blue);
        contentPane.add(intensityLb);

        intensity = new JTextField();
        intensity.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        intensity.setColumns(10);
        intensity.setBounds(283, 185, 78, 19);
        intensity.setBackground(Color.orange);
        contentPane.add(intensity);

        addButton = new JButton("ADAUGA");
        addButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
        addButton.setForeground(Color.white);
        addButton.setBackground(Color.blue);
        addButton.setBounds(121, 220, 240, 31);
        contentPane.add(addButton);
    }

    public void addAddButtonActionListener(ActionListener actionListener) {
        addButton.addActionListener(actionListener);
    }

    public MenuItem getNewMenuItem() {
        String prodTitle = title.getText();
        float prodRating = raiting.getText().isEmpty() ? 0 : Float.parseFloat(raiting.getText());
        int prodVolume = Integer.parseInt(volume.getText());
        int prodFragrance = Integer.parseInt(fragrance.getText());
        int prodIntensity = Integer.parseInt(intensity.getText());
        int prodAlcohol = Integer.parseInt(alcohol.getText());
        int prodPrice = Integer.parseInt(price.getText());
        return new BaseProduct(prodTitle, prodRating, prodVolume, prodFragrance, prodIntensity, prodAlcohol, prodPrice);
    }

    public String[] newRow() {
        return new String[]{title.getText(), raiting.getText(), volume.getText(), fragrance.getText(), intensity.getText(),
                alcohol.getText(), price.getText()};
    }

}


