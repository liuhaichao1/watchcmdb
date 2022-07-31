node {
    stage('Clone') {
      echo "1.Clone Stage"
      git url: "https://github.com/liuhaichao1/watchcmdb.git"
      script {
            build_tag = sh(returnStdout: true, script: 'git rev-parse --short HEAD').trim()
            echo ${build_tag} 
      }
      
    }
    stage('Test') {
      echo "2.Test Stage"
    }
    stage('Build') {
      echo "3.Build Docker Image Stage"
    }
    stage('Push') {
      echo "4.Push Docker Image Stage"
    }
    stage('YAML') {
      echo "5. Change YAML File Stage"
    }
    stage('Deploy') {
      echo "6. Deploy Stage"
    }
}
