# 🐉 Thrones API Java Console App

Mini app to search **Game of Thrones characters by ID** using the [Thrones API](https://thronesapi.com).  
Built as a Java console application using `HttpClient` and `Gson` for practicing REST API consumption.

---

## 📸 Demo

Enter character ID (0 to 53) or type 'salir' to exit: 3 🎯 Character found: 👤 Daenerys Targaryen | 🏰 House Targaryen | 🎖️ Mother of Dragons


---

## 🚀 Features

- Connects to a public REST API (`https://thronesapi.com`)
- Fetches and displays character details based on user input
- Handles input errors (non-numeric, invalid IDs, etc.)
- Exits gracefully with the keyword `"salir"`

---

## 🔧 Built With

- **Java 17**
- **HttpClient** (built-in HTTP requests)
- **Gson** (`com.google.code.gson`) for JSON parsing
- **Maven** for dependency management

---

## ▶️ How to Run

1. Clone the repo:

```bash
git clone https://github.com/your-username/your-repo-name.git
Navigate into the project folder:
cd your-repo-name
Run with Maven:
mvn compile
mvn exec:java -Dexec.mainClass="Main"

Make sure you have Java and Maven installed.




