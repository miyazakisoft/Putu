SCRIPT_DIR=$(cd $(dirname $0); pwd)
docker run --rm -v "$PWD":/home/ninerules tamada/9rules:latest A > result.txt
cat result.txt
#echo $SCRIPT_DIR/sample_project/$1
#echo test
#docker run --rm -v "$PWD":/home/ninerules tamada/9rules:latest example
