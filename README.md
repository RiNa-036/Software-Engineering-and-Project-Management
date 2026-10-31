# LifeLink — Capstone Project
A Java/JSP capstone prototype for potential blood donor discovery and emergency blood request coordination.

## Open and run
1. Open this folder in IntelliJ IDEA (select the folder containing `pom.xml`).
2. Wait for Maven dependency import.
3. Configure Apache Tomcat 10.1.
4. Add `LifeLink:war exploded` to Deployment.
5. Run Tomcat and open `http://localhost:8080/LifeLink/`.

## Prototype features
- Homepage and responsive navigation.
- Find Blood: Java `DonorService` filters fictional sample donors by blood group and district.
- Emergency Request: `RequestServlet` validates and accepts a demo request into in-memory service logic.
- Donor registration UI demonstration.
- Java domain/service/controller classes and capstone proposal/UML files.

## Class list
`User`, `Donor`, `Admin`, `BloodRequest`, `DonorService`, `RequestService`, `MatchingService`, `FindDonorServlet`, `RequestServlet`.

## Important limitations
This is not a live blood service. Sample donor profiles are fictional. Data is in-memory and is lost when the server restarts. Donor registration is not persisted. No notifications are sent. The system does not determine medical eligibility or compatibility. Professional screening and crossmatching must be performed by qualified staff at an authorized facility.

## Proposal and diagrams
See `docs/LifeLink_Capstone_Proposal.md` and `docs/diagrams/`. The proposal includes the process model, schedule, milestones, deliverables, Gantt chart, and all six requested diagram types. Student details have been filled in the proposal. GitHub project folder: https://github.com/RiNa-036/Software-Engineering-and-Project-Management/tree/main/Project
