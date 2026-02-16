# JavaFX Registration Application

A JavaFX desktop application simulating a student registration form for Humber College.

## Overview
Implements a registration form UI with input validation, form controls, and user feedback using JavaFX components and event handling.

## Features
- Student registration form with multiple fields
- Input validation and error display
- JavaFX form controls (TextField, ComboBox, Button)
- Event-driven UI interactions

## Technologies Used
- **Language:** Java (JDK 11+)
- **UI Framework:** JavaFX
- **IDE:** Eclipse

## Project Structure
```
src/
+-- HumberRegistrationApp.java   # Main JavaFX application
```

## Usage
```bash
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls src/*.java -d out/
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls -cp out/ HumberRegistrationApp
```

## Author
Kandy Kochar
