set NOCOUNT ON;
Go

/* Creating Procedure for option 1. */
Create Procedure Insert_Customer
/* Inserting parameters. */
    @name varchar(20),
    @address VARCHAR(100),
    @category int

as
begin

/* Inserting the all above entered information Customer table. */
    INSERT into Customer
    (
        Customer_name,
        Address,
        category
    )
    VALUES
        (@name, @address, @category);
End

set NOCOUNT ON;
Go

/* Creating Procedure for option 2. */
Create Procedure Insert_Department
/* Inserting parameters. */
    @DNO int,
    @description varchar(200)
    
as
begin

/* Inserting the all above entered information Department table. */
    INSERT into Department
    (
        Department_No,
        Details
    )
    VALUES
        (@DNO, @description);
End

set NOCOUNT ON;
Go
/* Creating Procedure for option 3. */
Create Procedure Insert_Assembly
/* Inserting parameters. */
    @Assy_no int,
    @date date,
    @details varchar(200),
    @Customer_name VARCHAR(64)
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Assembly
    (
        Assembly_ID,
        Date,
        Details,
        Customer_name
    )
    VALUES
        (@Assy_no,@date, @details, @Customer_name);
End

set NOCOUNT ON;
GO
/* Creating Procedure for option 4. */
Create Procedure Insert_Process
/* Inserting parameters. */
    @PID int,
    @details varchar(100)
    
as
begin

/* Inserting the all above entered information Assembly table. */
   INSERT into Process
    (
        PID,
        Details
    )
    VALUES
        (@PID, @details);
End

set NOCOUNT ON;
GO
/* Creating Procedure for option 4a. */
Create Procedure Insert_Fit_Process
/* Inserting parameters. */
    @PID int,
    @Fit_type VARCHAR(65),
    @Dept_no int
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Fit_Process
    (
        PID,
        Fit_Type,
        Department_no
    )
    VALUES
        (@PID,@Fit_type, @Dept_no);
End

set NOCOUNT ON;
Go
/* Creating Procedure for option 4b. */
Create Procedure Insert_Paint_Process
/* Inserting parameters. */
    @PID int,
    @Paint_Type VARCHAR(65),
    @Painting_method VARCHAR(65),
    @Department_no int
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Paint_Process
    (
    PID,
    Paint_Type,
    Painting_method,
    Department_no 
    )
    VALUES
        (@PID,@Paint_Type, @Painting_method, @Department_no);
End

set NOCOUNT ON;
Go
/* Creating Procedure for option 4c. */
Create Procedure Insert_Cut_Process
/* Inserting parameters. */
    @PID int,
    @Cut_Type VARCHAR(65),
    @Machine_type VARCHAR(65),
    @Department_no int
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Cut_Process
    (
    PID,
    Cut_Type,
    Machine_type,
    Department_no 
    )
    VALUES
        (@PID, @Cut_Type, @Machine_type, @Department_no);
End

set NOCOUNT ON;
Go
/* Creating Procedure for inserting relation. */
Create Procedure Insert_manufactures
/* Inserting parameters. */
    @PID int,
    @Assembly_ID int,
    @Job_No int
    
as
begin

/* Creating Procedure for option 6. */
    INSERT into Manufactures
    (
    PID,
    Assembly_ID,
    Job_No
    )
    VALUES
        (@PID, @Assembly_ID, @Job_No);
End


set NOCOUNT ON;
Go
/* Creating Procedure for inserting relation. */
Create Procedure Insert_Job
/* Inserting parameters. */
    @Job_No int,
    @Start_date DATE
    
    
as
begin

/* Creating Procedure for option 6. */
    INSERT into Job
    (
    Job_No ,
    Start_date 
    )
    VALUES
        (@Job_No, @Start_date);
End


set NOCOUNT ON;
Go
/* Creating Procedure for option 7a */
Create Procedure Insert_Fit_Job
/* Inserting parameters. */
    @Job_No int,
    @End_Date DATE,
    @labor_time int
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Fit_Job
    (
    Job_No ,
    End_Date,
    labor_time 
    )
    VALUES
        (@Job_No, @End_Date, @labor_time);
End

set NOCOUNT ON;
Go
/* Creating Procedure for option 7b. */
Create Procedure Insert_Paint_Job
/* Inserting parameters. */
    @Job_No int,
    @End_Date DATE,
    @color VARCHAR(65),
    @volume FLOAT,
    @labor_time int
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Paint_Job
    (
    Job_No ,
    End_Date,
    color,
    volume,
    labor_time 
    )
    VALUES
        (@Job_No, @End_Date, @color, @volume, @labor_time);
End

set NOCOUNT ON;
Go
/* Creating Procedure for option 7c */
Create Procedure Insert_Cut_Job
/* Inserting parameters. */
    @Job_No int,
    @End_Date DATE,
    @Machine_type VARCHAR(65),
    @Machine_used_time int,
    @Material_used VARCHAR(65),
    @labor_time int
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Cut_Job
    (
    Job_No ,
    End_Date,
    Machine_type,
    Machine_used_time,
    Material_used,
    labor_time 
    )
    VALUES
        (@Job_No, @End_Date, @Machine_type, @Machine_used_time, @Material_used, @labor_time);
End



set NOCOUNT ON;
Go
/* Creating Procedure for option 5a */
Create Procedure Insert_Assembly_Account
/* Inserting parameters. */
    @Account_No varchar(15),
    @Date_Established date,
    @Assembly_ID int,
    @Details_1 decimal(19,2)
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Assembly_Account
    (
    Account_No,
    Date_Established,
    Assembly_ID,
    Details_1 
    )
    VALUES
        (@Account_No, @Date_Established, @Assembly_ID,@Details_1);
End

set NOCOUNT ON;
Go
/* Creating Procedure for option 5b */
Create Procedure Insert_Department_Account
/* Inserting parameters. */
    @Account_No varchar(15),
    @Date_Established date,
    @Department_no int,
    @Details_2 decimal(19,2)
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Department_Account
    (
    Account_No,
    Date_Established,
    Department_no,
    Details_2 
    )
    VALUES
        (@Account_No, @Date_Established, @Department_no, @Details_2);
End

set NOCOUNT ON;
Go
/* Creating Procedure for option 5c */
Create Procedure Insert_Process_Account
/* Inserting parameters. */
    @Account_No varchar(15),
    @Date_Established date,
    @PID int,
    @Details_3 decimal(19,2)
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Process_Account
    (
    Account_No,
    Date_Established,
    PID,
    Details_3 
    )
    VALUES
        (@Account_No, @Date_Established, @PID, @Details_3);
End

set NOCOUNT ON;
Go
/* Creating Procedure for option 8 */
Create Procedure Insert_Transaction
/* Inserting parameters. */
    @Transaction_ID int,
    @Sup_cost decimal(19,4),
    @Job_no int,
    @Assembly_Account_no varchar(15),
    @Department_Account_no varchar(15),
    @Process_Account_no varchar(15) 
    
as
begin

/* Inserting the all above entered information Assembly table. */
    INSERT into Transactions
    (
    Transaction_ID,
    Sup_cost,
    Job_no
    )
    VALUES
        (@Transaction_ID, @Sup_cost, @Job_no);
    
    Update Details_1
    set Details_1=Details_1+@Sup_cost
    from Assembly_Account a
    where Assembly_Account in 
    (select Account_No
    from Assembly_Account
    where Assembly_ID in 
    (
        select Assembly_ID
        from Manufactures
        where Job_No=@Job_no
    )
    )

    update Details_2
    set Details_2 = Details_2 + @Sup_cost
    where Account_No in 
    (select Account_No
    from Department_account
    where department_no in
    (select Department_no
    from Process
    where PID in 
    (
        select PID 
        from Manufactures
        where Job_No=@Job_no
    )))

    
    Update Details_3
    set Details_3=Details_3+@Sup_cost
    from Process_Account a
    where Process_Account in 
    (select Account_No
    from Process_Account
    where PID in 
    (
        select PID
        from Manufactures
        where Job_No=@Job_no
    )
    )
   

   Insert into Records
   (
       Transaction_ID,
       Job_No
   )
   VALUES
   (@Transaction_ID, @Job_No);


   Insert into Updates
   (
       Transaction_ID,
       Assembly_Account_no,
       Department_Account_no,
       Process_Account_No
   )
   VALUES
   (@Transaction_ID, @Assembly_Account_no, @Department_Account_no, @Process_Account_no);

End

 set NOCOUNT ON;
GO
/* Creating Procedure for option 9 */
Create procedure Retrieve_cost

/* Inserting parameters. */
    
    @Assembly_ID int

as
begin

select Details_1
from Assembly_Account
where Assembly_ID=@Assembly_ID

End


set NOCOUNT ON;
GO
/* Creating Procedure for option 10 */
Create Procedure Total_labor_Time
    @date Date,
    @Dno INT
AS
BEGIN

  select Total_labor_time
  from ((  select sum(labor_time) as Total_labor_time
    from Fit_job
    where Job_No in (select Job_No
    from Manufactures
    where PID in (select PID
    from Process where  Department_No=@Dno
    )) 
)union
   ( select sum(labor_time) as Total_labor_time
    from Paint_job
    where Job_No in (select Job_No
    from Manufactures
    where PID in (select PID
    from Process where  Department_No=@Dno
    )))
union
    (select sum(labor_time) as Total_labor_time
    from Cut_job
    where Job_No in (select Job_No
    from Manufactures
    where PID in (select PID
    from Process where  Department_No=@Dno
    )))) as q

END


set NOCOUNT ON;
GO
/* Creating Procedure for option 11 */
Create Procedure Processes_Per_assembly
    @Assembly_ID int

AS
BEGIN

    Select m.PID, Assembly_ID, Start_date, Department_no
    from Manufactures m
    inner join Job j
    on j.Job_No = m.Job_No
    inner join Process f
    on f.PID=m.PID
    where Assembly_ID=@Assembly_ID
    order by Start_date

End

exec Processes_Per_assembly @Assembly_ID=11310

set NOCOUNT ON;
go
/* Creating Procedure for option 12 */
Create procedure All_Job_info_Fit
/* Inserting parameters. */
    @End_Date Date,
    @Department_no int
as
begin

    select *
    from Fit_job p
    where p.End_Date= @End_Date and End_Date in
    (Select Fit_job.End_Date
    from Fit_job
    where Job_No in (select Job_No
    from Manufactures
    where PID in ((select Process.PID
    from Process
    where Process.Department_no=@Department_no))))

END


set NOCOUNT ON;
go
Create procedure All_Job_info_Paint
/* Inserting parameters. */
    @End_Date Date,
    @Department_no int
as
begin

    select *
    from Paint_job p
    where p.End_Date= @End_Date and End_Date in
    (Select Paint_job.End_Date
    from Paint_job
    where Job_No in (select Job_No
    from Manufactures
    where PID in ((select Process.PID
    from Process
    where Process.Department_no=@Department_no))))

END

set NOCOUNT ON;
go
Create procedure All_Job_info_Cut
/* Inserting parameters. */
    @End_Date Date,
    @Department_no int
as
begin
    select *
    from Cut_job p
    where p.End_Date= @End_Date and End_Date in
    (Select Cut_job.End_Date
    from Cut_job
    where Job_No in (select Job_No
    from Manufactures
    where PID in ((select Process.PID
    from Process
    where Process.Department_no=@Department_no))))

End

set NOCOUNT ON;
Go
/* Creating Procedure for option 13 */
Create procedure Categorized_customer
/* Inserting parameters. */
    @Cat1 int,
    @Cat2 int
as
begin
    select *
    from Customer
    where Category between @Cat1 and @Cat2
    order by Customer_name
end

set NOCOUNT ON;
Go
/* Creating Procedure for option 14*/
Create procedure Search_Jobs
/* Inserting parameters. */
    @Job1 int,
    @Job2 int
as
begin
    delete from Cut_job
    where Job_no between @Job1 and @Job2
end

set NOCOUNT ON;
Go
/* Creating Procedure for option 15 */
Create procedure Update_paint
/* Inserting parameters. */
    @col VARCHAR(65),
    @Job int
as
begin
    update Paint_Job
    set color=@col
    where Job_no= @Job

    select *
    from Paint_Job
    where Job_no= @Job
end

set NOCOUNT ON;
GO
Create procedure select_customer

as 
begin
    select *
    from Customer
end


