
# 📄 Description

This project consists of several exercises focused on creating a class hierarchy in Java for managing different types of workers. The exercises are as follows:

- **Exercise 1:** Create a class hierarchy with three classes: `Worker`, `OnlineWorker`, and `OnsiteWorker`. The `Worker` class includes attributes such as name, surname, and hourly rate, with a method to calculate salary based on hours worked.
- **Exercise 2:** Enhance the `OnlineWorker` and `OnsiteWorker` classes to override the salary calculation method, incorporating additional factors such as internet fees for online workers and gasoline costs for onsite workers.
- **Exercise 3:** Add deprecated methods in the child classes and demonstrate the use of the `@Deprecated` annotation, suppressing warnings in an external class while invoking these methods.
- **Exercise 4:** Use the main class to showcase the functionality of the class hierarchy and verify method overriding through demonstration.

## 💻 Technologies Used

- Java JDK 22
- IntelliJ IDEA
- Maven

## 📋 Requirements

- JDK 22 or higher installed.
- IntelliJ IDEA or any other Java-compatible IDE.
- Maven dependencies configured.

## 🛠️ Installation

1. Clone the repository to your local machine using the command:
   ```bash
   git clone https://github.com/CatalinBarsan/1.7-Annotations.git
   ```
2. Navigate to the project directory:
   ```bash
   cd worker-hierarchy
   ```
3. If using Maven, run the following command to download dependencies:
   ```bash
   mvn install
   ```

## ▶️ Execution

To execute the exercises, follow these steps:

1. Open the project in your IDE.
2. Set up the necessary command-line arguments, if required.
3. Run the main class to demonstrate the functionality of the worker hierarchy.

## 🌐 Deployment

To deploy the project in a production environment, follow these steps:

1. Ensure all dependencies are correctly installed.
2. Compile the project using:
   ```bash
   mvn clean package
   ```
3. Copy the resulting JAR file to the production server and run it with:
   ```bash
   java -jar <file-name>.jar
   ```

## 🤝 Contributions

If you want to contribute to this project, follow these steps:

1. Fork the repository.
2. Create a new branch for your changes:
   ```bash
   git checkout -b my-new-feature
   ```
3. Make your changes and commit:
   ```bash
   git commit -m 'Added a new feature'
   ```
4. Push your branch to the remote repository:
   ```bash
   git push origin my-new-feature
   ```
5. Create a Pull Request to have your changes reviewed.