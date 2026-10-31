# LifeLink — Intelligent Emergency Blood Donor Matching & Management System

## Project overview
LifeLink is a proposed software platform intended to make searching for potential blood donors more organized. A requester can submit a blood requirement, while potential donors can register their blood group, district and availability. The system can filter possible donor records using blood group and location.

## Problem statement
During an urgent blood requirement, families may struggle to find relevant donor contacts quickly. Information can be scattered across personal networks and social media. A structured digital directory and request workflow may make the search process easier to organize.

## Objectives
- Provide a structured potential-donor registration workflow.
- Allow search by blood group and location.
- Allow a requester to submit an emergency blood request.
- Provide an admin workflow for future verification and monitoring.
- Explore AI-assisted ranking only in a later development stage.

## Main users and responsibilities
**Donor:** registers as a potential donor, updates availability, and may respond to requests.

**Patient/requester:** submits a blood requirement and searches potential donors.

**Admin:** manages accounts and requests, reviews verification status, and monitors misuse. Admin does not make medical decisions.

## Proposed workflow
Requester submits a request → system filters potential donor records by blood group and location → suitable potential contacts are displayed → donor may respond → requester coordinates with the hospital → request status can be updated.

## Prototype scope
The current prototype demonstrates the home page, donor search filters, donor registration form, and emergency request form. Search uses clearly labelled fictional sample records. Forms validate input and show a demo confirmation, but do not save or transmit data.

## Proposed technology
Java 17, JSP, HTML5, CSS3, JavaScript, Maven, Apache Tomcat 10.1, and MySQL in a later database-backed phase.

## Future development
1. MySQL schema and JDBC/DAO layer.
2. Secure login and role-based access for donor, requester and admin.
3. Persistent registration and emergency request management.
4. Admin verification and audit trail.
5. Optional AI-assisted prioritization/recommendation with transparent rules and human oversight.

## Safety, ethics and limitations
LifeLink is not a blood bank, hospital, emergency response service, or medical decision system. Search results only identify potential contacts. Medical eligibility, blood grouping, screening and crossmatching must be handled by qualified professionals at an authorized facility. Real deployment would require informed consent, privacy/security controls, verified data, and institutional/legal review.
