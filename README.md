# HATEOAS (Hypermedia as the Engine of Application State)
  - HATEOAS (Hypermedia as the Engine of Application State) is an architectural pattern that is commonly used in RESTful web services to provide links to related resources within responses.

# Dependencies to add for HATEOAS

Link: https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-hateoas

# Implementation Options:
    1. Custom Format and implementation
        - Difficullt to maintain
    2. Use Standard Implementation 
        - HAL (JSON Hypertext Application Language)
        - Spring HATEOAS: Generate HAL responses with hyperlinks to resources
        
# Image
![image](https://user-images.githubusercontent.com/84695818/234446816-7f9200a5-653a-4ee7-b758-83aaca370cd1.png)

# HATEOAS concepts-

	1. EntityModel
      - EntityModel is a class in Spring HATEOAS that represents a resource with hypermedia links. 
      - It is similar to the RepresentationModel class, but it is specifically designed to wrap domain objects and provide hypermedia links.
      
	2. WebMVCLinkBuilder
      - WebMvcLinkBuilder is a utility class in Spring HATEOAS that provides methods for building hypermedia links in a Spring MVC environment. 
      - It can be used to create links to controller methods, static resources, or external URLs.
