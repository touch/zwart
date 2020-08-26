pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'lein install'
      }
    }
    stage ('deploy') {
      steps {
        sh 'printenv'
        sh 'lein deploy upstream'
      }
    }
  }
}