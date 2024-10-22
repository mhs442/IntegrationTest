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

            }
        }
        stage('build') {
            steps {

            }
        }
        stage('docker build') {
            steps {

            }
        }
    }
}