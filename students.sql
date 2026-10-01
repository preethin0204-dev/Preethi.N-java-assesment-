-- Create the students table
CREATE TABLE students (
    student_id INT,
    roll_no VARCHAR(20),
    name VARCHAR(50) NOT NULL,
    age INT,
    dob DATE,
    email_id VARCHAR(100),
    phone_number VARCHAR(15) NOT NULL,
    address TEXT,
    PRIMARY KEY (student_id, name, email_id)
);

-- Insert three sample records into the table
INSERT INTO students (student_id, roll_no, name, age, dob, email_id, phone_number, address) VALUES 
(1, 'R001', 'Alice Smith', 20, '2006-05-12', 'alice@example.com', '9876543210', '123 Main Street'),
(2, 'R002', 'Bob Jones', 21, '2005-08-22', 'bob@example.com', '9123456780', '456 Oak Avenue'),
(3, 'R003', 'Charlie Brown', 19, '2007-01-15', 'charlie@example.com', '9988776655', '789 Pine Road');
