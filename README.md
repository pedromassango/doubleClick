# DoubleClick on Android Views.
A android library lo handle double click on android Views components. You just need to call it on your view `onCLickListener`.
## Requirements
​
- Android API level 14 or greater
- Your favorite IDE

## Setting up

Gradle:

Step 1. Add the JitPack repository to your build file.
Add it in your root build.gradle at the end of repositories:
```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency
```groovy
dependencies {
	        compile 'com.github.pedromassango:doubleClick:1.0'
	}
```

Maven:

Step 1. register jitpack.io
```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

Step 2. Add the dependency

```xml
<dependency>
	    <groupId>com.github.pedromassango</groupId>
	    <artifactId>doubleClick</artifactId>
	    <version>1.0</version>
	</dependency>
```


## Basic usage

The class DoubleClick extends of `View.OnClickListener` so, just call the `DoubleClick` class on you onClickListener Button
and pass a instance of `DoubleClickListener` class to listen the events.

Sample here.
```java
Button btn = new Button(this);
btn.setOnClickListener( new DoubleClick(new DoubleClickListener() {
            @Override
            public void onSingleClick(View view) {

                // Single tap here.
            }

            @Override
            public void onDoubleClick(View view) {

                // Double tap here.
            }
        });
```
