## 1. 什么是Free-Proxy?

Free-Proxy是一个开源代理IP获取库，它使用http的方式从指定网站获取代理IP。

##  

## 2.Free-Proxy的优点

###  

### 2.1 集成简单

通过maven依赖就可以获取代理IP，集成方便。

###  

### 2.2 使用简单

Free-Proxy的API十分简洁。

```
Proxy proxy = Proxys.get();  //获取代理IP

```

###  


## 3. 下载和使用

###  

### eclipse JavaEE平台下载及使用：

- 下载jar包。[最新版jar包下载]；

###  

### 你可以在maven中央仓库中直接下载：

```

```

###  

### 或者配置maven依赖

```xml
<dependency>
    <groupId>com.github.24kbear</groupId>
    <artifactId>free-proxy</artifactId>
    <version>x.x.x</version>
</dependency>
```

其中x.x.x是版本号，根据需要使用特定版本，建议使用最新版本。
