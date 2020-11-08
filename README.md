# lab4
Application for Docker Labs


Aby lokalnie uruchomić program wydajemy polecenie:
- docker build --tag bryczek_zad1 https://github.com/ArkadiuszB239/lab4.git#master
a następnie:
- docker run -d --name bryczek_container -p 8080:8080 bryczek_zad1
