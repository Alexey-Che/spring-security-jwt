# spring-security-jwt
Сервис авторизации пользователей, сохранение и чтнение пользовательских сообщений

описание эндпойнтов:

@RestController AuthController

 @PostMapping("/register")  
 регистрация в БД нового пользователя
 request:
 RegistrationRequestDto 
                       {
                          "login": "",
                          "password": ""
                       }
 response: "OK"
 
 @PostMapping("/auth")  
 получение jwt токена зарегестрированным пользователем
 request:
 AuthRequestDto
                       {
                          "login": "",
                          "password": ""
                       }
 response: 
 AuthResponseDto {
                  "{сгенерированный jwt токен}",
                  }
 
@RestController MessageController

@PostMapping("/message") 
сохранение сообщения от авторизованного пользователя, либо получение истории сообщений
request:
 MessageRequestDto 
                       {
                          "login": "",
                          "message": "" 
                       }
 response: List<MessageResponseDto>
 возвращает переданное сообщение, либо при сообщении вида "history x" возвращает х последних пользовательских сообщений
 
 
 Создание образа и запуск контейнера docker
 
 ./mvnw clean package -DskipTests  // приложение как файл JAR
 
cp target/spring-security-jwt-0.0.1-SNAPSHOT.jar src/main/docker //копируем файл JAR в директорию src/main/docker

docker compose up  // запускаем docker compose
 

 
 
 
