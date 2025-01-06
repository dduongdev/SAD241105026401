# **Create Initial Design Classes**

## **Mục tiêu**
Xác định danh sách các lớp cần thiết từ **Use Case** và mô tả trách nhiệm chính của chúng. Đây là bước khởi đầu quan trọng để định nghĩa cấu trúc cơ bản của hệ thống, đảm bảo các lớp được tạo ra đúng với yêu cầu của **Use Case**.

---

## **Các lớp cần thiết**

### **1. Timecard**
- **Trách nhiệm**: Quản lý thông tin về thẻ chấm công của nhân viên.
- **Vai trò**: Lưu trữ thông tin chi tiết và thực hiện các thao tác cơ bản liên quan đến timecard.

### **2. Employee**
- **Trách nhiệm**: Đại diện cho nhân viên trong hệ thống.
- **Vai trò**: Quản lý thông tin cá nhân của nhân viên và liên kết với các thẻ chấm công.

### **3. TimecardController**
- **Trách nhiệm**: Điều phối logic nghiệp vụ liên quan đến việc xử lý thẻ chấm công.
- **Vai trò**: Xử lý các yêu cầu từ giao diện người dùng hoặc các hệ thống khác và tương tác với lớp `Timecard` để thực hiện các hành động như lưu, cập nhật, hoặc truy vấn.

### **4. TimecardForm**
- **Trách nhiệm**: Giao diện giữa người dùng và hệ thống để quản lý thẻ chấm công.
- **Vai trò**: Cung cấp chức năng nhập thông tin thẻ chấm công từ người dùng.

### **5. ProjectManagementDatabase**
- **Trách nhiệm**: Tương tác với cơ sở dữ liệu quản lý dự án để lấy hoặc lưu thông tin liên quan đến mã charge (charge codes).
- **Vai trò**: Kết nối với cơ sở dữ liệu và cung cấp dữ liệu cần thiết cho các lớp khác như `TimecardController`.

---

## **Sơ đồ lớp (Class Diagram)**

![Class Diagram](https://www.planttext.com/plantuml/png/Z5FRIWD137tVhyXZ2_OFf1Is2WMLWeBFwKxOZivboMGBHVmo7_maVq5cTdPsKIg-9Jd9EISPvklZize4GPRUcagq68AQ2OLWvxHeDB2be5i7jS4GA5HL4mDuqfOQP0Ll5G20TW97ttDuzlnAAjM2i7OjT7ZU4si_5BSe56UXIIegvWauUQqWu8aMoodlEvNxezRYXyhLBubbzJuQlB6TyMUYR31tEhGqpobtxGPtTph8zIYt1ibHc6X7iFPEs1j3d0Nsx5-eaNjqs98b9riKF60WK3b8RULkBKdTCvEJijvoyl2OxArJrn6vfTeh2lFJn5ELoS8wEfuTOiHkFTliDH5er_L5EvgTioiTEeFdVmdiBsu-gDNUEMf4UvVMATcV-pxqza0S5WC03MiXrfXaYvdLQbtUkLHdBnFniNm9l-Y-3AJ3pQacXcf3JiMVymq00F__0m00)

---

# 2. Define Operations

### Mục tiêu
Xác định các hành vi (operations) mà mỗi lớp trong hệ thống Payroll cần thực hiện. Các hành vi này được xác định dựa trên các yêu cầu từ **Use Case** đã có.

### Các bước thực hiện:
1. **Đọc kỹ các Use Case** để hiểu các hành vi (operations) cần thiết cho mỗi lớp.
2. **Xác định các methods (phương thức)** mà các lớp trong hệ thống cần có để đáp ứng các hành vi được mô tả trong Use Case.
3. **Mô tả chi tiết** các hành vi của từng lớp.

### Ví dụ cho lớp `Timecard`

Lớp `Timecard` trong hệ thống Payroll có các hành vi (operations) sau:

#### **1. `save()`**
- **Mô tả**: Lưu thông tin thời gian làm việc của nhân viên vào cơ sở dữ liệu.
- **Đầu vào**: Các thông tin về thời gian làm việc của nhân viên (ví dụ: số giờ làm, số tuần).
- **Đầu ra**: Lưu trữ thành công hoặc thất bại.

#### **2. `updateTimecard()`**
- **Mô tả**: Cập nhật thời gian làm việc cho nhân viên trong trường hợp có sự thay đổi.
- **Đầu vào**: Các thay đổi về giờ làm việc (ví dụ: điều chỉnh số giờ đã làm).
- **Đầu ra**: Cập nhật thành công trong cơ sở dữ liệu.

#### **3. `getTimecardInfo()`**
- **Mô tả**: Lấy thông tin chi tiết về thời gian làm việc của nhân viên trong một kỳ trả lương.
- **Đầu vào**: Mã nhân viên và khoảng thời gian.
- **Đầu ra**: Trả về thông tin thời gian làm việc cho nhân viên trong kỳ đó.

### Ví dụ cho lớp `Employee`

Lớp `Employee` trong hệ thống Payroll có các hành vi (operations) sau:

#### **1. `getPayAmount()`**
- **Mô tả**: Tính toán số tiền phải trả cho nhân viên trong kỳ trả lương.
- **Đầu vào**: Thông tin về số giờ làm việc, mức lương của nhân viên.
- **Đầu ra**: Số tiền cần phải trả cho nhân viên.

#### **2. `isPayday()`**
- **Mô tả**: Kiểm tra xem hôm nay có phải là ngày trả lương không.
- **Đầu vào**: Ngày hiện tại.
- **Đầu ra**: Trả về true nếu hôm nay là ngày trả lương, ngược lại false.

#### **3. `getPaymentMethod()`**
- **Mô tả**: Xác định phương thức thanh toán cho nhân viên (chuyển khoản, nhận tiền mặt, nhận séc).
- **Đầu vào**: Mã nhân viên.
- **Đầu ra**: Phương thức thanh toán của nhân viên.

### Ví dụ cho lớp `BankSystem`

Lớp `BankSystem` trong hệ thống Payroll có các hành vi (operations) sau:

#### **1. `deposit(payCheck: Paycheck, bankInfo: BankInformation)`**
- **Mô tả**: Thực hiện việc chuyển tiền vào tài khoản ngân hàng của nhân viên.
- **Đầu vào**: Thông tin chi tiết về lương của nhân viên và thông tin tài khoản ngân hàng.
- **Đầu ra**: Xử lý thành công việc chuyển tiền hoặc lỗi nếu không thành công.

---

# 3. Define Methods

## Mục tiêu

Chuyển các operations đã xác định trong các lớp thành các phương thức cụ thể và chi tiết. Phương thức sẽ thực hiện các hành động cụ thể, xử lý các dữ liệu, thực thi các tính toán, và tương tác với các đối tượng khác trong hệ thống. Mỗi phương thức cần phải được thiết kế sao cho phù hợp với các yêu cầu của nghiệp vụ và dễ dàng thực hiện trong giai đoạn cài đặt sau.

---

## Các bước để xác định phương thức:

1. **Xác định các Operations từ Use Cases**: 
   Trước khi định nghĩa các phương thức, cần phải hiểu rõ các hoạt động mà hệ thống sẽ thực hiện theo các ca sử dụng (use case). Những operations này sẽ trở thành các phương thức trong các lớp.

2. **Chuyển đổi operations thành các phương thức trong lớp**: 
   Mỗi operation từ use case sẽ được chuyển thành một phương thức trong lớp phù hợp. Phương thức cần phải bao gồm tên rõ ràng, các tham số (nếu có) và giá trị trả về (nếu có).

---

## Ví dụ về việc định nghĩa phương thức:

Giả sử bạn đang thiết kế hệ thống Payroll với lớp `Employee` và operation từ use case là "calculatePay" (tính toán lương của nhân viên).

- **Operation**: `calculatePay()`
  
  **Mô tả**: Tính toán lương của nhân viên dựa trên loại nhân viên (salaried, commissioned, hourly) và các dữ liệu liên quan như số giờ làm việc, doanh thu bán hàng, v.v.

- **Phương thức trong lớp `Employee`**: 
    ```csharp
    public decimal CalculatePay()
    {
        if (this is SalariedEmployee)
        {
            return Salary;  // Trả về mức lương cố định của nhân viên.
        }
        else if (this is CommissionedEmployee)
        {
            return Salary + (Sales * CommissionRate);  // Lương cơ bản + hoa hồng từ doanh thu.
        }
        else if (this is HourlyEmployee)
        {
            return HoursWorked * HourlyRate;  // Lương theo giờ.
        }
        else
        {
            return 0m;  // Trả về 0 nếu không phải loại nhân viên hợp lệ.
        }
    }
    ```

## Các phương thức khác cần định nghĩa trong lớp `Employee`:

- **Phương thức `getCurrentTimecard()`**:
    - **Mục đích**: Trả về thời gian làm việc (timecard) hiện tại của nhân viên.
    - **Ví dụ**:
        ```csharp
        public Timecard GetCurrentTimecard()
        {
            // Trả về thời gian làm việc hiện tại từ cơ sở dữ liệu.
            return TimecardDatabase.GetLatestTimecardForEmployee(this.EmployeeId);
        }
        ```

- **Phương thức `getPaymentMethod()`**:
    - **Mục đích**: Trả về phương thức thanh toán của nhân viên (ví dụ: chuyển khoản ngân hàng, nhận tiền mặt, v.v.)
    - **Ví dụ**:
        ```csharp
        public PaymentMethod GetPaymentMethod()
        {
            return this.PaymentMethod;
        }
        ```

## Cách xác định các phương thức cho các lớp khác:

1. **Lớp `Timecard`**:
   - **Phương thức `save()`**:
     - Mục đích: Lưu thông tin thời gian làm việc của nhân viên.
     - Ví dụ:
       ```csharp
       public void Save()
       {
           TimecardDatabase.SaveTimecard(this);
       }
       ```

   - **Phương thức `updateTimecard()`**:
     - Mục đích: Cập nhật thông tin thời gian làm việc cho nhân viên.
     - Ví dụ:
       ```csharp
       public void UpdateTimecard()
       {
           TimecardDatabase.UpdateTimecard(this);
       }
       ```

2. **Lớp `BankSystem`**:
   - **Phương thức `deposit()`**:
     - Mục đích: Thực hiện giao dịch chuyển khoản tiền lương cho nhân viên.
     - Ví dụ:
       ```csharp
       public void Deposit(Paycheck paycheck, BankInformation bankInfo)
       {
           bankAPI.ProcessDeposit(bankInfo, paycheck.Amount);
       }
       ```

3. **Lớp `PrintService`**:
   - **Phương thức `printPaycheck()`**:
     - Mục đích: In phiếu lương cho nhân viên.
     - Ví dụ:
       ```csharp
       public void PrintPaycheck(Paycheck paycheck)
       {
           string formattedPaycheck = payCheckPrintFormatter.Format(paycheck);
           printerManager.Print(formattedPaycheck);
       }
       ```

---

# Define States

## Mục tiêu
Mục tiêu của việc xác định các trạng thái là mô tả các trạng thái có thể có của một đối tượng trong hệ thống và cách đối tượng thay đổi trạng thái qua các hành động. Việc này giúp dễ dàng hiểu và quản lý các quá trình của đối tượng trong hệ thống.

## Ví dụ cho lớp `Timecard`
Lớp `Timecard` có thể có các trạng thái khác nhau trong suốt vòng đời của nó, phụ thuộc vào các hành động mà người dùng hoặc hệ thống thực hiện. Dưới đây là các trạng thái quan trọng:

### 1. **Pending (Chờ duyệt)**:
   - Trạng thái mặc định của một `Timecard` mới.
   - Thời gian làm việc được ghi nhận nhưng chưa được duyệt.

### 2. **Approved (Đã duyệt)**:
   - Trạng thái sau khi một `Timecard` được duyệt bởi quản trị viên hoặc người quản lý.
   - Sau khi được duyệt, `Timecard` có thể được sử dụng để tính lương.

### 3. **Rejected (Bị từ chối)**:
   - Trạng thái này được gán cho `Timecard` khi nó bị từ chối do có lỗi trong việc nhập liệu hoặc lý do khác.
   - Thời gian làm việc sẽ không được tính cho kỳ lương hiện tại.

## Biểu đồ trạng thái (State Diagram) cho lớp `Timecard`
Biểu đồ trạng thái mô tả sự thay đổi trạng thái của một `Timecard` từ khi nó được tạo ra cho đến khi được duyệt hoặc từ chối.

![State Diagram](https://www.planttext.com/plantuml/png/UhzxlqDnIM9HIMbk3bUqLgo2hgwTGa1gNafcNZeN5vG15dGiA2ZABqjDKR1II8GmDJHH50IbPgKcbu0L586P6ffSN71T81NHMh5SS5Km0Iw7rBoKqjmS00000F__0m00)

## Giải thích biểu đồ trạng thái

1. **Trạng thái ban đầu (Pending)**: 
   - Khi một `Timecard` được tạo ra, nó ở trạng thái `Pending` (chờ duyệt). Trong trạng thái này, các thông tin về thời gian làm việc được ghi lại nhưng chưa được duyệt.

2. **Hành động `approve()`**: 
   - Khi một người quản lý hoặc người có quyền hạn duyệt `Timecard`, hành động `approve()` sẽ chuyển `Timecard` sang trạng thái `Approved` (đã duyệt).
   - Sau khi duyệt, `Timecard` có thể được sử dụng trong việc tính toán lương của nhân viên.

3. **Hành động `reject()`**:
   - Nếu `Timecard` không hợp lệ (chẳng hạn như ghi sai giờ hoặc thiếu thông tin), nó sẽ bị từ chối thông qua hành động `reject()`, và chuyển sang trạng thái `Rejected`.
   - `Timecard` trong trạng thái này sẽ không được sử dụng để tính lương và có thể yêu cầu nhân viên điều chỉnh lại.

4. **Kết thúc trạng thái**:
   - Khi `Timecard` đã được duyệt hoặc từ chối, quá trình của `Timecard` kết thúc và trạng thái chuyển về trạng thái kết thúc ([*]).

---

# Define Attributes

Mục tiêu của bước này là xác định các thuộc tính (data fields) cần thiết để biểu diễn thông tin của lớp. Thuộc tính sẽ lưu trữ dữ liệu liên quan đến đối tượng của lớp đó.

## Ví dụ cho lớp `Timecard`:

Lớp `Timecard` lưu trữ các thông tin về thời gian làm việc của nhân viên trong một kỳ thanh toán (pay period). Các thuộc tính của lớp này có thể bao gồm:

- `int hoursWorked`: Số giờ làm việc của nhân viên trong một kỳ thanh toán. Loại dữ liệu là `int` vì số giờ là một giá trị nguyên.
- `string payPeriod`: Kỳ thanh toán, có thể là một chuỗi thể hiện khoảng thời gian như "January 2025" hoặc "Week 5". Loại dữ liệu là `string`.
- `DateTime createdDate`: Ngày tạo của bản ghi thời gian (timecard), giúp theo dõi khi nào thời gian làm việc này được ghi nhận. Loại dữ liệu là `DateTime` để lưu trữ thời gian.

## Ví dụ cho lớp `Employee`:

Lớp `Employee` lưu trữ thông tin về nhân viên. Các thuộc tính có thể bao gồm:

- `string employeeId`: Mã nhận dạng duy nhất cho nhân viên. Loại dữ liệu là `string`.
- `string name`: Tên của nhân viên. Loại dữ liệu là `string`.
- `string bankInfo`: Thông tin tài khoản ngân hàng của nhân viên (để gửi lương). Loại dữ liệu là `string`.
- `string socialSecurityNumber`: Số bảo hiểm xã hội của nhân viên. Loại dữ liệu là `string`.
- `string address`: Địa chỉ của nhân viên. Loại dữ liệu là `string`.
- `string phoneNumber`: Số điện thoại của nhân viên. Loại dữ liệu là `string`.
- `string email`: Địa chỉ email của nhân viên. Loại dữ liệu là `string`.
- `string paymentMethod`: Phương thức thanh toán của nhân viên (ví dụ: trả qua ngân hàng, nhận trực tiếp, gửi qua bưu điện). Loại dữ liệu là `string`.

## Ví dụ cho lớp `Paycheck`:

Lớp `Paycheck` lưu trữ thông tin về bảng lương của nhân viên cho một kỳ thanh toán. Các thuộc tính có thể bao gồm:

- `double amount`: Số tiền phải trả cho nhân viên. Loại dữ liệu là `double` để chứa số thực có giá trị tiền tệ.
- `string paymentDate`: Ngày thanh toán. Loại dữ liệu là `string` hoặc `DateTime` tùy thuộc vào yêu cầu về định dạng.
- `string paymentMethod`: Phương thức thanh toán (như đã đề cập trong `Employee`). Loại dữ liệu là `string`.

## Cách xác định thuộc tính

Khi xác định các thuộc tính cho một lớp, bạn cần cân nhắc các yếu tố sau:

1. **Loại dữ liệu**: Xác định loại dữ liệu phù hợp cho mỗi thuộc tính (ví dụ: `string`, `int`, `double`, `DateTime`).
2. **Ý nghĩa**: Mỗi thuộc tính phải có mục đích rõ ràng và phản ánh một phần quan trọng trong đối tượng.
3. **Định dạng**: Đảm bảo rằng định dạng của dữ liệu (chẳng hạn như ngày tháng hoặc tiền tệ) là hợp lý và có thể dễ dàng thao tác trong hệ thống.

---

# 6. Define Dependencies

## Mục tiêu:
Xác định các phụ thuộc giữa các lớp trong hệ thống. Phụ thuộc ở đây có thể là mối quan hệ giữa các lớp mà một lớp cần phải sử dụng các dịch vụ hoặc đối tượng từ lớp khác để thực hiện các hành động của mình.

## Ví dụ về phụ thuộc giữa các lớp:

### Lớp TimecardController và Timecard:
- **Phụ thuộc**: TimecardController cần phụ thuộc vào lớp Timecard để xử lý các thao tác liên quan đến timecard (thẻ chấm công) của nhân viên.
- **Giải thích**: TimecardController sẽ gọi các phương thức của lớp Timecard để lấy thông tin về thời gian làm việc, cập nhật timecard, và lưu lại dữ liệu timecard.
- **Ví dụ mã**:

    ```csharp
    public class TimecardController {
        private Timecard timecard;

        public TimecardController(Timecard timecard) {
            this.timecard = timecard;
        }

        public void updateTimecard() {
            timecard.updateTimecard();
        }

        public void saveTimecard() {
            timecard.save();
        }
    }
    ```

### Lớp TimecardController và ProjectManagementDatabase:
- **Phụ thuộc**: TimecardController cần phụ thuộc vào ProjectManagementDatabase để lấy thông tin liên quan đến các mã charge (charge codes).
- **Giải thích**: Trong quá trình duy trì timecard, TimecardController cần truy xuất thông tin từ cơ sở dữ liệu về các mã charge mà nhân viên làm việc để phân loại thời gian làm việc.
- **Ví dụ mã**:

    ```csharp
    public class TimecardController {
        private ProjectManagementDatabase projectDb;

        public TimecardController(ProjectManagementDatabase projectDb) {
            this.projectDb = projectDb;
        }

        public void getChargeCodes() {
            List<String> chargeCodes = projectDb.getChargeCodes("criteria");
        }
    }
    ```

### Lớp BankSystem và IBankAPI:
- **Phụ thuộc**: BankSystem cần phải phụ thuộc vào IBankAPI để thực hiện các giao dịch thanh toán trực tiếp vào tài khoản ngân hàng của nhân viên.
- **Giải thích**: BankSystem sử dụng IBankAPI để xử lý các giao dịch ngân hàng, chẳng hạn như việc chuyển tiền thanh toán vào tài khoản của nhân viên.
- **Ví dụ mã**:

    ```csharp
    public class BankSystem {
        private IBankAPI bankAPI;

        public BankSystem(IBankAPI bankAPI) {
            this.bankAPI = bankAPI;
        }

        public void processPayment(Paycheck paycheck) {
            bankAPI.processDeposit(paycheck.getBankInfo(), paycheck.getAmount());
        }
    }
    ```

### Lớp PrintServiceImpl và IPrintFormatter:
- **Phụ thuộc**: PrintServiceImpl cần phải phụ thuộc vào IPrintFormatter để định dạng thông tin thanh toán (Paycheck) thành một tài liệu in được.
- **Giải thích**: PrintServiceImpl sẽ gọi phương thức của IPrintFormatter để chuyển đổi đối tượng Paycheck thành chuỗi văn bản có thể in được.
- **Ví dụ mã**:

    ```csharp
    public class PrintServiceImpl {
        private IPrintFormatter printFormatter;

        public PrintServiceImpl(IPrintFormatter printFormatter) {
            this.printFormatter = printFormatter;
        }

        public void printPaycheck(Paycheck paycheck) {
            String formattedPaycheck = printFormatter.format(paycheck);
            printerManager.print(formattedPaycheck);
        }
    }
    ```

## Tổng quan phụ thuộc:
- TimecardController phụ thuộc vào Timecard để thực hiện các thao tác với timecard.
- TimecardController phụ thuộc vào ProjectManagementDatabase để lấy thông tin mã charge.
- BankSystem phụ thuộc vào IBankAPI để thực hiện giao dịch với ngân hàng.
- PrintServiceImpl phụ thuộc vào IPrintFormatter để định dạng và in thông tin thanh toán.

---

# 7. Define Associations

## Mục tiêu:
Xác định các mối quan hệ giữa các lớp trong hệ thống, như quan hệ 1-1, 1-n, hoặc n-n. Những mối quan hệ này giúp mô tả cách các đối tượng trong hệ thống tương tác và phụ thuộc vào nhau.

## Các loại mối quan hệ:
- **1-1 (One-to-One)**: Mỗi đối tượng của lớp A chỉ có một đối tượng tương ứng trong lớp B, và ngược lại.
- **1-n (One-to-Many)**: Một đối tượng của lớp A có thể liên kết với nhiều đối tượng trong lớp B, nhưng mỗi đối tượng trong lớp B chỉ liên kết với một đối tượng trong lớp A.
- **n-n (Many-to-Many)**: Một đối tượng trong lớp A có thể liên kết với nhiều đối tượng trong lớp B, và một đối tượng trong lớp B có thể liên kết với nhiều đối tượng trong lớp A.

## Mối quan hệ giữa các lớp trong Payroll System:

### 1. Employee và Timecard
- **Loại mối quan hệ**: 1-n (One-to-Many).
- **Giải thích**: Mỗi Employee có thể có nhiều Timecard, nhưng mỗi Timecard chỉ thuộc về một Employee. Điều này cho thấy mỗi nhân viên có thể ghi lại nhiều ca làm việc trong các khoảng thời gian khác nhau.
- **Ví dụ**:
  - Employee có một danh sách các Timecards.
  - Timecard chỉ có một Employee.
  
    Employee "1" --> "n" Timecard

### 2. TimecardController và Timecard
- **Loại mối quan hệ**: 1-n (One-to-Many).
- **Giải thích**: TimecardController chịu trách nhiệm quản lý nhiều đối tượng Timecard. Một TimecardController có thể xử lý nhiều Timecard trong các phiên làm việc khác nhau.
- **Ví dụ**:
  - TimecardController có thể lưu trữ và quản lý nhiều Timecard.
  
    TimecardController "1" --> "n" Timecard

### 3. TimecardController và ProjectManagementDatabase
- **Loại mối quan hệ**: 1-1 (One-to-One).
- **Giải thích**: TimecardController sử dụng ProjectManagementDatabase để truy xuất thông tin về các mã dự án (charge codes). Mối quan hệ này thể hiện rằng mỗi TimecardController chỉ tương tác với một ProjectManagementDatabase.
- **Ví dụ**:
  - TimecardController truy xuất thông tin từ ProjectManagementDatabase.
  
    TimecardController "1" --> "1" ProjectManagementDatabase

### 4. Employee và BankSystem
- **Loại mối quan hệ**: 1-1 (One-to-One).
- **Giải thích**: Mỗi Employee chỉ có một phương thức thanh toán duy nhất, có thể là qua chuyển khoản ngân hàng. Mối quan hệ này thể hiện rằng mỗi nhân viên có thông tin ngân hàng của riêng mình trong hệ thống.
- **Ví dụ**:
  - Employee có một đối tượng BankSystem để xử lý thanh toán qua ngân hàng.
  
    Employee "1" --> "1" BankSystem

### 5. BankSystem và IBankAPI
- **Loại mối quan hệ**: 1-1 (One-to-One).
- **Giải thích**: BankSystem sử dụng IBankAPI để xử lý các giao dịch chuyển tiền. Mối quan hệ này cho thấy mỗi BankSystem sử dụng một giao diện IBankAPI duy nhất để thực hiện các giao dịch ngân hàng.
- **Ví dụ**:
  - BankSystem sử dụng IBankAPI để thực hiện chuyển khoản ngân hàng.
  
    BankSystem "1" --> "1" IBankAPI

## Mối quan hệ phụ thuộc khác:

- **TimecardController và Employee**: TimecardController phụ thuộc vào Employee để lấy thông tin về các nhân viên và tính toán các khoản thanh toán.
  
    TimecardController "1" --> "1" Employee

- **PrintServiceImpl và PrinterManager**: PrintServiceImpl phụ thuộc vào PrinterManager để gửi các tài liệu cần in đến máy in.
  
    PrintServiceImpl "1" --> "1" PrinterManager
---
# 9. Define Generalizations

## Mục tiêu:
Xác định các quan hệ kế thừa giữa các lớp trong hệ thống. Điều này giúp tái sử dụng mã nguồn và giảm thiểu sự trùng lặp trong việc triển khai các lớp có chức năng tương tự.

## Ví dụ:
Giả sử trong hệ thống Payroll, có các lớp `TimecardForm` và `PayrollForm`, cả hai đều có một số phương thức và thuộc tính chung, chẳng hạn như khả năng hiển thị thông tin, lưu và cập nhật dữ liệu. Những lớp này có thể kế thừa từ một lớp cha chung, chẳng hạn như `Form`.

## Quan hệ kế thừa:
### Lớp cha: Form

- **Thuộc tính:**
  - `title`: Chuỗi chứa tiêu đề của form.
  - `fields`: Danh sách các trường nhập liệu trong form.
  
- **Phương thức:**
  - `validateFields()`: Kiểm tra tính hợp lệ của các trường nhập liệu.
  - `submit()`: Gửi dữ liệu từ form đi.

### Lớp con: TimecardForm và PayrollForm

- **Thuộc tính và phương thức riêng biệt:**
  - `TimecardForm` có thể có thuộc tính như `hoursWorked` (số giờ làm việc) và phương thức như `calculateOvertime()`.
  - `PayrollForm` có thể có thuộc tính như `payAmount` (số tiền thanh toán) và phương thức như `calculateTax()`.

## Lợi ích của việc sử dụng kế thừa:
- **Tái sử dụng mã nguồn**: Các lớp con không cần phải triển khai lại những phương thức chung đã có trong lớp cha.
- **Giảm thiểu mã nguồn trùng lặp**: Các phương thức chung được định nghĩa ở lớp cha, giúp giảm bớt sự trùng lặp trong mã nguồn.

---

# 10. Resolve Use-Case Collisions

## Mục tiêu:
Giải quyết các xung đột khi các Use Case yêu cầu logic khác nhau từ cùng một lớp. Điều này đảm bảo rằng hệ thống không bị xung đột và duy trì được tính linh hoạt.

## Cách làm:

### Phân tách logic trong các lớp điều khiển (Controller):
Khi có một số use case có các yêu cầu mâu thuẫn (ví dụ, một use case yêu cầu cập nhật thông tin trong khi một use case khác yêu cầu xác nhận trước khi thay đổi), ta có thể tách logic thành các phương thức riêng biệt trong các lớp điều khiển.

Ví dụ: `TimecardController` có thể có một phương thức `approveTimecard()` để xử lý việc phê duyệt thời gian, và phương thức `updateTimecard()` để cập nhật thông tin của thời gian làm việc.

### Sử dụng giao diện (Interface) để tách các trách nhiệm:
Nếu một lớp phải xử lý nhiều loại logic khác nhau, có thể tạo các giao diện (interface) riêng biệt để tách các trách nhiệm này.

Ví dụ, giao diện `IApproval` có thể bao gồm phương thức `approve()`, trong khi giao diện `IUpdate` có thể bao gồm phương thức `update()`. Các lớp như `TimecardController` có thể triển khai các giao diện này để xử lý các tác vụ khác nhau một cách rõ ràng và có cấu trúc.

### Ví dụ:

```csharp
public interface IApproval {
    void approve(Timecard timecard);
}

public interface IUpdate {
    void update(Timecard timecard);
}

public class TimecardController : IApproval, IUpdate {
    public void approve(Timecard timecard) {
        // Logic phê duyệt thời gian
    }

    public void update(Timecard timecard) {
        // Logic cập nhật thời gian làm việc
    }
}

---

# 11. Handle Nonfunctional Requirements in General

## Mục tiêu:
Đảm bảo các yêu cầu phi chức năng, như bảo mật, hiệu năng, khả năng mở rộng, được áp dụng trong thiết kế.

## Ví dụ:

### Sử dụng Dependency Injection:
**Mục đích**: Giúp cải thiện khả năng mở rộng của hệ thống, giảm sự phụ thuộc trực tiếp giữa các lớp và tạo điều kiện cho việc thay thế các phụ thuộc dễ dàng.

Ví dụ: Trong hệ thống Payroll, thay vì trực tiếp tạo đối tượng `DatabaseConnection` trong lớp `PayrollService`, ta có thể sử dụng Dependency Injection để truyền đối tượng này vào thông qua constructor.

```csharp
public class PayrollService {
    private readonly IDatabaseConnection _databaseConnection;

    public PayrollService(IDatabaseConnection databaseConnection) {
        _databaseConnection = databaseConnection;
    }

    // Các phương thức khác...
}