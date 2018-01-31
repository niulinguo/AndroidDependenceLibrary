# Android Support

**1、build.gradle**
````gradle

dependencies {

    ...

    // Android Support
    implementation project(':androidsupport')
}

````

## MultiDex

**1、build.gradle**
````gradle

    defaultConfig {

        ...

        // Enabling MultiDex Support
        multiDexEnabled true
    }

````

**2、Application**

````xml

    <application
        android:name=".MyApp"
        ...
        >

        ...

    </application>

````

> 1. 可以直接继承 NilesMultiDexApplication 类
````java

public class MyApp extends NilesMultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        ...

    }
}

````
> 2. 可以在 Application 类 attachBaseContext 里面加行代码
````java

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ...

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        NilesMultiDex.install(this);
    }
}

````