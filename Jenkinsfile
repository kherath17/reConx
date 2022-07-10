pipeline{
    agent any
        stages{
            stage('Build'){
                steps{
                        echo "Building the Project"
                        bat "mvn clean"
                    }
                }
                stage('Test'){
                    steps{
                        echo "Testing the Project"
                        bat "mvn test"
                    }
                }
                stage('Compil'){
                    steps{
                        echo "Building the Project"
                        bat "mvn compile"
                    }
                }
}
}