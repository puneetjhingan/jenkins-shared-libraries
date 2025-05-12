def call() {
    echo "Checking out repository..."
    checkout scm
}

// def call(String url, String branch){
//   git url: "${url}", branch: "${branch}"
// }
