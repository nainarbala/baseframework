FROM rabbitmq:3.11-management
LABEL maintainer="dev"

# Copy custom configuration (mounted in compose as well)
COPY rabbitmq.conf /etc/rabbitmq/rabbitmq.conf

EXPOSE 5672 15672