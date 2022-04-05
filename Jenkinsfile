pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        git(url: 'https://github.com/AbdelRahman-Raafat/jenkins.git', branch: 'main', poll: true)
      }
    }

    stage('Build') {
      steps {
        bat 'mvn clean install'
      }
    }

    stage('') {
      steps {
        bat 'copy .\\integration-framework-release\\plugins\\vodafone-plugin-0.0.1.jar C:\\Users\\Dell\\Desktop\\ffsdfd.jar'
      }
    }

  }
}