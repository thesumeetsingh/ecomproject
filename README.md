# E-Commerce Product Management System

A full-stack e-commerce product management application built with **React**, **Spring Boot**, and **MySQL**. The application allows users to manage products, upload product images, search products, and maintain persistent product data.

---

## Home Page

![Home Page](screenshots/homepage.png)

---

## Features

- Add new products
- Update existing products
- Delete products
- Search products by name, category, brand, or description
- Upload and display product images
- Product availability management
- Shopping cart
- Checkout popup
- Responsive UI
- Persistent MySQL database
- RESTful API architecture

---

## Tech Stack

### Frontend

- React
- Vite
- Bootstrap
- Axios
- CSS

### Backend

- Java 25
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Maven

### Database

- MySQL

---

## Project Structure

```
ECommerceProject
│
├── backend
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   ├── resources
│   └── pom.xml
│
└── frontend
    ├── components
    ├── assets
    ├── App.jsx
    └── main.jsx
```

---

## REST API

| Method | Endpoint | Description |
|----------|----------------------|----------------|
| GET | `/api/products` | Get all products |
| GET | `/api/product/{id}` | Get product by ID |
| POST | `/api/product` | Add product |
| PUT | `/api/product/{id}` | Update product |
| DELETE | `/api/product/{id}` | Delete product |
| GET | `/api/product/{id}/image` | Fetch product image |
| GET | `/api/products/search?keyword=` | Search products |

---

## Database

The application uses **MySQL** for persistent storage.

Product information including uploaded images is stored in the database.

Hibernate automatically manages schema creation and updates.

---

## Running the Project

### Clone Repository

```bash
git clone https://github.com/yourusername/ecommerce-project.git
```

---

### Backend Setup

1. Open the backend project.
2. Create a MySQL database.

```sql
CREATE DATABASE ecomdb;
```

3. Configure `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecomdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. Install dependencies

```bash
mvn clean install
```

5. Run Spring Boot.

---

### Frontend Setup

Install dependencies

```bash
npm install
```

Run

```bash
npm run dev
```

---

## Screenshots

### Home Page

![Home Page](screenshots/homepage.png)

---

## Future Improvements

- User Authentication
- JWT Authorization
- Order Management
- Wishlist
- Product Categories
- Pagination
- Cloud Image Storage
- Docker Deployment
- Payment Gateway Integration

---

## Author

Sumeet Singh

B.Tech Computer Science and Engineering

---

## License

This project is intended for educational and portfolio purposes.