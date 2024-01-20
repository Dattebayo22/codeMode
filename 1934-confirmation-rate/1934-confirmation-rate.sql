/* Write your T-SQL query statement below */
SELECT
    s.user_id,
    ISNULL(CONVERT(NUMERIC(4, 2),AVG(CASE WHEN c.action = 'confirmed' THEN 1.0 ELSE 0.0 END)), 0.0) AS confirmation_rate
FROM
    Signups AS s
LEFT JOIN
    Confirmations AS c ON s.user_id = c.user_id
GROUP BY
    s.user_id;
