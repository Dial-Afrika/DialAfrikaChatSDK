# DialAfrikaChatSDK
Dial Afrika ChatSDK v1.0.0

## Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
## Step 2. Add the dependency

```
	dependencies {
	        implementation 'com.github.thai-ru:DialAfrikaChatSDK:Tag'
	}
  ```
  ## Step3. Add the Api keys and Customize Message to your liking from you Android Activity
  ```
  val apikey = "KHBJH8675rCYD56Dy"
  val greeting = "Welcome to DialAfrika 👋"
  val message = "how can i help you"

ChatSDK.initialize(this, apikey, greeting, message)
```
  
  ### Remember to Change and Update with credential Obtained from DialAfrika
