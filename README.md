# AnimeG API

## What is this project?
An Application Programming Interface for we can do the basic CRUD operations create, read, update, and delete. I use this project Anime Models to store on the database but you can use your model like Product or something else. 

## Dependencies
- IDE
- Pgadmin4
- Postman

## Instalation
1. Clone this repository:
 ```
 git clone https://github.com/usuario/anime-api.git
 ```
2. Open your IDE favorite and import the project folder.
3. Install maven dependencies.
```
./mvnw install
```

## Configuration
1. Configure your connection with Postgresql in src/main/java/resources/application.properties

## Endpoints
### GET /anime
Return all animes on database
![Screenshot from 2024-06-13 18-41-27](https://github.com/luizgmelo/anime-springboot-api/assets/88911920/5d2059da-ec17-44b3-bbfe-0fac13457a2d)
### POST /anime
Add one anime in database
![Screenshot from 2024-06-13 18-41-05](https://github.com/luizgmelo/anime-springboot-api/assets/88911920/92983d64-4b29-4467-99f4-afdad4eff004)
### PUT /anime/{id}
Udpate one anime in database
![Screenshot from 2024-06-13 18-42-31](https://github.com/luizgmelo/anime-springboot-api/assets/88911920/3bf286da-7060-4511-8370-b07f395a7163)
### DELETE /anime/{id}
Delete one anime in database
![Screenshot from 2024-06-13 18-42-51](https://github.com/luizgmelo/anime-springboot-api/assets/88911920/aad80d1a-1542-4656-a2a6-7a08069e5321)

## Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- PosgresSQL
- Maven

## Contact with me
Email: luizgmelo64@gmail.com <br>
LinkedIn: https://www.linkedin.com/in/luiz-guilherme-78905323a/ | Luiz Guilherme
