def call(Map config = [:]) {
    def imageName = config.imageName
    if (!imageName) {
        error("Image name is required")
    }

    def imageTag = config.imageTag ?: 'latest'
    def dockerfile = config.Dockerfile ?: 'Dockerfile'
    def context = config.context ?: '.'

    echo "Building Docker image: ${imageName}:${imageTag} using ${Dockerfile}"

    sh """
        docker build -t "${imageName}:${imageTag}" -t "${imageName}:latest" -f "${Dockerfile}" "${context}"
    """
}
