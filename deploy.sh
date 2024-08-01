#!/bin/bash

# Print a message indicating the start of the deployment process
echo "Starting deployment process..."

# Clean and package the project using Maven
echo "Running 'mvn clean package'..."
mvn clean package

# Build the Docker image
echo "Building Docker image..."
docker build --platform linux/amd64 -t gcr.io/verdant-upgrade-431200-i7/volunteer-hub:1.0 .

# Push the Docker image to Google Container Registry
echo "Pushing Docker image to GCR..."
docker push gcr.io/verdant-upgrade-431200-i7/volunteer-hub:1.0

# Deploy the Docker image to Google Cloud Run
echo "Deploying Docker image to Google Cloud Run..."
gcloud run deploy --image gcr.io/verdant-upgrade-431200-i7/volunteer-hub:1.0 --platform managedhttps://volunteer-hub-i365snazra-uc.a.run.app/

# Print a message indicating the end of the deployment process
echo "Deployment process completed."
