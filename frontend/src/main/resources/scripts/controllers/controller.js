angular.module('DateApp')

.controller('DateController', ['$scope', '$resource', function ($scope, $resource) {
    $scope.currentDate = "07/03/2016";
}]);