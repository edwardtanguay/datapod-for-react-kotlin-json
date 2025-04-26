# datapod-for-react-php-json

This is a simple datapod template for a local site that displays data from a JSON file, which is created by a PHP script that parses a text file.

# Install Kotlin

- Ubuntu
    - `kotlin install ubuntu`
    - `curl -s https://get.sdkman.io | bash`
    - `sdk install kotlin`
    - `kotlin -version`

## Compatibility

- ✔️ tested on Windows
- ✔️ tested on Ubuntu

## Known issues

- note there is a hack in the npm statements that execute commands to clear cache, since changes in called modules were not updating unless the top file was changed
- at one point I received this error: "error: org.jetbrains.kotlin.mainKts.Import (app.main.kts): java.lang.ClassNotFoundException: org.jetbrains.kotlin.mainKts.Import"

## More Datapod templates and sites

https://datapod-tanguay-eu.vercel.app
