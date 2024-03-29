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
                          				//println "cat ~/.docker/config.json".execute().text
							//sh " cat /home/jenkins/.dockercfg "
							docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
							def app = docker.build("ankushpa/nodeapp:19", '.')
								app.push()
								app.pull()
								sh "docker run -p 5001:8080 ankushpa/nodeapp:19"
								//docker pull nodeapp
							// docker images
								//app.run(nodeapp)
								
							//sh 'sudo docker login -u "ankushpa" -p "@nkush2019"  https://registry-1.docker.io/v2/'
						}
							
						
							
						}
                    }    
                }
            }
        }
    }
                
