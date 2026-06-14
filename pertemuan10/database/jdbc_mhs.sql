-- File      : setup_db_jdbc_mhs.sql
-- Deskripsi : Skrip untuk membuat database dan tabel untuk praktikum 10 (JDBC CRUD)
-- Pembuat   : Rafa Azlan / 24060124140126
-- Tanggal   : 12 Mei 2026

CREATE DATABASE IF NOT EXISTS jdbc_mhs;
USE jdbc_mhs;

CREATE TABLE IF NOT EXISTS mahasiswa (
    id INT(11) PRIMARY KEY NOT NULL,
    nama VARCHAR(20) NOT NULL
);
