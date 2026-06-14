package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class GuiSimple extends JFrame {
    private DefaultListModel<String> dlm;
    private JList<String> jListItem;
    private JTextField jTextFieldNamaItem;
    private JLabel jLabelJumlahData;
    private List<String> items;

    public GuiSimple() {
        setTitle("GuiSimple");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 350);
        setResizable(false);
        setLocationRelativeTo(null);

        dlm = new DefaultListModel<>();
        items = new ArrayList<>();
        String[] datas = {"buku", "meja", "kursi tamu", "tas"}; 
        for (String data : datas) {
            dlm.addElement(data);
        }

        jListItem = new JList<>(dlm);
        JScrollPane scrollPane = new JScrollPane(jListItem);
        scrollPane.setBounds(15, 15, 150, 280);

        JButton btnInsertData = new JButton("insert data");
        btnInsertData.setBounds(180, 15, 100, 25);

        JButton btnSaveData = new JButton("save data");
        btnSaveData.setBounds(180, 45, 100, 25);

        jLabelJumlahData = new JLabel("Data tersimpan = 0");
        jLabelJumlahData.setBounds(290, 15, 150, 25);

        JLabel lblItemName = new JLabel("Item name:");
        lblItemName.setBounds(180, 110, 80, 25);

        jTextFieldNamaItem = new JTextField();
        jTextFieldNamaItem.setBounds(260, 110, 150, 25);

        JButton btnAdd = new JButton("add");
        btnAdd.setBounds(180, 150, 100, 25);

        JButton btnUpdate = new JButton("update");
        btnUpdate.setBounds(290, 150, 100, 25);

        JButton btnDelete = new JButton("delete");
        btnDelete.setBounds(180, 185, 100, 25);

        JButton btnClearAll = new JButton("clear all");
        btnClearAll.setBounds(290, 185, 100, 25);

        JPanel panel = new JPanel(null);
        panel.add(scrollPane);
        panel.add(btnInsertData);
        panel.add(btnSaveData);
        panel.add(jLabelJumlahData);
        panel.add(lblItemName);
        panel.add(jTextFieldNamaItem);
        panel.add(btnAdd);
        panel.add(btnUpdate);
        panel.add(btnDelete);
        panel.add(btnClearAll);

        add(panel);

        updateJumDataTersimpan();

        btnAdd.addActionListener(e -> {
            dlm.addElement(jTextFieldNamaItem.getText());
            jTextFieldNamaItem.setText("");
        });

        btnUpdate.addActionListener(e -> {
            int index = jListItem.getSelectedIndex();
            if (index != -1) {
                dlm.setElementAt(jTextFieldNamaItem.getText(), index);
                jTextFieldNamaItem.setText("");
            }
        });

        btnDelete.addActionListener(e -> {
            int index = jListItem.getSelectedIndex();
            if (index != -1) dlm.removeElementAt(index);
            jTextFieldNamaItem.setText("");
        });

        btnClearAll.addActionListener(e -> dlm.clear());

        btnSaveData.addActionListener(e -> {
            if (!dlm.isEmpty()) {
                items.clear();
                for (int i = 0; i < dlm.getSize(); i++) {
                    items.add(dlm.getElementAt(i));
                }
                updateJumDataTersimpan();
            }
        });

        btnInsertData.addActionListener(e -> {
            for (String item : items) {
                dlm.addElement(item);
            }
        });
    }

    private void updateJumDataTersimpan() {
        jLabelJumlahData.setText("Data tersimpan = " + items.size());
    }

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } 
        catch (Exception e) {}
        SwingUtilities.invokeLater(() -> new GuiSimple().setVisible(true));
    }
}