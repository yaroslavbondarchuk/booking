(function(angular) {
  angular.module("book.controllers", []);
  angular.module("book.services", []);
  angular.module("book", ["ngResource", "book.controllers", "book.services"]);
}(angular));