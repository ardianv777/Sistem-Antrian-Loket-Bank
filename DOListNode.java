/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;



/**
 *
 * @author Ardian
 * @param <E>
 */
public class DOListNode<E> {//deklarasi kelas dan mengimplementasi tipe data generic
    private Object data;//deklarasi variabel data dengan tipe Object dan dengan akses yang bersifat private
    DOListNode next;//deklarasi variabel next dengan tipe DListNode dan dengan akses yang bersifat private
    private DOListNode prev;//deklarasi variabel prev dengan tipe DListNode dan dengan akses yang bersifat private
    
    public DOListNode(){//membuat constructor untuk kelas DOListNode
        next = null;//menyimpan null ke variabel next
        prev = null;//menyimpan null ke variabel prev
    }
    public DOListNode(E d){//membuat constructor untuk kelas DOListNode dengan mendeklarasikan variabel d dengan tipe E (generic)
        setData(d);//menginput method setData yang berisi variabel d
        next = null;//menyimpan null ke variabel next
        prev = null;//menyimpan null ke variabel prev
    }
    public DOListNode(E d, DOListNode n,DOListNode p){//membuat constructor untuk kelas DOListNode dengan mendeklarasikan variabel d dengan tipe E (generic) dan variabel n dan p dengan tipe DOListNode
        setData(d);//menginput method setData yang berisi variabel d
        this.next = n;//menyimpan variabel n ke variabel next
        this.prev = p;//menyimpan variabel p ke variabel prev
        }

    public E getData() {//membuat method getData untuk mengambil nilai dengan tipe int dan perintah getter
        return (E) data;//mengembalikkan nilai data dengan tipe E (generic)
    }

    public void setData(E data) {//membuat method setData untuk mengatur dan menyimpan variabel data dengan tipe E (generic) dan perintah setter
        this.data = data;//memberi nilai pada variabel data yang dimiliki class ini sama dengan nilai data yang merupakan parameter inputan dari method
    }

    public DOListNode getNext() {//membuat method getNext untuk mengambil nilai dengan tipe DListNode dan perintah getter
        return next;//mengembalikkan nilai next
    }

    public void setNext(DOListNode<E>  next) {//membuat method setNext untuk mengatur dan menyimpan variabel next dengan tipe DListNode yang mengimplementasikan tipe generic dan perintah setter
        this.next = next;//memberi nilai pada variabel next yang dimiliki class ini sama dengan nilai next yang merupakan parameter inputan dari method
    }

    public DOListNode<E>  getPrev() {//membuat method getPrev untuk mengambil nilai dengan tipe DOListNode yang mengimplementasikan tipe generic dan perintah getter
        return prev;//mengembalikkan nilai prev
    }

    public void setPrev(DOListNode<E>  prev) {//membuat method setPrev untuk mengatur dan menyimpan variabel prev dengan tipe DOListNode yang mengimplementasikan tipe generic dan perintah setter
        this.prev = prev;//memberi nilai pada variabel prev yang dimiliki class ini sama dengan nilai prev yang merupakan parameter inputan dari method
    }
    @Override
    public String toString(){//mmbuat method toString deengan tipe String
         return "DOListNode{" + "data = " + data + ", next = " + next + ", prev = " + prev + '}';//mencetak tulisan untuk output
    }
}
