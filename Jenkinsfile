pipeline {
  agent any
  stages {
    stage('pre-build') {
      parallel {
        stage('pre-build') {
          steps {
            echo 'pre-build'
          }
        }

        stage('parrale pre-builld') {
          steps {
            echo 'git repo'
          }
        }

      }
    }

    stage('build') {
      steps {
        echo 'build success'
      }
    }

    stage('test') {
      parallel {
        stage('test') {
          steps {
            echo 'test completed'
          }
        }

        stage('firefox ') {
          steps {
            echo 'test in firefox brower'
          }
        }

        stage('chrome') {
          steps {
            echo 'test in chrome completed'
          }
        }

      }
    }

    stage('deploly') {
      steps {
        echo 'deply '
      }
    }

  }
}