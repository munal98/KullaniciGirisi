import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KullaniciGirisi {
    public static void main(String[] args) {
        // Frame oluşturuluyor
        JFrame frame = new JFrame("Kullanıcı Girişi");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel oluşturuluyor
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Kullanıcı adı ve şifre etiketleri ve alanları
        JLabel userLabel = new JLabel("Kullanıcı Adı:");
        JTextField userText = new JTextField();
        JLabel passwordLabel = new JLabel("Şifre:");
        JPasswordField passwordText = new JPasswordField();

        // Giriş butonu
        JButton loginButton = new JButton("Giriş Yap");

        // Mesaj alanı
        JLabel messageLabel = new JLabel("", JLabel.CENTER);

        // Panel elemanları ekleniyor
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(new JLabel()); // Boşluk için
        panel.add(loginButton);

        // Frame'e bileşenler ekleniyor
        frame.add(panel, BorderLayout.CENTER);
        frame.add(messageLabel, BorderLayout.SOUTH);

        // Giriş butonuna tıklama olayı
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // Kullanıcı adı ve şifre kontrolü
                if (username.equals("admin") && password.equals("12345")) {
                    messageLabel.setText("Giriş başarılı! Hoş geldiniz.");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Giriş başarısız! Lütfen tekrar deneyin.");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });

        // Frame görünür hale getiriliyor
        frame.setLocationRelativeTo(null); // Ortada açılması için
        frame.setVisible(true);
    }
}
