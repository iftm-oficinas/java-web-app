function ChildClass(value) {
	ParentClass.call(this, value);
};

ChildClass.prototype = Object.create(ParentClass.prototype);
ChildClass.prototype.constructor = ChildClass;

ChildClass.prototype.method = function() {
	console.log("Implemented!");
};

ChildClass.prototype.newMethod = function() {
	console.log("Implemented a new method too!");
};