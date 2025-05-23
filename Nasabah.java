/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Ardian
 */
public class Nasabah implements Comparable {

    private String nama, alamat, kebutuhan, noAntrian;
    private int nominal;

    public Nasabah() {
        kebutuhan = null;
    }

    public Nasabah(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }

    public Nasabah(String noAntrian, String nama, String alamat, String kebutuhan, int nominal) {
        this.nama = nama;
        this.alamat = alamat;
        this.noAntrian = noAntrian;
        this.kebutuhan = kebutuhan;
        this.nominal = nominal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoAntrian() {
        return noAntrian;
    }

    public void setNoAntrian(String noAntrian) {
        this.noAntrian = noAntrian;
    }

    public String getKebutuhan() {
        return kebutuhan;
    }

    public void setKebutuhan(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }

    @Override
    public String toString() {
        return "No Antrian : " + noAntrian + "\n" + "Nama Nasabah : " + nama + "\n" + "Alamat Nasabah : " + alamat
                + "\n" + "Keperluan : " + kebutuhan + "\n" + "Nominal : " + nominal;
    }

    @Override
    public int compareTo(Object o) {
        Nasabah tiket = (Nasabah) o;
        if (noAntrian.equals(tiket.getNoAntrian())) {
            return 0;
        } else {
            return 1;
        }
    }
}
