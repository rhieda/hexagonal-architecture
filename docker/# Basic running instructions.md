# Basic running instructions

## Include mock(Addresses.json)
 - Include json into mappings
## How to start 
docker compose -f compose/docker-compose.yml up -d
## How to stop
docker compose -f compose/docker-compose.yml down

## How to list containers
docker ps


## Mongo
### How to access Mongo Container
docker ps
docker exec -it 1510c5d59390 /bin/bash
#### Inside image
mongosh -u root -p
example #password

use  hexagonal
show collections
db.Customers.find();