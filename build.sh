GREEN='\033[0;32m'
BLUE='\033[0;30m'
RED='\033[0;31m'
NC='\033[0m'
TIMEFORMAT=%R

echo "   ___      _   _____           _ "
echo "  / _ \    | | |_   _|__   ___ | |"
echo " | | | |_  | |   | |/ _ \ / _ \| |"
echo " | |_| | |_| |   | | (_) | (_) | |"
echo "  \___/ \___/    |_|\___/ \___/|_|"
echo ""
printf "compiling ACcode ..."
javac Main.java -d ./ -encoding UTF8
printf " ${GREEN}done${NC}.\n"

printf "testing testcase ...\n"
echo ""
for f in testcase/*.in ; do
    base=${f%.in}
    name=${f##*/}
    echo testcase/$(echo "$name" | cut -f 1 -d '.').in
    time java Main < testcase/$(echo "$name" | cut -f 1 -d '.').in > testcase/$(echo "$name" | cut -f 1 -d '.').out;
done
printf "testing testcase ... ${GREEN}done${NC}.\n"

printf "generating pdf ..."
pandoc problem.md -s -o problem.pdf --pdf-engine=xelatex -V mainfont='標楷體'
printf " ${GREEN}done${NC}.\n"
 
printf "zipping testcase ..."
cd testcase&&zip -q testcase.zip ./{*.in,*.out}&&mv ./testcase.zip ../&&cd ../
printf " ${GREEN}done${NC}.\n"