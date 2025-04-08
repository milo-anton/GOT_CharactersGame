# 🐉 Thrones API Java Console App

Mini app to search **Game of Thrones characters by ID** using the [Thrones API](https://thronesapi.com).  
Built as a Java console application using `HttpClient` and `Gson` for practicing REST API consumption.

---

## 📸 Demo

```bash
Enter character ID (0 to 53) or type 'salir' to exit:
3
🎯 Character found:
👤 Daenerys Targaryen | 🏰 House Targaryen | 🎖️ Mother of Dragons
🚀 Features
Connects to a public REST API (https://thronesapi.com)

Fetches and displays character details based on user input
Handles input errors (non-numeric, invalid IDs, etc.)
Exits gracefully with the keyword "salir"

🔧 Built With
Java 17
HttpClient (built-in HTTP requests)
Gson (com.google.code.gson) for JSON parsing
Maven for dependency management

🌐 API Reference
This project uses the Thrones API:
📎 https://thronesapi.com/api/v2/Characters
You can explore it using Swagger UI.

✨ Future Ideas
List all characters
Filter by family or title
Create a menu with options
GUI version using JavaFX or Swing

📄 License
This project is open source and free to use for educational purposes.
