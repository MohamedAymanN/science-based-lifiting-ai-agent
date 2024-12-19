# 🏋️‍♂️ Science-Based Lifting Agent 🏋

An AI agent for science-based lifting, built with Java, Spring Boot and Spring AI

## 📚 Table of Contents

- [📖 Introduction](#introduction)
- [✨ Features](#features)
- [⚙️ Installation](#installation)
- [🚀 Usage](#usage)
- [🤝 Contributing](#contributing)

## 📖 Introduction

This project is an AI agent designed to provide science-based lifting advice. It leverages Spring Boot for the backend and integrates with various AI services.

## ✨ Features

- 💬 Chat with different coaches for lifting advice
- 🤖 Integration with Spring AI services
- 🌐 RESTful API endpoints
- 🧠 Chat memory for maintaining conversation context
- 🦙 Integration with [Ollama](https://ollama.com), especially with Llama 3.2 model

## ⚙️ Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/mo-nagib/science-based-lifting-agent.git
    cd science-based-lifting-agent
    ```

2. Build the project using Maven:
    ```sh
    ./mvnw clean install
    ```

3. Run the application:
    ```sh
    ./mvnw spring-boot:run
    ```

## 🚀 Usage

### API Endpoints

Check [`chat-with-coaches.http`](http-clients/chat-with-coaches.http) for examples of API requests with intellij.


- **Chat with Jeff Nippard:**
    ```http
    POST http://localhost:8080/chat/jeff-nippard/{chatId}
    ```

- **Chat with Generic Coach:**
    ```http
    POST http://localhost:8080/chat/{chatId}
    ```

### Example Request

```http
POST http://localhost:8080/chat/jeff-nippard/12345
Content-Type: application/json

{
    "message": "What is the best exercise for chest?"
}
```


## 🤝 Contributing
Feel free to contribute to this project 
