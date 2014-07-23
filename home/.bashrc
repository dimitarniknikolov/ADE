# ~/.bashrc: executed by bash(1) for non-login shells.
# see /usr/share/doc/bash/examples/startup-files (in the package bash-doc)
# for examples

# If not running interactively, don't do anything
[ -z "$PS1" ] && return

# don't put duplicate lines in the history. See bash(1) for more options
# don't overwrite GNU Midnight Commander's setting of `ignorespace'.
export HISTCONTROL=$HISTCONTROL${HISTCONTROL+,}ignoredups
# ... or force ignoredups and ignorespace
export HISTCONTROL=ignoreboth

# append to the history file, don't overwrite it
shopt -s histappend

# for setting history length see HISTSIZE and HISTFILESIZE in bash(1)

# check the window size after each command and, if necessary,
# update the values of LINES and COLUMNS.
shopt -s checkwinsize

# make less more friendly for non-text input files, see lesspipe(1)
[ -x /usr/bin/lesspipe ] && eval "$(SHELL=/bin/sh lesspipe)"

# set variable identifying the chroot you work in (used in the prompt below)
if [ -z "$debian_chroot" ] && [ -r /etc/debian_chroot ]; then
    debian_chroot=$(cat /etc/debian_chroot)
fi

# set a fancy prompt (non-color, unless we know we "want" color)
case "$TERM" in
    xterm-color) color_prompt=yes;;
esac

# uncomment for a colored prompt, if the terminal has the capability; turned
# off by default to not distract the user: the focus in a terminal window
# should be on the output of commands, not on the prompt
force_color_prompt=yes

if [ -n "$force_color_prompt" ]; then
    if [ -x /usr/bin/tput ] && tput setaf 1 >&/dev/null; then
	# We have color support; assume it's compliant with Ecma-48
	# (ISO/IEC-6429). (Lack of such support is extremely rare, and such
	# a case would tend to support setf rather than setaf.)
	color_prompt=yes
    else
	color_prompt=
    fi
fi

if [ "$color_prompt" = yes ]; then
    PS1='${debian_chroot:+($debian_chroot)}\[\033[01;32m\]\u@\[\033[00m\]:\[\033[01;34m\]\W\[\033[01;31m\]$(git branch 2> /dev/null | grep -e "\* " | sed "s/^..\(.*\)/:\1/")\[\033[00m\] $ \[\e[0;30m\]'
else
    PS1='${debian_chroot:+($debian_chroot)}\u@\h:\w\$ '
fi
unset color_prompt force_color_prompt

# If this is an xterm set the title to user@host:dir
case "$TERM" in
xterm*|rxvt*)
    PS1="\[\e]0;${debian_chroot:+($debian_chroot)}\u@\h: \w\a\]$PS1"
    ;;
*)
    ;;
esac

# Alias definitions.
# You may want to put all your additions into a separate file like
# ~/.bash_aliases, instead of adding them here directly.
# See /usr/share/doc/bash-doc/examples in the bash-doc package.

if [ -f ~/.bash_aliases ]; then
    . ~/.bash_aliases
fi

# enable color support of ls and also add handy aliases
if [ -x /usr/bin/dircolors ]; then
    eval "`dircolors -b`"
    alias ls='ls --color=auto'
    alias dir='dir --color=auto'
    alias vdir='vdir --color=auto'

    alias grep='grep --color=auto'
    alias fgrep='fgrep --color=auto'
    alias egrep='egrep --color=auto'
fi

# some more ls aliases
alias ll='ls -l'
alias la='ls -A'
alias l='ls -CF'
alias phpunit='phpunit --colors'

# enable programmable completion features (you don't need to enable
# this, if it's already enabled in /etc/bash.bashrc and /etc/profile
# sources /etc/bash.bashrc).
if [ -f /etc/bash_completion ]; then
    . /etc/bash_completion
fi

if [ -d ~/bin ]; then
    PATH=~/bin:"${PATH}"
fi

export ANDROID_HOME=/home/dimitar/.bin/adt-bundle-linux/sdk/
export NDK_ROOT=/home/dimitar/.bin/android-ndk-r8/
export PATH=${PATH}:/home/dimitar/.bin/adt-bundle-linux/sdk/tools/
export PATH=${PATH}:/home/dimitar/.bin/adt-bundle-linux/sdk/platform-tools/
export PATH=${PATH}:/home/dimitar/.bin/
export GIT_MERGE_AUTOEDIT=no
export PATH=${PATH}:/home/dimitar/

export CCACHE_DIR=/home/dimitar/.ccache
#export PS1="\e[0;32m[\u@\h \W]\$ $(parse_git_branch)\e[m "

export USE_CCACHE=1

#export PS1='\e[0;32m[\u@\h \w $(parse_git_branch)$ '

alias df="git diff"
alias gst="git status"
alias andro="cd /home/dimitar/.bin/adt-bundle-linux/sdk/platform-tools/"
alias gppa="git pull && git submodule foreach git pull && git push && git submodule foreach git push"
alias add="git add"
alias ad="git add"
alias pull="git pull"
alias push="git push"
alias com="git commit -m"
alias gpp="git pull git push"
alias gppa="git pull && git submodule foreach git pull && git push && git submodule foreach git push"
alias andro="cd /home/dimitar/.bin/adt-bundle-linux/sdk/platform-tools/"
alias adb=~/.my_adb
alias adbcolor=~/.colored_logcat.py
alias dpis=~/.dpis

. ~/.adb_completion

function svn {
  command svn "$@" | awk '
  BEGIN {
    cpt_c=0;
  }
  {
    if        ($1=="C") {
      cpt_c=cpt_c+1;
      print "\033[31m" $0 "\033[00m";  # Conflicts are displayed in red
    }
    else if   ($1=="A") {
      print "\033[32m" $0 "\033[00m";  # Add in green
    }
    else if   ($1=="?") {
      print "\033[33m" $0 "\033[00m";  # New in cyan
    }
    else if   ($1=="D") {
      print "\033[31m" $0 "\033[00m";  # Delete in magenta
    }
    else                {
      print $0;                        # No color, just print the line
    }
  }
  END {
    print cpt_c, " conflicts are found.";
  }';
}

# Android emulator aliases -------------------------------------------------------------------------
alias adbinput='adb shell input'
 
alias adbtext='adbinput text'
 
alias adbkey='adbinput keyevent'

alias adbtab='adbkey 61'
 
alias adbdown='adbkey 20'
 
alias adbback='adbkey 4'
 
alias adbenter='adbkey 66'

alias adbuser_technician='adbtext technician11@yopmail.com'
alias adbpass_admin='adbtext admin'
alias applogin_3plenish_technician11='adbuser_technician;adbtab;adbpass_admin;adbtab;adbtab;adbenter'

alias adbuser_tdahl='adbtext tdahl123@yopmail.com'
alias adbpass_perfect1='adbtext perfect1'
alias applogin_3plenish_tdahl123='adbuser_tdahl;adbtab;adbpass_perfect1;adbtab;adbtab;adbenter'
# navigate splash screen
 
alias appconf='for i in {1..3};do adbtab;done;adbenter'
 
# select test environment
 
alias apptest='appconf;adbtab;adbenter'
 
# select production environment
 
alias appprod='appconf;for i in {1..3};do adbtab;done;adbenter'

# END Android emulator aliases ---------------------------------------------------------------------

# Android application projects sendBuildScipts -----------------------------------------------------

alias sendBuild3plenish="./home/dimitar/src/3plenish-android/sendBuild3plenish"
# End Android application projects sendBuildScipts -------------------------------------------------

# Android get Application database -------------------------------------------------
alias pullDb3plenish="adb pull /data/data/com.threeplenish/databases/threeplenish-db /home/dimitar/"

alias pushDb3plenish="adb push /home/dimitar/threeplenish-db /data/data/com.threeplenish/databases/"
# END Android get Application database -------------------------------------------------

# Android uninstall Applications -------------------------------------------------
alias uninstall3plenish="adb uninstall com.threeplenish"
# END Android uninstall Applications -------------------------------------------------
