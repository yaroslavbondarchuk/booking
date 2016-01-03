(function(angular) {
  var ItemController = function($scope, Item) {
    Item.query(function(response) {
      $scope.items = response ? response : [];
    });
    
    $scope.addItem = function(name, description) {
      new Item({
        name: name,
        description: description,
        checked: false
      }).$save(function(item) {
        $scope.items.push(item);
      });
      $scope.newItem = "";
    };
    
    $scope.updateItem = function(item) {
      item.$update();
    };
    
    $scope.deleteItem = function(item) {
      item.$remove(function() {
        $scope.items.splice($scope.items.indexOf(item), 1);
      });
    };
  };
  
  ItemController.$inject = ['$scope', 'Item'];
  angular.module("book.controllers").controller("ItemController", ItemController);

  var UserController = function($scope, User) {
    User.query(function(response) {
      $scope.users = response ? response : [];
    });

    $scope.addUser = function(firstName, lastName, email, password) {
      new User({
        firstName: firstName,
        lastName: lastName,
        email: email,
        password: password
      }).$save(function(user) {
            $scope.users.push(user);
          });
      $scope.newUser = "";
    };

    $scope.updateUser = function(user) {
      item.$update();
    };

  };
  UserController.$inject = ['$scope', 'User'];
  angular.module("book.controllers").controller("UserController", UserController);
}(angular));