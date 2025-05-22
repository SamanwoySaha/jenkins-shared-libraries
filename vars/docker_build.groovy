def call(String dockerHubUsername, String imageName, String imageTag){
  sh "docker build -t ${dockerHubUsername}/${imageName}:${imageTag} ."
}
