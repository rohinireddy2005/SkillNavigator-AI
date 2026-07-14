# SkillNavigator AI
## Student Placement Readiness & Skill Gap Analyzer Platform

### 📌 Overview
SkillNavigator AI is a cloud-native, web-based placement readiness platform that helps engineering students check their technical readiness for specific companies. It provides a unified view of skills, company-specific gap analysis, readiness scoring, and personalized learning roadmaps.

### 🚀 Key Features
- **Student Registration & Login** – Secure authentication
- **Skill Profile Management** – Add, view, and delete skills
- **Company Management** – Add target companies
- **JD Parser** – Auto-extract skills from job descriptions
- **Skill Gap Analyzer** – Readiness Score + Matched/Missing Skills
- **Personalized Learning Roadmap** – 6-week study plan
- **Resume Upload** – Store resumes in AWS S3
- **Dashboard** – Overview of all statistics
- **Profile** – User details and progress

### 🛠️ Tech Stack
- **Backend:** Java 17, Spring Boot 4.1.0, Spring Data JPA
- **Database:** MySQL 8.4.9 (AWS RDS), H2 (Development)
- **Frontend:** HTML5, CSS3, JavaScript
- **Cloud:** AWS (EC2, RDS, S3, VPC, CloudWatch, IAM)

### ☁️ AWS Services Used
Service =>Purpose 

EC2 | Hosts the Spring Boot application 
RDS | MySQL database for users, skills, companies 
S3 | Resume file storage 
VPC | Secure networking 
CloudWatch | Monitoring and custom metrics 
IAM | Secure access control 

### 🔗 Live Demo
**[http://3.110.207.54:8080](http://3.110.207.54:8080)**

### 📁 Project Structure
### 📁 Project Structure
SkillNavigator/
├── src/main/java/com/skillnavigator/
│ ├── controller/ # REST API Controllers
│ ├── service/ # Business Logic
│ ├── repository/ # JPA Repositories
│ ├── entity/ # Database Entities
│ └── dto/ # Data Transfer Objects
├── src/main/resources/
│ ├── static/ # HTML, CSS, JS files
│ └── application.properties
└── pom.xml # Maven Dependencies

text

### 👥 Team Members
- **Devarapalli Rohini Reddy** – Team Lead
- **Darsi Meghana Sri**
- **Appidi Sushmitha**
- **Singamsetti Lavanya**
- **Yekula Siva Priya**

### 📄 Documentation
[SkillNavigator-Documentation.pdf](SkillNavigator-Documentation.pdf)

### 📧 Contact
- **Email:** rohinireddy.devarapalli@gmail.com

---

**© 2026 SkillNavigator AI – All Rights Reserved**
