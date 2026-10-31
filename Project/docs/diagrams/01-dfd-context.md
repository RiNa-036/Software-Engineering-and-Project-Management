```mermaid
flowchart LR
 R[Patient / Requester] -->|Request and search criteria| LL((LifeLink))
 LL -->|Potential donor results and status| R
 D[Potential Donor] -->|Profile and availability| LL
 LL -->|Request workflow| D
 A[Admin] -->|Review actions| LL
 LL -->|Reports| A
```