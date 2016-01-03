(function(angular) {
  var ItemFactory = function($resource) {
    return $resource('/items/:id', {
      id: '@id'
    }, {
      update: {
        method: "PUT"
      },
      remove: {
        method: "DELETE"
      }
    });
  };
  
  ItemFactory.$inject = ['$resource'];
  angular.module("book.services").factory("Item", ItemFactory);

  var UserFactory = function($resource) {
    return $resource('/users/:email', {
      id: '@email'
    }, {
      update: {
        method: "PUT"
      },
      remove: {
        method: "DELETE"
      }
    });
  };

  UserFactory.$inject = ['$resource'];
  angular.module("book.services").factory("User", UserFactory);
}(angular));