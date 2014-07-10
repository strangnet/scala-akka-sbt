# Scala Akka Project 

A starter project to begin coding in Scala with Akka.

Clone and push to own repository.

## Scala settings

Suggestions to get the most out of sbt when running the project:

Edit `~/.sbtconfig`:
   
   SBT_OPTS='-Xms1024M -Xmx2048M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=1024M -XX:+UseParallelGC'

Edit `sbt` (homebrew: `/usr/local/Cellar/sbt/<version>/bin/sbt`):
    
    #!/bin/sh
    test -f ~/.sbtconfig && . ~/.sbtconfig
    exec java ${SBT_OPTS} -jar /usr/local/Cellar/sbt/0.13.5/libexec/sbt-launch.jar "$@"