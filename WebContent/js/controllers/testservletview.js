function TestCtrl($scope, $routeParams, $http) {
	$http.post("ServletOne", {"firstName":"Bob", "lastName" : "Smith"})
	.success(function(data, status, headers, config) {
	    $scope.data = data;
	}).error(function(data, status, headers, config) {
	    $scope.status = status;
	});
};

