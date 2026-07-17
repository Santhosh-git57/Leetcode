-- Last updated: 7/17/2026, 3:03:12 PM
# Write your MySQL query statement below
/* Write your PL/SQL query statement below */
SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%'