# EtherealApp-Ecommerce-web-Backend-Java-Spring-Boot
Ecommerce-web Backend Java Spring Boot

+ Công nghệ sử dụng: Java Spring Boot 
+ IDE: InteliJ 
+ Database: MySQL 
Hướng dẫn cấu hình DB: Tạo 1 database trong MySQL --> Vào file .\EtherealApp\src\main\resources\application.properties

![image](https://user-images.githubusercontent.com/75941386/170670940-99abe877-65c8-4ee5-a4b9-9952955bc417.png)

 - Thay đổi spring.datasource.url thành tên db vừa tạo trong MySQL.
 - Thay đổi spring.datasource.username và spring.datasource.password theo MySQL của bạn.
 
Mô tả: WebService sử dụng cấu trúc RestfulAPI cho hệ thống quản lý và mua sắm mỹ phẩm online.

Chức năng: 
 - User: Login, addUser (Signup), updateUser, getOneUserByID.
 - Product: addProduct, updateProduct, deleteProduct, getAllProduct, getProductByID.
 - Cart: addProductToCart, updateProductCart, deleteProductCart, getCart.
 - Order: addOrder,updateStatusOrder, addProductToOrder, getOrderByUserID, getAllOrder.
 - OrderInfor: addOrderInfor, updateOrderInfor, deleteOrderInfor, getOneOrderInfor.
 - Address: addAddress, updateAddress, deleteAddress, getAddress.
 - Photo: addPhoto, updatePhoto, deletePhoto, getOnePhoto, getPhotoByCategory.
 - Category: addCategory, updateCategory, deleteCategory, getAllCategory,getOneCategory.
 - Manufacturer: addManufacturer, updateManufacturer,deleteManufacturer, getAllManufacturer, getOneManufacturer.
