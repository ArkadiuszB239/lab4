# lab4
Application for Docker Labs


Aby lokalnie uruchomić program wydajemy polecenia:
- docker build --tag bryczek_zad1 https://github.com/ArkadiuszB239/lab4.git#master
- docker run -d --name bryczek_container -p 8080:8080 bryczek_zad1


Aby uruchomić program z gotowego obrazu na docker.hub:

- docker pull arekb112/first_lab_repo
- docker run -d --name bryczek_container -p 8080:8080 arekb112/first_lab_repo
