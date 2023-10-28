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