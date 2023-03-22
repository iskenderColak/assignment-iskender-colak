-- Queries are for MySQL

-- ** First SQL Problem **
-- As first step, we apply the where part to get the last 30 days records.
-- Then we apply group by over country since our focus is getting the numbers of member based on their country
-- Then we get the count of members by count() method
-- As a result, this query will return two rows =>
-- Country (represents each country in the table as unique),
-- * count(represents the count of member of the grouped country);
SELECT country, count() AS COUNT FROM member WHERE registration_time >= DATE_SUB(CURRENT_DATE, INTERVAL 30 DAY) GROUP BY country;

-- In order to increase the performance of the query above, we need to create some indexes.
CREATE INDEX member_registration_time ON member (registration_time);
-- 1. The above index (over registration_time column) is needed for making time calculation faster
CREATE INDEX member_country ON member (country);
-- 2. The above index (member_country) is not must but good to have for a better performance, for making group by part faster

-- ** Second SQL Problem **
-- As first step, we need to search with 'like' in order to search the expected NAME (not as full name)
-- That is why 'like' is used with an ending % character.
-- Then we order the records by the registration_time as desc to get the last registered users
-- Then we apply 'limit' to get the only 50 of the members
SELECT * FROM member WHERE name LIKE 'Jamal%' ORDER BY registration_time DESC limit 50;