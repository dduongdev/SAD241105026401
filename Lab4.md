# Use Case Design: Maintain Timecard
## Description of Interaction Between Design Objects
### Identifying Participating Objects
- TimecardForm: A user interface that allows employees to interact with Timecards.
- TimecardController: Coordinates and processes requests.
- Timecard: Represents a managed object within the system.
- Employee: Represents an employee managed within the system.
- ProjectManagementDatabase subsystem: An existing database containing information about projects and charge numbers.
- ProjectManagementDatabase interface: The interface of the ProjectManagementDatabase subsystem.

### Classes and their attributes and methds
##### Timecard
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XUNSqvYSR52I6PkQd9YKOf2DPU2Wgv2HdvfKN5uVb5sQWgONv1O6P1Qb0dcAIWK9vQbQcY2cUcf9J2jddbf-L3HqeAKn99Kc0HGi9QBoo4rBmLe8G000F__0m00)
##### Employee
![Diagram](https://www.planttext.com/api/plantuml/png/L90z3i8m38Ntd28Z3DoXK35q05M22xY9eH5nKYNE425Eni2Hk08b51Ksl-yz_yZF-wEA384JMI5g2p7ABGtMPqHv5LAkf0F2Kk346rra1-xIk9Cl8dfbm1vGfM0uxnDr68e1MWUCiTH3xnt-U4XWxCU1JEXuXzpxztGfJMmXQyYBPP5dv56loIV7VsXkc_5ckcmcTGfX31uDeOBmZIgmAbbWRCkUcn0LEZr-uWK00F__0m00)
##### TimecardController
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSGEESa5XShX6JcfYOd5gKuv-UL5ENdvAGMALHpAG11Ucg9SsbHKMfU2Ko9XYPS8YEnA3tLEJybjHWgM5gGabYIYgQoEB4CMQWMPAj3QbuAq0400000__y30000)
##### TimecardForm
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSNbtDEOd6nGaXcRcfoOb6AMtvHha8rbm8Gf6GM5-GaLi9aD3J1ela5gNbGPcfUIMgHHtvfKJ5GbtD6Ob5wgbzfRb9gKJ5KGMvYPbu94ACPKPnObeeaL0jq19T3QbuAq3q00000__y30000)
##### ProjectManagementDatabaseInterface
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSGPEQLf1Qb9IQdAWGKvMUb9fVu9kObfgVcfkQLk2IM92Ob5gSgL7Cf045wQebpHc9HUgfpVafgiOOcLorGkqDgNWhG9000003__mC0)

### Classes Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/X9DBJiCm48RtEOMNiCWT2W545qMHG68zZQU9gH_Hs0P5Y9Enu4XS0SU9cmHQkeZaUVdxyq_o_VcriWx8UIMph91WBRjLhJGT8dlF6CkP1eNnW6D-pMEu1RrVwvs9WJML0Fc8bIVXkWUljaYn09mJMXlFRMCqpcgeGCYX0fr2xJRe6jFVpfYm9NGSkelB6DReGdobZDTkaPh6flJrg6pA59ueD3u9XHLGQgr0Lbw2mp9oFf81gMqqe36UxBEXFV8ajaGIE0Yry8eJA8tEyBxb0J53_-4KHZioKY95uZ-A-q83L6DXEDfJW2HhmLmYxmof4SQ5RILql-PDYtey1Xb8zxq9OMh03qjC0i8QjGlFEGcPw6_QGOMi9FE2bTk0XXhx7Tw0WorOd3cmUD4mVLXBJg9kN9uVCN3Mb1y-vEo8qUVA2N5IQBQmCkVcJHzNbArGy_1x_G000F__0m00)

### Interactions Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/l5L1JiCm4Bpx5LPFSE03HKALMX0SYf3W0zja5OnYErflAkLj77WINy0XJMlIn34SE4IAPktPcV76-Np_M3a6ubgNGh3Y4kKMb67_o1UbCGFAvODX9CXOMUFaHa51e8NmW2LvgwlIDeYYyYmgKnKObelhVk-T9RsOgAsjOR9bYJIrOeZtpORuSxrpZMFKyedi6sQy1GC5QZIy0OOTEB-bqtksuDk8sWFZoOlet-JLpT3CKkf3G3rySHbm3AsB0V2JCOXWAGlaTKtaDSqmXy69KRZhSemhWViKROxpy8oI4QU7x7BbgXAQGCHaSgCD_nJgAr21QvkZ6-yNkeZ4cJ9byOP9Svgsh9LqLerrFn_y8E1eCL7tx814FofixvXxMvFpG6VXiTOxfDP4-d7NLUu5nCShyRYFbr0QwqG02Rb41ZqQcOFzZAQE93szUSRVPzTo_cDYGUbqdQ_GvFuFzmK00F__0m00)

## Simplify sequence diagram using subsystem
![Diagram](https://www.planttext.com/api/plantuml/png/l9L1ReCm44NtFeMLLRle1LAfYaHQDOjKNVG24poYhh2DnaEadAsB7gbNg14X40J6xQ8B9FHj_lnvZE7xyslZ6OXhKmh1cakKUz2MmoNVjC4SICcTPIJ8MJlhvLP3GM24288Z-MYgqfqGHHLSTAuhi2nNzzspJuxCQcOjSvR9bINIt8wntXKRwxjNSX-Oynui56ZGyXOO3k33pYQdFW9Z7rLqT_BkOPnrBSsv_qw-kHruZ3iJ8-7QST3XMXR8MKqKmYqu3xc8IRcjSg6HuDsJKxWiBoIPwFJCJcbVbN0QX9WbDrdmJr3VWGhCd48_NM_OHGHdP8ZYTMBJTzLbyiQfvD6PnUQ4FhkQV13Qe2-rEI0rKTDfrfKA0U9lBv7cvGYdkSu0IE0IcQCeCW_7XKojIJgzPSVVisiy_v7OOAd_McxGgl1_-0400F__0m00)

## Define persistence-related behavior
### Analysis class to Architectural mechanism map from use-case analysis
| Analysis Class     | Analysis Mechanism(s) |
|--------------------|-----------------------|
| Timecard           | Persistency, Security |
| Employee           | Persistency, Security |
| TimecardController | Distribution          |

## Refine the flow of events description
![Diagram](https://www.planttext.com/api/plantuml/png/l5L1JiCm4Bpx5QjSW0CVA1Agr8BeeHK7ZbosyJOOnNPaRmfv6mUUn1Tmr8OcKUe43XmYHRFsxCnuutnzVCuze-DIvqAmufnWZSfmUE19QKhHILWP9eSfAsiyB1Lc3hKG0R0ExdIHsuf85855fQf0mv3SD7llhTF9cTh26dOspycTMz77csPzVFNex2kbl4Q36Maol4J6BVgmijQfziXqaYgQDxY-xMkTWJxwR-3BgnP7tvde0Lt6biCPPCIBqhaWReIvdOimDjHosdNipo3Pq1jOGv0w2hibg1qeVZRIaZSN3FIkF4D5d8X1ueFE5k6WkfQuK_IInk51Az6eZk5BvOiSgs4DtUW76_xfL5xGPRImalnmlxQBI9gHAOptYOrln-NaXKFAeqDFzIV-O4ld0t0GkYdrbbmjTNgQPI63WFZfJKppvmwOndecW0cvHEOe6fd7_OYc0ydqzCOPVvzTpVcFYRLAf-jMY3aP6Nuntm000F__0m00)

## Unify classes and subsystems
![Diagram](https://www.planttext.com/api/plantuml/png/X9DBJiCm48RtEOMNiCWT2W545qMHG68zZQU9gH_Hs0P5Y9Enu4XS0SU9cmHQkeZaUVdxyq_o_VcriWx8UIMph91WBRjLhJGT8dlF6CkP1eNnW6D-pMEu1RrVwvs9WJML0Fc8bIVXkWUljaYn09mJMXlFRMCqpcgeGCYX0fr2xJRe6jFVpfYm9NGSkelB6DReGdobZDTkaPh6flJrg6pA59ueD3u9XHLGQgr0Lbw2mp9oFf81gMqqe36UxBEXFV8ajaGIE0Yry8eJA8tEyBxb0J53_-4KHZioKY95uZ-A-q83L6DXEDfJW2HhmLmYxmof4SQ5RILql-PDYtey1Xb8zxq9OMh03qjC0i8QjGlFEGcPw6_QGOMi9FE2bTk0XXhx7Tw0WorOd3cmUD4mVLXBJg9kN9uVCN3Mb1y-vEo8qUVA2N5IQBQmCkVcJHzNbArGy_1x_G000F__0m00)


# Use case Design: Run Payroll
## Description of Interaction Between Design Objects
### Identifying Participating Objects
- SystemClockInterface: Initiates the payroll system every Friday or on the last working day of the month.
- PayrollController: Coordinates and processes payroll operations.
- Paycheck: Represents a Paycheck object managed by the system.
- Employee: Represents an Employee object managed by the system.
- PurchaseOrder: Represents a PurchaseOrder object managed by the system.
- Timecard: Represents a Timecard object managed by the system.
- PrintService interface: The interface of the PrintService subsystem.
- PrintService subsystem: The subsystem for printing services.
- BankSystem interface: The interface of the BankSystem subsystem.
- Subsystem BankSystem: The BankSystem subsystem.

### Classes and their attributes and methds
##### SystemClockInterface:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XTNPbv9Qb5QOdAgGd1bSKbghdDEVdAs9romcai12C3ADJIvQhcuk1nIyrA0EW40003__mC0)

##### PayrollController:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSGEESa5XSh12HM5kNdv3ZdvvM0wDGYXMek1I0eAis3IcbeSjLoSJcavgK0DG80003__mC0)

##### Timecard:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSGEESa5XShX6JcfYOd5gKeL7CfAEWgPEIN5XM7vnTbfwQ0-GM9bG6fHPbWde92SM9PgeOcc9cUMWBJwfcNbWyLBIr8IIn9XKa01Mkv75BpKe0s0W000F__0m00)

##### Employee:
![Diagram](https://www.planttext.com/api/plantuml/png/L50x3i8m3DqvHKOOk4EXOkW0gWGNS1D38-AaIfmXGfoCWIDn1T9GLF3qVlx8hyUp2WoU8vb5hjf02697Wt49KTmMGgo51S82SD8RLMW7zjhOioiaEAd17556hpaT8dNeYm5AUGoXuA5t5dyy9D3cuq0YjBn7xjquNGWTMaWAqd9Lw0KvymsvQFbFcjjcUJjTDYjrz3u7JvfGWlz69HWP3J2sPSzzV465LkLll0400F__0m00)

##### HourlyEmployee:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSNbtDEOd6nWaT-QL5EfMjkGKv-PMggGZMNWeAkGWPOC2Yn91N8LL18JotnW8jeQ7BLSZcavgK0JG40003__mC0)

##### SalariedEmployee:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XUNSqvYSR52S69EOb5cQefhRa5EVcLgga8rbuA2ha9YNbvfOWvOiX8eeA2GdbhYY2IceSbLo-MGcfS2D0e0003__mC0)

##### CommissionedEmployee:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSNbtDEOd6nWdD-RcvcSN5cVbvgYcjkGKv-PMggGZMNWeAkGZ9SAYYn91KefA2GdbeIK5gKd95OdEfVb99QLAoX2HDtHb4D5A_bSaZDIm7Q1G000F__0m00)

##### Paycheck:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSNbtDEOd6nGa1YPN96QdAsGZMNWeAkGc9kVcbU2P2fe91Sb9fOaXgUMPBX21RKWCXfSjLoEQJcfG0D0G000F__0m00)

##### PurchaseOrder:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSNbtDEOd6nGa1fKN96Od6gVr5AQf52DPS24AIdbWJuU-QbvMjeSjLoEQJcfG1r00000F__0m00)

##### PrintServiceInterface:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSNLsPUIMfHMc9oga904P0Td5fKbfcSwWaNhUPI0882a9o69bSjbqDgNWfG9m000F__0m00)

##### BankSystemInterface:
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3XSGPEQLf1Qb9IQdAZWbvcK7LnQNfEPwmiMgkHI0e3WrBmKa6rAKc5USc5oIcP-daHYGM9cSaPgSRQK0O-aeb6IaWjHvvgNbQtBLSZa0zG6j0G000F__0m00)

### Classes Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/X5HBRjim4Dtp55gcG7M1BegaGe5uqKQe0sGzeIOLONwC8Hb0Q7EoBdgaNg4aHLgKB23Uc9ptXZDyZwD_V_xUMWVal9AC2UsGNe1ZSvoiGzL9mq-7I_0NQy8lqMy-i3V6EWdMDZrCPAJiZ7Rn7oaJoUiCrUn7eP033OdKDgFnP9yCdN18-pDCFP98kr0BNZ4an-LFT2Nre5zCZlhp00uBKDVvgixIJ8YvZWQ5QO4vVfZhFOC-nVFInXekG1wHUn9k-kxLCr82O1W8hPqx78t62aC5GfRU5Mht3Trevlw53GeCC2rt2FixPRnsgz2IjeI_vCwMIEU90h6wRGGuIEvbKA5FTMfR-8Zyb0M0L7NE80pq9-76tCgCLRdtmHKvRIGSK_17I2qDtLyYTU4ZI8WERj91Qn_4ZU1K3hYhOlKHdL5AM2k2qjjZ-0MgE-azyH4iFj20P2l9LkoLF7L6Vh7ne8Ui-Liz3Zs5zH7fLN3SpiCvOjk4QDuyGrVZWtg8w2E1ji1TQEq6YbUVBgvzRDo8vGcamtT7icslnuzT3sIW5HdPnjks_Vrv0Q-yMyExlYJADd6VQcA_jV1i1PMNlOuMIVRlzGwwPzm-TSSoncw3M-7J-1y00F__0m00)

### Interactions Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/f5N1Ri8m3BttAt9aqlY17YOss87311f8EuVKq8WsgT8KgT-smpvflx0qDCLfBR5ffoOlzhFpOhlVdr-Bsd9Zcx984Yjj0UozKMpBMwEBWgsL1SE5bLhLR2NvoV0oIHoW3TkrjOLoMMXnJYf78OMikB8Oz-v7BY0owCcNMjdk2oOwVIshGhSGk-nb2OARBEPfZCXv3HkJZJXS1973EA_cKFlKjaOgkmDpaIwnwrqyD28Px5-uEbylrLiZe4FaXLk8v41hDfy_aPAap0i_Uo0fRifHe2UTo9WoqwWUnRHJlIU89mpAfqpMpcB5Mymol4i6K-mUuGciCtakTQCiIHeMtY-yjlSBcxKwQkmwb0JAPy0YkgXEhhbincnnBI7A-23YlLrFy48qXJFV_a6pt-iOoja5Ck3iFwJDfreEHO-p3nX1F7sV4fHz0vlhx9yFJxPQogfkDmivuS8dMvD4kxpxRWs4M8E-Zx44KuWETr-Yhk_xmY6DYOdXkXnKrkttXglwEae72HxPeQUan41ZXi2wWECuE0PYH4H81HgbeiS5DPebs9UQN_Hvid3fkf_E3m000F__0m00)

## Simplify sequence diagram using subsystem
![Diagram](https://www.planttext.com/api/plantuml/png/f5JDJiCm3BxtAN8S4dk17j1Wux03siGcSJQfjqRafqhTINqs3ZmIhq3QjLsoH1g8KzFFzfVFTkplpwz5JM2fKJBBI914zjfejeNM6YdPMXDQu2IChjbAmD62oZ876CjsRKsebjBmZwno58AB2ZJvU1z-08w1mq2-D9gwBzh0-gmgQLeCG_P28GTRX3oDvINKkB755OUxWPTufMjhXQOTsfFWc1Rs1FhZhFvYxv8L9o0CylNER3v_IEQSixwoixianUM65DYJHdNAcMtqWFgqSK4Zf2SSIvipKJkF5RG-orJu0cFi5k4HoRayAjDeIfAEXpvkR6SVD_wizS7ueLFFFJqJ5j053-6iPNFD5ZuMZp8q1BoNz3X8taZdllr3pNvVn_6zkeiiElytGMLSo-bL--f7B44SzqUXfXUaqXJ_R7nobd9MTV1irEHBJywUdqVIuNPItSWEhKuw9qRQpINgeZFiBUZwlDqcqVViVQ3qvASMWoV-XZaUJy-ON0bfUxPmkjsY_W400F__0m00)

## Define persistence-related behavior
### Analysis class to Architectural mechanism map from use-case analysis
| Analysis Class        | Analysis Mechanism(s) |
|-----------------------|-----------------------|
| BankSystem            | Legacy Interface      |
| Employee              | Persistency, Security |
| CommissionedEmployee  | Persistency, Security |
| SalariedEmployee      | Persistency, Security |
| HourlyEmployee        | Persistency, Security |
| PayrollController     | Distribution          |
| Paycheck              | Persistency           |
| Timecard              | Persistency           |
| Purchase Order        | Persistency           |
| PrintServiceInterface | None                  |
| BankSystemInterface   | None                  |

## Refine the flow of events description
![Diagram](https://www.planttext.com/api/plantuml/png/b5LBRjmm3Dtx55ocGES2ioZI9YsGHP514w0RRrIP4miZKu941vYpTT4ZzGgL_9N6AYPPsURdaU-9el_-_dFhMJZkErrLh5WZ_EW93kBiZDRmG8nEI5Q6FDmhyU94LrN1O1mydJrZTwUDF5KsG2Yfh21ExKFwKKZC0YRmEqCSd-WoxzVEQdF6FELPTIY5QtAStibMU7nqpGL6g21RlEZhu1Jn4xfN9R7Ss1T1fx7xrH_9gbV1cF5Dtc6t-rJal8T1sPiFHOYrGiauW6vqseFhQR86M381KkEneEWU3W78k0wuHOyrXHBMGx3KX4AsWBFAIs_RKzbOXgxcyzc3yY7YNfnJXilfDRYrNGDyGGuXdplJ4nT1vvSXRvw98M_-UA2ZILENmKdwMMmPN3PDOo-FbsZvn2MGkIF3NUb9eMMlG_ZX7PgzNSTvw4CXXo7-f-9sg-LoDTBkPri1U7i-7H9_HsvDysOIoQIMBk4UleLzqWcb8JojagTTRsiIOAV6mgY1ZPdO_8zy6NT8kfdvfJ8Kbq6gIJ7Wka1nXqnZix8kB9QHSwCSIjurQ8rN72cp4-J7ZHjOrpIUPGDim2CryJxNPCTJ04NnZeiON6wjM3ZYHCVpMcgHw2FycWWaOfNsOYBL5VTsiIJEuaOi-wlRq7VuJ_q3003__mC0)

## Unify classes and subsystems
![Diagram](https://www.planttext.com/api/plantuml/png/X5HBRjim4Dtp55gcG7M1BegaGe5uqKQe0sGzeIOLONwC8Hb0Q7EoBdgaNg4aHLgKB23Uc9ptXZDyZwD_V_xUMWVal9AC2UsGNe1ZSvoiGzL9mq-7I_0NQy8lqMy-i3V6EWdMDZrCPAJiZ7Rn7oaJoUiCrUn7eP033OdKDgFnP9yCdN18-pDCFP98kr0BNZ4an-LFT2Nre5zCZlhp00uBKDVvgixIJ8YvZWQ5QO4vVfZhFOC-nVFInXekG1wHUn9k-kxLCr82O1W8hPqx78t62aC5GfRU5Mht3Trevlw53GeCC2rt2FixPRnsgz2IjeI_vCwMIEU90h6wRGGuIEvbKA5FTMfR-8Zyb0M0L7NE80pq9-76tCgCLRdtmHKvRIGSK_17I2qDtLyYTU4ZI8WERj91Qn_4ZU1K3hYhOlKHdL5AM2k2qjjZ-0MgE-azyH4iFj20P2l9LkoLF7L6Vh7ne8Ui-Liz3Zs5zH7fLN3SpiCvOjk4QDuyGrVZWtg8w2E1ji1TQEq6YbUVBgvzRDo8vGcamtT7icslnuzT3sIW5HdPnjks_Vrv0Q-yMyExlYJADd6VQcA_jV1i1PMNlOuMIVRlzGwwPzm-TSSoncw3M-7J-1y00F__0m00)

# The reason for proposing these designs is that use case design focuses on ensuring that each use case is implemented and maintains consistency from start to finish. This includes the following steps:
## Identify participating objects.
## Allocate responsibilities among objects.
## Model messages Between objects.
## Describe processing resulting from messages.
## Model associated class relationships.