pipeline {
    environment {
        docker_image = 'leelavamsikrishna/calculator:latest'
    }
    agent any
    stages {
        stage('Stage 1: Git Clone') {
            steps {
                git branch: 'master',
                url: 'https://github.com/vamsikrishna1007/Calculator.git'
            }
        }
        stage('Step 2: Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Step 3: Build Docker Image')
        {
            steps {
                script {
                    docker_image = docker.build docker_image
                }
            }
        }
        stage('Stage 4: Push docker image to hub')
        {
            steps
            {
                script
                {
                    docker.withRegistry('', 'dockercred')
                    {
                        docker_image.push()
                    }
                }
            }
        }
        stage('Stage 5: Clean Docker Images') {
            steps {
                script {
                    sh 'docker container prune -f'
                    sh 'docker image prune -f'
                }
            }
        }
         stage('Step 6: Ansible Deployment')
        {
            steps
            {
                ansiblePlaybook becomeUser: null,
                colorized: true,
                credentialsId: 'localhost',
                disableHostKeyChecking: true,
                installation: 'Ansible',
                inventory: 'Deployment/inventory',
                playbook: 'Deployment/deploy.yml',
                sudoUser: null
            }
        }
    }
}