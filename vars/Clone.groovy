#def gitClone() {
 #   stage('Code Checkout') {
   #     git branch: 'java7', url: 'https://github.com/opstree/spring3hibernate.git'
  #  }
#}

def gitclone(String repo='https://github.com/opstree/spring3hibernate.git' , branch='java7'){
             git url: ${repo}, branch: ${branch} 
}
