SCRIPT_DIR=$(cd $(dirname $0); pwd)
docker run --rm -v "$PWD":/home/ninerules tamada/9rules:latest A > result.txt

num=$(grep line result.txt | wc -l)

if [ $num -eq 0 ]; then
  exit 0
else
  exit 1
fi

exit 0
