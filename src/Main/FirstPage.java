package Main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JFrame {

    JLabel header = new JLabel("Selamat Datang!");
    JButton tombolDosen = new JButton("DOSEN");
    JButton tombolMahasiswa = new JButton("MAHASISWA");

    public FirstPage() {
        // Set judul, ukuran, dan default close
        setTitle("Halaman Awal");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        // Center-in jendela ke layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (layar.width - getWidth()) / 2;
        int y = (layar.height - getHeight()) / 2;
        setLocation(x, y);

        // Styling header
        header.setFont(new Font("Arial", Font.BOLD, 24));
        header.setBounds(110, 30, 250, 30);
        header.setForeground(new Color(33, 33, 33));

        // Styling tombol
        tombolDosen.setBounds(130, 100, 120, 40);
        tombolMahasiswa.setBounds(130, 160, 120, 40);

        // Tambahkan ke frame
        add(header);
        add(tombolDosen);
        add(tombolMahasiswa);

        setVisible(true);
        tombolDosen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              dispose();
              new View.Dosen.ViewData();
            }
        
        });
        
        tombolMahasiswa.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              dispose();
              new View.Mahasiswa.ViewData();
            }
        
        });
    }

    public static void main(String[] args) {
        new FirstPage();
    }

}
