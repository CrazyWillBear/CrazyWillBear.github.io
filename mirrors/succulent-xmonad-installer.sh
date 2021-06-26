#!/bin/bash

echo "Installing dependencies..."

if ! command -v paru >/dev/null; then
  echo "Installing paru"
  git clone https://aur.archlinux.org/paru.git
  cd ./paru
  makepkg -si
  cd ..
fi

paru -S xmonad xmonad-contrib xorg flameshot picom-jonaburg-git nitrogen git pcmanfm-gtk3 polybar base-devel curl rofi kitty brave-bin  --needed

echo "Copying config files..."

if [ ! -d "~/.xmonad" ]
  then
  mkdir ~/.xmonad/
fi

curl https://dotfiles.xsucculentx.repl.co/.xmonad/xmonad.hs -o ~/.xmonad/xmonad.hs

if [ ! -d "~/.config/polybar" ]
  then
  mkdir ~/.config/polybar/
fi

curl https://dotfiles.xsucculentx.repl.co/config/polybar/config -o ~/.config/polybar/config
chmod +x ~/.config/polybar/config

curl https://dotfiles.xsucculentx.repl.co/.xinitrc -o ~/.xinitrc

if [ ! -d "~/bin" ]
  then
  mkdir ~/bin
fi

curl https://dotfiles.xsucculentx.repl.co/bin/polybar-init.sh -o ~/bin/polybar-init.sh

curl https://dotfiles.xsucculentx.repl.co/config/picom.conf -o ~/.config/picom.conf

if [ ! -d "~/.config/gtk-3.0" ]
  then
  mkdir ~/.config/gtk-3.0
fi

curl https://dotfiles.xsucculentx.repl.co/config/gtk-3.0/settings.ini -o ~/.config/gtk-3.0/settings.ini

if [ ! -d "~/.config/kitty" ]
  then
  mkdir ~/.config/kitty
fi

curl https://dotfiles.xsucculentx.repl.co/config/kitty/kitty.conf -o ~/.config/kitty/kitty.conf

echo "Downloading wallpapers"

git clone https://gitlab.com/dwt1/wallpapers
