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
                                git fetch https://github.com/chaossnowflake/sonar-test.git +refs/heads/main:refs/remotes/origin/main
                                git branch -a
                               '''
                            }
                sh '''
                    printenv
                    ./gradlew sonar -Dsonar.host.url=https://sonarcloud.io  -Dsonar.projectKey=chaossnowflake_sonar-test -Dsonar.pullrequest.key=5 -Dsonar.pullrequest.branch=feature/jenkins-2 -Dsonar.pullrequest.base=main --debug
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