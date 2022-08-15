//def project = "KDON"
def buildNumber_2 = BUILD_NUMBER
//def projectPeriod = "kdon." + buildNumber

node(){
    stage('Instalacion'){
        //sh 'mkdir pruebas && cd pruebas'
        //sh '''touch Index.html'''
        sh 'echo "Project: ${buildNumber_2}"'
    }
    stage('Ejecución'){
        //sh 'mkdir copi_1'
        //sh 'mv pruebas copi_1'
        sh 'echo "ejecutando..."'
    }
    stage('Variables'){
        def project = "KDON"
        def buildNumber = BUILD_NUMBER
        echo "Project: ${project}"
                     
        if(project == "KDON"){
            stage('Variable si'){
                sh 'echo "Variable si"'
            }
        }else{
            stage('Variable no'){
                sh 'echo "Variable no"'
            }
        }
    }
    stage('loop de entorno'){
        for(i = 0 ; i < 10 ; i++){
            echo "Entorno: " + i
        }
    }
}
