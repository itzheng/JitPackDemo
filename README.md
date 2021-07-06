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

or
git tag -a v0.1 -m "Test tag" uuiduuid
git push origin --tags
```
* [How to ](https://jitpack.io/#itzheng/JitPackDemo)
* Commits -> Get it
* [添加文档注释](https://jitpack.io/docs/#javadoc-publishing) [Thanks](https://www.shuzhiduo.com/A/1O5EomWz7a/)
```
1.classpath 'com.github.dcendents:android-maven-gradle-plugin:1.5' on project build.gradle dependencies
2.apply plugin: 'com.github.dcendents.android-maven' on module build.gradle top
3.Add artifacts (sourcesJar/javadocJar), see Demo.
```
* [javadoc](https://javadoc.jitpack.io/com/github/itzheng/JitpackDemo/0.6/javadoc/)
* 强制更新 Gradle 依赖
```base
gradlew build --refresh-dependencies
```
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
[![](https://jitpack.io/v/itzheng/JitPackDemo.svg)](https://jitpack.io/#itzheng/JitPackDemo)
```gradle
dependencies {
    ...
    implementation 'com.github.itzheng:JitPackDemo:0.6'
}
```