pipeline {
    agent any

    tools {
        jdk 'JDK-17'
        maven 'Maven-3.9'
    }

    stages {

        stage('Checkout Backend Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/omkar232001/personalProject.git'
            }
        }

        stage('Build Backend') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Backend build successful'
        }
        failure {
            echo 'Backend build failed'
        }
    }
}
