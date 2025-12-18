pipeline {
  agent any
  stages {
    stage('prebuilld') {
      parallel {
        stage('prebuilld') {
          steps {
            echo 'pre build success'
          }
        }

        stage('parallel prebuild ') {
          steps {
            echo 'prebuild '
          }
        }

      }
    }

    stage('build phase') {
      steps {
        echo 'build success'
      }
    }

    stage('test') {
      steps {
        echo 'test success'
      }
    }

    stage('deploy') {
      steps {
        echo 'deploy success'
      }
    }

    stage('release ') {
      steps {
        echo 'release success'
      }
    }

  }
}