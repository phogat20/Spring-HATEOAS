	@GetMapping("/allfuels/{id}")
	public EntityModel<User> getFuels(@PathVariable Integer id) {
		User user = userRepo.findById(id);
    
		EntityModel<Fuel> entityModel = EntityModel.of(user);
    WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUsers();
    entityMode.add(link.withRel("all-users"));                              
		return entityModel;
	}
 
// 	# HATEOAS concepts-

// 	1. EntityModel
//       - EntityModel is a class in Spring HATEOAS that represents a resource with hypermedia links. 
//       - It is similar to the RepresentationModel class, but it is specifically designed to wrap 
//	   domain objects and provide hypermedia links.
      
// 	2. WebMVCLinkBuilder
//       - WebMvcLinkBuilder is a utility class in Spring HATEOAS that provides methods for
//           building hypermedia links in a Spring MVC environment. 
//       - It can be used to create links to controller methods, static resources, or external URLs.
                                    
                                    
