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
                 withCredentials([gitUsernamePassword(credentialsId: 'git-basic', gitToolName: 'git-tool')]) {
                              sh '''
                                git branch -a
                                git fetch $GIT_URL +refs/heads/main:refs/remotes/origin/main
                                git branch -a
                               '''
                            }
                sh '''
                    printenv
                    ./gradlew sonar -Dsonar.host.url=https://sonarcloud.io  -Dsonar.projectKey=chaossnowflake_sonar-test -Dsonar.pullrequest.key=8 -Dsonar.pullrequest.branch=feature/test-2 -Dsonar.pullrequest.base=main
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