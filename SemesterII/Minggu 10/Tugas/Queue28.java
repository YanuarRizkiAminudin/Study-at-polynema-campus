package Tugas;

public class Queue28 {
    Pembeli28[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue28(int n) {
        max = n;
        antrian = new Pembeli28[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty() {
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void enqueue(Pembeli28 p) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = p;
            size++;
        }
    }
    public Pembeli28 dequeue() {
        Pembeli28 temp = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            temp = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return temp;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
            System.out.println("jumlah elemen = " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + ", No HP: " + antrian[front].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang: " + antrian[rear].nama + ", No HP: " + antrian[rear].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int posisi = -1;
            for (int i = front; i != rear; i = (i + 1) % max) {
                if (antrian[i].nama.equals(nama)) {
                    posisi = (i - front + size) % max + 1;
                    break;
                }
            }
            if (antrian[rear].nama.equals(nama)) {
                posisi = (rear - front + size) % max + 1;
            }
            if (posisi == -1) {
                System.out.println("Pembeli dengan nama " + nama + " tidak ditemukan dalam antrian");
            } else {
                System.out.println("Pembeli dengan nama " + nama + " berada di posisi " + posisi);
            }
        }
    }
    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Daftar Pembeli:");
            int i = front;
            while (i != rear) {
                System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
        }
    }
}