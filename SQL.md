### MySql基本用法
 1. 登录: sudo mysql -u root -p mopeng
 2. 显示数据库: show databases;
 3. 使用数据库: use databasename;
 4. MySql8.0授权用户语句:  
    a. 创建用户: CREATE USER 'mopeng'@'%' IDENTIFIED BY 'mopeng'  
    b. GRANT ALL PRIVILEGES ON *.* TO 'mopeng'@'%' WITH GRANT OPTION;
 5. Ubuntu为文件夹增加权限
    a. sudo chmod 600 xxx (只有所有者有读写权限)
    b. sudo chmod 644 xxx (所有者有读写权限，组用户只有读的权限)
    c. sudo chmod 700 xxx (只有所有者有读写和执行的权限)
    d. sudo chmod 666 xxx (每个人都有读写权限)
    e. sudo chmod 777 xxx (每个人都有读写和执行权限)

### MySql有用的网址
 1. [Ubuntu下开放MySql权限](https://blog.csdn.net/weixin_39589455/article/details/126445394)


### Linux下安装AndroidStudio并设置为图标可启动
    ```txt
     去官网下载Android Studio的安装包，然后解压缩到随便一个目录

     tar -zxvf android-studio*.tar.gz -C /home/leo/
     然后可以去bin目录下检验可否运行
     cd /home/leo/android-studio/bin/
     ./studio.sh
     想要从图标直接点击运行我们还需要创建快捷链接
     创建程序引用链接
     sudo ln -s /home/leo/android-studio/bin/studio.sh /usr/bin/android-studio
     创建启动图标
     sudo vim /usr/share/applications/android-studio.desktop
     然后编辑内容为

     [Desktop Entry]
     Type=Application
     Name=Android studio
     Comment=Android Studio integrated Development Environment
     Icon=/home/leo/android-studio/bin/studio.png  //图标位置
     Exec=android-studio
     Terminal=false
