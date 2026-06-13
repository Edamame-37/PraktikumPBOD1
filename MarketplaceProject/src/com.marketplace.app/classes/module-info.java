module com.marketplace.app {
    requires com.marketplace.core;
    requires com.marketplace.repository;
    requires java.desktop; // Ini yang paling sering terlupa, wajib ada agar GUI tidak error merah!
}