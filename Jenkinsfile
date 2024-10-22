pipeline {
    agent any
    stages {
        stage('checkout'){
            steps {
                git branch : 'main',
                credentialsId : 'mhs',
                url : 'https://github.com/mhs442/IntegrationTest.git'
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