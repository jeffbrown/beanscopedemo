beans = {
    someServiceProxy(org.springframework.aop.scope.ScopedProxyFactoryBean) {
        targetBeanName = 'someService'
        proxyTargetClass = true
    }
}
