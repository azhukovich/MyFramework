    pipeline {
        agent any

        stages {
stage('Run Tests') {
    steps {
        sh 'chmod +x gradlew'
        sh './gradlew test'
    }
}
        }

        post {
            always {
                junit 'build/test-results/test/*.xml'
            }
        }
    }