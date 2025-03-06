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
                    ./gradlew sonar -Dsonar.host.url=https://sonarcloud.io  -Dsonar.projectKey=chaossnowflake_sonar-test -Dsonar.pullrequest.key=7 -Dsonar.pullrequest.branch=feature/more-bad -Dsonar.pullrequest.base=main
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