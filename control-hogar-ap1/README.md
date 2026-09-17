# Control Hogar AP1

Proyecto Web Integrador para la gestión de movimientos económicos del hogar.

## Tecnologías

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Git y GitHub

## Arquitectura

El sistema utiliza una arquitectura por capas:

- Entity
- Repository
- Service
- Controller

## Funcionalidades implementadas

- Registro y listado de categorías
- Registro y listado de movimientos
- Relación entre movimientos y categorías
- Persistencia de datos en MySQL
- Servicios REST probados con Thunder Client

## Endpoints

### Categorías

- `GET /api/categorias`
- `POST /api/categorias`

### Movimientos

- `GET /api/movimientos`
- `POST /api/movimientos`

## Base de datos

La aplicación utiliza la base de datos MySQL `controlhogar`.