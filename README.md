# UAS PBO Restaurant
Percobaan penerapan konsep OOP dan implementasi JDBC antara Java dan Mysql

## Yang dibutuhkan :
- XAMPP (untuk mysql)
- Netbeans (untuk membuka project ini)

## Langkah - langkah penggunaan :
1. Persiapkan aplikasi yang dibutuhkan
2. Download/clone project ini dengan cara (silahkan dipilih)
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
4. Buka link localhost phpmyadmin pada browser
   ```
   http://localhost/phpmyadmin/index.php
   ```
5. Pada phpmyadmin buatlah database baru dengan nama **restaurant**
6. Pada tab import phpmyadmin, klik _Choose File_ dan pilih **restaurant.sql** pada folder project /sql/
   ```
   .../UAS-PBO/sql/
   ```
7. Pilih dan jalankan **MainInterface.java**

## TL;DR
Clone project ini, buat database baru bernama **restaurant**, import file **restaurant.sql** yang terdapat pada folder /sql/, lalu run **MainInterface.java** melalui netbeans


Dibuat pada aplikasi Netbeans versi 8.2