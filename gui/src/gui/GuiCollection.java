package gui;

import java.util.*;
import java.util.List;
import javax.swing.*;

public class GuiCollection extends JFrame {
    private DefaultListModel<String> dlm;
    private JList<String> jListItem;
    private JTextField jTextFieldItem;
    private JLabel jLabelList, jLabelSet, jLabelMap;
    
    private List<String> dataList = new ArrayList<>();
    private Set<String> dataSet = new HashSet<>();
    private Map<Integer, String> dataMap = new HashMap<>();

    public GuiCollection() {
        setTitle("GUI dan Collections (Proyek 4)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 430);
        setResizable(false);
        setLocationRelativeTo(null);

        dlm = new DefaultListModel<>();
        String[] initialDatas = {"buku", "meja", "kursi", "tas", "pintu jati", "tikus", "meja", "buku tulis", "tas"};
        for (String data : initialDatas) {
            dlm.addElement(data);
        }

        jListItem = new JList<>(dlm);
        JScrollPane scrollPane = new JScrollPane(jListItem);
        scrollPane.setBounds(15, 15, 160, 310);

        JButton btnClearAll = new JButton("clear all");
        btnClearAll.setBounds(15, 335, 160, 25);

        JButton btnSaveList = new JButton("save to List ->");
        btnSaveList.setBounds(190, 15, 140, 25);
        JButton btnInsertList = new JButton("<- insert data List");
        btnInsertList.setBounds(190, 45, 140, 25);
        jLabelList = new JLabel("Data tersimpan = 0");
        jLabelList.setBounds(345, 15, 150, 25);

        JButton btnSaveSet = new JButton("save to Set ->");
        btnSaveSet.setBounds(190, 95, 140, 25);
        JButton btnInsertSet = new JButton("<- insert data Set");
        btnInsertSet.setBounds(190, 125, 140, 25);
        jLabelSet = new JLabel("Data tersimpan = 0");
        jLabelSet.setBounds(345, 95, 150, 25);

        JButton btnSaveMap = new JButton("save to Map ->");
        btnSaveMap.setBounds(190, 175, 140, 25);
        JButton btnInsertMap = new JButton("<- insert data Map");
        btnInsertMap.setBounds(190, 205, 140, 25);
        jLabelMap = new JLabel("Data tersimpan = 0");
        jLabelMap.setBounds(345, 175, 150, 25);

        JLabel lblItemName = new JLabel("Item name:");
        lblItemName.setBounds(190, 260, 80, 25);
        
        jTextFieldItem = new JTextField();
        jTextFieldItem.setBounds(190, 285, 140, 25);

        JButton btnAdd = new JButton("add");
        btnAdd.setBounds(190, 335, 80, 25);
        
        JButton btnUpdate = new JButton("update");
        btnUpdate.setBounds(280, 335, 80, 25);
        
        JButton btnDelete = new JButton("delete");
        btnDelete.setBounds(370, 335, 80, 25);

        JPanel panel = new JPanel(null);
        panel.add(scrollPane);
        panel.add(btnClearAll);
        
        panel.add(btnSaveList); panel.add(btnInsertList); panel.add(jLabelList);
        panel.add(btnSaveSet); panel.add(btnInsertSet); panel.add(jLabelSet);
        panel.add(btnSaveMap); panel.add(btnInsertMap); panel.add(jLabelMap);
        
        panel.add(lblItemName);
        panel.add(jTextFieldItem);
        panel.add(btnAdd);
        panel.add(btnUpdate);
        panel.add(btnDelete);

        add(panel);

        btnAdd.addActionListener(e -> {
            dlm.addElement(jTextFieldItem.getText());
            jTextFieldItem.setText("");
        });

        btnUpdate.addActionListener(e -> {
            int index = jListItem.getSelectedIndex();
            if(index != -1) {
                dlm.setElementAt(jTextFieldItem.getText(), index);
                jTextFieldItem.setText("");
            }
        });

        btnDelete.addActionListener(e -> {
            int index = jListItem.getSelectedIndex();
            if(index != -1) dlm.removeElementAt(index);
        });

        btnClearAll.addActionListener(e -> dlm.clear());

        btnSaveList.addActionListener(e -> {
            dataList.clear();
            for (int i = 0; i < dlm.getSize(); i++) dataList.add(dlm.getElementAt(i));
            jLabelList.setText("Data tersimpan = " + dataList.size());
        });
        btnInsertList.addActionListener(e -> {
            for (String item : dataList) dlm.addElement(item);
        });

        btnSaveSet.addActionListener(e -> {
            dataSet.clear();
            for (int i = 0; i < dlm.getSize(); i++) dataSet.add(dlm.getElementAt(i));
            jLabelSet.setText("Data tersimpan = " + dataSet.size());
        });
        btnInsertSet.addActionListener(e -> {
            for (String item : dataSet) dlm.addElement(item);
        });

        btnSaveMap.addActionListener(e -> {
            dataMap.clear();
            for (int i = 0; i < dlm.getSize(); i++) dataMap.put(i, dlm.getElementAt(i));
            jLabelMap.setText("Data tersimpan = " + dataMap.size());
        });
        btnInsertMap.addActionListener(e -> {
            for (Map.Entry<Integer, String> entry : dataMap.entrySet()) dlm.addElement(entry.getValue());
        });
    }

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } 
        catch (Exception e) {}
        SwingUtilities.invokeLater(() -> new GuiCollection().setVisible(true));
    }
}