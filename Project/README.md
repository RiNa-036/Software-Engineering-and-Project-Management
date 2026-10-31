# LifeLink — Intelligent Emergency Blood Donor Matching & Management System

**Connecting Donors. Supporting Lives.**

LifeLink is a Java-based capstone project prototype designed to support emergency blood requests and potential blood donor discovery. The system aims to make it easier to identify potential donors based on blood group and district.

## 1. Project Overview

Finding suitable blood donors during emergencies can be challenging. LifeLink proposes a centralized platform where users can search for potential donors and coordinate emergency blood requests.

The project demonstrates the basic workflow of donor discovery, donor registration interface, and emergency request handling.

## 2. Objectives

* Make potential blood donor discovery easier.
* Allow users to search donors by blood group and district.
* Provide an interface for emergency blood requests.
* Demonstrate donor registration functionality.
* Organize donor and blood request information.
* Apply Software Engineering principles through system design, UML diagrams, and prototype development.

## 3. Main Features

* **Homepage:** Provides an overview of the system.
* **Find Blood:** Searches potential donors using blood group and district.
* **Emergency Request:** Accepts and validates emergency blood request information.
* **Donor Registration:** Demonstrates the donor registration interface.
* **Responsive Interface:** Provides simple navigation and user-friendly pages.

## 4. Technologies Used

* Java
* JSP (JavaServer Pages)
* Jakarta Servlet
* HTML
* CSS
* JavaScript
* Apache Maven
* Apache Tomcat 10.1
* IntelliJ IDEA

**Database:** MySQL is planned for future development.

## 5. Project Structure

```text
Project/
│
├── README.md
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       └── webapp/
│
├── docs/
│   ├── LifeLink_Capstone_Proposal.pdf
│   ├── LifeLink_Capstone_Proposal.md
│   └── diagrams/
│       ├── 01-dfd-context.md
│       ├── 02-use-case.md
│       ├── 03-activity.md
│       ├── 04-erd.md
│       ├── 05-class.md
│       └── 06-object.md
│
└── SUBMISSION_CHECKLIST.txt
```

## 6. UML Diagrams and Documentation

The `docs` directory contains the project proposal and system design documentation.

The proposal includes:

* Problem Statement
* Project Goals and Objectives
* Project Scope
* Functional and Non-Functional Requirements
* Software Development Process Model
* Project Schedule and Milestones
* Deliverables
* Gantt Chart

The `docs/diagrams/` directory contains the six required UML and system design diagrams:

1. Data Flow Diagram (DFD)
2. Use Case Diagram
3. Activity Diagram
4. Entity Relationship Diagram (ERD)
5. Class Diagram
6. Object Diagram

The diagrams are provided in Markdown format using Mermaid syntax.

## 7. Main Classes

The project includes the following Java classes:

* `User`
* `Donor`
* `Admin`
* `BloodRequest`
* `DonorService`
* `RequestService`
* `MatchingService`
* `FindDonorServlet`
* `RequestServlet`

These classes demonstrate the project's basic object-oriented design and application workflow.

## 8. How to Run the Project

### Requirements

* JDK 17 or later
* IntelliJ IDEA
* Apache Tomcat 10.1
* Maven

### Steps

1. Clone or download this repository.
2. Open the project folder containing `pom.xml` in IntelliJ IDEA.
3. Wait for Maven dependencies to load.
4. Configure Apache Tomcat 10.1.
5. Add `LifeLink:war exploded` to the Tomcat deployment configuration.
6. Run the Tomcat server.
7. Open the following address in your browser:

`http://localhost:8080/LifeLink/`

## 9. Current Prototype Limitations

This project is an academic prototype, not a live blood donation service.

* Donor profiles use fictional sample data.
* Data is stored in memory and is lost when the server restarts.
* Donor registration is not permanently stored.
* Actual user authentication is not implemented.
* Real-time notifications are not implemented.
* MySQL database integration is planned for future development.

**Medical Disclaimer:** LifeLink only supports potential donor discovery. It does not determine medical eligibility or blood compatibility. Actual donor eligibility, blood grouping, screening, and crossmatching must be confirmed by qualified medical professionals at an authorized facility.

## 10. Future Enhancements

* MySQL database integration.
* Secure user authentication and authorization.
* Permanent donor and blood request management.
* Real-time notifications.
* Improved donor matching and filtering.
* AI-assisted features with appropriate human oversight.

## 11. Project Repository

**GitHub Project Folder:**

https://github.com/RiNa-036/Software-Engineering-and-Project-Management/tree/main/Project

---

**Project Name:** LifeLink
**Project Type:** Software Engineering Capstone Project
**Department:** ICT
**University:** Mawlana Bhashani Science and Technology University (MBSTU)

*Academic Project | Prototype with Sample Data*

Demo Screenshots:
<img width="1873" height="912" alt="Home" src="https://github.com/user-attachments/assets/2507231c-bde9-4bcd-a176-41e8211a7937" />

<img width="1898" height="905" alt="FineBlood" src="https://github.com/user-attachments/assets/add42dbd-8c0f-4686-9910-ee4a2622cc32" />

<img width="1887" height="911" alt="EmergencyRequest" src="https://github.com/user-attachments/assets/a2fbaae4-25d1-4d01-af98-950a8d04f78e" />

<img width="1880" height="942" alt="DonerRegistration" src="https://github.com/user-attachments/assets/144ef72c-1d19-4bb5-94ec-2a82fe711c63" />




