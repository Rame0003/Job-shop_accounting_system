DROP TABLE Customer; --Drop the table if it was previously created
Drop Table Assembly;
Drop Table Department;
Drop Table Process;
Drop Table Manufactures;
Drop Table Fit_Process;
Drop Table Paint_Process;
Drop Table Cut_Process;
Drop Table Job;
Drop Table Fit_job;
Drop Table Paint_job;
Drop Table Cut_job;
Drop Table Account;
Drop Table Assembly_Account;
Drop Table Department_Account;
Drop Table Process_Account;
Drop Table Updates;
Drop Table Records
Drop Table Transactions;




--Create the new table for CUSTOMER data
CREATE TABLE Customer 
(Customer_name VARCHAR(64) PRIMARY KEY, 
Address VARCHAR(100), 
Category INT);



CREATE TABLE Assembly 
(Assembly_ID int PRIMARY KEY, 
Date DATE, 
Details varchar(200),
Customer_name VARCHAR(64) FOREIGN KEY REFERENCES CUSTOMER(Customer_name));

SELECT *
FROM Records


CREATE TABLE Department 
(
  Department_No int PRIMARY KEY,
  Details varchar(200),
);


CREATE TABLE Process
(
    PID int PRIMARY KEY, 
    Details varchar(100),
    Department_no int FOREIGN KEY REFERENCES Department(Department_No)
)

CREATE TABLE Fit_Process
(
  PID int FOREIGN KEY REFERENCES Process(PID),
  Fit_Type VARCHAR(65)
  
);


CREATE TABLE Paint_Process
(
  PID int FOREIGN KEY REFERENCES Process(PID),
  Paint_Type VARCHAR(65),
  Painting_method VARCHAR(65)
);


CREATE TABLE Cut_Process
(
  PID int FOREIGN KEY REFERENCES Process(PID),
  Cut_Type VARCHAR(65),
  Machine_type VARCHAR(65)
);



CREATE TABLE Manufactures
(
  PID int FOREIGN Key REFERENCES Process(PID),
  Assembly_ID int FOREIGN Key REFERENCES Assembly(Assembly_ID),
  Job_No int FOREIGN Key REFERENCES Job(Job_No),
  primary key (PID, Assembly_ID, Job_No)
)

select *
from Manufactures


Create TABLE Job
(
  Job_No int PRIMARY KEY,
  Start_date DATE
)



CREATE TABLE Fit_job
(
  Job_No int FOREIGN KEY REFERENCES Job(Job_No),
  End_Date DATE,
  labor_time int
);



CREATE TABLE Paint_job
( 
  Job_No int FOREIGN KEY REFERENCES Job(Job_No),
  End_Date DATE,
  color VARCHAR(65),
  volume FLOAT,
  labor_time int,
  INDEX Paint_color (color)
);


CREATE TABLE Cut_job
( 
  Job_No int FOREIGN KEY REFERENCES Job(Job_No),
  End_Date DATE,
  Machine_type VARCHAR(65),
  Machine_used_time int,
  Material_used VARCHAR(65),
  labor_time int
);


Create table Account
(
    Account_No varchar(15) PRIMARY KEY,
    Created_date DATE
)

CREATE TABLE Assembly_Account
(
  Account_No varchar(15) PRIMARY KEY,
  Created_date DATE,
  Assembly_ID int FOREIGN KEY REFERENCES Assembly(Assembly_ID),
  Details_1 decimal(19,2),
  INDEX Acc_No(Account_No)
);



CREATE TABLE Department_Account
(
  Account_No varchar(15) PRIMARY KEY,
  Created_date DATE,
  Department_no int FOREIGN KEY REFERENCES Department(Department_No),
  Details_2 decimal(19,2), 
  INDEX Acc_No(Account_No)
);



CREATE TABLE Process_Account
(
  Account_No varchar(15) PRIMARY KEY,
  Created_date DATE,
  PID int FOREIGN KEY REFERENCES Process(PID),
  Details_3 decimal(19,2), 
  INDEX Acc_No(Account_No)
);


Create table Transactions
(
  Transaction_ID int Primary KEY,
  Sup_cost decimal(19,4),
  Job_no int FOREIGN KEY REFERENCES Job(Job_No)
)

create table Updates
(
    Transaction_ID int FOREIGN key REFERENCES Transactions(Transaction_ID),
    Assembly_Account_no varchar(15) FOREIGN key REFERENCES Assembly_Account(Account_No),
    Department_Account_no varchar(15)FOREIGN key REFERENCES Department_Account(Account_No),
    Process_Account_no varchar(15) FOREIGN key REFERENCES Process_Account(Account_No)
    PRIMARY Key(Transaction_ID, Assembly_Account_no, Department_Account_no, Process_Account_no)
)


Create table Records
(
    Transaction_ID int FOREIGN key REFERENCES Transactions(Transaction_ID),
    Job_No int FOREIGN Key REFERENCES Job(Job_No),
    Primary key(Transaction_ID, Job_No)
)



