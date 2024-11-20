## Đề xuất kiến trúc cho hệ thống Payroll
- Để đáp ứng các yêu cầu của hệ thống Payroll, kiến trúc được đề xuất là 'Kiến trúc phân lớp' (Layers Architecture). Việc tổ chức dự án thành các lớp, các module đảm bảo tính hiệu quả, dễ mở rộng, bảo trì và có thể tích hợp với một cơ sở dữ liệu đã có. 

#### Lý do lựa chọn kiến trúc phân lớp
1. Tính dễ bảo trì và mở rộng: việc phân chia thành các layer giúp cô lập các thành phần. Khi cần thay đổi thì chỉ cần điều chỉnh trong layer tương ứng mà không ảnh hưởng đến toàn bộ hệ thống.
2. Tính tái sử dụng: logic nghiệp vụ được tách biệt trong Business Logic layer, có thể tái sử dụng trong các hệ thống hoặc dịch vụ khác.
3. Tích hợp dễ dàng với cơ sở dữ liệu hiện có: Data Access layer sẽ chịu trách nhiệm giao tiếp với DB2 database đã có.

#### Thành phần trong kiến trúc layers
1. Presentation Layer (UI Layer)
- Mục đích: cung cấp giao diện người dùng (Windows-based desktop).
2. Application Layer (Service Layer)
- Mục đích: đóng vai trò trung gian giữa Presentation Layer và Business Logic Layer
- Chúc năng:
    * Xử lý các yêu cầu từ UI và chuyển chúng đến Business Logic.
    * Cung cấp API cho các chức năng chính của hệ thống.
3. Business Logic Layer
- Mục đích: xử lý toàn bộ logic nghiệp vụ
4. Data Access Layer
- Mục đích: kết nối và tương tác với cơ sở dữ liệu

#### Biểu đồ package mô tả kiến trúc
![Diagram](https://www.planttext.com/api/plantuml/svg/VD0n3i8m343HtQUmkdC5r2B63bp1Sasm24cKk0D2d8o18t4521E8bDLwbh_ykDtxOfHjFddmiZUqY5dTmN3IB6mQ0q0YFf8Jx7PPYWIZEiQHpf8xl00YN3_Ga99N_cysSz4WfU0OdV8Ysv8H3inl-MsQBQjrwpoqaYfjLi12N5tuxO5UmlHwtXC00F__0m00)

## Đề xuất các cơ chế phân tích cần giải quyết trong hệ thống Payroll
1. Persistency: "The system will retain information on all employees in the company."
2. Legacy Interface: "The new system must work with the existing Project Management Database, which is a DB2 database running on an IBM mainframe."
3. Security: "For reasons of security and auditing, employees can only access and edit their own timecards and purchase orders.". Ngoài ra khi làm việc với database hiện có, Payroll System chỉ truy xuất, chứ không cập nhật dữ liệu trong database.
4. Distribution: "The system will run on individual employee desktops throughout the entire company."
5. Error Detection và Redundancy: bất kỳ một hệ thống nào cũng cần có các cơ chế này để đảm bảo tính toàn vẹn dữ liệu, độ tin cậy, và khả năng phục hồi khi đối mặt với lỗi.

## Phân tích ca sử dụng Select Payment Method
- Xác định lớp phân tích:
    * Boundary: SelectPaymentMethodView 
    * Control: SelectPaymentMethodControl
    * Entity: EmployeeCatalog

- Nhiệm vụ của các lớp phân tích:
    * SelectPaymentMethodView: là lớp giao diện người dùng, chịu trách nhiệm thu thập và hiển thị thông tin liên quan đến việc chọn phương thức thanh toán.
    * SelectPaymentMethodControl: là lớp trung gian điều phối logic giữa giao diện người dùng và các thực thể.
    * EmployeeCatalog: là lớp chịu trách nhiệm quản lý dữ liệu của các thực thể Employee trong hệ thống.

- Biểu đồ sequence:
![Digram](https://www.planttext.com/api/plantuml/svg/f5F1IWCn4BtdAyOzAUWFx44ArTuKiUXzTZEjeKac9hF8Vfi7FybVC4dB8gMjgB1aoRpCUu-NoUVxnom9HXcSLMbZF4HEf5J7WzSOHrYIfLuUS7JavOxaXVMpeJVLivV8zX0-tq8g5uoCSEk2vP5eZeAMrqeTRu6hw_tZBIoCrrDLARGoxM1HR2euvhBm7O5Qk34fM1o1WnZs2SwROFeD3A6vXCQXiUMlJSpTe2bmCj9SPAty5G_JwRolHRA9Tesrz1TFZ_GwK18eBDRuDQ3MaLAQwFVy_5keGx_nw0WmXunzd_CKy8FhA1RD6kwlyztTPWlBeND686n1S1M5L3joveU9Jyt2Kz0e1CQlE3gi73MNQI3kMKuDnJVk7-U2OkIOFQU4QsgXcJHyrbWLZRD6bOJKBA_v_Nm1003__mC0)

- Biểu đồ lớp:

![Digram](https://www.planttext.com/api/plantuml/svg/Z99DQiCm48NtFiKi7OWlO488XEuIKoXqFxO6MqG_HXgbXD2JTT4ZzGhviTNy42VUZjvxl4ypVp-_2y_eE6YLL0gzXmzILF4xxZGPNXCtLdnA-e9z0f11UpttEQoavvbd9qqzFme0V2YrlBLtYTAQT9B3rahnMeX2EFB7_2vwjAz4iobGqnImgcmmN0HTael-xsGOScaDEwjwJjAjiZkY9J8gM-VmTZiuLsdG24LzocFA0KdFDq8vbkYktna3_Z7YfgAgsrLe1JAbKNI1l4eVEeSicp_xnKU--7QotjTD5cJ4wGWF0000__y30000)

## Phân tích ca sử dụng Maintain Timecard
- Xác định lớp phân tích:
    * Boundary: TimeCardView
    * Control: TimecardControl
    * Entities: EmployeeCatalog, TimecardCatalog, ChargeNumberCatalog

- Nhiệm vụ của các lớp phân tích: 
    * TimeCardView: Lớp giao diện người dùng chịu trách nhiệm hiển thị thông tin timecard hiện tại và thu thập dữ liệu từ nhân viên, bao gồm việc nhập giờ làm việc và các dự án tương ứng.
    * TimecardControl: Lớp điều phối xử lý logic của việc quản lý timecard, bao gồm việc tạo mới, chỉnh sửa, xác nhận, và gửi timecard sau khi người dùng nhập thông tin.
    * EmployeeCatalog: Lớp chịu trách nhiệm quản lý thông tin nhân viên.
    * TimecardCatalog: Lớp quản lý dữ liệu của các timecard.
    * ChargeNumberCatalog: Lớp cung cấp và quản lý danh sách các mã số dự án (charge numbers).

- Biểu đồ sequence:

![Diagram](https://www.planttext.com/api/plantuml/svg/d5NBRjim4BphAnQv-mTyA5BO1Neeqg8ESbzHMvaejLJvSA9lww6Vr5yeALkKP2g5R1_yM98pmz7i-k_lFu_MeN6-KGKAfmryQbgbEo902rIKsdE5feDdsP10Kxr8UYs4PcUqIiNT-RSYKn0xwRg4iaE7IjT3UNT4KzEJRqeoLqi9wr8k23OVPhHR-DeIWxkKYkdQTE-ePWlVwPSdwq1uOm9HVdZS726kP6_X1PMiq17GO4jBff7MIissGEL6lwI5KznTG7Wjmr_TCSfpHjA9SdqH9C8FHu3Uf7Mshzz0y4LZDGSbPGcUT2hU2Rmp56tXOFqSdi-V_t5X8GHJ9_fLu7xP9X_sOME9GJgUK2ei5IN52tYmUJSFpXjU8dbFRnR2lRIjmcuq4BbQ0koDJh8zvy9NqHsE-XN8cD2Q3LcBTNv-Q03QmZUZcpR4I4FiKScU81mKo89KEZUBhJXgRSbEZwIDDtlIPqboFSz4ScCaxGNPkuXwpuFVN0VLqVj0waOU7dDu_fAFaOCl6tdLQxSCas2LxI7oBaKL-gBgBkkEgZiUTaJOQ5RTGkCc8jPk9Sb2ywQfTjH-4lzuay-n0fB7KNPlMkEZCSFurM6y2HU6vZmGPxPrN0ltE60O6957QV4ppzngrM7nXpGDHe5PbqqJDK_nrANrxZny529Gm9vOKlLGHDp7y1R_Wly1003__mC0)

- Biểu đồ lớp:
![Diagram](https://www.planttext.com/api/plantuml/svg/Z9HDReCm48NtdC9Bkk02g8gYe4gDL6LLTM_mY5YoSMGRKbJrP5tqIBr2WNfSuxX9MI7F6_oz-U7hutDhBDMsbo9h13M6F7C95TNiXSEPl6LaUWfYtM7fmoxG7AbkuT3B6dH9dhYnzyPgthMRHK08u-Oaw3YdDLDQVbUIGN7cegQl9RSNmVSiW9aZbUgiLcB5qwHu97rzLBqs9U6TTPSCL716BJp8ar0ZG0xkPSyMsNHhhPH093g01xgyvoh_BJcIB8ZvqOCYWVUDg1MrLAZM-qPousgDEgns2nQFTkEU9PnYs2LGnYxAyYlwknyH5nf7BhGVS67gRhpIXrKt2MaqJDKwmDbN-6RAFzld7LN10CUkmk4soUcUV8KVCFC49sJOzr2RhrVd9o4OXDKU5iKcteKiterP4yrDKXFrCAb9L2NBjj2n-J_n3G00__y30000)

## Hợp nhất kết quả phân tích
- Biểu đồ lớp hợp nhất cho 2 ca sử dụng Select Payment Method và Maintain Timecard
![Diagram](https://www.planttext.com/api/plantuml/svg/Z5L1QiCm4Bpx5Jgwq7p0b13Y5X9eGw2bFIlMueXALf3afARqPJtqIVr2RKTIBTcnuqCmsjdDpAns_Vlzir0QIrro5cKCAuMUWK6cjxZYKEWdq7j1NYcSq6U4wcU63jr8WfIMjCZR64A4gWF3bPUiufi47GKb1gFwzMFk5RFuhyXGUg4SKYnz7jeS9Yvi0jaUonms9T-1JD0ZLVhkN7VkispIiZeju5Up0haIfLHlGhu3YGdMaA3x-hV9k4Nx9fOWMkX0MBdZLFUgEXK3ngQYq58mf-di3P3jYCT7p6X3QSB1dH3C4iF7ANJVxqP3I4-Ryvxb77-id2i1pmT-OA82YC6yh8arB-3ehEl_pwZJKt3BfAKOU-rh6JZTbcgADMOYTxejSsMkayNP2vM3jaVBQaq6bDgmIS24z6pv1rtkHy3B2hUyhFmEBvkwh4Rwu7KJeKn2xTO6JixXoPGhs-SKfPqP3LLrvrSD3d2jgrkWtJ03CDltBZRsjuC_BZMzIzjlDfkF373aRQW66upGK5qxNGqyk7bHE87NOeARCeWPy3vQG46QJy0V0000__y30000)

   * Sau khi đã có biểu đồ lớp phân tích cho 2 ca sử dụng trên, tiến hành hợp nhất và loại bỏ những class trùng lặp.
