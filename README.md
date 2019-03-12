# Demo Pact

## Demo Setup

Run the Pact server

    ./docker-compose up.

Register the Pact contract

    cd src/main/resources
    curl -v -XPUT \-H "Content-Type: application/json" \
-d@demo-pact.json \
http://localhost:80/pacts/provider/demo/consumer/consumer-api/version/1.0.0

