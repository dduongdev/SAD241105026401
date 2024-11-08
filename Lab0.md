## BIỂU ĐỒ USE CASE CHO HỆ THỐNG ATM ĐƠN GIẢN
## Mô tả Biểu Đồ:
Biểu đồ này mô tả tương tác giữa một Người dùng (User) và một Hệ thống Ngân hàng (BankSystem). Người dùng có thể thực hiện hai hành động chính: rút tiền (withdraw) và gửi tiền (deposit). Các hành động này được gửi dưới dạng yêu cầu đến Hệ thống Ngân hàng, hệ thống sẽ xử lý và cập nhật số dư tài khoản của người dùng tương ứng.

## Các thành phần chính:
Người dùng (User): Đại diện cho khách hàng của ngân hàng.
Hệ thống Ngân hàng (BankSystem): Đại diện cho hệ thống cốt lõi của ngân hàng xử lý các giao dịch.
Rút tiền (withdraw): Hành động người dùng yêu cầu rút tiền từ tài khoản của mình.
Gửi tiền (deposit): Hành động người dùng yêu cầu gửi tiền vào tài khoản của mình.
Biểu đồ này cung cấp một cái nhìn đơn giản về các tương tác cơ bản giữa người dùng và hệ thống ngân hàng. Trong thực tế, Hệ thống Ngân hàng sẽ xử lý nhiều hoạt động khác như chuyển khoản, kiểm tra số dư và tạo sao kê tài khoản.

## Biểu đồ:
![Diagram](https://www.planttext.com/api/plantuml/svg/UhzxlqDnIM9HIMbk3bTEQbg9Gac-Gb5cUaQ9GafcKMfoIMP-7XTNOd99Vf52Q75g4PJfb9YN7LnPN9AQoyK5KfMObvwJ2XPLgEPI0AjKqDMrKz0epop9I2bABDT44Kr9BSWlpYm12I9KWAMG35P0g4ENgkLoICrB0JeP0000__y30000)

## BIỂU ĐỒ LỚP CHO HỆ THỐNG QUẢN LÝ LỚP HỌC PHẦN 
## Mô tả biểu đồ:
Biểu đồ lớp này mô tả mối quan hệ giữa ba lớp: Student, Class, và Professor:
+ Student: Đại diện cho một sinh viên với các thuộc tính như ID, tên, địa chỉ và email. Sinh viên có thể đi học (goToSchool).
+ Class: Đại diện cho một lớp học với các thuộc tính như ID, tên và lịch học.
+ Professor: Đại diện cho một giáo viên với các thuộc tính như ID, tên và môn giảng dạy. Giáo viên có thể giảng dạy (teach).

## Mối quan hệ:
+ Class --o Student: Một lớp có thể có nhiều sinh viên. Mối quan hệ này là một-nhiều.
+ Class "n" -- "1" Professor: Một lớp chỉ có thể có một giáo viên hoặc một giáo viên có thể dạy nhiều lớp. 

## Biểu đồ:
![Diagram](https://www.planttext.com/api/plantuml/svg/X90z2iCm38Ltdq9uQY4PkcOAz0A5z0AkfIOkZWssF9MUh4EFr2lK-IEXIy08wyFlwSdVzwUEh0AdtWgXhOeH6av8Zk4f04g35HZ7mzMfdYg878nhXruX1efnYwXNncv0FelTuRXj31Om-1KmknGmQiT7hR_wHdVUsonwBR7EOzqB5NL7c6ncg9XMzINuUnxZmxv3kZr8yzyMJ4ftKvmfY2_BPPkPI2SXGtcIwpGXH4qEy-_-0000__y30000)

## BIỂU ĐỒ SEQUENCE MÔ TẢ QUÁ TRÌNH ĐĂNG NHẬP VÀO MỘT WEB SITE
Mô tả Sequence Diagram:
Biểu đồ này mô tả quá trình đăng nhập vào một website. Dưới đây là các bước:

1. Yêu cầu đăng nhập: Người dùng gửi yêu cầu đăng nhập đến website.
2. Kiểm tra thông tin: Website gửi yêu cầu kiểm tra thông tin đăng nhập (tên người dùng và mật khẩu) đến cơ sở dữ liệu.
3. Trả kết quả: Cơ sở dữ liệu kiểm tra thông tin và trả kết quả về website.
4. Xử lý kết quả:
    + Nếu thông tin đúng: Website gửi thông báo đăng nhập thành công đến người dùng.
    + Nếu thông tin sai: Website gửi thông báo đăng nhập thất bại đến người dùng.

## Các thành phần trong biểu đồ:
+ Participant: Đại diện cho các đối tượng tham gia vào tương tác (User, Website, Database)
+ Message: Các mũi tên biểu thị sự tương tác giữa các đối tượng
+ Activation: Hình chữ nhật biểu thị một đối tượng đang thực hiện một hoạt động
+ Alt/Else: Sử dụng để biểu diễn các nhánh điều kiện

## Biểu đồ
![Diagram](https://www.planttext.com/api/plantuml/svg/Z90n3i8m34Ltdy8Nw0Kwe4fbP492p6xgGaH8I-nmEGQEn1L8949RiP35qRUV_UtNuzc8Kj1uTJ2bQ8sTo2iUXCDAE78dLXaWPx3Q5A76FTyYYw8RJzO36RLtKlu2dvYHBIbr98bfpsmkQ0BtxDMIavahHL0-MAsdQGmU0qjq2Zt_SkGKsxapcZ44DWgOti9CtgF6NJQD4erXaI4wO9ScBd7h_sWma7NS0_j-QQcSe4bwEl0R003__mC0)