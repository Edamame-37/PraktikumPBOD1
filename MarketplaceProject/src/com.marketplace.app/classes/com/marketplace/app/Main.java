package com.marketplace.app;

import com.marketplace.app.controller.MarketplaceController;
import com.marketplace.app.view.MarketplaceView;
import com.marketplace.repository.db.ProdukRepository;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        // Menggunakan tema Cross-Platform bawaan Java agar custom styling kita tidak ditimpa oleh Windows
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Gagal memuat tema cross-platform.");
        }

        SwingUtilities.invokeLater(() -> {
            MarketplaceView view = new MarketplaceView();
            ProdukRepository repo = new ProdukRepository();
            
            MarketplaceController app = new MarketplaceController(view, repo);
            app.start();
        });
    }
}