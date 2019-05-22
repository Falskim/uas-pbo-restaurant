# UAS PBO Restaurant
Percobaan penerapan konsep OOP dan implementasi JDBC antara Java dan Mysql

### PBO A - Kelompok 2:
- Fawwaz Syiham Muyassar        (1177050044)
- Seno Tresna Galang Pradana    (11770500106) 
- Fahmi Fauzi kadarmanto        (177050127)  

## Yang dibutuhkan :
- XAMPP (untuk MySQL, Apache, phpmyadmin)
- Netbeans (untuk membuka Project)

## Langkah - Langkah Menjalankan Aplikasi :
1. Persiapkan aplikasi yang dibutuhkan
2. Download/clone source code project, dengan cara (Pilih) :
    - Menclone langsung melalui Netbeans
      
      [Tutorial](https://www.joe0.com/2018/02/16/how-to-cloning-github-project-into-netbeans/)
    - Aplikasi git
      1. Buka git, kemudian masukan command
          ```
          git clone https://github.com/Falskim/uas-pbo-restaurant.git
          ```
      2. Buka aplikasi Netbeans, lalu pilih **Open Project**
      3. Pilihlah folder dimana tempat clone berada
    - Download .zip **Clone or download**
      1. Pada atas kanan, klik **Clone or download** dan **Download ZIP**
      2. Ekstrak .zip tersebut
      3. Buka aplikasi Netbeans, lalu pilih **Open Project**
      4. Pilihlah folder dimana tempat ekstrak berada
3. Buka aplikasi XAMPP, lalu Aktifkan Mysql dan Apache
4. Buka link localhost phpmyadmin pada browser, dengan cara (Pilih) :
    - Tekan button **Admin** pada sebelah kanan baris **MySQL**
    - [Click Me !](http://localhost/phpmyadmin/index.php) 
5. Pada phpmyadmin, klik tab **Database** lalu buatlah database baru dengan nama **restaurant**
6. Pada phpmyadmin, klik tab **Import** lalu click _Choose File_ dan pilih **restaurant.sql** yang berada pada subdirectory project */sql/*
   ```
   .../UAS-PBO/sql/
   ```
7. Buka aplikasi Netbeans, lalu pilih dan jalankan **MainInterface.java**, dengan cara (Pilih) :
    - Pada sidebar kiri, buka package **main** lalu click kanan pada **MainInterface.java** dan pilih **Run File**
    - Pada tab Run (diantara **Refactor** dan **Debug**), click **Run Project**, dan pilih **MainInterface.java** sebagai class utama
    
_Anda dapat pula membuild project dengan cara mengclick_ __Clean and Build Project__ _pada tab_ __Run__ _, sehingga jika anda ingin menjalankan aplikasi ini tidak perlu membuka Netbeans, namun cukup dengan menjalankan_ __UAS-PBO.jar__ _yang berada pada direktori build berada, default :_
    ```
       .../UAS-PBO/dist/UAS-PBO.jar
    ```
    
## Keterangan Menggunakan Aplikasi
- Jika anda memilih untuk mengetik jumlah porsi (tidak mengclick spinner), maka pastikan anda menekan **Enter** setelahnya
- Jika anda lupa dengan id transaksi (untuk melakukan cek status), maka anda dapat membuka phpmyadmin table **orders** dan mencari daftar id yang tersedia ([Shortcut](http://localhost/phpmyadmin/sql.php?server=1&db=restaurant&table=orders&pos=0)) 
- Lebih detailnya dapat dilihat pada [User Manual](https://github.com/Falskim/uas-pbo-restaurant/blob/master/USER%20MANUAL.pdf)    

## TL;DR
Clone project ini, buat database baru bernama **restaurant**, import file **restaurant.sql** yang terdapat pada folder /sql/, lalu run **MainInterface.java** melalui netbeans


_Aplikasi ini diibuat pada Netbeans versi 8.2_
