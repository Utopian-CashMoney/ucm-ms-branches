pipeline { 
    agent any 
    
    tools { 
	    maven 'Maven 3.8.1' 
	    jdk 'jdk1.8' 
    }
    
    stages { 
	      stage ('Checkout Git Repo') {
	        steps {
	                git branch: 'development', url: 'https://github.com/Utopian-CashMoney/ucm-ms-branches.git'            
	        }
	    }
	    
          stage ('Unit Tests') {
            
            steps {
            
                  sh 'mvn test'        
            }
        }

        stage ('Build') {
            
            steps {
            
                  sh 'mvn clean package' 
                
            }
        }
    }
}
