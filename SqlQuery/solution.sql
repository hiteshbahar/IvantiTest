Select a.manufacturer, a.model, a.price
from
(SELECT manufacturer, model, price, 
RANK() OVER (PARTITION BY manufacturer ORDER BY price DESC) AS rank_id
FROM car) a
where rank_id <2
