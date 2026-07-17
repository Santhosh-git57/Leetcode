-- Last updated: 7/17/2026, 3:03:10 PM
# Write your MySQL query statement below
SELECT tweet_id 
FROM Tweets
WHERE LENGTH(content) > 15;