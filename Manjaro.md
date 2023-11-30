 
# Manjaro相关

1. [Manjaro/Arch 软件配置安装](https://blog.csdn.net/weixin_52802958/article/details/118368908)
2. [manjaro安装相关](https://blog.csdn.net/qq_19954537/article/details/124868508)
3. [Manjaro 21安装搜狗输入法](http://e.betheme.net/article/show-428532.html?action=onClick)
4. [Manjaro入坑](https://blog.csdn.net/qq_46079815/article/details/128250103)
5. [的安装配置_Manjaro Linux安装配置](https://blog.csdn.net/weixin_28839629/article/details/112673168)
6. [manjaro安装deb软件包](https://www.cnblogs.com/lisuhang/p/15894049.html)
7. [linux下为.sh的可执行文件创建快捷方式](https://blog.csdn.net/NoodleMaster/article/details/117070147)
8. [Linux命令 - ln命令](https://blog.csdn.net/tian830937/article/details/127788822) 
9. [Manjaro安装搜狗输入法](https://www.51c51.com/baike/xinxi/5/236650.html) 
10. [IDEA开发软件在linux环境下使用搜狗输入法无法进行中文输入](https://blog.csdn.net/TwT520Ly/article/details/80421953?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_baidulandingword~default-0-80421953-blog-106060583.235^v38^pc_relevant_anti_vip_base&spm=1001.2101.3001.4242.1&utm_relevant_index=1)
11. [manjaro基本配置](https://blog.csdn.net/jmmgjl/article/details/131289560)
12. [Manjaro配置攻略](https://blog.csdn.net/qq_27525611/article/details/105986126)
13. [ManjaroLinux扩展显示器，连接显示器](https://blog.csdn.net/weixin_53064820/article/details/125111248)
14. [git每次pull以及push代码时都需要输入用户名和密码](https://blog.csdn.net/DcOo_xjw/article/details/129680695)

15. [Manjaro安装详细教程——备份资料](https://www.vinchin.com/blog/vinchin-technique-share-details.html?id=16366)
16. [Manjaro Linux系统安装配置，一篇小白必看入门指南](https://zhuanlan.zhihu.com/p/462061314)
17. [Manjaro](https://cloud.tencent.com/developer/techpedia/1979)
18. [Manjaro强制关闭应用](https://blog.csdn.net/weixin_39417324/article/details/114779828)
19. [Manjaro中文社区](https://linux.zone/category/manjaro-linux)

# Manjaro安装软件遇到的问题
```txt
安装WPS：
yay -S wps-office-cn wps-office-mui-zh-cn
需要先安装base-devel: sudo pacman -S base-devel
``` 
```base
搜狗输入法快捷键冲突解决:
1. 首先打开搜狗的设置文档
sudo vim ~/.config/sogoupinyin/conf/env.ini
2. 然后找到下面这行，将后面的值改为0，保存文件
ShortCutFanJian=1
3. 完成这一步还没结束，还需要修改fcitx的配置文件，打开fcitx的相关配置文件
sudo vim ~/.config/fcitx/conf/fcitx-chttrans.config
4. 然后找到下面这行
#Hotkey=CTRL_SHIFT_F
5. 将前面的注释取消，随便修改一个不常用的快捷键，比如
Hotkey=CTRL_SHIFT_)
6. 然后保存文件，重新登陆即可
```


# 一些常用的命令
```bash
ln -s ../buildSrc buildSrc //文件夹软连接 
git update-index --assume-unchanged .\buildSrc\
```

```bash
查看隐藏文件：ls -a
```

```
Manjaro系统备份
yay  -S timeshift //安装timeshift
sudo timeshift --create  //Timeshift会自动选择备份目录和文件系统。
恢复系统：  在Timeshift的图形界面中选择要恢复的快照，然后点击“恢复”按钮即可。
```
```
Manjaro强制关闭应用
Ctrl + Alt + T打开终端
输入 xkill
然后点击要关闭的应用窗口即可
```
```
Manjaro打开终端的快捷键
Ctrl + Alt + T
```
```
Manjaro安装unzip
yay -S unzip
解压zip命令
unzip fileName
解压到指定路径
unzip fileName -d dir
```

```
Linux下AndroidStudio无权限更新的问题:
Studio does not have write access to /opt/android-studio. Please run it by a privileged user to update 
执行一下命令：sudo chown -R $USER:$USER /opt/android-studio
```

# Jetpack Compose相关

1. [Jetpack-Compose详解](https://blog.csdn.net/m0_37667770/article/details/114542808)
2. [JetpackCompose自定义Loading](https://article.juejin.cn/post/7248608019860684837)


# VSCode
1. [VSCode插件集合](https://blog.csdn.net/YN2000609/article/details/131974148)

# Cladue
1. [Claude无法使用](https://zhuanlan.zhihu.com/p/634114942?utm_source=zhihu&utm_medium=social&utm_oi=967087324971110400)

# MQTT
1. [MQTT学习网址](https://www.emqx.com/)

# Android源码编译
1. [在Manjaro Linux上编译Android源码（1）](https://www.bilibili.com/read/cv12505660/)
2. [史上最简最全，Android AOSP源码阅读+编译环境这一篇就够了](https://zhuanlan.zhihu.com/p/574856795?utm_id=0)


# VirtualBox

1. [VirtualBox虚拟机安装Windows10史上最全安装教程](https://blog.csdn.net/m0_66345324/article/details/129426788)
2. [Host键和显示模式](https://www.cnblogs.com/pandabang/p/14817301.html)

# MPAndroidChart
1. [MPAndroidChart的LineChart（折线图）的个人学习经验](https://www.cnblogs.com/lll333study/p/13698291.html)
2. [安卓图形之MPAndroidChart3.0详解四——案例篇（限制线和覆盖物，组合图）](https://blog.csdn.net/qq_43332570/article/details/103314238)
3. [安卓图形之MPAndroidChart3.0详解一——折线图](https://blog.csdn.net/qq_43332570/article/details/103180779)

# Git
```
git把已添加到跟踪的文件加入ignore
git rm --cached filePath

```
AndroidStudio每次提交都需要输入帐号密码修改
git config --global credential.helper store
```

```


# 向日葵
```
https://blog.csdn.net/P_LarT/article/details/127423101
```
