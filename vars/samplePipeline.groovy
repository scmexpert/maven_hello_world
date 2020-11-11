def call() {
    node {     
        stage('SCM') {
            sh 'echo git checkout'
        }        
        stage('Build & Test') {
            sh 'echo build and test'
        }        
        stage('Deploy') {
                sh 'echo deploy'
        }
    }
}
