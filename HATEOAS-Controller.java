	@GetMapping("/allfuels/{id}")
	public EntityModel<User> getFuels(@PathVariable Integer id) {
		User user = userRepo.findById(id);
    
		EntityModel<Fuel> entityModel = EntityModel.of(user);
    WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUsers();
    entityMode.add(link.withRel("all-users"));                              
		return entityModel;
	}
 
	// HATEOAS concepts-
	// - EntityModel
	// - WebMVCLinkBuilder
                                    
                                    
