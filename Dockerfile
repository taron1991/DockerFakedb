# Используем официальный образ PostgreSQL
FROM postgres:13

# Устанавливаем переменные окружения для базы данных
ENV POSTGRES_DB fakedb
ENV POSTGRES_USER fakepostgres
ENV POSTGRES_PASSWORD fakewestside


# Открываем порт 5432
EXPOSE 5432