CORE=2

nohup java -Dcore=$CORE -cp loafer.jar loafer4vm/StartLoafer >console.txt 2>&1 &
