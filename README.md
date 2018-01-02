# jersey-on-tomcat-xmlconfig

The key point of this demo project is to show a xml way of configuring jersey servlet.

```
    <servlet>
        <servlet-name>jersey-serlvet</servlet-name>
        <servlet-class>
            com.sun.jersey.spi.container.servlet.ServletContainer
        </servlet-class>
        <init-param>
            <param-name>com.sun.jersey.config.property.packages</param-name>
            <param-value>com.imarchuang.jersey.demo</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>jersey-serlvet</servlet-name>
        <url-pattern>/rest/*</url-pattern>
    </servlet-mapping>
```
