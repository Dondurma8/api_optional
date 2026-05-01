# 🔥 Java Stream API Practice Project

## 📖 Description
This project is a practical implementation of Java Stream API and Optional usage.  
It focuses on processing collections of data (users and posts) using functional programming concepts.

The project simulates a simple social media system with users and posts.

---

## 🎯 Goals

- Learn Java Stream API
- Practice functional programming in Java
- Understand Optional usage
- Work with collections (List, Set, Map)
- Apply sorting, filtering, mapping, and collecting

---

## 🧩 Project Structure
---

## 📊 Data Model

### 👤 User
- username
- city
- followers count
- verified status

### 📝 Post
- id
- author
- content
- tags
- likes
- comments
- category (TECH, NEWS, LIFESTYLE, etc.)
- publish date

---

## ⚙️ Technologies Used

- Java 8+
- Stream API
- Optional
- Collections Framework

---

## 🚀 Implemented Features

### 🔹 Stream Creation
- `Stream.of()`
- `Arrays.stream()`
- `Stream.iterate()`
- `Stream.generate()`
- `Collection.stream()`

---

### 🔹 Intermediate Operations
- `filter()` → filtering posts by category, likes
- `map()` → transforming data (e.g. extracting fields)
- `distinct()` → removing duplicates
- `sorted()` → sorting by likes, date, category
- `limit()` / `skip()` → pagination

---

### 🔹 Terminal Operations
- `count()`
- `anyMatch()`, `allMatch()`, `noneMatch()`
- `findFirst()`
- `forEach()`

---

### 🔹 Collectors
- `toList()`
- `toSet()`
- `toMap()`
- `toUnmodifiableList()`

---

### 🔹 Optional Usage
- Handling empty results safely
- `orElse()`, `isPresent()`, `ifPresent()`

---

## 📌 Example Tasks

- Find all TECH posts
- Get top 3 posts by likes
- Extract unique authors
- Check if any post contains specific tag
- Convert posts into maps (id → likes)
- Pagination using `skip()` and `limit()`

---

## ▶️ How to Run

1. Clone repository:
```bash
git clone https://github.com/your-username/stream-api-project.git
