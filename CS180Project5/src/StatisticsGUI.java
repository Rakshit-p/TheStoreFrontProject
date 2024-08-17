import javax.swing.*;
import java.awt.*;

public class StatisticsGUI {

    private JFrame frame;
    private JTextArea textArea;
    private JButton sellerButton;
    private JButton customerButton;
    private Statistics statistics;

    public StatisticsGUI(Statistics statistics) {
        this.statistics = statistics;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Statistics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        sellerButton = new JButton("View Seller Dashboard");
        sellerButton.addActionListener(e -> viewSellerDashboard());
        buttonPanel.add(sellerButton);

        customerButton = new JButton("View Customer Dashboard");
        customerButton.addActionListener(e -> viewCustomerDashboard());
        buttonPanel.add(customerButton);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void viewSellerDashboard() {
        String dashboard = statistics.getSellerDashboard();
        textArea.setText(dashboard);
    }

    private void viewCustomerDashboard() {
        String dashboard = statistics.getCustomerDashboard();
        textArea.setText(dashboard);
    }
}

