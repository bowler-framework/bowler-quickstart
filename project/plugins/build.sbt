resolvers += "Web plugin repo" at "http://siasia.github.com/maven2"

libraryDependencies += "com.github.siasia" %% "xsbt-web-plugin" % "0.1.0-0.10.0"
//libraryDependencies <+= sbtVersion("com.github.siasia" %% "xsbt-web-plugin" % ("0.1.0-"+_))