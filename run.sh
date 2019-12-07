test=$(docker run --rm -v "$PWD":/home/ninerules tamada/9rules:latest A | grep line | wc -l)
echo ${test}
