### Reference Documentation

•	Responds to an HTTP GET request at /products/{id} and delivers product data as JSON (where {id} will be a number. 

[http://localhost:8080/products/13860428] 


•	Performs an HTTP GET to retrieve the product name from an external API. (For this exercise the data will come from redsky.target.com, but let’s just pretend this is an internal resource hosted by myRetail) 

[http://localhost:8081/productName/13860428]


•	Reads pricing information from a NoSQL data store and combines it with the product id and name from the HTTP request into a single response. 

[ProductService.java : 30]


•   Accepts an HTTP PUT request at the same path (/products/{id}), containing a JSON request body similar to the GET response, and updates the product’s price in the data store

[http://localhost:8080/productName/13860428]



#Additional Info

Feign Client - External API interaction
Hysterix - Fallback handling
sl4j - Logging
