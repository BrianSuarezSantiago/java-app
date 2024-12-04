pipeline {
    agent any

    stages {
        stage("Prepare Stage") {
            steps {
                script {
                    // Llamar a la función definida en vars/miPaso.groovy
                    //miPaso('¡Hola desde la librería compartida!')
                    echo "-- Configure Step --\n"
                    echo "Checking if neccessary tools are installed..."
                    def isGitInstalled = sh(script: 'which git', returnStatus: true) == 0
                    def isMavenInstalled = sh(script: 'which mvn', returnStatus: true) == 0
                    
                    //sh "apt-get update && apt-get install sudo"
                    //sh 'sudo apt install maven -y'
                    echo "Checking installed tools versions..."
                    sh "git --version"
                    sh "mvn --version"
                    sh "rm -rf java-app"
                    echo "borrado..."
                    /*if((isGitInstalled || isMavenInstalled) == false) {
                        echo "Installing tools..."
                        //sh "yum install mvn -y"
                        sh 'apt install mvn -y'
                        echo "Checking installed tools versions..."
                        sh "git --version"
                        sh "mvn --version"
                    } else {
                        echo "Tools are already installed."
                    }*/

                    echo "Inicio de la clonación del repositorio..."
                    sh "git clone https://github.com/BrianSuarezSantiago/java-app.git"
                    echo "El repositorio se ha clonado con éxito."
                    sh "ls -l"
                    sh "pwd"
                    //sh "cd java-app/"
                    //sh "pwd"
                    dir("java-app") {
                        sh "pwd"
                        sh "ls -l"
                        sh "mvn compile"
                        sh "mvn test"
                    }
                }
            }
        }

        /*stage("Build Stage") {
            steps {
                script {
                    print("Stage de build")
                    sh "mvn compile"
                    sh "mvn test"
                }
            }
        }*/

        stage("Package Stage") {
            steps {
                script {
                    print("Stage de package")
                }
            }
        }

        stage("Deploy Stage") {
            steps {
                script {
                    print("Stage de deploy")
                }
            }
        }
    }
}
