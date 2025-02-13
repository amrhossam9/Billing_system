# SwiftPay

## Table of contents

* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Project Overview](#project-overview)

## General info
This Billing System is a software application designed to help users manage and organize their shops in an efficient and effective way.
<br><br>
	
## Technologies
Project is created with:
* Language: JAVA
* DataBase: MS SQL Server
	
## Setup
To run this project, install it locally :
````
$ git clone https://github.com/Abdu117/SwiftPay_Billing_System
````
Then put the database file 
````
Billing_system_db.bak
````
into your mangment system by recovering the database and if you got the next error:
SQL Server principal "dbo" does not exist
run following query
````
use [Billing_system] EXEC sp_changedbowner 'sa'
````


## Project Overview
"SwiftPay Billing System" boasts three main roles, each equipped to handle specific tasks efficiently:

1️⃣ Manager Role: Empowers supermarket managers with the tools they need to oversee operations and Bills, manage employees and customers, and make informed decisions.

2️⃣ Stock Manager Role: Equips stock managers with the ability to efficiently track inventory, make data-driven decisions, and optimize product availability by viewing Monthly/yearly analysis.

3️⃣ Cashier Role: Streamlines the billing process for cashiers, ensuring seamless customer transactions,bills and a pleasant shopping experience.

📈 Advanced Analysis & Insights:
Beyond its essential functionalities, "SwiftPay" offers an extra edge by providing advanced analysis tools. Stock managers can now perform monthly and yearly analysis for each product, thanks to interactive 2D graphs and data visualization. Profit calculations, sales trends, and product amounts facilitate decision-making, ensuring supermarkets are always one step ahead.

Aesthetically Pleasing Dark Theme:
User experience is paramount to us, and we took care to design a visually appealing application. With the "FlatLaf Theme Editor" integration, "SwiftPay" features a dark theme that's easy on the eyes and exudes modernity.

> The loading menu.

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/160e3f2d-63fb-48e7-915e-06972a11d9c8">

> The login page enables the user to choose different roles.

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/1159faf4-5d29-4328-84ea-237cef284fcd">

> Manager can view all the stock content without editing it. If the user login as a stock manager he can edit the stock data.

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/f6fd3294-fb34-4e8a-ad56-e901f8f224c3">

> Manager can view Bills' history.

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/b345ac20-8a17-4c6d-8d63-bff83804f73c">

> Can also view elements inside each bill.

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/6b88ef3f-9869-4f34-8c58-99626ecb1dfc">

> Manager can view and edit customer and employee info.

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/57a2979c-36cb-4cdd-89a5-c4cff6b40af8">

> Inside the cashier menu you can view your current customers or add a new one and submit an order for him.

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/9468e631-08dd-4782-929f-50a420604df7">

> An important feature that the app includes is the Analysis menu. It gives analytical info about the product counts that are sold in a specific year.
> The graph also shows sales and profit for products.

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/e5b92299-b7c1-48df-ad02-cb83059df06c">

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/d3b86010-379d-4182-9bd5-d8db215dacb8">




> ERD

<img width="800" alt="Login Interface" src="https://github.com/Abdu117/SwiftPay_Billing_System/assets/101186125/0f8e4a5d-01cb-4070-9a9e-a899af9e9652">
