-- Last updated: 7/17/2026, 3:03:11 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
Select user_id,
    Concat(UPPER(LEFT(name, 1)), LOWER(SUBSTRING(name, 2))) as name
From Users
Order By user_id;