# TailorMe-API

## Overview

**Purpose:** Manage users, dresses, blouses, shirts, and skirts for a tailoring platform.  
**Target Audience:** Tailor shop administrators, staff, and customers  
**Version:** v1

## Authentication

**Authentication type:** JWT

**Purpose for chosen Authentication type:** Provides stateless, token-based authentication suitable for REST APIs.

**Permissions**
- **ADMIN:** Full access to all endpoints.
- **STAFF:** Access to most clothing and user endpoints.
- **CUSTOMER:** Limited access (e.g., can sign up, log in, view own data).

---

## Endpoint Summary and Details

### User Endpoints

1. **User Registration**
   - **Endpoint:** POST /api/v1/user
   - **Request Body Example:**
     ```json
     {
       "firstName": "Jane",
       "lastName": "Doe",
       "email": "jane@example.com",
       "password": "SecurePass123",
       "userRole": "customer"
     }
     ```
   - **Response Example:**
     ```json
     {
       "message": "user successfully created"
     }
     ```

2. **User Login**
   - **Endpoint:** GET /api/v1/user/Login
   - **Request Body Example:**
     ```json
     {
       "email": "jane@example.com",
       "password": "SecurePass123"
     }
     ```
   - **Response Example:**
     ```json
     {
       "userId": 1,
       "userRole": "customer",
       "firstName": "Jane",
       "lastName": "Doe",
       "email": "jane@example.com",
       "jwt": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
     }
     ```

3. **Login With Code**
   - **Endpoint:** GET /api/v1/user/loginWithCode?code=123456
   - **Response Example:**
     ```json
     {
       "message": "Success"
     }
     ```

4. **Get All Users**
   - **Endpoint:** GET /api/v1/user/getAllusers
   - **Response Example:**
     ```json
     [
       {
         "userId": 1,
         "userRole": "admin",
         "firstName": "Alice",
         "lastName": "Smith",
         "email": "alice@example.com"
       },
       {
         "userId": 2,
         "userRole": "customer",
         "firstName": "Jane",
         "lastName": "Doe",
         "email": "jane@example.com"
       }
     ]
     ```

5. **Get User By ID**
   - **Endpoint:** GET /api/v1/user/getuser?Id=1
   - **Response Example:**
     ```json
     {
       "userId": 1,
       "userRole": "admin",
       "firstName": "Alice",
       "lastName": "Smith",
       "email": "alice@example.com"
     }
     ```

---

### Dress Endpoints

1. **Add New Dress**
   - **Endpoint:** POST /api/v1/dress/newDress
   - **Request Body Example:**
     ```json
     {
       "name": "Evening Gown",
       "size": "M",
       "color": "Red"
     }
     ```
   - **Response Example:**
     ```json
     {
       "dressId": 1,
       "name": "Evening Gown",
       "size": "M",
       "color": "Red"
     }
     ```

2. **Get All Dresses**
   - **Endpoint:** GET /api/v1/dress/getDresses
   - **Response Example:**
     ```json
     [
       {
         "dressId": 1,
         "name": "Evening Gown",
         "size": "M",
         "color": "Red"
       }
     ]
     ```

3. **Delete All Dresses**
   - **Endpoint:** DELETE /api/v1/dress/deleteAllDresses
   - **Response Example:**
     ```json
     {
       "message": "Successfully deleted all"
     }
     ```

4. **Delete Dress By ID**
   - **Endpoint:** DELETE /api/v1/dress/deleteDressById?Id=1
   - **Response Example:**
     ```json
     {
       "message": "Successfully deleted"
     }
     ```

---

### Blouse Endpoints

1. **Add New Blouse**
   - **Endpoint:** POST /api/v1/blouse/newBlouse
   - **Request Body Example:**
     ```json
     {
       "name": "Silk Blouse",
       "size": "S",
       "color": "Blue"
     }
     ```
   - **Response Example:**
     ```json
     {
       "blouseId": 1,
       "name": "Silk Blouse",
       "size": "S",
       "color": "Blue"
     }
     ```

2. **Get All Blouses**
   - **Endpoint:** GET /api/v1/blouse/getBlouse
   - **Response Example:**
     ```json
     [
       {
         "blouseId": 1,
         "name": "Silk Blouse",
         "size": "S",
         "color": "Blue"
       }
     ]
     ```

---

### Shirt Endpoints

1. **Add or Edit Shirt**
   - **Endpoint:** POST /api/v1/shirt/addOrEditShirt
   - **Request Body Example:**
     ```json
     {
       "name": "Formal Shirt",
       "size": "L",
       "color": "White"
     }
     ```
   - **Response Example:**
     ```json
     {
       "shirtId": 1,
       "name": "Formal Shirt",
       "size": "L",
       "color": "White"
     }
     ```

2. **Get All Shirts**
   - **Endpoint:** GET /api/v1/shirt/getAllShirts
   - **Response Example:**
     ```json
     [
       {
         "shirtId": 1,
         "name": "Formal Shirt",
         "size": "L",
         "color": "White"
       }
     ]
     ```

---

### Skirt Endpoints

1. **Add New Skirt**
   - **Endpoint:** POST /api/v1/skirt/newSkirt
   - **Request Body Example:**
     ```json
     {
       "name": "Pencil Skirt",
       "size": "M",
       "color": "Black"
     }
     ```
   - **Response Example:**
     ```json
     {
       "skirtId": 1,
       "name": "Pencil Skirt",
       "size": "M",
       "color": "Black"
     }
     ```

2. **Get All Skirts**
   - **Endpoint:** GET /api/v1/skirt/getAllSkirts
   - **Response Example:**
     ```json
     [
       {
         "skirtId": 1,
         "name": "Pencil Skirt",
         "size": "M",
         "color": "Black"
       }
     ]
     ```

---

## Error Handling

**Error handling format**
```json
{
  "error": "integer",
  "message": "String"
}
```
**Common Types of errors and their meaning**

- **Unauthorized (401):** Invalid or missing token.
- **Bad Request (400):** Invalid input or missing required fields.
- **Conflict (409):** Duplicate resource or state conflict.
- **Not Found (404):** Resource not found.
- **Internal Server Error (500):** Unexpected server error.

---

## Versioning

**Strategy:** URI-based versioning (/api/v1/...)

---

## Rate Limiting

**Limit:** 100 requests per minute.

**Response When Exceeded:**
```json
{
  "error": "Too many requests",
  "message": "Rate