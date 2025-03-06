pipeline {
    agent any
    environment {
        SONAR_TOKEN = credentials('sonar-token')
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                sh '''
                    printenv
                    ./gradlew sonar -Dsonar.pullrequest.key=8 -Dsonar.pullrequest.branch=feature/test-2 -Dsonar.pullrequest.base=main
                '''
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}