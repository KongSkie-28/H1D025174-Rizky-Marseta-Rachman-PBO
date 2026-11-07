# Responsi Akhir Praktikum Pemrograman Berorientasi Objek (PBO)

**Jurusan Informatika - Fakultas Teknik - Universitas Jenderal Soedirman**

---

## 🆔 Identitas Mahasiswa

* **Nama**: Rizky Marseta Rachman
* **NIM**: H1D025174
* **Digit Terakhir NIM**: 4
* **Tema Sistem**: IoT

---

## 📌 Deskripsi Sistem

Sistem ini dibangun menggunakan bahasa pemrograman **Java** dengan menerapkan konsep Pemrograman Berorientasi Objek (Object-Oriented Programming). Proyek ini berada di dalam package `Responsi_PBO` pada repositori praktikum dan dirancang untuk memenuhi 10 persyaratan teknis penugasan Responsi Akhir PBO.

---

## ⚙️ Pemenuhan Persyaratan Teknis Kode

Berikut adalah pemetaan implementasi 10 persyaratan teknis pada source code proyek di package `Responsi_PBO`:

| No | Konsep | Ketentuan Penugasan | Lokasi Class / Method Implementasi |
| :-: | ----- | ----- | ----- |
| **1** | **State dan Behavior** | Memiliki variabel, method `void`, dan method `return value`. | *Contoh: `Responsi_PBO/Entity.java`* |
| **2** | **Immutability** | Memiliki `public static final` (konstanta) dan `private final` (atribut kekal). | *Contoh: `Responsi_PBO/AppConfig.java`* |
| **3** | **Enkapsulasi & Overloading** | Atribut `private` + getter/setter, keyword `this`, minimal 2 overloaded constructor. | *Contoh: `Responsi_PBO/User.java`* |
| **4** | **Inheritance** | Relasi superclass dan minimal 2 subclass via `extends`. Class `Main` terpisah. | *Contoh: `Responsi_PBO/Main.java`* |
| **5** | **Super Chaining** | Pemanggilan `super(...)` pada konstruktor subclass dan `super.namaMethod()`. | *Contoh: Subclass constructor & method* |
| **6** | **Method Overriding** | Penimpaan method superclass pada subclass menggunakan anotasi `@Override`. | *Contoh: `@Override` pada Subclass* |
| **7** | **Abstract Class** | Superclass berstatus `abstract` dan memiliki minimal satu `abstract method`. | *Contoh: `Responsi_PBO/AbstractClass.java`* |
| **8** | **Logika State Percabangan** | Implementasi abstract method memuat logika `if/else` yang membaca & mengubah state objek. | *Contoh: Method logika pada Subclass* |
| **9** | **Polimorfisme Interface** | Pemanggilan method melalui variabel referensi bertipe interface (`NamaInterface obj = new Subclass();`). | *Contoh: `Responsi_PBO/Main.java`* |
| **10** | **Multiple Interface** | Minimal satu subclass mengimplementasikan minimal dua interface sekaligus (`implements A, B`). | *Contoh: `Responsi_PBO/Subclass.java`* |

---

## 📁 Struktur Repositori Proyek

Berdasarkan struktur proyek IntelliJ IDEA Anda:

```text
Praktikum_PBO_1/
├── .idea/
├── out/
├── src/
│   ├── Praktikum_PBO1/
│   ├── Praktikum_PBO2/
│   ├── ...
│   ├── Praktikum_PBO9/
│   └── Responsi_PBO/         <-- Root Folder Responsi
│       ├── Main.java
│       ├── [Interface1].java
│       ├── [Interface2].java
│       ├── [AbstractClass].java
│       ├── [Subclass1].java
│       └── [Subclass2].java
├── .gitignore
├── Praktikum_PBO_1.iml
└── README.md
```

---

## 🚀 Petunjuk Compile & Run via Terminal

Karena kode berada di dalam folder `src/` dan menggunakan package `package Responsi_PBO;`, ikuti langkah-langkah berikut untuk kompilasi dan menjalankan program via terminal:

### 1. Buka Terminal dan Navigasi ke Root Project

Pastikan Anda berada di direktori root `Praktikum_PBO_1`:

```bash
cd D:/kyky/Praktikum_PBO_1
```

### 2. Kompilasi (Compile) Kode Sumber

Kompilasi seluruh file `.java` yang ada di dalam package `Responsi_PBO` dan simpan hasil build ke folder `out/`:

```bash
javac -d out src/Responsi_PBO/*.java
```

### 3. Jalankan Program (Run)

Jalankan class `Main` yang berada di dalam package `Responsi_PBO`:

```bash
java -cp out Responsi_PBO.Main
```

---

## 📸 Screenshot Luaran Program (Output)

Berikut adalah bukti eksekusi program melalui class `Main` di package `Responsi_PBO`:

![Output Running Program](screenshots/output_running.png)

*(Catatan: Simpan gambar screenshot hasil running terminal ke folder `screenshots/output_running.png`)*

---

## 📄 Pengujian pada Class `Main`

Pengujian pada `Responsi_PBO.Main` mencakup:

1. Instansiasi objek subclass dengan variasi konstruktor (*Overloaded Constructor*).
2. Pemanggilan method polimorfik melalui referensi *Interface*.
3. Pengubahan dan evaluasi *state* internal objek memanfaatkan logika percabangan `if/else`.
4. Pembuktian penggunaan atribut kekal (*final*) dan konstanta.