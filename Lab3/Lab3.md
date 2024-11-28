# Subsystem Context Diagram - PrintService
## Các thành phần chính
1. PayrollControl <<control>>
- Control class chịu trách nhiệm quản lý quy trình tính lương.
- Tương tác với PrintService subsystem thông qua interface IPrintService.

2. IPrintService <<interface>>
- Định nghĩa phương thức printPaycheck(paycheck: Paycheck), PayrollControl chỉ cần biết đến và sử dụng chứ không cần biết bên trong triển khai như thế nào.

3. PrintService <<subsystem proxy>>
- Triển khai của IPrintService.
- Là hệ thống con chịu trách nhiệm xử lý quy trình in thực sự.

4. IPrinter <<interface>>
- Là một subsystem, đại diện cho máy in vật lý. 
- Không cần biết người dùng sẽ sử dụng máy in hiệu gì, loại nào, chỉ cần 'plug and play'.
- PrintService sẽ tương tác với IPrinter để yêu cầu in.

5. Paycheck <<entity>>
- Chứa thông tin về paycheck của nhân viên.

## Relationships và Interactions
- PayrollControl --> IPrintService: printPaycheck
- IPrintService <|.. PrintService
- PrintService ..> IPrinter
- IPrintService --> Paycheck
- PrintService --> Paycheck

## Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/Z5BDQiCm3BxhANJC3adl8OJ2Ujcjq2Tm7MqpIsmZAwLXsvFji4VQAynfqs871ZjPID-VX7--lhT15Ciuz23EepWyEX4tO6UOj1XdGOpqX8Vn6AOWDE2Ziq9dmPrHBwm6B77Fnig1-6Gq0UXUXO1xDR7h-naSNsmQVQtQ5jy1SRD17YtwAwfuW4-0A4Byh3JXKwfumIFwkHLLzIlfjy8lHOstraLYyKxPJHFkqJsxyxGa-AVYEXHnoYuwfslSEPswB_JeJ3OUxsOu8rPNASistxNEGq6sIJdwglfOCN98LRNtd91VSVRwGpUTm9Pi5x_3Bm000F__0m00)

# Subsystem Context Diagram - Project Management Database
## Các thành phần chính
1. MaintainTimeCardControl <<control>>
- Lớp control chịu trách nhiệm quản lý timecard.
- Yêu cầu getAvailableChargeNumbers từ hệ thống con ProjectManagementDatabase.

2. CreateEmployeeReportControl <<control>>
- Lớp control chịu trách nhiệm tạo báo cáo nhân viên.
- Yêu cầu getAvailableChargeNumbers từ hệ thống con ProjectManagementDatabase.

3. IProjectManagementDatabase <<interface>>
- Giao diện của hệ thống con ProjectManagementDatabase
- Định nghĩa phương thức getAvailableChargeNumbers(): List<ChargeNumber>

4. ProjectManagementDatabase <<subsystem proxy>>
- Triển khai IProjectManagementDatabase.
- Là hệ thống con giao tiếp với cơ sở dữ liệu đã có.

5. ChargeNumber <<entity>>

## Relationships và Interactions
- MaintainTimeCardControl --> IProjectManagementDatabase: getAvailableChargeNumbers
- CreateEmployeeReportControl --> IProjectManagementDatabase: getAvailableChargeNumbers
- ProjectManagementDatabase ..|> IProjectManagementDatabase
- IProjectManagementDatabase --> ChargeNumber
- ProjectManagementDatabase --> ChargeNumber

## Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/f9B1JiCm38RlUGeVsI5xWAcgXWe7941ey09kPxfCILCvBberzcGSU2HUWLHqK26b1uWKARAT___ivEFjVHq4MJfdbH8Zbk2nAqCVX1mKlX4w25mPh1aTQ7XWlwTAu0uRhCbH4vCeM68WfIgB8SIKQIJk9-EeGDuE8kmjP5drTSfpE9x6ue89XQvTQtrFjA7MioGkg2XB_8mLmSs8yKDnXe2ZWhXgaiiND1PBIyKEkQRxpfN4uMAnWbiJ99j6StKwmwU5ionypwLbV-W7gl-PJSDHFxePwSTcKrFKEfzfVvM6KNEZ_hjgUc2wQvVBrpbTDVEEcaszau5hwZTdzxjKhQdPnc_z2G00__y30000)

# Ánh xạ các lớp phân tích đến phần tử thiết kế: Ca sử dụng Maintain Timecard
| Analysis Class            | Design Element     	 |
|---------------------------|----------------------------|
| TimecardForm              | TimecardForm       	 |
| TimecardController        | TimecardController 	 |
| Employee                  | Employee           	 |
| Timecard                  | Timecard           	 |
| ProjectManagementDatabase | IProjectManagementDatabase |

# Ánh xạ các phần tử thiết kế vào các gói: Ca sử dụng Maintain Timecard
| Design Element     	     | "Owning" package                   |
|----------------------------|------------------------------------|
| TimecardForm       	     | Middleware::Security:GUI Framework |
| TimecardController 	     | Applications::Employee Activities  |
| Employee           	     | Applications::Entities             |
| Timecard           	     | Applications::Entities             |
| IProjectManagementDatabase | Data Access             		  |

# Architecture layers diagram
![Diagram](https://www.planttext.com/api/plantuml/png/RCzD2i9038RXVKuHkkyLf2DTklC48GqrE1s7J4OGwSbSU2Ilu0y8LRf-Fnxu7hTxLvpCwnJ1rQFWZYvYCc0mFgWBUpN1NcaqcW0oyP56mIRa79N9zPGQlCAyIDjQD4afk1SxAqlv7_JaX85VvPj-kRRTh2cm9d-sIn2WapIy_pm1003__mC0)

