# 依赖查找与依赖注入的对比
### 1、依赖查找和依赖注入是IOC的两种实现方式
### 2、依赖查找通过调用API去主动获取bean.JNDI也是一种依赖查找；
### 3、依赖注入通过配置文件、注解等，由容器自动注入bean
### 4、BeanFactory是spring内建的依赖
### 5、自定义bean 用户自定义的bean，可以进行查找、依赖注入
### 6、BeanFactory可以依赖注入，不能进行查找
### 7、IOC 的两种实现方式是依赖注入 DI 和依赖查找 DL。这两种方式的区别是：DL 是对 Bean 的定位；DI 是对 Bean 属性的操作。