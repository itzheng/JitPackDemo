# 将 Android Module 添加到 JitPack
## 一、[将 Github Module 添加到 JitPack](https://jitpack.io/docs/BUILDING/)

* [Android Gradle 插件 3.6.0 及更高版本](https://developer.android.com/studio/build/maven-publish-plugin#groovy)
* [在对应的module 的 build.gradle 添加插件](https://docs.gradle.org/current/userguide/publishing_maven.html)
```bash
apply plugin: 'maven-publish'
```
* [执行测试语句 ](https://jitpack.io/docs/ANDROID/)
```bash
gradlew publishToMavenLocal
```
or
```
RightMenu -> Gradle -> lib_name -> publishing -> publishToMavenLocal
```
* ~~[Add afterEvaluate.publishing method on Gradle](https://developer.android.com/studio/build/maven-publish-plugin#groovy)~~
```
afterEvaluate是为了区分测试版和正式版，之前没添加Javadoc，是可以在 JitPack 中使用不同版本的
添加了注释工具后，这个貌似失效了，不过，对于工具包，一个版本就够了，还省的去区分配置。
```
* [添加文档注释](https://jitpack.io/docs/#javadoc-publishing) [Thanks](https://www.shuzhiduo.com/A/1O5EomWz7a/)
```
1.classpath 'com.github.dcendents:android-maven-gradle-plugin:1.5' on project build.gradle dependencies
2.apply plugin: 'com.github.dcendents.android-maven' on module build.gradle top
3.Add artifacts (sourcesJar/javadocJar), see Demo.
```
* push git hub,then Add tag.
```bash
git add .
git rm -r --cached .idea
git commit -m "this is commit,xxxxxxx"
git push origin master
```
Tag 建议使用版本号，前面不用加v,例如 1.0.0 ，~~而不是 V1.0~~
```bash
git tag -a 0.1 -m "Test tag"
git tag
git push origin 0.1
or
git tag -a 0.1 -m "Test tag" uuiduuid
git tag -a 0.2 -m "Test tag2" uuiduuid2
git tag -a 0.3 -m "Test tag3" uuiduuid3
git push origin --tags
```
```
关于git提交可以直接使用 AndroidStudio ,Tag可以直接在GitHub上打,这个就不说了。
```
* [Goto JitPack build it](https://jitpack.io/#itzheng/JitPackDemo)
* Releases/Commits -> Get it -> Waiting ...
* [javadoc](https://javadoc.jitpack.io/com/github/itzheng/JitpackDemo/0.6/javadoc/)
* 强制更新 Gradle 依赖,如果是在测试，为了保证更新可以使用。
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