# PlatformCommandMicroservice
A project to learn microservice architecture with 2 .NET microservices(Platform service and Commands service), making use of RabbitMQ and GRPC to facilitate loose coupling and event driven architecture and using K8 to deploy and run the microservices

High level information covered:
• Building two .NET Microservices using the REST API pattern
• Working with dedicated persistence layers for both services
• Deploying our services to Kubernetes cluster
• Employing the API Gateway pattern to route to our services
• Building Synchronous messaging between services (HTTP & gRPC)
• Building Asynchronous messaging between services using an Event Bus (RabbitMQ)
