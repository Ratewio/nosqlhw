# NoSQL Homework

REST API для управления пользователями на Spring Boot и MongoDB.

## Технологии

- Java 25
- Spring Boot 4.1.2
- Spring Data MongoDB
- MongoDB 8.3.9
- Maven

## Запуск

```bash
./mvnw spring-boot:run
```

Приложение доступно по адресу: `http://localhost:8080`.

## API

Базовый адрес: `/users`

| Метод | Endpoint | Описание |
|---|---|---|
| POST | `/users` | Создать пользователя |
| GET | `/users` | Получить всех пользователей |
| GET | `/users/{id}` | Получить пользователя по ID |
| PUT | `/users/{id}` | Обновить пользователя |
| DELETE | `/users/{id}` | Удалить пользователя |

### Пример пользователя

```json
{
  "name": "Alex",
  "email": "alex@example.com",
  "age": 20
}
```

Для тестирования API используйте Postman или Insomnia.