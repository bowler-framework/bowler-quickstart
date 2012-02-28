resolvers += "Web plugin repo" at "http://siasia.github.com/maven2"

//libraryDependencies += "com.github.siasia" %% "xsbt-web-plugin" % "0.1.0-0.10.0"
libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.11"))

