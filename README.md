# E-Commerce Web Application

A simple full-stack e-commerce application built using Spring Boot and React. It provides REST APIs for managing products and a React frontend to interact with them.

## Tech Stack

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- H2 Database
- Lombok

### Frontend
- React
- React Router
- Axios

## Features

- View all products
- View product details
- Add new products
- Upload product images
- Store product images in the database

## Project Structure

```
ecomproject
├── backend
│   ├── controller
│   ├── model
│   ├── repository
│   ├── service
│   └── resources
└── frontend
    ├── components
    ├── Context
    └── assets
```

## REST API

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/products` | Get all products |
| GET | `/api/product/{id}` | Get product by ID |
| POST | `/api/product` | Add a product with image |

## Running the Project

### Backend

```bash
mvn spring-boot:run
```

Runs on:

```
http://localhost:8080
```

### Frontend

```bash
npm install
npm run dev
```

Runs on:

```
http://localhost:5173
```

## Database

The project uses the H2 in-memory database.

H2 Console:

```
http://localhost:8080/h2-console
```

Default configuration:

```
JDBC URL: jdbc:h2:mem:demo
Username: sa
Password:
```

## Future Improvements

- Update product
- Delete product
- Product search
- Shopping cart
- User authentication
- MySQL/PostgreSQL support

## Author

Sumeet Singh
