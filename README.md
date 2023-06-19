# DialAfrikaChatSDK
Version: 1.0.0

The DialAfrika ChatSDK allows developers to integrate chat functionality into their mobile applications. This documentation provides instructions on how to integrate and utilize the ChatSDK in your Android application.

# Prerequisites
Before integrating the DialAfrika ChatSDK into your project, ensure that you have the following:

Android Studio installed
A valid DialAfrika API key
Access to the internet

## Step 1. Add the JitPack repository to your build file
Add the following code to the build.gradle file located in the root directory of your project:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
## Step 2. Add the dependency

Add the following dependency to the build.gradle file of your application module:


```
	dependencies {
	        implementation 'com.github.thai-ru:DialAfrikaChatSDK:Tag'
	}
  ```
  Replace Tag with the desired version or commit hash of the ChatSDK.
  
## Step3. In your Android activity, add the following code to initialize and configure the ChatSDK with your API key and custom messages:
  ```
  val apikey = "KHBJH8675rCYD56Dy"
  val greeting = "Welcome to DialAfrika 👋"
  val message = "how can i help you"

ChatSDK.initialize(this, apikey, greeting, message)

Ensure that you replace the apiKey with your valid DialAfrika API key. The greeting and message variables can be customized to fit your application's needs.
```
  
  ### Remember to Change and Update with credential Obtained from DialAfrika
