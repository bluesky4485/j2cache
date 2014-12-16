j2cache
=======

修改了开源中国的红薯的j2cache，全部依赖库都升级为最新版本，修改为maven结构，且去掉了hibernate的支持
注意：fst最新版本需要jdk1.7支持

具体的依赖库版本请参考pom文件。

主要修改内容如下：
    1、整个去掉了针对hibernate的支持，不知道是用来干嘛的，暂时在我的业务场景中不使用，且由于原版本中依赖的hibernate版本过低，所以干脆去掉，减少依赖
    2、FSTSerializer中使用FSTConfiguration的方式进行序列化
    3、JGroup更新版本后配置文件的更新
    4、Jedis更新版本后，所依赖的commons-pool库也得相应更新，主要是创建jedispool时使用的poolconfig配置的相关修改
    5、在EhCacheProvider中创建CacheManager时，修改为单例方法CacheManager.getInstance()