# Java validation

source : programmer zaman now


##Validator
- class utama dalam Bean Validation
- Validator digunakan sebagai object untuk mengeksekusi validation.
- Validator adalah object yang berat. Sebaiknya hanya dibuat sekali saja

##ValidatorFactory
- Validator adalah Interface, untuk membuatnya kita membutuhkan ValidatorFactory
- ValidatorFactory cukup dibuat sekali di dalam aplikasi karena ini adalah obect yang berat.
- UNtuk membuatnya bisa menggunakan calss Validation dan method buildDefaultValidatorFactory()

## Nested Validation
- perlu menambahkan annotation @Valid pada field address di class Person


## Hibernate Validator Constraint
- selain annotation yg ada di Bean Validation, Hibernate Validator juga menyediakan constraint tambahan
- kita bisa melihatnya di package org.hibernate.validator.constraints


## Grouping constraints
- contoh kasus: payment menggunakan credit card, transfer bank, dll menggunakan  class DTO yang sama
- oleh karena itu perlu group constraint karena kebutuhannya berbeda
- misalnya payment dengan CC, maka creditCardNumber menjadi mandatory
- namun jika payment menggunakan VA bank, maka creditCardNumber tidak menjadi mandatory
- setiap constraint bisa memiliki lebih dari 1 group

## Group Sequence
- urutan group mana dulu yang di validasi


## Group Conversion
- Kadang ada kasus dimana terdapat sebuah class yang sudah memiliki field group, namun ternyata kita membutuhkan class tersebut di embed di class lain, sedangkan class lain menggunakan group berbeda
- class Payment memiliki Customer sebagai field
- perlu menambahan @ConvertGroup di class Payment agar field validation di class Customer akan divalidasi
- 
