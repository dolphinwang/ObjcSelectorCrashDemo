## Introduce
This repo is a reproducer for [KT-51034](https://youtrack.jetbrains.com/issue/KT-51034)

1. create a KMM project via AndroidStudio
2. transfer Swift to Objc and make it correct in iosApp
3. make a VCDelegate to receive lifecycle from iOS
4. start invoking CADisplayLink.displayLinkWithTarget when viewDidAppear
5. boom!