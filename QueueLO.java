/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Ardian
 */
public class QueueLO<E> {//deklarasi kelas dan mengimplementasikan tipe data generic

    DoubleLLHead<E> antrian;// mendeklarasikan variabel antrian dengan tipe dengan tipe DoubleLLHead yang mengimplementasikan tipe generic

    public QueueLO() {//Membuat constructor untuk kelas QueueLO
        antrian = new DoubleLLHead<E>();//membuat variabel antrian menjadi objek baru dengan tipe DoubleLLHead yang mengimplementasikan tipe generic
    }

    public boolean enQueue(E data) {//membuat method enQueue dengan tipe boolean dan diisi dengan variabel data dengan tipe E (generic)
        antrian.addLast(data);//menginput method addLast dengan isi variabel data untuk objek antrian
        return true;//Mengembalikkan nilai true
    }

    public E deQueue() {//membuat method deQueue dengan tipe E (generic)
        if (!isEmpty()) {//jika kondisi negasi dari method isEmpty
            return (E) antrian.removeFirst().getData();//Mengembalikkan nilai method getData pada method removeFirst untuk objek antrian dengan tipe E (generic)
        }
        return null;//mengembalikkan nilai null
    }

    public boolean isEmpty() {//membuat method isEmpty dengan tipe boolean
        return antrian.isEmpty();//mengembalikkan nilai method isEmpty untuk objek antrian
    }

    public int size() {//membuat method isEmpty dengan tipe int
        return antrian.getSize();//mengembalikkan nilai method getSize untuk objek antrian
    }

    public String toString() {//membuat method toString dengan tipe String
        return antrian.toString();//mengembalikkan nilai method toString untuk objek antrian
    }

    public E cari(E key) {
        return (E) antrian.search(key);
    }
}
