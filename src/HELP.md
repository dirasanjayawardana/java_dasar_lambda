# Lambda
- Di java lambda merupakan representasi sederhana dari anonymous class yang memiliki satu method abstract (Functional Interface)
- Pada bahasa pemrograman lain, lambda biasanya merupakan representasi dari anonymous function, namun di java, function tidak bisa berdiri sendiri, tetapi harus berada di dalam class
- Jadi di java, lambda merupakan representasi dari sebuah anonymous class

## Syarat Lambda
- Berupa interface
- Hanya memiliki satu method abstract
- Ditambahkan annotation @FunctionalInterface di interfacenya
- Minimal menggunakan java 8

## java.util.function
Sejak java 8 muncul lambda, java juga menyediakan package baru bernama java.util.function.
Package ini berisi banyak functional interface untuk kebutuhan membuat lambda.
Dengan menggunakan interface-interface yang ada di package inim tidak perlu lagi membuat functional interface sendiri secara manual.
Contoh interface yang disediakan :
- Consumer
- Interface Function
- Predicate
- Dll