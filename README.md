Needed tools to run tests:
Android SDK
Java 8
Appium
maven

Steps to run tests:
1. Create emulator of android device and run it or connect real device
   1. For real device need to enable developer mode and give access to enter device in debug mode
2. Open terminal and run "adb devices" command
3. Copy device name and paste it to nativeTNG.xml amd webTNG.xml files in the "value" field:
    For example, <parameter name="deviceName" value="{deviceName}"></parameter>
4. Launch appium server with host "0.0.0.0" and "4723" port
5. Execute "mvn clean test -P native" to run tests for native app
6. Execute "mvn clean test -P web" to run tests for web app