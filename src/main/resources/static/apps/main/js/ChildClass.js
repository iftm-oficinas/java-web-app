function ChildClass(value) {
	ParentClass.call(this, value);
};

inheritPrototype(ChildClass, ParentClass);

ChildClass.prototype.method = function() {
	console.log("Implemented!");
};