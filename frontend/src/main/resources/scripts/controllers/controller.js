angular.module('DateApp')

.controller('DateController', ['$scope', '$resource', function ($scope, $resource) {
    $resource("http://localhost:8080/api/date").get({}, function(data) {
        $scope.currentDate = data.currentDate;
    });
}]);