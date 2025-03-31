# Kid-Ex-Android-Development-Project
A simple Android Development Project using explicit intent which takes username and password and navigates to next welcome page using intent event listener

## 📌 Project Overview
This is an Android application developed in Java. It includes Java source files, XML layout files, and a pre-built APK for installation.

## 📂 Project Structure
```
/your-project-folder
│-- /src/main/java/com/example/yourapp/  # Java source files
│-- /src/main/res/layout/                # XML layout files
│-- AndroidManifest.xml                   # Android app manifest
│-- build.gradle                           # Gradle build configuration
│-- app.apk                                # Pre-built APK
```

## 🚀 How to Set Up the Project in IntelliJ IDEA
### 1️⃣ **Install IntelliJ IDEA and Required Plugins**
- Ensure you have **IntelliJ IDEA (Ultimate or Community Edition)** installed.
- Install the **Android Plugin** (Go to `File → Settings → Plugins → Search for "Android" → Install`).

### 2️⃣ **Install the Android SDK** (If Not Installed)
- Go to **SDK Manager** (`File → Project Structure → SDKs → Add → Android SDK`).
- If the SDK is not installed, download it from [Android Developer](https://developer.android.com/studio#downloads).

### 3️⃣ **Open the Project in IntelliJ**
1. **Open IntelliJ IDEA**
2. Click **"Open"** and select your project folder
3. Wait for Gradle sync to complete

### 4️⃣ **Manually Add Missing Directories (If Needed)**
- If the `res/layout/` folder is missing:
  1. Right-click `res/` → `New → Directory` → Name it **layout**.
  2. Move your XML files into this folder.

### 5️⃣ **Ensure `AndroidManifest.xml` is Correct**
- Open `AndroidManifest.xml` and verify that `MainActivity` is properly registered:
  ```xml
  <activity android:name=".MainActivity">
      <intent-filter>
          <action android:name="android.intent.action.MAIN" />
          <category android:name="android.intent.category.LAUNCHER" />
      </intent-filter>
  </activity>
  ```

### 6️⃣ **Run the Application on an Emulator or Device**
- Click **Run ▶** or press **Shift + F10**.
- Select an emulator or connected Android device.
- If you don't have an emulator, create one using **AVD Manager** (`Tools → Device Manager`).

## 📱 Installing the APK
- If you just want to install and test the app without running the code:
  1. Copy `app.apk` to your Android device.
  2. Enable **Install Unknown Apps** in your phone settings.
  3. Open the APK file and install the app.

## ❓ Troubleshooting
- **Gradle Sync Errors?** → Try `File → Invalidate Caches & Restart`.
- **Android SDK Not Found?** → Set the SDK path in `File → Project Structure → SDK Location`.
- **App Crashing?** → Check the **Logcat** (`View → Tool Windows → Logcat`).
