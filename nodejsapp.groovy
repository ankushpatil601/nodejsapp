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
                           ls -ltr
						}
                    }    
                }
            }
        }
    }
                
