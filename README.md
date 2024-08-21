
<br/>
<div align="center">
<a href="https://github.com/ShaanCoding/ReadME-Generator">
<img src="https://github.com/user-attachments/assets/f226dc93-8bb4-4a31-8de4-7131dbd95990" alt="Logo" width="80" height="80">
</a>
<h3 align="center">End to End - HarryPotter</h3>
<p align="center">
Amazing Harry Potter page





</p>
</div>

## About The Project

![House](https://github.com/user-attachments/assets/8ed300be-3afb-43e6-82c8-de31f6e19e88)

![location](https://github.com/user-attachments/assets/3566ab54-6563-44c0-b223-ccd86eeb29f4)

![spell](https://github.com/user-attachments/assets/d5d119f5-1a93-4e8c-a496-03a9d921dd62)

This project, developed with Java, Spring, Hibernate, and other technologies, aims to demonstrate a complete and functional web application inspired by the Harry Potter universe. The application retrieves data from a MySQL database using Hibernate, offering an intuitive interface built with HTML, CSS, and Thymeleaf to explore characters, houses, events, locations, and books from the saga. The robust architecture, based on Spring, ensures the scalability and maintainability of the system.
### Built With

Java: Core language for backend development.

Spring: Framework for application infrastructure and management.

Hibernate: ORM tool for database interaction.

HTML: Defines the structure of web pages.

CSS: Styles and layouts web pages.

Apache Maven: Builds and manages project dependencies.

Thymeleaf: Server-side templating engine for dynamic content.

MySQL: Stores application data.

Apache Tomcat: Web server for running the application.

- [Java](https://developer.mozilla.org/en-US/docs/Glossary/Java)
- [Spring](https://spring.io/projects/spring-framework)
- [Hibernate](https://en.wikipedia.org/wiki/Hibernate_(framework))
- [HTML](https://developer.mozilla.org/pt-BR/docs/Web/HTML)
- [CSS](https://developer.mozilla.org/pt-BR/docs/Web/CSS)
- [Apache Maven](https://maven.apache.org/)
- [Thymeleaf](https://www.thymeleaf.org/index.html)
- [Mysql](https://www.mysql.com/)
- [Apache Tomcat](https://tomcat.apache.org/)
### Prerequisites

JDK 8 or higher: Check installation with:
```java -version ```  in your terminal.

Apache Maven: Verify installation with:
```mvn -version ```  also in your terminal.

MySQL: Ensure MySQL is installed and running. Check the version with:
```mysql --version``` 
Check the service status with:
```sudo systemctl status mysql```


Apache Tomcat: Ensure Tomcat is installed and configured. Open a web browser and go to http://localhost:8080. You should see the Tomcat welcome page.
### Installation

These installations are only for LINUX

To install JDK 8 or 11:
```sudo apt update

sudo apt install openjdk-8-jdk  // For OpenJDK 8

sudo apt install openjdk-11-jdk  // For OpenJDK 11 
```


To install Maven:

```
sudo apt update
sudo apt install maven
``` 

To install MySQL:
```
sudo apt update
sudo apt install mysql-server 
```


To install Tomcat: 
Go to the Tomcat download page(https://tomcat.apache.org/download-90.cgi) and download the binary distribution (usually a .tar.gz file) for Linux.
Replace 9.x.xx with the version number you downloaded.
Open Terminal and navigate to the directory where you downloaded the file. Extract it:
```tar xzf apache-tomcat-9.x.xx.tar.gz```

tar: The command to extract archive files.
-x: Option for extraction.
-v: Option for verbose output (optional).
-f: Option to specify the archive filename.

Move the extracted directory to /opt or another preferred location:
```sudo mv apache-tomcat-9.x.xx /opt/tomcat```

Navigate to the Tomcat configuration directory:
```cd ~/tomcat/conf```

Edit the tomcat-users.xml file:

Open tomcat-users.xml using a text editor (e.g., vim):
```sudo vim tomcat-users.xml```

Add the following lines at the end of the file:

```<role rolename="admin-gui"/>
    <role rolename="manager-gui"/>
    <role rolename="manager-script"/>
    <user username="tomcat" password="tomcat" roles="admin-gui,manager-gui,manager-script"/>
```

Create the settings.xml file (if it doesn't exist):
```touch ~/.m2/settings.xml```


Edit the settings.xml file:
Open settings.xml using a text editor (e.g., vim):
```vim ~/.m2/settings.xml```

Add the following content:
```<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
<servers>
<!--INSERT SERVER AUTHENTICATION INFORMATION HERE -->
<server>
<id>tomcat</id>
<username>tomcat</username>
<password>tomcat</password>
</server>
</servers>
</settings>
```

Change the Username and Password to what you want.

## Getting Started

Clone this repository
```git clone https://github.com/DanielFonsecaa/End-to-End-HarryPotter.git```


Start the MySQL service:
```sudo systemctl start mysqld```

Start Tomcat:
```sudo ./path/to/tomcat/startup.sh```
Or, if you are already in the Tomcat directory: ```sudo ./startup.sh```


In your IDE terminal, inside the project directory, use:
```mvn tomcat7:deploy``` 
to clean:  ```mvn clean```
to undeploy ```mvn tomcat7:undeploy```
to redeploy ```mvn tomcat7:redeploy```
## Roadmap

Since the backend is quite similar to another project I have, I used it as a base for this one:

- [x] `Pom .xml` 
- [x] XML Configuration
- [x] Create all the models
- [x] Create all the services
- [x] Create all the controllers
- [x] Set up the relational database
- [x] Create DAOs
- [x] Create Jpa Repositories
- [x] Create HTML
- [x] Create CSS
- [ ] Improve database information (currently too little)
- [ ] Enhance CSS across all pages
- [ ] Add responsive design features
- [ ] Introduce more complexity, such as trivia or a simple game

See the [open issues](https://github.com/DanielFonsecaa/End-to-End-HarryPotter/issues) for a full list of proposed features (and known issues).
## Contributing

I value your contributions! Help me enhance the project by forking the repo and submitting a pull request. You can also open an issue with the "enhancement" tag for suggestions.

Steps to contribute:

    Fork the Project
    Create a Branch (git checkout -b feature/YourFeature)
    Commit Changes (git commit -m 'Add YourFeature')
    Push Branch (git push origin feature/YourFeature)
    Open a Pull Request

Any contributions are greatly appreciated. Don’t forget to give the project a star! Thanks for your support!
