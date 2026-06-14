-- File      : setup_db_jdbc_mhs.sql
-- Deskripsi : Skrip untuk membuat tabel mahasiswa dengan Auto Increment
-- Pembuat   : Rafa Azlan / 24060124140126

CREATE DATABASE IF NOT EXISTS jdbc_mhs;
USE jdbc_mhs;

CREATE TABLE IF NOT EXISTS mahasiswa (
    id INT(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nama VARCHAR(20) NOT NULL
);