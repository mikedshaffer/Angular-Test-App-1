angular.module('app1', []).
	config(['$routeProvider', function($routeProvider) {
	$routeProvider.
		when('/test', {templateUrl: 'views/testservletview.jsp', controller: TestCtrl}).
		otherwise({redirectTo: '/'});
}]);