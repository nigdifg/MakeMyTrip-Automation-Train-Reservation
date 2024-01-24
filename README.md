# MakeMyTrip-Automation-Train-Reservation
The MakeMyTrip Railways Automation project is designed to automate the train booking process on the MakeMyTrip website. Leveraging the Selenium framework with Java in Eclipse IDE, this script streamlines the booking procedure by systematically navigating the website, selecting travel details, and initiating a search.

This project demonstrates how to set up a Selenium automation project using Eclipse IDE with Java.

[Video Demo Link : ](https://drive.google.com/file/d/14v2wOjXtLRsSY80Z-7lq5e1vPXsMp4Xr/view?usp=sharing)

## Tools Used

- **IDE:** Eclipse
- **Automation Tool:** Selenium
- **Language:** Java

## Setup Instructions

### Step 1: Install Eclipse IDE

Download and install Eclipse IDE from the [official Eclipse website](https://www.eclipse.org/). Choose the appropriate version for your operating system.

### Step 2: Install Java Development Kit (JDK)

Download and install the Java Development Kit (JDK) from the [official Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html). Ensure that you set the JAVA_HOME environment variable.

### Step 3: Set up Eclipse

1. Open Eclipse IDE.
2. Configure Eclipse workspace if prompted.

### Step 4: Create a New Java Project

1. Click on `File -> New -> Java Project`.
2. Enter a project name (e.g., "SeleniumAutomation") and click `Finish`.

### Step 5: Add Selenium WebDriver Libraries

1. Download the Selenium WebDriver JAR files from the [official Selenium website](https://www.selenium.dev/downloads/).
2. In Eclipse, right-click on your project, choose `Build Path -> Configure Build Path`.
3. Go to the `Libraries` tab, click on `Add External JARs`, and add the Selenium WebDriver JAR files.

### Step 6: Create a New Package

1. Right-click on the `src` folder inside your project.
2. Choose `New -> Package`.
3. Enter a package name (e.g., "com.automation").

### Step 7: Create a New Class

1. Right-click on the newly created package.
2. Choose `New -> Class`.
3. Enter a class name (e.g., "TestAutomation") and check the option to include the `public static void main(String[] args)` method.
4. Click `Finish`.

### Step 8: Write Selenium Automation Code

Write your Selenium automation code inside the `main` method. See the provided example in the [TestAutomation.java](src/com/automation/TestAutomation.java) file.

### Step 9: Run the Selenium Test

1. Save your Java file (`Ctrl + S`).
2. Right-click inside the `main` method.
3. Choose `Run As -> Java Application`.

This will execute your Selenium automation script.

Make sure to replace `"path/to/chromedriver.exe"` with the actual path to your ChromeDriver executable and update the script according to your specific automation requirements.

Now you're all set to start building and running Selenium automation scripts using Eclipse IDE with Java!

