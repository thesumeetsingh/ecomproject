# E-Commerce Product Management System

## Overview

This is a full-stack E-Commerce Product Management application built using **Spring Boot** for the backend and **React (Vite)** for the frontend.

The application allows users to browse products, search products, filter by category, view detailed product information, upload product images, manage products, maintain a shopping cart, and simulate a checkout process that updates product inventory.

The backend exposes REST APIs while the frontend consumes them using Axios.

---

## Features

### Product Management
- View all available products
- View individual product details
- Add new products
- Update existing products
- Delete products
- Upload product images
- Store images directly in the database

### Product Search
- Search by
  - Product Name
  - Brand
  - Category
  - Description

### Categories
- Browse products category-wise
- Filter products dynamically

### Product Details
- Display product information
- Product image
- Brand
- Description
- Price
- Release date
- Availability status

### Shopping Cart
- Add products to cart
- Increase or decrease quantity
- Remove items
- Calculate total price
- Checkout popup
- Inventory updates after checkout

### UI Features
- Responsive interface
- Dark mode / Light mode
- Search suggestions
- Bootstrap based design

---

# Tech Stack

## Frontend

- React
- Vite
- React Router
- Axios
- Bootstrap
- CSS

## Backend

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- H2 Database

## Build Tools

- Maven
- npm

---

# Project Structure

```
ecomproject/

│
├── backend/
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   └── resources
│
├── frontend/
│   ├── components
│   ├── Context
│   ├── assets
│   ├── App.jsx
│   └── main.jsx
│
└── README.md
```

---

# Backend APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/products` | Get all products |
| GET | `/api/product/{id}` | Get product by ID |
| GET | `/api/product/{id}/image` | Get product image |
| POST | `/api/product` | Add product |
| PUT | `/api/product/{id}` | Update product |
| DELETE | `/api/product/{id}` | Delete product |
| GET | `/api/products/search?keyword=` | Search products |

---

# Database

The project uses the **H2 in-memory database**.

Each product stores:

- Product ID
- Name
- Brand
- Description
- Price
- Category
- Release Date
- Stock Quantity
- Availability
- Image Name
- Image Type
- Image Data (BLOB)

---

# Image Upload

Product images are uploaded using **multipart/form-data**.

The backend stores:

- image name
- image type
- image bytes

Images are retrieved through a dedicated REST endpoint.

---

# Installation Guide

## Prerequisites

Install the following software:

- Java 21+ (or the version compatible with your Spring Boot setup)
- Maven
- Node.js
- npm
- Git

---

## Clone the Repository

```bash
git clone https://github.com/thesumeetsingh/ecomproject.git

cd ecomproject
```

---

# Backend Setup

Navigate to the backend project.

```bash
cd backend
```

Install dependencies and run:

```bash
mvn clean install

mvn spring-boot:run
```

Backend runs on

```
http://localhost:8080
```

---

# Frontend Setup

Navigate to the frontend project.

```bash
cd frontend
```

Install dependencies

```bash
npm install
```

Start the development server

```bash
npm run dev
```

Frontend usually runs on

```
http://localhost:5173
```

---

# How to Use

1. Start the Spring Boot backend.
2. Start the React frontend.
3. Open the frontend in your browser.
4. Browse available products.
5. Add products using the Add Product page.
6. Upload product images.
7. Search products using the search bar.
8. Filter products by category.
9. View product details.
10. Add products to the cart.
11. Complete checkout to update inventory.

---

# Technologies Used

### Backend

- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

### Frontend

- React
- Vite
- Axios
- React Router
- Bootstrap
- CSS

---

# Future Improvements

- User authentication and authorization
- JWT-based login
- MySQL/PostgreSQL integration
- Order history
- Payment gateway integration
- Wishlist
- Product reviews and ratings
- Admin dashboard
- Pagination
- Product sorting
- Cloud image storage (AWS S3, Cloudinary)
- Docker support
- Deployment to cloud platforms

---

# Author

**Sumeet Singh**

B.Tech Computer Science & Engineering

Bhilai Institute of Technology, Durg

---

# License

This project is intended for learning and educational purposes.