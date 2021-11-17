# BasicResearch
用于自己基础学习，了解面试经常问题的精髓，why总是问，有什么作用

1：Spring 生命周期   doing

生命周期
1：实例化 BeanFactoryPostProcessor实现类
https://www.cnblogs.com/zrtqsk/p/3735273.html 
BeanFactoryPostProcessor是实现spring容器功能扩展的重要接口，例如修改bean属性值，实现bean动态代理等。很多框架都是通过此接口实现对spring容器的扩展，例如mybatis与spring集成时，只定义了mapper接口，无实现类，但spring却可以完成自动注入，是不是很神奇？ 本文将通过简单的例子，展现BeanFactoryPostProcessor的扩展能力。
BeanFactoryPostProcessor可以对BeanFactory修改，产生一些新的BeanFactory（及注册新的Bean定义到Bean工厂）
beabFactory创建bean ->bean创建-> bean的引擎安装 ->bean后置处理器->在属性设置afterPropertiesSet->执行初始化方法 -> invoke方法-> 调用initMethod方法->invoke方法
2：

3：

4：

5：

6：

7：

2：Class加载过程   todo
