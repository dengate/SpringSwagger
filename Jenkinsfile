pipeline {
    agent any
    tools {
        maven 'maven-3.6.3'
    }
    stages {
        stage("build project") {
            steps {
                echo "Java VERSION"
                sh 'java -version'
                echo "Maven VERSION"
                sh 'mvn -version'
                echo 'building project...'
                sh "mvn compile"
                sh "mvn package"
                sh "mvn clean install"
            }
        }
    }
}
