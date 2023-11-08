# xfg-frame-archetype - DDD 脚手架

**备注**：2核4G 可部署整套环境开发学习 [京东云服务器 2核4G 132元/1年或者3年的](https://3.cn/1K-cfT7D)

## Maven - 阿里云镜像

```java
  <!-- mirrors
   | This is a list of mirrors to be used in downloading artifacts from remote repositories.
   |
   | It works like this: a POM may declare a repository to use in resolving certain artifacts.
   | However, this repository may have problems with heavy traffic at times, so people have mirrored
   | it to several places.
   |
   | That repository definition will have a unique id, so we can create a mirror reference for that
   | repository, to be used as an alternate download site. The mirror site will be the preferred
   | server for that repository.
   |-->
  <mirrors>
    <!-- mirror
     | Specifies a repository mirror site to use instead of a given repository. The repository that
     | this mirror serves has an ID that matches the mirrorOf element of this mirror. IDs are used
     | for inheritance and direct lookup purposes, and must be unique across the set of mirrors.
     | 
    <mirror>
        <id>alimaven</id>
        <mirrorOf>central</mirrorOf>
        <name>aliyun maven</name>
        <url>https://maven.aliyun.com/nexus/content/repositories/central/</url>
    </mirror>

  </mirrors>
```

- 没有镜像你可能会出现拉取很慢的问题，以及错误。
