use dac16;

drop table students;
drop procedure getcnt;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    marks INT
);

-- Insert some sample data
INSERT INTO students (name, marks) VALUES
('Alice', 85),
('Bob', 70),
('Charlie', 55),
('David', 90);


DELIMITER $$

CREATE PROCEDURE getcnt(IN input_val INT, OUT output_val INT)
BEGIN
    -- Example: count rows in a table called 'students' where 'marks' > input_val
    SELECT COUNT(*) INTO output_val
    FROM students
    WHERE marks > input_val;
END$$

DELIMITER ;
CALL getcnt(70, @cnt);
SELECT @cnt;



