pipeline {
    agent any

    tools {
        jdk 'java'      // Ensure Java is installed in Jenkins
        gradle 'gradle' // Ensure Gradle is installed in Jenkins
    }

    stages {
        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/MageswariMuthu/Junit-parameter-test.git', branch: 'main'
            }
        }

        stage('Build and Run Tests') {
            steps {
                sh './gradlew clean test'  // Run JUnit 5 tests
            }
        }

        stage('Archive Test Results') {
            steps {
                junit 'app/build/test-results/test/*.xml' // Store test reports in Jenkins
            }
        }
    }
}
