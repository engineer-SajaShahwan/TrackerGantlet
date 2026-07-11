# Kotlin Software Engineering Challenges - TrackerGauntlet

This repository contains the individual programming challenges implemented in **Kotlin**, focusing on core algorithm implementation, baseline syntax, data structures, and strict adherence to **Clean Code (Chapter 2) Naming Principles**.

## 🚀 Implemented Problems

### 📌 Problem 1: Priority Dispatcher
* **Description:** A loop iterating from 1 to 50 representing package indices.
* **Logic:** 
  * Prints `Express` for multiples of 3.
  * Prints `Freight` for multiples of 5.
  * Prints `PriorityExpress` for common multiples (multiples of both 3 and 5).
  * Otherwise, prints the package index itself.

### 📌 Problem 2: Waypoints Reverser
* **Description:** Inverts a flat transit route format (`HubA -> HubB -> HubC`) to a reversed order (`HubC -> HubB -> HubA`).
* **Constraint:** Solved manually via custom loops **without** relying on built-in reversal functions (`.reversed()`).

### 📌 Problem 3: Max Weight Filter *(In Progress)*
* **Description:** Scanning a decimal array of positive weights containing invalid `-1.0` tags to manually locate the maximum valid package weight without helper sorting methods.

### 📌 Problem 4: Palindrome Transit Code *(In Progress)*
* **Description:** A case-insensitive algorithmic check to verify if specific transit identifier strings are palindromes.

### 📌 Problem 5: Binary Search Lookup *(In Progress)*
* **Description:** A custom Binary Search implementation over a sorted `IntArray` to track a specified tracking ID index, showcasing step-by-step console iteration traces and a $O(\log n)$ Big O notation analysis.

---

## 🛠️ Project Structure & Architecture
The codebase strictly follows the standard Gradle and Kotlin directory structure:
* All source components and algorithmic solutions reside in the single compilable file: `src/main/kotlin/TrackerGauntlet.kt`.
* Variable and function names are clean, descriptive, and explicit (avoiding single-character variables, `temp`, or vague contexts).

## 💻 Tech Stack
* **Language:** Kotlin 
* **Build System:** Gradle
* **IDE:** IntelliJ IDEA
