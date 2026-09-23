package com.mycompany.minpro2jasacucisepatu;

import Controller.TransaksiController;
import Model.Pelanggan;
import Model.Sepatu;
import Model.SepatuBoot;
import Model.SepatuSneakers;
import Model.Transaksi;
import View.Menu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Minpro2JasaCuciSepatu {

    public static void main(String[] args) {

        TransaksiController controller = new TransaksiController();

        // dummy data

        Pelanggan pelanggan1 = new Pelanggan(
                "PL001",
                "Syahla",
                "081234567890",
                "Samarinda"
        );

        Sepatu sepatu1 = new SepatuSneakers(
                "SP001",
                "Nike",
                "Putih"
        );

        String tanggal1 = LocalDate.now().format(
                DateTimeFormatter.ofPattern("dd-MM-yyyy")
        );

        Transaksi transaksi1 = new Transaksi(
                "TR001",
                pelanggan1,
                sepatu1,
                "Deep Clean",
                35000,
                tanggal1,
                "Menunggu"
        );

        controller.tambah(transaksi1);


        Pelanggan pelanggan2 = new Pelanggan(
                "PL002",
                "cala",
                "082345678901",
                "Bontang"
        );

        Sepatu sepatu2 = new SepatuBoot(
                "SP002",
                "Dr. Martens",
                "Hitam"
        );

        String tanggal2 = LocalDate.now().format(
                DateTimeFormatter.ofPattern("dd-MM-yyyy")
        );

        Transaksi transaksi2 = new Transaksi(
                "TR002",
                pelanggan2,
                sepatu2,
                "Fast Clean",
                20000,
                tanggal2,
                "Diproses"
        );

        controller.tambah(transaksi2);

        Menu menu = new Menu(controller);

        menu.tampilkanMenu();
    }
}