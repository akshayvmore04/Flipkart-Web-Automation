📦 Flipkart Web Automation Project
🛠 Selenium WebDriver | Java | Cucumber (BDD) | Maven
📌 Project Overview

This project automates basic user scenarios on the Flipkart website using Selenium WebDriver with Java and Cucumber (BDD).
It demonstrates UI and functional validation using a readable BDD format.

🎯 Objectives

✔ Open Flipkart in a browser
✔ Validate login popup UI elements
✔ Search a product
✔ Check displayed results
✔ Validate homepage UI (logo & key elements)

🚀 Scenarios Automated
🧪 Feature File Includes:

Login UI Validation

Confirm login popup appears

Check if mobile number field is visible

Product Search

Search for a product

Validate results appear

Homepage UI Validation

Confirm Flipkart logo is visible

🧰 Tools & Technologies

Java

Selenium WebDriver

Cucumber (BDD)

JUnit / TestNG

Maven

WebDriverManager

IntelliJ IDEA / Eclipse

🏗 Project Structure
src/test/java
 ├── stepdefinitions     -> Step implementation for feature steps
 ├── runners             -> Test runner configuration
 └── utils               -> Driver setup and shared code

src/test/resources
 └── features            -> Gherkin test scenarios (.feature files)

▶️ How to Run
1️⃣ Clone the project
git clone <your-repo-link>

2️⃣ Import into IntelliJ / Eclipse

Open project as a Maven Project

3️⃣ Install dependencies

Maven auto-downloads required libraries.

4️⃣ Run tests

Option A: Run flipkart.feature

Option B: Run TestRunner.java

👉 Browser opens
👉 Scenarios execute
👉 Assertions validate expected UI behavior

📌 What This Project Demonstrates

Interacting with a live production site (Flipkart)

Identifying UI elements using:

XPath

CSS Selectors

Name Locators

Sending keys, clicking elements, reading values

Assertions for pass/fail validation

BDD test design using Given-When-Then

⭐ Future Enhancements

Add Page Object Model (POM)

Introduce TestNG reports

Parameterize data using Examples table

Add screenshots on failure

Increase test coverage (cart, filter, product page, etc.)

👨‍💻 Author

Akshay More

Java | Backend | QA & Automation

LinkedIn: add link

GitHub: add link

📄 Note

Flipkart login uses OTP verification, so this project validates UI behavior only, not end-to-end login — a real-world best practice.