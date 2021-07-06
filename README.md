# 将 Android Module 添加到 JitPack
## 一、将 Github Module 添加到 JitPack

* [Android Gradle 插件 3.6.0 及更高版本](https://developer.android.com/studio/build/maven-publish-plugin#groovy)
* [在对应的 gradle 添加插件 apply plugin: 'maven-publish'](https://docs.gradle.org/current/userguide/publishing_maven.html)
* [执行测试语句 gradlew publishToMavenLocal](https://jitpack.io/docs/ANDROID/)
* [Add afterEvaluate.publishing method on Gradle](https://developer.android.com/studio/build/maven-publish-plugin#groovy)
* Right -> Gradle -> publishing -> publish ReleaseXxxToXxx
* push git hub-> Add tag.
```bash
git tag -a v0.1 -m "Test tag"
git tag
git push origin v0.1
```
* [How to ](https://jitpack.io/#itzheng/JitPackDemo)
* Commits -> Get it

## 二、使用
1.在 build.gradle on Project 添加maven地址
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
2.在项目 build.gradle 添加依赖

```gradle
dependencies {
    ...
    implementation 'com.github.itzheng.JitPackDemo:release:v0.1'
}
```