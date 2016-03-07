angular.module('DateApp').config(function($routeProvider){
	$routeProvider

	.when('/', {
		templateUrl: './views/home.html'
	})
	.otherwise ( { redirectTo: '/' });
});
