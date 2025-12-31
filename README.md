# 📚 Week 3 – Console-Based Library Management System (Java)

A **menu-driven, console-based Library Management System** developed using **Java**, following **Object-Oriented Programming (OOP)** principles and **file-based data storage**.  
This project runs entirely in the **terminal / command line** (no GUI, no web).

---

## 📌 Project Overview

The Library Management System allows librarians to:
- Manage books and members
- Handle borrowing and returning of books
- Track due dates and calculate fines
- Store data persistently using text files

This project is developed as part of **Week 3 Java Assignment / Mini Project**.

---

## ✅ Features

✔ Add new books  
✔ Remove books  
✔ Search books  
✔ Register library members  
✔ Manage members  
✔ Borrow books  
✔ Return books  
✔ Due date tracking  
✔ Fine calculation for late return  
✔ File-based data storage (TXT files)  
✔ Input validation (prevents crashes on wrong input)  
✔ Library statistics (total, available, borrowed books)

---

## 🛠 Technologies Used

- Java (JDK 8+ / 11 / 17)
- Object-Oriented Programming (OOP)
- File Handling (BufferedReader, FileWriter)
- Collections Framework (ArrayList)
- LocalDate API
- Command Line Interface (CLI)

---

## 📁 Project Structure

week3-library-system/
│
├── src/
│ └── main/
│ └── java/
│ └── library/
│ ├── Main.java
│ ├── Book.java
│ ├── Member.java
│ ├── Library.java
│ └── FileHandler.java
│
├── data/
│ ├── books.txt
│ └── members.txt
│
├── screenshots/
│ ├── menu.png
│ ├── add-book.png
│ ├── view-books.png
│ ├── borrow-book.png
│ └── return-book.png
│
├── README.md
└── pom.xml


---

## ⚙️ Installation & Setup

### 1️⃣ Prerequisites
Make sure you have:
- Java JDK installed  
  Check using:
  ```bash
  java -version

2️⃣Clone the Repository

git clone https://github.com/USERNAME/week3-library-system.git
cd week3-library-system

3️⃣ Open Project in IDE

Open your IDE

Choose Open Existing Project
▶️ How to Run the Project
Option 1: Using IDE

1.Navigate to:

src/main/java/library/Main.java


2.Right-click on Main.java

3.Click Run

Option 2: Using Terminal
javac src/main/java/library/*.java
java library.Main

🖥️ Sample Console Menu
===== LIBRARY MANAGEMENT SYSTEM =====
1. Add Book
2. View Books
3. Register Member
4. Borrow Book
5. Return Book
6. Exit
Enter your choice:


## 📸 Screenshots

### Main Menu
<img width="702" height="422" alt="image" src="https://github.com/user-attachments/assets/bd572662-f659-4c12-a9ce-a70fe86ec23b" />


### Add New Book
<img width="443" height="226" alt="image" src="https://github.com/user-attachments/assets/515155d9-e39e-4683-8568-592235ff25e2" />


### View Books
<img width="901" height="112" alt="image" src="https://github.com/user-attachments/assets/e7694d94-c745-43b6-b1af-c957e741b671" />


### Register Member
<img width="396" height="155" alt="image" src="https://github.com/user-attachments/assets/4d5504f4-3c43-44c0-90aa-b135e70cb0d2" />


### Borrow Book (Due Date Tracking)
<img width="391" height="97" alt="image" src="https://github.com/user-attachments/assets/3dc8a403-14bb-49d7-a1f3-25fe6c32abd1" />


### Return Book (Fine Calculation)
<img width="689" height="101" alt="image" src="https://github.com/user-attachments/assets/e628f533-87a2-4c98-815d-615508d7d4c5" />


### Library Statistics
<img width="448" height="228" alt="image" src="https://github.com/user-attachments/assets/ecbb8144-fa44-46cf-b1c0-b62f9a00061e" />

