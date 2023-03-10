package viewLayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class SearchView extends JFrame {

    private JPanel contentPane;
    private JLabel lbNewLabel;
    private JLabel lbKeywordInThe;
    private JLabel lbMinimumRating;
    private JLabel lbMaximumPrice;
    private JLabel lbMaximumNumberOf;
    private JLabel lbMinimumNumberOf;
    private JLabel lbMaximumGramsOf;
    private JLabel lbMaximumGramsOf_1;
    private JTextField keyword;
    private JTextField rating;
    private JTextField price;
    private JTextField volume;
    private JTextField fragrance;
    private JTextField intensity;
    private JTextField alcohol;
    private JButton searchBtn;

    public SearchView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.cyan);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lbNewLabel = new JLabel("Cautare Produse ");
        lbNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lbNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lbNewLabel.setBounds(133, 25, 150, 35);
        contentPane.add(lbNewLabel);

        lbKeywordInThe = new JLabel("Cuvinte cheie in titlu:");
        lbKeywordInThe.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lbKeywordInThe.setBounds(26, 70, 220, 25);
        contentPane.add(lbKeywordInThe);

        lbMinimumRating = new JLabel("Rating minim:");
        lbMinimumRating.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lbMinimumRating.setBounds(26, 104, 190, 25);
        contentPane.add(lbMinimumRating);

        lbMaximumPrice = new JLabel("Pret maxim:");
        lbMaximumPrice.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbMaximumPrice.setBounds(26, 138, 190, 25);
        contentPane.add(lbMaximumPrice);

        lbMaximumNumberOf = new JLabel("Volum maxim:");
        lbMaximumNumberOf.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lbMaximumNumberOf.setBounds(26, 172, 220, 25);
        contentPane.add(lbMaximumNumberOf);

        lbMinimumNumberOf = new JLabel("Min aroma:");
        lbMinimumNumberOf.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lbMinimumNumberOf.setBounds(26, 206, 200, 25);
        contentPane.add(lbMinimumNumberOf);

        lbMaximumGramsOf = new JLabel("Max intensitate:");
        lbMaximumGramsOf.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lbMaximumGramsOf.setBounds(26, 240, 200, 25);
        contentPane.add(lbMaximumGramsOf);

        lbMaximumGramsOf_1 = new JLabel("Max alcool:");
        lbMaximumGramsOf_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lbMaximumGramsOf_1.setBounds(26, 274, 200, 25);
        contentPane.add(lbMaximumGramsOf_1);

        keyword = new JTextField();
        keyword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        keyword.setBounds(241, 70, 120, 20);
        contentPane.add(keyword);
        keyword.setColumns(10);

        rating = new JTextField();
        rating.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        rating.setColumns(10);
        rating.setBounds(241, 104, 120, 20);
        contentPane.add(rating);

        price = new JTextField();
        price.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        price.setColumns(10);
        price.setBounds(241, 138, 120, 20);
        contentPane.add(price);

        volume = new JTextField();
        volume.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        volume.setColumns(10);
        volume.setBounds(241, 172, 120, 20);
        contentPane.add(volume);

        fragrance = new JTextField();
        fragrance.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        fragrance.setColumns(10);
        fragrance.setBounds(241, 206, 120, 20);
        contentPane.add(fragrance);

        intensity = new JTextField();
        intensity.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        intensity.setColumns(10);
        intensity.setBounds(241, 240, 120, 20);
        contentPane.add(intensity);

        alcohol = new JTextField();
        alcohol.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        alcohol.setColumns(10);
        alcohol.setBounds(241, 274, 120, 20);
        contentPane.add(alcohol);

        searchBtn = new JButton("CAUTARE");
        searchBtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
        searchBtn.setBounds(241, 315, 120, 22);
        searchBtn.setBackground(Color.blue);
        searchBtn.setForeground(Color.white);
        contentPane.add(searchBtn);
    }

    public void addSearchBtnActionListener(ActionListener actionListener) {
        searchBtn.addActionListener(actionListener);
    }

    public int getFat() {
        if (intensity.getText().equals(""))
            return Integer.MAX_VALUE;
        return Integer.parseInt(intensity.getText());
    }

    public int getSodium() {
        if (alcohol.getText().equals(""))
            return Integer.MAX_VALUE;
        return Integer.parseInt(alcohol.getText());
    }


    public int getProteins() {
        if (fragrance.getText().equals(""))
            return 0;
        return Integer.parseInt(fragrance.getText());
    }

    public int getCalories() {
        if (volume.getText().equals(""))
            return Integer.MAX_VALUE;
        return Integer.parseInt(volume.getText());
    }


    public int getPrice() {
        if (price.getText().equals(""))
            return Integer.MAX_VALUE;
        return Integer.parseInt(price.getText());
    }


    public float getRaiting() {
        if (rating.getText().equals(""))
            return 0;
        return Float.parseFloat(rating.getText());
    }

    public String getKeyword() {
        return keyword.getText();
    }

}
