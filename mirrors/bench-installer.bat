mkdir "C:\Program Files\bench"
curl -L "https://github.com/CrazyWillBear/bench/releases/download/0.0.2/bench.exe" -o "C:\Program Files\bench\bench.exe"
setx /m Path "%path%;C:\Program Files\bench;"