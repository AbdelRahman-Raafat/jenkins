pipeline {
  agent any
  stages {
    stage('git') {
      steps {
        git(url: 'https://github.com/AbdelRahman-Raafat/jenkins.git', branch: 'new')
      }
    }

    stage('build') {
      steps {
        bat 'mvn clean install'
      }
    }

    stage('deploy') {
      steps {
        bat 'copy .\\integration-framework-release\\plugins\\vodafone-plugin-0.0.1.jar C:\\Users\\Dell\\Desktop\\ffs.jar'
      }
    }

  }
}