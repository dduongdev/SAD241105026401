# Subsystem Design: PrintService
### Distribute subsystem behavior to subsystem elements
- Analyze the function printPaycheck(paycheck: Paycheck) and distribute behavior across the following subsystem elements:
    * IPrintService: interface of this subsystem, it specifies the general contract for printing.
    * PrintServiceImpl: Implements IPrintService and provides the concrete functionality for printing paychecks.
    * PrinterManager: Manages the connection to printers and handles sending data to the printer.
    * IPrintFormatter: interface of subsystem defining a general contract for formatting objects before printing.
    * PaycheckPrintFormatter: A concrete implementation of IPrintFormatter specifically for formatting paychecks.

### Document subsystem elements
1. IPrintService
- Method:
    * void printPaycheck(Paycheck paycheck);

2. PrintServiceImpl
- Attributes:
    * PrinterManager printerManager;
    * IPrintFormatter printFormatter;
- Methods:
    * void printPaycheck(Paycheck paycheck);

3. PrintManager
- Methods:
    * void print(String document);

4. IPrintFormatter
- Methods:
    * String format(Object obj);

5. PaycheckPrintFormatter
- Methods
    * String format(Object obj);

##### Class diagram
![Diagram](https://www.planttext.com/api/plantuml/png/b5913e8m4BplAth42m_mO4mm9XoC9BvWAGjMAP2oa1ZrPHvyab-m8YgYajZBDhCpipjDBwVpj6GqNEaKW1Md90AZCbwHgPKauQLObcAcC36e0Mo7J8osuR_HzY3igNCLYUA61xYJQv9RfsWlO_60Hd04kDjsBNnTf8Csth0DcGLcc93vC75MR4iYebnMcZ9kbFqWyzneP7xAMqtSmCuot91aaOURxjXsa__r7xbTzp1vVz5ld4alwNTEBm_yMBCpyiM5AMMH_GfN0000__y30000)

### Subsystem Interaction Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/T58xRiCm3Drr2exEq0juA08qAE2XQ02VW9OPHwdrWKm7oDawv4YzGkN0XcKfcKJoYUyzKlhxlUy7Hi-ZxeLWnJt1qIl3DVchaWJrs0otWKb3PPWyIbRMm45Xvr4BuKAhaigXuVNgHw_8y0QBEIlj-Xma_uK6E_8Rg7fWdzPhv71517thbmOnfUgAJ9bsaiFRUsQX13TLZdYJPv8_XPk34fRIRkNF_AU5II4nMyBf4HRVpOKaWsqk4MCwMKileMTQsvtDinGrXwE3rifHXx7J0TOTRzE8S6RA6cD_hqiBVOh4cukmzDN4damRVk8_0000__y30000)

### Describe subsystem dependencies
![Diagram](https://www.planttext.com/api/plantuml/png/V4_B2S904Brl5KCAI0cIWnwy2QbWsBp4qSqcp8uX8bRcmP9imGH13OB7z-SzRlSY6QkTsk1CB81sAj5Aw02bDNh42j4BaWkeZQmZbMPlL8d2ctJHkPxzaHlGWGVE-pbE5tVzyEz6yLWgsMOqQEH0vJaPMjh62TViaRANSv7DyzNNoA_shyuLqvFvvHC00F__0m00)

# Subsystem Design: BankSystem
### Distribute subsystem behavior to subsystem elements
- IBankSystem: interface of this subsystem, defines the contract for the subsystem.
- BankSystem: The concrete implementation of IBankSystem. This class is responsibilities for implementing the deposit logic and dispatching with bank APIs.
- IBankAPI: Defines the interaction with bank APIs to request deposit.

### Document subsystem elements
1. IBankSystem
- Methods:
    * void deposit(payCheck: Paycheck, bankInfo: BankInformation)

2. BankSystem:
- Attributes:
    * bankAPI: BankAPI
- Methods:
    * deposit(payCheck: Paycheck, bankInfo: BankInformation)

3. IBankAPI:
- Methods:
    * processDeposit(bankInfo: BankInformation, amount: double)

##### Class Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/f9113e9034NtFKMNcg07O65GsR0ZyGGLYavWPiXCMH3rP2uyabTmG1FHn9LT_QJj-x-zNs-95tBIwGP0b3IC6pBrhlV26hSDUO-feeCZ3Q2CiAkeOCmcGoV0K2MtrYkPjTHlZrpKCURK5uEAS1-6CrFPU6GFocaIPSqSBW1Fao_WObnQvrdyz0hgJvkly07uIjuwMx3twOlyan8XQTiPYR6qtRxXaJg9lLoULzF7VFPMxpiWOLE6Xpy0003__mC0)

### Subsystem Interaction Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/Z59BRW8n3Dtd55w211V8eeB2PdP8S07FZ4iZ9awKU2fnDXOSYIiqC-KJqY9rz-BOxnFdSZelec2GtdPAYP6Eu1tvi3r68GiL2mLin3Y6jS5zGAkKJ-scCHvPODlNSMnTTOPOdkuUF4_bQgWlDvLAl2wCNMh0vWk5VX4MPvZFtp9Y3Irv5urCF1vNdzGSD6okQ0Prwglum-bnOa31uf1b-j3BJ6QvIvKzoTAwdcNozsXB_o2y1TVWWsienlNL-qkVCy1HDSLqVTrH9dv_nHkuUzOGYTjTG8u_coizbsvVkC-gvL8MII1zc6y0003__mC0)

### Describe subsystem dependencies
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XTNIMP9Jgg2Ks9UTd1bSKbgha9mQL8nXEMIMf2QbvAQbvoPMip5LP2Od9sOdggWv5fHabgKbvYZ0DNWcGVafoKcfnOhALJNmjKX6OaagXIGM5cKdvEZu5XKaWdKL0BHn8MaMa_F3gyb66enZUHo03eSw3q00000__y30000)


# Subsystem Design: ProjectManagementDatabase
### Distribute subsystem behavior to subsystem elements
- IProjectManagementDatabase: the interface of this subsystem, it defines getChargeNumbers method which get chage numbers based on a provided criteria.
- ProjectManagementDatabase: Implements the interface.
- DBUtils: Handles the connection and management of the legacy database.
- ChargeNumberDAO: Responsible for querying charge numbers from the legacy database.

### Document Subsystem Elements
1. IProjectManagementDatabase:
- Methods:
    * List<String> getChargeNumbers(criteria: String)
2. ProjectManagementDatabase:
- Methods:
    * List<String> getChargeNumbers(criteria: String)

3. DBUtils
- Attributes:
    * url: String
    * username: String
    * password: String
- Methods:
    * Connection getConnection()

4. ChargeNumberDAO:
- Methods:
    * getChargeNumbers(criteria: String)

##### Class Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/j59BJiD03Dtx55wM1Jq0Gb5Hia7Y9o4EuAHcC9fnaCSH2-Z9kkYHUWM61b2er2wGyCxMUyzltdYxtYooa_cG8e2BHyOxwv-vysjI2fnOlI6dbZ9Z7IbdR8I2KG8GTRP7wXWl3tFU04jTIVRpUpVHK65Whv_80jyCgMNBiywaA0cTuGWvWHN0kEpVX9lsmINcdSmf3XQ_CMEVsPGI_ng-5DvhRyl94B6avz9XtQiMdzBhpiLFDvkid7fhBcx__eB3eSpdxzMHtpZAhFODmhxXJynNRW0BrcMvcWy0003__mC0)

### Subsystem Interaction Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/b5F1JiCm3BttAtmSqj3kEw2XzOB406dY0zpK2a5DMXm7r6_Zm2Vn2wJRW3GZ1qwHO_kzv-Vay_rZumLPWksgIenq10_SFvEI7JhKPCb9ZO8DUe8R9yIenFGEQeEQqLRL4BkDCWCwWNre_EY5xBOpiN6MAyBEghPFo9hkWcs8w-lxMQvk7iLqleeAUePRqgZ67v3frhoYq9c8B8RBgxAMDMYIL8DVA3PnQeDhs0iRfoz-cSeZbJsCxDcC_-FC3ShY2V_aqn6tTuuE6ria8DzEdiwfQMvdtXkuMqBmn0ujBM50xzzwRXF8R1qjdP7zeJGdNQtW9H2Fe0wru8v-f6XbdjoP95LUL5AKlviDkJP-Yoy0003__mC0)

### Describe subsystem dependencies
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XTNIMP9Jgf2G55-LcfoYMzYNc9wQcvgNebBOabYKc9nge9BQa5gNafgNd9cQZ4NLq5YSZPG1HxrrRLmHKgk5IMfHNc9EGh1bSKbgRaAddb0VbfYScgn4hAwhCIoHBtYmXoG61Tka_NqxE1A2IZ3PpCNbmFGGq2_0m000F__0m00)