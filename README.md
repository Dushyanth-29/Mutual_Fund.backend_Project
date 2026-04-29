# 💼 Mutual Fund Backend Project

A Spring Boot-based backend application designed to help users explore, analyze, and manage mutual fund investments. This platform provides structured data, insights, and role-based functionalities for investors, admins, and financial advisors.

---

## 🚀 Features

* 📊 View and analyze mutual funds
* 🔍 Compare different funds based on performance
* 👤 User roles:

  * **Investor** – Explore and manage investments
  * **Admin** – Manage platform and data
  * **Financial Advisor** – Guide users with insights
  * **Data Analyst** – Monitor trends and generate reports
* 📈 Track investment trends and fund performance
* 🔐 Secure REST APIs

---

## 🛠️ Tech Stack

* **Backend:** Spring Boot
* **Language:** Java
* **Database:** MySQL / H2 (configurable)
* **ORM:** Spring Data JPA (Hibernate)
* **API Testing:** Postman
* **Build Tool:** Maven

---

## 📂 Project Structure

```
src/
 ├── main/
 │   ├── java/com/project/
 │   │   ├── controller/
 │   │   ├── service/
 │   │   ├── repository/
 │   │   ├── model/
 │   │   └── config/
 │   └── resources/
 │       ├── application.properties
```

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/Dushyanth-29/Mutual_Fund.backend_Project.git
cd Mutual_Fund.backend_Project
```

---

### 2. Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mutualfund
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3. Run the project

Using Maven:

```bash
mvn spring-boot:run
```

Or run main class in STS / IntelliJ.

---

## 🔗 API Endpoints (Sample)

| Method | Endpoint    | Description          |
| ------ | ----------- | -------------------- |
| GET    | /funds      | Get all mutual funds |
| POST   | /funds      | Add new fund         |
| GET    | /funds/{id} | Get fund by ID       |
| PUT    | /funds/{id} | Update fund          |
| DELETE | /funds/{id} | Delete fund          |

---

## 🧪 Testing

Use **Postman** to test APIs:

* Import endpoints
* Send GET/POST requests
* Verify JSON responses

---

## 📌 Future Enhancements

* 📱 Frontend integration (React)
* 🔔 Notifications & alerts
* 🤖 AI-based fund recommendations
* 📊 Advanced analytics dashboard

---

## 👨‍💻 Author

**Dushyanth Reddy Gadi**
Aspiring Entrepreneur | BTech CSE (Data Science)

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!

---
