pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build Application'
            }
        }
        stage('Test') {
            steps {
                echo 'Test Application'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy Application'
            }
        }
    }
    post {
        always {
            emailext body: 'Please check the pipeline status', subject: 'Pipeline status', to: 'tenneti.anand@gmail.com'
        }
    }
}
