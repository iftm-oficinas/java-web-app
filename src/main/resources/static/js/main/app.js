angular.module("myModule", []).controller("home", function($http) {
	var self = this;
	$http.get("/resource/").then(function(response) {
		self.message = response.data;
	});
});