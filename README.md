# TextViewClock
时间控件，显示时分，中间”：”跳动

## 使用方法

## gradle
### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Step 2. Add the dependency
```java
	dependencies {
	    compile 'com.github.loonggg:TextViewClock:1.1'
	}
 ```
 
## maven
### Step 1. Add the JitPack repository to your build file  
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

### Step 2. Add the dependency
```xml
	<dependency>
	    <groupId>com.github.loonggg</groupId>
	    <artifactId>TextViewClock</artifactId>
	    <version>v1.0</version>
	</dependency>
```

#### Example
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.loonggg.textviewclock.MainActivity">

    <com.loonggg.textviewclock.lib.TextViewClock
        android:id="@+id/tvc"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center"
        app:clockTextSize="30sp"
        app:space="18dp" />
</RelativeLayout>
```

### Step 3. TextViewClock concrete use 
```java
public class MainActivity extends AppCompatActivity {
    private TextViewClock tvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvc = (TextViewClock) findViewById(R.id.tvc);
        Typeface typeface = Typeface.createFromAsset(this.getAssets(), "fonts/weds.ttf");
        tvc.setFontTypeface(typeface);
    }
}
```
### 公众号
欢迎大家关注我的微信公众号：非著名程序员（smart_android），更多好的原创文章均首发于微信订阅号：非著名程序员
![](https://raw.githubusercontent.com/loonggg/BlogImages/master/%E5%85%AC%E4%BC%97%E5%8F%B7%E4%BA%8C%E7%BB%B4%E7%A0%81/erweima.jpg)

# License
```xml
Copyright 2017 loonggg

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
