/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192259_stack;

import java.util.Scanner;

/**
 *
 * @author Sendy
 */
public class E31192259_Stack {

    /**
     * @param args the command line arguments
     */
    int nim;
    String nama;
    E31192259_Stack next;
    //Fungsi Scanner sebagai inputan
    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    //Tampilan yang keluar saat memilih menu 1.Push atau saat akan memasukkan data
    public void input() {
        System.out.print("Masukkan NIM\t\t: ");
        nim = in.nextInt();
        System.out.print("Masukkan Nama Mahasiswa\t: ");
        nama = str.nextLine();
        next = null;
    }

    //Tampilan yang keluar saat memilih 3. View Stack, yaitu menampilkan isi dari Stack
    public void view() {
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama Mahasiswa\t: " + nama);
    }

    public static void main(String[] args) {
        int menu = 0;
        //Dekalarasi nama object baru st yang merupakan dari class Stack
        Stack st = new Stack();
        System.out.println("-----------------");
        System.out.println("| Stack Program |");
        System.out.println("-----------------");
        //Perulangan memilih menu, terdapat 4 pilihan menu. Apabila input lebih dari 4 maka akan menampilkan input salah,
        //dan mengulang inputan dari awal.
        while (menu != 4) {
            System.out.println("1. Push\n2. Pop\n3. View Stack\n4. Exit Program");
            System.out.println("-------------------");
            System.out.print("Pilih Menu : ");
            menu = in.nextInt();
            //Memanggil method push dalam class Stack
            if (menu == 1) {
                E31192259_Stack baru = new E31192259_Stack();
                baru.input();
                st.push(baru);
            } //Memanggil method pop dalam class Stack
            else if (menu == 2) {
                st.pop();
            } //Memanggil method view dalam class Stack
            else if (menu == 3) {
                st.view();
            } else if (menu == 4) {
                System.out.println("Exiting ...");
            } else {
                System.out.println("Input salah ...");
            }
            System.out.println(" ");
        }
    }
}
