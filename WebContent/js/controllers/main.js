function MainCtrl($scope, $routeParams, $http) {
	$http.get("ServletOne")
	.success(function(data, status, headers, config) {
	    $scope.data = data;
	}).error(function(data, status, headers, config) {
	    $scope.status = status;
	});
};