$(function() {
	var application = new App();
});

function App() {
	this.init();
};

App.prototype = {
	constructor : App,
	
	init: function() {
		console.log("Initializing the application...");
		
		this.testInheritPrototype(new ParentClass("yo"));
		this.testInheritPrototype(new ChildClass("yo"));
	},
	
	testInheritPrototype : function(object) {
		object.setPrivateProperty("yooo");
		object.toString();
		object.method();

		console.log('Is object an instance of ParentClass?', object instanceof ParentClass);
		console.log('Is object an instance of ChildClass?', object instanceof ChildClass);
		console.log(object);
	},
}