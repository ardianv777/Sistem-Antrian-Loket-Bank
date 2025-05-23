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
public class DoubleLLHead<E> {//deklarasi kelas dan mengimplementasikan tipe data generic

    DOListNode<E> head;//deklarasi variabel head dengan tipe DOListNode yang mengimplementasikan tipe generic dan dengan akses yang bersifat private
    private int size;//deklarasi variabel size dengan tipe int dan dengan akses yang bersifat private

    public DoubleLLHead() {//membuat constructor untuk kelas DoubleLLHead
        head = new DOListNode<E>();//membuat objek baru dengan nama head dan bertipe DOListNode yang mengimplementasikan nilai generic
        head.setNext(head);//menginput method setNext untuk objek head dengan isi variabel head
        head.setPrev(head);//menginput method setPrev untuk objek head dengan isi variabel head
        size = 0;//mengisi bilangan 0 ke size
    }

    public void addBefore(E val, DOListNode point) {//membuat method addBefore dengan tipe void dan berisi variabel val dengan tipe E (generic) dan point dengan tipe DListNode
        DOListNode<E> baru = new DOListNode<E>(val);//membuat objek baru dengan nama head dan bertipe DListNode yang mengimplementasikan tipe generic dengan isi val
        baru.setNext(point);//menginput method setNext untuk objek baru dengan isi variabel point
        baru.setPrev(point.getPrev());//menginput method setNext untuk objek baru dengan isi method getPrev untuk point
        point.getPrev().setNext(baru);//menginput method setNext dengan isi variabel baru pada getPrev untuk point
        point.setPrev(baru);////menginput method setPrev untuk objek baru dengan isi variabel point
        size++;
    }

    public void addFirst(E val) {//membuat method addFirst dengan tipe void dan berisi variabel val dengan tipe E (generic)
        addBefore(val, head.getNext());//menginput method addBefore dengan isi val dan method getNext untuk objek head
    }

    public void addLast(E val) {//membuat method addLast dengan tipe int dan berisi variabel val dengan tipe E (generic)
        addBefore(val, head);//menginput method addBefore dengan isi val dan head
    }

    public DOListNode<E> remove(DOListNode<E> point) {//membuat method remove dengan tipe DOListNode yang mengimplementasikan tipe generic dan berisi variabel point dengan tipe DListNode yang mengimplementasikan tipe generic dan mendeklarasikan exception
        point.getPrev().setNext(point.getNext());//menginput method setNext dengan isi method getNext untuk point pada getPrev untuk point
        point.getNext().setPrev(point.getPrev());//menginput method setPrev dengan isi method getPrev untuk point pada getNext untuk point
        size--;
        return point;//mengembalikkan nilai point
    }

    public DOListNode<E> removeFirst() {//membuat method removeFirst dengan tipe DOListNode yang mengimplementasikan tipe generic
        return remove(head.getNext());//mengembalikkan nilai remove dengan isi method getNext untuk objek head
    }

    public DOListNode<E> removeLast() {//membuat method removeFirst dengan tipe DOListNode yang mengimplementasikan tipe generic
        return remove(head.getPrev());//mengembalikkan nilai remove dengan isi method getPrev untuk objek head
    }

    public DOListNode<E> search(E val) {//membuat method search dengan tipe DOListNode yang mengimplementasikan tipe generic dan berisi variabel val dengan tipe E (generic)
//        DOListNode<E> bantu = head.getNext();//mendeklarasikan variabel bantu dengan tipe DListNode yang mengimplementasikan tipe generic dan berisi method getNext untuk objek head
//        while (bantu.getData() != val && bantu != head) {//melakukan perulangan while jika getData untuk variabel bantu tidak sama dengan val dan bantu tidak sama dengan head
//            bantu = bantu.getNext();//menyimpan getNext untuk variabel bantu ke variabel bantu
//        }
//
//        return bantu;//mengembalikkan nilai bantu
        DOListNode<E>  bantu = head.next;
        while (bantu != head) {

            if (((Comparable) bantu.getData()).compareTo(val) == 0) {
                return bantu;
            }
            bantu = bantu.getNext();
        }
        return null;
    }

    public DOListNode<E> getHead() {//membuat method getHead untuk mengambil nilai dengan tipe DOListNode yang mengimplementasikan tipe generic dan perintah getter
        return head;//mengembalikkan nilai head
    }

    public void setHead(DOListNode<E> head) {//membuat method setHead untuk mengatur dan menyimpan variabel head dengan tipe DListNode yang mengimplementasikan tipe generic dan perintah setter
        this.head = head;//memberi nilai pada variabel head yang dimiliki class ini sama dengan nilai head yang merupakan parameter inputan dari method
    }

    public int getSize() {//membuat method getSize untuk mengambil nilai dengan tipe int dan perintah getter
        return size;//mengembalikkan nilai size
    }

    public void setSize(int size) {//membuat method setSize untuk mengatur dan menyimpan variabel size dengan tipe int dan perintah setter
        this.size = size;//memberi nilai pada variabel size yang dimiliki class ini sama dengan nilai size yang merupakan parameter inputan dari method
    }

    public boolean isEmpty() {//membuat method isEmpty dengan tipe boolean
        return (getSize() == -1);//mengembalikkan nilai method getSize yang sama dengan 0
    }

//    public DOListNode searchElemen(DoubleLLHead data, String key) {
//        DOListNode pointer = data.head;
//        pointer = pointer.getNext();
//        while (pointer != data.head) {
//            if (key == ((Nasabah) pointer.getData()).getKebutuhan()) {
//                return pointer;
//            }
//            pointer = pointer.getNext();
//        }
//        return null;
//    }

    @Override
    public String toString() {//mmbuat method toString deengan tipe String
        String isi = "";//mendeklarasikan variabel isi dan menyimpan tulisan kosong
        DOListNode<E> bantu = this.getHead().getNext();//mendeklarasikan variabel bantu dengan tipe DListNode yang mengimplementasikan tipe generic dan berisi method getNext untuk method getHead yang dimiliki class ini
        while (bantu != head) {//melakukan perulangan while jika kondisi variabel bantu tidak sama dengan head
            isi = isi + bantu.getData() + " ";//menyimpan hasil dari isi tambah nilai dari method getData untuk bantu tambah tulisan kosong ke variabel isi
            bantu = bantu.getNext();//menyimpan method getNext untuk variabel bantu ke variabel bantu
        }
        return isi;//mengembalikkan nilai isi
    }
}
