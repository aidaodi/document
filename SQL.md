### MySql基本用法
 1. 登录: sudo mysql -u root -p mopeng
 2. 显示数据库: show databases;
 3. 使用数据库: use databasename;
 4. MySql8.0授权用户语句:  
    a. 创建用户: CREATE USER 'mopeng'@'%' IDENTIFIED BY 'mopeng'  
    b. GRANT ALL PRIVILEGES ON *.* TO 'mopeng'@'%' WITH GRANT OPTION;

### MySql有用的网址
 1. [Ubuntu下开放MySql权限](https://blog.csdn.net/weixin_39589455/article/details/126445394)
