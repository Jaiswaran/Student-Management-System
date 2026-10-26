# Student Management System

A beginner-friendly **Java console application** for managing student marks and attendance. The project uses Java collections and searching/sorting logic to perform common student-management tasks.

## Features

### Student marks
- Add a student with an ID, name, and marks.
- Display all students (sorted by student ID).
- Search for a student by ID using binary search.
- Delete a student by ID.
- Find students with the highest marks.
- Calculate the class average.
- View statistics: mean, variance, standard deviation, and pass/fail percentages.

### Attendance
- Add and display student attendance percentages.
- List students whose attendance is below 75%.
- Search attendance records by student ID.
- List students with 100% attendance.
- Update a student's attendance by ID.

The program starts with sample student and attendance records so you can try the menu options immediately.

## Tech stack

- **Language:** Java
- **Concepts:** Classes and objects, `ArrayList`, sorting with `Comparator`, binary search, loops, methods, and basic statistics
- **Interface:** Command-line menu
- **IDE configuration:** Includes a VS Code settings file

> **Java version:** The source uses `IO.println()`, which requires a recent Java version with the `java.io.IO` API. Use a JDK that supports this API (for example, JDK 25) and enable preview features if your JDK requires them.

## Project structure

```text
Student-Management-System/
├── Main.java                 # Main menu and application entry point
├── student/
│   ├── StudentDetails.java   # Student marks and class statistics
│   └── Attendance.java       # Attendance management
├── .vscode/
│   └── settings.json        # VS Code workspace settings
└── README.md
```

## Run the project

### 1. Install Java

Install a JDK version that supports `java.io.IO`. Check your installation:

```bash
java -version
javac -version
```

### 2. Clone the repository

```bash
git clone https://github.com/Jaiswaran/Student-Management-System.git
cd Student-Management-System
```

### 3. Compile the source files

For JDK 25, if preview features are required by your installation, compile with:

```bash
javac --enable-preview --release 25 Main.java student/StudentDetails.java student/Attendance.java
```

If your JDK does not require preview features for `java.io.IO`, use its corresponding compiler command instead.

### 4. Run the application

```bash
java --enable-preview Main
```

If preview features are not required by your JDK, run `java Main` instead.

You can also open the folder in Visual Studio Code and run the program with a compatible JDK.

## Using the menu

The main menu provides these options:

| Option | Action |
| --- | --- |
| 1 | Add student marks record |
| 2 | Display student records |
| 3 | Search student by ID |
| 4 | Delete student by ID |
| 5 | Find highest marks |
| 6 | Calculate class average |
| 7 | Display class statistics |
| 8 | Open the attendance submenu |
| 9 | Exit |

Inside the attendance submenu, you can add or display attendance records, list students below the 75% attendance threshold, search by ID, find students with 100% attendance, update attendance, or return/exit from the submenu.

## Notes and limitations

- Records are stored in memory using `ArrayList`. Changes are **not saved** after the application exits.
- The program loads sample records each time it starts.
- Enter a valid menu number and the expected data type when prompted.
- Attendance below 75% is included in the debar list.
- The current implementation is a learning project and can be extended with file or database storage, input validation, and a graphical interface.

## Future improvements

- Save and load student records from a file or database.
- Prevent duplicate student IDs.
- Validate marks and attendance ranges.
- Improve handling of empty student lists and invalid input.
- Add unit tests.

## License

No license is currently specified in this repository. Contact the repository owner before reusing or distributing the project.
