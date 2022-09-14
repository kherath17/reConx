pipeline{
agent any{
    //agent {label 'Built-In Node'}
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
                stage('Compile'){
                    steps{
                        echo "Building the Project"
                        bat "mvn compile"
                    }
                }
               /* stage('Generate Report'){
                    steps{
                        publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'reports', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: 'coverageReport'])
                    }
                }
                */

    }
}