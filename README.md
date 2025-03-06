# To-Do App (Java Play Framework + MySQL)

## 📌 Overview
This is a **To-Do List** web application built using the **Play Framework (Java)** and **MySQL** as the database. The app allows users to **add, edit, delete, and manage tasks** with reminders.

## 🛠️ Tech Stack
- **Backend:** Java (Play Framework)
- **Frontend:** HTML, CSS (Bootstrap), JavaScript
- **Database:** MySQL

## 🚀 Features
- ✅ Add new tasks with title, description, and reminders
- ✏️ Edit existing tasks
- ❌ Delete tasks
- 📅 Set reminders for tasks
- 🗂️ View all tasks

## 📷 Screenshots
![Landing Page Screenshot](screenshots/task list.png).
![Task List Screenshot](screenshots/task_list.png)
![Add Task Screenshot](screenshots/add_task.png)

## 🔧 Installation & Setup

### 1️⃣ Prerequisites
Ensure you have the following installed:
- Java 11+
- Play Framework
- MySQL Database
- sbt (Scala Build Tool)

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/todo2.git
cd todo2
```

### 3️⃣ Configure MySQL Database
Create a database named `todo_db` and update `conf/application.conf`:
```properties
db.default.driver=com.mysql.cj.jdbc.Driver
db.default.url="jdbc:mysql://localhost:3306/todo_db"
db.default.username="your_mysql_user"
db.default.password="your_mysql_password"
```

### 5️⃣ Run the Application
Start the Play Framework server:
```bash
sbt run
```

### 6️⃣ Access the App
Open your browser and visit:
```
http://localhost:9000/
```

## 📌 API Endpoints

| Method | Endpoint | Description |
| GET | `/tasks` | Get all tasks |
| POST | `/task/save` | Add a new task |
| GET | `/task/delete/:id` | Delete a task |
| GET | `/task/edit/:id` | Edit a task |

## 📜 Folder Structure
```
📂 app
 ┣ 📂 controllers  # Contains Java controllers
 ┣ 📂 models       # Contains data models
 ┣ 📂 views        # Contains HTML templates
📂 conf
 ┣ 📄 application.conf  # Configuration file
📂 public
 ┣ 📂 stylesheets  # CSS files
 ┣ 📂 javascript   # JavaScript files
📂 migrations      # Database migration files
```

## 🛠️ Contributing
Feel free to contribute by **forking** the repository and creating a **pull request**.

## 📄 License
This project is licensed under the MIT License.



