git clone https://github.com/CrazyWillBear/yes-replacement
cd yes-replacement
cargo build --release
sudo mv target/release/yes /bin/yes
cd ..
rm -r ./yes-replacement