function ParentClass(value) {
	
	// Initialize the instance properties.​
	this.publicProperty = value;
	
	// These private properties can't be accessed or changed by instances​.
	var privateProperty = null;

	// This is the only way to access the privateProperty variable. 
	this.getPrivateProperty = function() {
		return privateProperty;
	}

	// This is the only way to change the privateProperty variable.
	this.setPrivateProperty = function(value) {
		privateProperty = value;
	}

	this.toString = function() {
		console.log("ParentClass: {" 
				+ "publicProperty: " + this.publicProperty
				+ ", privateProperty: " + this.getPrivateProperty() 
				+ "}"
		);
	}

	this.toString();
};

// Define the prototype methods that will be inherited​, these methods can be overrided.
ParentClass.prototype.method = function() {
	console.log("Not implemented yet!");
};