## Introduce
This repo is a reproducer for [KT-51034](https://youtrack.jetbrains.com/issue/KT-51034)

1. create a KMM project via AndroidStudio
2. transfer Swift to Objc and make it correct in iosApp
3. make a VCDelegate to receive lifecycle from iOS
4. start invoking CADisplayLink.displayLinkWithTarget when viewDidAppear
5. run sh gradlew clean
6. run "iosApp" in AndroidStudio or in Xcode
7. boom!

### Env

* AndroidStudio

```
Android Studio Arctic Fox | 2020.3.1 Patch 3
Build #AI-203.7717.56.2031.7784292, built on October 1, 2021
Runtime version: 11.0.10+0-b96-7281165 x86_64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
macOS 11.5.1
GC: G1 Young Generation, G1 Old Generation
Memory: 4096M
Cores: 12
Registry: ide.instant.shutdown=false, external.system.auto.import.disabled=true
Non-Bundled Plugins: com.berzanmikaili.intellij.monokai_pro, com.bytedance.idea-tools.bytedance-plugin-store, org.jetbrains.kotlin, com.bytedance.android.tetris, com.bytedance.android.tools.live.platform, com.jetbrains.kmm, com.bytedance.asplugin.as.plugin.bytedance-as-plugin, com.bytedance.android.tools.brick, com.bytedance.pluginx, com.bytedance.tools.popview, com.bytedance.tools.wrangler
```

* Java

```
openjdk 11.0.1 2018-10-16
OpenJDK Runtime Environment 18.9 (build 11.0.1+13)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.1+13, mixed mode)
```

Kotlin

```
1.5.31
```

* Xcode

```
13.1 (13A1030d)
```

* Simulator

```
iPhone 11 with iOS 15
```