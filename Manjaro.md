
# Manjaro相关

1. [Manjaro/Arch 软件配置安装](https://blog.csdn.net/weixin_52802958/article/details/118368908)
2. [manjaro安装相关](https://blog.csdn.net/qq_19954537/article/details/124868508)
3. [Manjaro 21安装搜狗输入法](http://e.betheme.net/article/show-428532.html?action=onClick)
4. [Manjaro入坑](https://blog.csdn.net/qq_46079815/article/details/128250103)
5. [Manjaro Linux安装配置](https://blog.csdn.net/weixin_28839629/article/details/112673168)
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
20. [Manjaro配置大全](https://ispacesoft.com/238303.html)
21. [Manjaro KDE 调教配置及美化](https://zhuanlan.zhihu.com/p/460826583?utm_id=0)
22. [zsh配置](https://zhuanlan.zhihu.com/p/441676276?utm_id=0)
23. [Manjaro Linux下炫酷zsh的安装配置](https://linux.zone/1306)
24. [Manjaro基本配置](https://zhuanlan.zhihu.com/p/139388970?ivk_sa=1024320u)
25. [Arch Linux (Manjaro) 配置与常用软件安装指南](https://blog.kaaass.net/archives/1205#toc-4)
26. [Arch Linux (Manjaro) 配置与常用软件安装指南](https://cloud.tencent.com/developer/article/1934651?areaSource=106000.13&traceId=F7YuhUXTozykVYep6o-Mh)
27. [oh-my-zsh美化](https://zhuanlan.zhihu.com/p/378627601?utm_id=0)
28. [ArchLinux 安装指南（新手向）](https://www.mivm.cn/archlinux-installation-guide-simple)

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

```
Manjaro配置Wireguard
uname -a //查看内核
yay -S linux-headers //安装Wireguard内核，需要安装与系统内核相同版本的内核
yay -S wireguard-tools
将配置文件复制到：
/etc/wireguard
Manjaro启动wireguard
wg-quick up mopeng
```

```shell
# manjaro和Windows双系统下，windows时间不正确问题
sudo timedatectl set-local-rtc true
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
```
Manjaro打开系统监视器
gnome-system-monitor
```

```text
Manjaro设置WireGuard开机执行wg-quick up
打开终端，输入以下命令创建一个 systemd 服务文件：
sudo vim /etc/systemd/system/wg-quick-up.service
在文件中输入以下内容：
[Unit]
Description=WireGuard VPN tunnel up
After=network-online.target

[Service]
Type=oneshot
ExecStart=/usr/bin/wg-quick up [YOUR_TUNNEL_NAME]

[Install]
WantedBy=multi-user.target
将 [YOUR_TUNNEL_NAME] 替换为您要启动的 WireGuard 隧道的名称。

保存文件并退出 vim.

使用以下命令启用新服务：

sudo systemctl enable wg-quick-up.service
使用以下命令启动新服务：
sudo systemctl start wg-quick-up.service
检查服务是否正在运行：
sudo systemctl status wg-quick-up.service
```
```text
manjaro查看某个软件是否安装命令:
which [软件名]
```
```shell
    #查看当前程序
    top -b -n 1 | grep 程序名
```

### Linux下添加网络接口的IP地址
```tex
ip addr add命令用于在Linux系统中添加网络接口的IP地址。它的基本语法如下：

ip addr add ip/netmask dev interface
其中：

ip是IP地址，格式为A.B.C.D。
netmask是子网掩码，格式为A.B.C.D。
interface是网络接口名称，例如eth0或wlan0。
例如，要为eth0接口添加IP地址192.168.1.100，子网掩码为255.255.255.0，可以使用以下命令：

ip addr add 192.168.1.100/255.255.255.0 dev eth0
如果需要设置网关地址，可以使用以下命令：

ip addr add 192.168.1.100/255.255.255.0 dev eth0 gateway 192.168.1.1
如果需要设置DNS服务器地址，可以使用以下命令：

ip addr add 192.168.1.100/255.255.255.0 dev eth0 gateway 192.168.1.1 dns1 8.8.8.8 dns2 8.8.4.4
注意事项

添加IP地址后，需要重启网络才能生效。
不同设备的网络接口名称可能不同，请根据实际情况进行调整。
```

### Linux Grub问题说明
```shell
   # 使用ls查看磁盘分区
   ls 
   # 使用ls (hd0,gpt5)/ 查看文件系统,找到有/boot目的的分区
   ls (hd0,gpt5)/
   # 设置根分区和引导路径
   set root=(hd0,gpt5)
   set prefix=(hd0,gpt5)/boot/grub
   # 加载必要的模块并引导
   insmod normal
   normal
   # 进入系统后，安装grub
   sudo update-grub
   sudo grub-install /dev/nvme0n1
```


# Jetpack Compose相关

1. [Jetpack-Compose详解](https://blog.csdn.net/m0_37667770/article/details/114542808)
2. [JetpackCompose自定义Loading](https://article.juejin.cn/post/7248608019860684837)
```text
Jetpack-Compose多平台版本修改SelectionContainer或者TextField右键提示词的方法
LocalLocalization provides RememberPlatformLocalization()
@Composable
fun RememberPlatformLocalization(): PlatformLocalization {
    return object :PlatformLocalization{
        override val copy: String
            get() = "复制"
        override val cut: String
            get() = "剪切"
        override val paste: String
            get() = "粘贴"
        override val selectAll: String
            get() = "全选"

    }
}
查看：androidx.compose.ui.platform.PlatformLocalization.desktop.kt文件
```
2. [JetpackCompose从入门到实战学习笔记8—ConstraintLayout的简单使用](https://blog.csdn.net/u012556114/article/details/128989773)
3. [Compose-jb图片加载库load-the-image](https://blog.csdn.net/qq_33505109/article/details/125194044)
4. [Jetpack Compose - - Modifier 系列文章 ](https://blog.csdn.net/pepsimaxin/category_12506185.html)


# VSCode
1. [VSCode插件集合](https://blog.csdn.net/YN2000609/article/details/131974148)

# Cladue
1. [Claude无法使用](https://zhuanlan.zhihu.com/p/634114942?utm_source=zhihu&utm_medium=social&utm_oi=967087324971110400)

# MQTT
1. [MQTT学习网址](https://www.emqx.com/)

# Android源码编译
1. [在Manjaro Linux上编译Android源码（1）](https://www.bilibili.com/read/cv12505660/)
2. [史上最简最全，Android AOSP源码阅读+编译环境这一篇就够了](https://zhuanlan.zhihu.com/p/574856795?utm_id=0)
3. [Kotlin实战指南](https://blog.csdn.net/zhaoyanjun6/category_9285613.html?spm=1001.2014.3001.5482)
4. [Android11 实现有线网络和wifi共存](https://blog.csdn.net/wenzhi20102321/article/details/133913924)
5. [Android 指定有线网或Wifi进行网络请求](https://blog.csdn.net/wenzhi20102321/article/details/133950336?spm=1001.2014.3001.5502)
6. [Android/Linux设备有线&无线 双网共存（同时上内、外网）](https://howiexue.blog.csdn.net/article/details/75937972?spm=1001.2101.3001.6650.2&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-2-75937972-blog-133950336.235%5Ev40%5Epc_relevant_default_base&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-2-75937972-blog-133950336.235%5Ev40%5Epc_relevant_default_base&utm_relevant_index=5&ydreferer=aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlbnpoaTIwMTAyMzIxL2FydGljbGUvZGV0YWlscy8xMzM5NTAzMzY%2Fc3BtPTEwMDEuMjAxNC4zMDAxLjU1MDI%3D)
7. [关闭和打开以太网](https://blog.csdn.net/romygreat/article/details/118694885)
8. [调用Android原生@SystemApi、@Hide方法和解决混淆问题](https://blog.csdn.net/u010248147/article/details/114533730)
9. [Android多网络环境（wifi,mobile）下强制在某个网络(mobile)访问服务端以及适配](https://blog.csdn.net/qq_35559358/article/details/77961979?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_baidulandingword~default-8-77961979-blog-72886859.235^v40^pc_relevant_3m_sort_dl_base1&spm=1001.2101.3001.4242.5&utm_relevant_index=11)
10. [Android app 指定网络发送数据包的实现与原理分析](https://blog.csdn.net/dongziqi_csdn/article/details/111405109)
11. [Android中利用Camera与Matrix实现3D效果详解](https://blog.csdn.net/zhangke3016/article/details/52093776)
12. [从零开始打造一个Android 3D立体旋转容器](https://blog.csdn.net/mr_immortalz/article/details/51918560)
13. [安卓自定义View进阶-Matrix Camera](https://www.gcssloop.com/customview/matrix-3d-camera.html)

```
在AndroidStudio中统计代码行数
find ./app/src/main/java/com/v2effistation -name "*.java" -or -name "*.kt" | xargs wc -l
```

```shell
#android中一些常用的命令
adb shell pidof packagename #在adb命令中查看某个包的#进程，查看此程序是否在运行
adb logcat | grep "packagename" #在adb命令中查看某个包的日志
adb pull /devicepath /localpath #从设备复制文件到本地
adb shell rm file_path
adb shell tar -czvf compressed_file.tar.gz files_to_compress
```


# VirtualBox

1. [VirtualBox虚拟机安装Windows10史上最全安装教程](https://blog.csdn.net/m0_66345324/article/details/129426788)
2. [Host键和显示模式](https://www.cnblogs.com/pandabang/p/14817301.html)

# MPAndroidChart
1. [MPAndroidChart的LineChart（折线图）的个人学习经验](https://www.cnblogs.com/lll333study/p/13698291.html)
2. [安卓图形之MPAndroidChart3.0详解四——案例篇（限制线和覆盖物，组合图）](https://blog.csdn.net/qq_43332570/article/details/103314238)
3. [安卓图形之MPAndroidChart3.0详解一——折线图](https://blog.csdn.net/qq_43332570/article/details/103180779)
4. [Android 一步步实现曲线图、折线图、柱状图、雷达图，动态心跳图](https://blog.csdn.net/gao511147456/article/details/108412584)

# Git
```shell
#git把已添加到跟踪的文件加入ignore
git rm -r --cached filePath
```

```shell
#AndroidStudio每次提交都需要输入帐号密码修改
git config --global credential.helper store

github token:
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

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

#跟踪但是不提交某个文件： 
git update-index --assume-unchanged 您的文件
#取消跟踪但是不提交某个文件
git update-index --no-assume-unchanged build-profile.json5
```

```tex
Manjaro下github仓库添加大文件:
1. 安装git lfs: yay -S git-lfs
2. 配置lfs: git config --global lfs.url https://git-lfs.github.com
3. 添加文件到lfs: git lfs track <文件名>
4. 提交文件： git commit -m "Add my-large-file.zip to Git LFS"
5. push到github: git push
6. 下载文件: git lfs pull
```


1. [github连接报"ssh: connect to host github.com port 22: Connection timed out"错误](https://www.cnblogs.com/Lutheran/p/15915295.html)

# 向日葵
```tex
Manjaro下安装向日葵
yay -S sunloginclient
设置启动向日葵服务:sudo systemctl start runsunloginclient.service
设置开机启动:sudo systemctl enable runsunloginclient.service
```
 1. [Linux下向日葵的使用](https://blog.csdn.net/P_LarT/article/details/127423101)


# 油猴
```
https://greasyfork.org/zh-CN
```

# Typora
```
Typora添加UML图
在Typora中输入"```mermaid",就会初始化一张空白图
时序图：
语法解释：->> 代表实线箭头，-->> 则代表虚线。
   sequenceDiagram
    Alice->>John: Hello John, how are you?
    John-->>Alice: Great!
```
1. [使用 Typora 画图（类图、流程图、时序图）](https://zhuanlan.zhihu.com/p/172635547?utm_id=0)
2. [Picgo + Typora配置](https://zhuanlan.zhihu.com/p/644127992)

# zlibrary
1. [zlibrary -cn](https://zh.z-library.se/)

# clash
1. [订阅链接转换](https://acl4ssr-sub.github.io/)
2. [clashgithub](https://clashgithub.com/)


# Qv2ray

```text
另外，你如果有配置 archlinuxcn 源，可以直接 sudo pacman -S qv2ray-dev-git 安装最新的预览版。
对应的插件可以通过 yay -S <插件AUR仓库名> 来进行安装，分别有：

qv2ray-plugin-command-dev-git
qv2ray-plugin-ssr-dev-git
qv2ray-plugin-trojan-dev-git
这些可选。

Manjaro系统升级后QV2ray无法正常使用，报缺失文件的错误。可以通过备份把缺失的文件复制到/usr/lib目录下。
```
1. [找不到lib库](https://blog.csdn.net/rjszz1314/article/details/114951124)

# ModBus
1. [java对接modbus rtu协议设备](https://blog.csdn.net/weixin_42612454/article/details/120728930)
2. [ModBus通讯协议（Java代码实例）](https://www.jianshu.com/p/614775616620)
3. [Java实现ModbusTCP通信](https://www.cnblogs.com/ioufev/p/10831289.html)
4. [Java 零基础入门物联网(1):Modbus 协议详解](https://juejin.cn/post/7218459472919150650)
5. [java实现Modbus通信](https://blog.51cto.com/beyondyinjl/4932820)
6. [Modbus在Java中使用总结](https://blog.csdn.net/neusoft2016/article/details/127725957)
7. [MODBUS RTU 485 协议简要说明](https://juejin.cn/post/7151966651594833951)
8. [Modbus4J在安卓系统下的使用](https://huijizyf.github.io/2016/11/15/Modbus4J%E5%9C%A8%E5%AE%89%E5%8D%93%E7%B3%BB%E7%BB%9F%E4%B8%8B%E7%9A%84%E4%BD%BF%E7%94%A8/)
9. [Android 端使用Modbus](https://juejin.cn/post/7025874710181183496)
10. [安卓与串口通信-modbus篇](http://www.likehide.com/blogs/android/android_using_serial_port_with_plc_modbus/)
11. [安卓与串口通信](http://www.likehide.com/series/%E5%AE%89%E5%8D%93%E4%B8%8E%E4%B8%B2%E5%8F%A3%E9%80%9A%E4%BF%A1/)
12. [modbus-TCP协议详解](https://zhuanlan.zhihu.com/p/666160134)


# 图片转换网址
1. [Favicon.io](https://favicon.io/)

# Scrcpy
1. [Scrcpy参数说明](https://blog.51cto.com/u_9843231/7266008)



# CRC-16算法
```kotlin
fun calculateCRC16(data: ByteArray): Int {
    var crc = 0xFFFF

    for (byte in data) {
        crc = crc xor (byte.toInt() and 0xFF)
        repeat(8) {
            if ((crc and 0x0001) != 0) {
                crc = (crc ushr 1) xor 0xA001
            } else {
                crc = crc ushr 1
            }
        }
    }

    // Swap low and high bytes
    return ((crc and 0xFF) shl 8) or ((crc ushr 8) and 0xFF)
}

fun main() {
    val data = "Hello, CRC-16!".toByteArray(Charsets.UTF_8)
    val crc16 = calculateCRC16(data)
    println("CRC-16 (Little Endian): 0x${crc16.toString(16).toUpperCase()}")
}
```

## ADB命令
```shell
使用adb压缩设备上从文件，并下载到本地
adb shell tar -cvzf /sdcard/logs/today.tar.gz /sdcard/logs/iot-manager.log

//adb下载文件
adb pull /sdcard/logs/today.tar.gz /localpath

adb删除文件
adb shell rm /filePath
adb shell rm -r /directoryPath

adb查看设备分辨率
adb shell wm size
```

## Go代理超时解决
```sh
更改go的代理地址
go env -w GOPROXY=https://goproxy.cn
```

### LibreOffice
```text
1. 设置为中文:
   yay -S libreoffice-fresh-zh-cn
   之后打开LibreOffice，依次点击Tools->Options->Language Settings->Languages点击切换到简体中文
```

### Manajro下安装Rust
```text
1.安装Rust
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh
2. 设置环境变量
source $HOME/.cargo/env
3. 查看版本
rustc --version
4. 更新rust
rustup update
5. 添加额外的组件和工具链
# 安装 rust-src
rustup component add rust-src
# 安装 nightly 版本
rustup toolchain install nightly

```

1. [Rust语言实战](https://practice-zh.course.rs/why-exercise.html)
2. [Rust语言圣经](https://course.rs/into-rust.html)
3. [Rust中文社区](https://rustcc.cn/)
4. [Rust中文文档](https://rustwiki.org/)
5. [Rust官方文档](https://www.rust-lang.org/zh-CN/)
6. [Rust包管理网站](https://crates.io/)
7. [Rust语言文档](https://prev.rust-lang.org/zh-CN/documentation.html)
8. [Rust交叉编译](https://www.jtianling.com/cross-compile-with-rust.html)
9. [Dioxus 中文网](https://www.dioxus.cn/docs/intro)
10. [Dioxus开发指南](https://dioxus.mrxzx.info/docs/setup.html)
11. [Diesel 基础](https://blog.csdn.net/chinus_yan/article/details/130529036)
12. [rust编译成so库](https://blog.csdn.net/henghengzheng/article/details/134311469)
13. [Rust在windows下SQLite错误解决](https://blog.itdevwu.com/post/915/)
14. [Rust100练习](https://colobu.com/rust100/)
    
#### rust中遇到的问题
```shell
# /usr/bin/ld: cannot find -lxdo: No such file or directory
# Manjaro下下载xdotool
yay -S xdotool
```
```text
Windows下Rust编译无法链接到sqlite3.lib解决，把sqlite.dll复制到.cargo/bin目录下
```

```shell
## 静态编译
RUSTFLAGS='-C target-feature=+crt-static' cargo build --release --target=armv7-unknown-linux-gnueabihf 
```
```shell
工作空间目录软连接： ln -s ../lib-core ./
```

## Linux
1. [Linux软件网](https://www.linuxpack.net/)
2. [Linux命令大全(手册)](https://www.linuxcool.com/)
3. [Linux教程网](https://www.linuxjiaocheng.com/)

## VPN
1. [v2ray免费节点](https://www.v2rayfree.eu.org/)

## 可视化
1. [Grafana](https://grafana.com/zh-cn/grafana/?pg=graf&plcmt=hero-btn-1)

## ThinkPad系统重装
1. [系统重装流程](https://iknow.lenovo.com.cn/detail/199249.html)

## MySQL
```sql
--初始化mysql
sudo mysqld --initialize --user=mysql --basedir=/usr --datadir=/var/lib/mysql
--启动mysql
sudo systemctl start mysqld
--停止mysql
sudo systemctl stop mysqld
--登录mysql
mysql -u root -p
--更改用户密码
ALTER USER 'username'@'localhost' IDENTIFIED BY 'new_password';
--mysql配置文件路径
/etc/mysql/mysql.conf
```

## Redis
```sh
#启动redis
sudo systemctl start redis
#验证redis是否在运行
sudo systemctl status redis
```

#手动启动redis
# 1.进入 Redis 安装目录：
```
cd /usr/local/redis
# 2. 启动 Redis 服务端：
./redis-server /etc/redis/redis.conf
# 3. 验证 Redis 是否正在运行：
redis-cli ping
```

## VS Code

1. [VS Code画思维导图：Graphviz Markdown Preview](https://tinycool.blog.csdn.net/article/details/134160036)
2. [颜色配置官网](https://glitchbone.github.io/vscode-base16-term/#/default-dark)

## HarmonyOS
1. [HarmonyOS官网](https://device.harmonyos.com/)
2. [HarmonyOS学习官网](https://developer.huawei.com/consumer/cn/training/)
3. [ArkTS基础学习笔记](https://blog.csdn.net/Glubin/article/details/134361951)
4. [ArkTS文档](https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V2/arkts-common-components-text-display-0000001504880745-V2)
5. [鸿蒙第三方开源项目集合](https://gitee.com/openharmony-tpc/tpc_resource)
6. [OpenHarmony文档](https://gitee.com/openharmony/docs)
7. [鸿蒙软总线教程](https://www.ebaina.com/articles/140000013053)
8. [鸿蒙分布式软总线技术研究](https://www.cnblogs.com/ikariShinji/p/14348415.html)
9. [深度解读设备的“万能语言”鸿蒙的分布式软总线能力](https://bbs.huaweicloud.com/blogs/detail/239194)
10. [OpenHarmony 实战开发——软总线解析](https://blog.csdn.net/m0_70748458/article/details/138958136)
11. [自由流转介绍](https://developer.huawei.com/consumer/cn/training/course/slightMooc/C101705112214146396)
12. [HarmonyOS NEXT Developer Beta1](https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/kgraphics-3d_uff08_u65b9_u821f3d_u56fe_u5f62_uff09-V5)
13. [鸿蒙开发者学堂](https://developer.huawei.com/consumer/cn/training/result?type1=101718934267126043)
14. [鸿蒙应用开发导读](https://developer.huawei.com/consumer/cn/doc/harmonyos-guides-V5/application-dev-guide-V5)

### 鸿蒙中一些常用命令
```shell
   #使用命令启动一个程序
   hdc shell aa start -b com.dh.blt -a ApplicationAbility
   #上传文件到设备
   hdc file send C:\work\ohos\start_service.hap /data 
   #下载文件到本地
   hdc file recv /etc/app/install_list_capability.json C:\work\ohos 
   #安装hap
   hdc install C:\work\ohos\blt.hap 
   #使用bm安装程序
   hdc shell bm install -p /data/start_service.hap -u 0 
   #获取设备的UUID
   hdc shell bm get --udid
   #为应用签名
   java -jar hap-sign-tool.jar sign-app -keyAlias "******" -signAlg "SHA256withECDSA" -mode "localSign" -appCertFile "******.cer" -profileFile "******.p7b" -inFile "******.hap" -keystoreFile "******.p12" -outFile "result\******.hap" -keyPwd "******" -keystorePwd "******" -signCode "1"
```

## Ubuntu
```shell
apt-cache search visual-studio-code // 搜索
```

## Python
```shell
Manjaro中安装python库命令:
yay -Syu python-xxxxx
```

## Windows
```
windows家庭版没有Hyper-V虚拟化，需手动安装：
pushd "%~dp0"
 
dir /b %SystemRoot%\servicing\Packages\*Hyper-V*.mum >hv.txt
 
for /f %%i in ('findstr /i . hv.txt 2^>nul') do dism /online /norestart /add-package:"%SystemRoot%\servicing\Packages\%%i"
 
del hv.txt
 
Dism /online /enable-feature /featurename:Microsoft-Hyper-V -All /LimitAccess /ALL
 
Pause
```
#### windows下软连接
```text
   mklink /J lib-common ..\lib-common
```

### WSL问题收集
```shell
# 1. 运行GUI程序中文乱码的问题,wsl2中缺少中文字体
# 解决方案，可以向系统存放字体的文件夹中添加Windows系统中的中文字体，（可以添加字体文件，不过用软连接可能会更棒些，因为节约硬盘资源）
sudo mkdir /usr/share/fonts/win11 # to differentiate self-built font links from system font files 
sudo ln -s /mnt/c/Windows/Fonts/* /usr/share/fonts/win11

```