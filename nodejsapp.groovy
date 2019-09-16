pipeline 
	{
		agent any	 
		
		stages 
		{
			stage ('Checkout from repository') 
			{
				steps 
				{
					dir("${WORKSPACE}")
					{
						script
						{
							//checkout([$class: 'GitSCM', branches: [[name: "nodejsapp"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: "https://github.com/ankushpatil601/nodejsapp.git/nodejsapp"]]])
                          				println "cat ~/.docker/config.json".execute().text
							docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
						//def app = docker.build("nodeapp/docker-nodejs-demo:latest", '.').push()
						}
							
							
							
							
							sh """
							ls -ltr
							#docker build .
							"""
						}
                    }    
                }
            }
        }
    }
                
