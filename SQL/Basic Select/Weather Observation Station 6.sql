SELECT
	DISTINCT CITY
FROM
    STATION
WHERE
    LOWER(SUBSTR(CITY, 0, 1)) = 'a'
        OR LOWER(SUBSTR(CITY, 0, 1)) = 'e'
        OR LOWER(SUBSTR(CITY, 0, 1)) = 'i'
        OR LOWER(SUBSTR(CITY, 0, 1)) = 'o'
        OR LOWER(SUBSTR(CITY, 0, 1)) = 'u';