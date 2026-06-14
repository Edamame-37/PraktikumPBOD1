-- File      : setup_db_pbo.sql
-- Deskripsi : Skrip untuk membuat database dan tabel untuk praktikum 10 (DAO Dasar)
-- Pembuat   : Rafa Azlan / 24060124140126
-- Tanggal   : 12 Mei 2026

CREATE DATABASE IF NOT EXISTS pbo;
USE pbo;

CREATE TABLE IF NOT EXISTS person (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
    name VARCHAR(100)
);