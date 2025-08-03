# 💰 Console-Based Banking System Application using Java

This is a beginner-friendly Core Java project that simulates basic banking operations like deposit, withdrawal, and balance inquiry via a Command-Line Interface (CLI). The project is structured using object-oriented principles and follows a layered architecture.

## 📌 Features

- Create and manage a bank account
- Deposit and withdraw money
- View current balance
- Display account information
- CLI-based user interaction
- Input validation and exception handling

## 🛠 Tech Stack

- Core Java
- Object-Oriented Programming (OOP)
- Java I/O
- Layered Architecture (Model-Service-Util)
- Command Line Interface (CLI)

## 📁 Project Structure

```bash
├── model
│   └── BankAccount.java         # Holds bank account details and business methods
├── service
│   └── BankService.java         # Contains business logic for deposit, withdrawal, etc.
├── util
│   └── Inpututil.java      # Validates user inputs 
├── Main.java                 # Main application file to run the CLI
