# What is Spring?

Used to manage Java EE projects infrastructure - widely used for microservices -
it provides JEE-like services through something they call "Beans".
Beans are just like POJOs, but their lifecycle is managed by the Spring Framework. 
A few examples of such "services":
* transactional management (e.g. `@Transactional` to manage them via AOP)
* security services
* persistence services (typical server-side infrastructure like resource pooling)
* REST clients (REST templates, webclient, etc. - with Jackson serialization by default)
* DB connection pools (by default using Hikari, used to use Apache DBCP)
* Testing mechanisms

Typically, all these services would require a full-fledged, JEE-compliant server.
Spring's approach is to manage beans to provide these "declaritive services".
"Declaritive" here means we define what we want and how we want it -
no huge amounts of boilerplate code is needed.
A good example is the transaction management which, via Spring AOP,
injects code to start and end transactions as needed.

To achieve the implementation of these services, Spring relies on a bunch of OSS.
Apache libraries, and others, are widely used for spring to provide what it does.
In Spring multiple Interfaces and default implementations exist for all sorts of things.
By the way, classes here often have very long names, as means to be very descriptive.

# Spring Dependency Injection

Dependency injection is on the basis on how Spring operates.
This is meta-data that we set up, so that Spring brings up required beans for things to work.
Meta data configuration is done via one of more of the following methods:
* XML / YAML files (a bit on the legacy side but still widely used)
* Java annotations (on classes, methods and even fields)
* Java configuration classes

Managed beans are maintained by Spring and kept in an internal, "lightweight" container.
This container goes by the name of "Application Context".
`ApplicationContext` is one of the main Spring Java interfaces that we can use to query beans.

Spring does provide a plethora of interfaces and default implementations - 3 times more than JEE.
Still, its memory footprint is many times smaller than a full-fledged, JEE-compliant server.
This is where Spring shines the most - providing same functionality for a lower cost.

# What does SpringBoot bring in?

It makes it much easier to bootstrap Spring application via automatic set up mechanisms.
Based on dependencies defined classpath, different beans for different functions are provided.
For example, adding JDBC driver dependency will lead to default DataSource bean to be created.

Or adding `spring-boot-starter-web` as a dependency will bring in tomcat into your app,
which is recurrently used as a basis to run a JAR as an independent service.
No more WARs being deployed in separate, heavy application servers.
It also automatically brings in all required facilities for REST services.
REST services will simply serialize and return Java POJOs in the form of JSONs.

Such dependency "starters" can be easily added from scratch in [Spring Initializr](https://start.select.io).
Simply click "Add Dependencies..." and select the starters you want.

Know also that all this is highly configurable.
For example, you can always generate a WAR instead of JAR.
