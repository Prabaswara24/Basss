/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192259_stack;

/**
 *
 * @author Sendy
 */
public class Stack {

    E31192259_Stack top;

    public Stack() {
        top = null;
    }

    //Push berfungsi untuk menyimpan data ke dalam Stack
    public void push(E31192259_Stack a) {
        if (top == null) {
            top = a;
        } else {
            a.next = top;
            top = a;
        }
    }

    //Pop berfungsi untuk menghapus data di dalam Stack
    public void pop() {
        if (top == null) {
            System.out.println("Stack telah kosong");
        } else {
            System.out.println("Pop Data ...");
            top.view();
            top = top.next;
        }
    }

    //View untuk menampilkan isi dari Stack baik saat belum diisi, sudah diisi, maupun telah diPop/hapus
    public void view() {
        if (top == null) {
            System.out.println("Stack masih kosong");
        } else {
            E31192259_Stack ptr = top;
            while (ptr != null) {
                System.out.println("-----------------");
                ptr.view();
                ptr = ptr.next;
            }
        }
    }
}
