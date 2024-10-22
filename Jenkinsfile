pipeline {
    agent any
    stages {
        stage('Prepare'){
            steps {
                git credentialsId : 'mhs',
                    branch : 'main',
                    url : 'git@github.com:mhs442/IntegrationTest.git'
            }
        }
        stage('test') {
            steps {
                echo 'test stage'
            }
        }
        stage('build') {
            steps {
                echo 'build stage'
            }
        }
        stage('docker build') {
            steps {
                echo 'docker build stage'
            }
        }
    }
}