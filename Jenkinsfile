@Library('library-demo') _

pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
            gitCheckout(
                branch: "master",
                sshkey: "new-ssh-key",
                url: "git@github.com:scmexpert/maven_hello_world.git"
            )
            }
    }
    }
}
