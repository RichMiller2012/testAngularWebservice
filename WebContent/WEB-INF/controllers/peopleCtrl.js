var app = angular.module('app', [])

    app.
    config(function($httpProvider){
    delete $httpProvider.defaults.headers.common['X-Requested-With'];
    });

    app.controller('peopleCtrl', function($scope, $http){
    $http({method: 'GET', url: 'http://localhost:8080/JsonFactory/service/person',
            headers:{
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE, OPTIONS',
                'Access-Control-Allow-Headers': 'Content-Type, X-Requested-With',
                'X-Random-Shit':'123123123'
            }})
        .success(function(d){ console.log( "yay" ); })
        .error(function(d){ console.log( "nope" ); });

});
/**
    app.controller('peopleCtrl', function($scope, $http){
      $http.get('http://localhost:8080/JsonFactory/service/person')
      .success(function(response){

        $scope.people = response.data;
      });
    });

    **/
