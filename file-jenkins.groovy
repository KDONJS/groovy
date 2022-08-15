//def project = "KDON"

//def projectPeriod = "kdon." + buildNumber

node(){

    def buildNumber_2 = BUILD_NUMBER

    stage('Instalacion'){
        //sh 'mkdir pruebas && cd pruebas'
        //sh '''touch Index.html'''
        sh 'echo "buildNumber_2: ${buildNumber_2}"'
    }
    stage('Ejecución'){
        //sh 'mkdir copi_1'
        //sh 'mv pruebas copi_1'
        sh 'echo "ejecutando..."'
    }
    stage('Variables'){
        def project = "KDON"
        def buildNumber = BUILD_NUMBER
        echo "buildNumber: ${buildNumber}"
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
