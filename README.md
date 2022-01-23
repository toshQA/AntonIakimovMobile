Needed tools to run tests:
- Android SDK
- Java 8
- Appium
- maven

Steps to run tests for exercise 1:
1. Create emulator of android device and run it or connect real device
   1. For real device need to enable developer mode and give access to enter device in debug mode
2. Open terminal and run "adb devices" command
3. Copy device name and paste it to nativeTNG.xml amd webTNG.xml files in the "value" field:
    For example, <parameter name="deviceName" value="{deviceName}"></parameter>
4. Launch appium server with host "0.0.0.0" and "4723" port
5. Execute "mvn clean test -P native" to run tests for native app
6. Execute "mvn clean test -P web" to run tests for web app

Steps to run tests for exercise 2:
1. Enter your "token" and "EPAM user name" ("firstname_lastname") into the "test.properties" file
2. Connect to the EPAM VPN 
3. Choose suitable Android device on cloud mobile farm and enter its "udid" in the cloudAndroidNativeTNG.xml and cloudAndroidWebTNG.xml in correspondent parameter as value.
4. Install manually EPAMTestApp.apk on device
5. Choose suitable iOS device on cloud mobile farm and enter its "udid" in the cloudiOSNativeTNG.xml and cloudiOSWebTNG.xml in correspondent parameter as value.
6. Install manually EPAMTestApp.ipa on device
7. Execute "mvn clean test -P androidCloudNative" to run tests for native app on android in cloud mobile farm
8. Execute "mvn clean test -P iOSCloudNative" to run tests for native app on iOS in cloud mobile farm
9. Execute "mvn clean test -P androidCloudWeb" to run tests for web app on android in cloud mobile farm
10. Execute "mvn clean test -P iOSCloudWeb" to run tests for web app on iOS in cloud mobile farm
