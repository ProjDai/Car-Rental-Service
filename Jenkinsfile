node{
   stage('SCM Checkout'){
     git credentialsId: 'c196ba76-6675-412f-926c-d494f077eb4a', url:'https://github.com/ProjDai/Car-Rental-Service'
    }
    stage('Mvn package'){
     def mvnHome = tool name: 'Maven', type: 'maven'
     sh "${mvnHome}/bin/mvn clean install"
    }
    
}
     
