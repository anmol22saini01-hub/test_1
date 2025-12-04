pipeline {
    agent any  // Run on any available Jenkins node

    tools {
        maven 'Maven3'   // Name of Maven installation in Jenkins
        jdk 'JDK11'      // Name of JDK installation in Jenkins
    }

    stages {

        stage('Checkout') {
            steps {
                echo "Checking out code from Git"
                git branch: 'main', url: 'https://github.com/anmol22saini01-hub/test_1.git'
            }
        }

        stage('Build') {
            steps {
                echo "Building the project"
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo "Running unit tests"
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo "Pipeline completed successfully!"
        }
        failure {
            echo "Pipeline failed. Check logs!"
        }
    }
}
