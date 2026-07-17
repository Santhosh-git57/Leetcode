-- Last updated: 7/17/2026, 3:03:26 PM
# Write your MySQL query statement below

select distinct author_id as id from Views
where author_id = viewer_id 
order by id;