# DoubleClick on Android Views.

## Requirements
​
- Android API level 15 or greater
- Your favorite IDE

## Setting up

Gradle:
```groovy
Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

dependencies {
	        compile 'com.github.pedromassango:doubleClick:1.0'
	}
```

Maven:
```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

** Step 2. Add the dependency

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
