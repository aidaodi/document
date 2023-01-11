### MySql基本用法
 1. 登录: sudo mysql -u root -p mopeng
 2. 显示数据库: show databases;
 3. 使用数据库: use databasename;
 4. MySql8.0授权用户语句:  
    a. 创建用户: CREATE USER 'mopeng'@'%' IDENTIFIED BY 'mopeng'  
    b. GRANT ALL PRIVILEGES ON *.* TO 'mopeng'@'%' WITH GRANT OPTION;
 5. MySql 8.0为root用户增加密码  
    select host, user, authentication_string from mysql.user;   

    update user set authentication_string='' where user='root';#密码设置为空  

    ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'mypwd#2019'
 6. Ubuntu为文件夹增加权限  
    a. sudo chmod 600 xxx (只有所有者有读写权限)  
    b. sudo chmod 644 xxx (所有者有读写权限，组用户只有读的权限)  
    c. sudo chmod 700 xxx (只有所有者有读写和执行的权限)  
    d. sudo chmod 666 xxx (每个人都有读写权限)  
    e. sudo chmod 777 xxx (每个人都有读写和执行权限)  

### MySql有用的网址
 1. [Ubuntu下开放MySql权限](https://blog.csdn.net/weixin_39589455/article/details/126445394)
 2. [安装Ubuntu Linux系统时硬盘分区](https://blog.csdn.net/Dejan520/article/details/123446157)
 3. [Ubuntu22.04点击.appimage软件不运行](https://blog.csdn.net/Paramagnetism/article/details/124956975)
 4. [Linux下安装MySql](https://www.w3cschool.cn/mysql/mysql-2i4k2owh.html)


### Linux下安装AndroidStudio并设置为图标可启动
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

### Linux下安装JDK
   sudo apt install openjdk-11-jre-headless  # version 11.0.17+8-1ubuntu2~22.04,   
   sudo apt install default-jre              # version 2:1.11-72build2  
   sudo apt install openjdk-17-jre-headless  # version 17.0.5+8-2ubuntu1~22.04  
   sudo apt install openjdk-18-jre-headless  # version 18.0.2+9-2~22.04  
   sudo apt install openjdk-19-jre-headless  # version 19.0.1+10-1ubuntu1~22.04  
   sudo apt install openjdk-8-jre-headless   # version 8u352-ga-1~22.04

### Linux安装Git
    sudo apt update 
    sudo apt install -y git  
    git --version 
    git config --global user.name "your_name"  
    git config --global user.email "email@rezhuji.com" 
    git config --list 
    ssh-keygen -t rsa -C "your email"再回车3次 
    cat ~/.ssh/id_rsa.pub 

### Linux下安装MySql
    sudo apt update 
    sudo apt install -y  mysql-server

### Ubuntu开启SSH
    1. 检测环境: ps -e | grep ssh
    2. 安装SSH： sudo apt-get install ssh
    3. 启动SSH： sudo /etc/init.d/ssh start

### Ubuntu开放端口
    1. 首先安装iptables（一般情况，ubuntu默认是安装好的）：  
      sudo apt-get update
      sudo apt-get install iptables
    2. 开放端口： sudo iptables -I INPUT -p tcp --dport 8080 -j ACCEPT
    3. 临时保存: sudo iptables-save
    4. 永久保存： sudo apt-get install iptables-persistent
    5. sudo netfilter-persistent save
    6. sudo netfilter-persistent reload
   
   
### Ubuntu安装Tomcat
    1. 下载Tomcat: https://tomcat.apache.org/download-80.cgi
    2. sudo tar -zxvf apache-tomcat-8.5.79.tar.gz -C /usr/local #解压到/usr/local/目录下
    3. cd /usr/local  
    4. sudo chmod 755 -R apache-tomcat-8.5.79 #修改文件夹权限，否则无法进入
    5. cd /usr/local/apache-tomcat-8.5.79/bin
    6. sudo vim catalina.sh
    7. export JAVA_HOME=/usr/local/jdk1.8.0_162
    8. export JRE_HOME=/usr/local/jdk1.8.0_162/jre

### Ubuntu安装vim
    1. sudo apt-get install vim-gtk

### Ubuntu配置Jdk
    1. 查看JDK位置: type -p javac
    2. readlink -f 第一步的结果
    3. dirname 第二步的结果
    4. dirname 第三步的结果
    5. sudo vim /etc/profile
    6. export JAVA_HOME=/usr/local/java/jdk1.8.0_141
       export JRE_HOME=${JAVA_HOME}/jre
       export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib:$CLASSPATH
       export JAVA_PATH=${JAVA_HOME}/bin:${JRE_HOME}/bin
       export PATH=$PATH:${JAVA_PATH}
    7. sudo source /etc/profile

### Ubuntu添加源报无签名错误解决
    1. http://archive.ubuntu.com/ubuntu trusty Release: 由于没有公钥，无法验证下列签名： NO_PUBKEY 40976EAF437D05B5 NO_PUBKEY 3B4FE6ACC0B21F32
    2. sudo apt-key adv --keyserver keyserver.ubuntu.com --recv-keys 40976EAF437D05B5
    3. sudo apt-key adv --keyserver keyserver.ubuntu.com --recv-keys 3B4FE6ACC0B21F32
    4. sudo apt-get update
    5. sudo apt-get upgrade 

### Ubuntu防火墙设置
    1.查看防火墙当前状态
      sudo ufw status
    2.开启防火墙
      sudo ufw enable
    3.关闭防火墙
      sudo ufw disable
    4.查看防火墙版本
      sudo ufw version
    5.默认允许外部访问本机
      sudo ufw default allow
    6.默认拒绝外部访问主机
      sudo ufw default deny
    7.允许外部访问53端口
      sudo ufw allow 53
    8.拒绝外部访问53端口
      sudo ufw deny 53
    9.允许某个IP地址访问本机所有端口
      sudo ufw allow from 192.168.0.1
