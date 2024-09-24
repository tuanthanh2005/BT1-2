package DemoTable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Demo extends JFrame {

    private JTable tblSanPham;
    private JButton btThem;
    private DefaultTableModel model;

    // Sample data and column names
    public Demo(String title) {
        super(title);
        setSize(800, 500);
        createGUI();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Demo frm = new Demo("Demo Table");
        frm.setVisible(true);
    }
//Khai Báo

    private void createGUI() {
        model = new DefaultTableModel(data, columnNames);
        tblSanPham = new JTable(model);

        // Adding the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(tblSanPham);
        add(scrollPane);

        // Optionally, you can add the button here
        btThem = new JButton("Add Product");
        // Add action listener to the button if needed
        add(btThem, "South"); // Add button at the bottom
    }

    //Khai Báo + Dữ Liệu Cần Thiết Kế
    private String[] columnNames = {"Tên Sản Phấm", "Mã Sản Phẩm", "Giá Tiền"};
    private Object[][] data = {
        {1, "Gạo", 50000},
        {2, "Đường", 35000},
        {3, "Rượu", 22000}
    };
}
