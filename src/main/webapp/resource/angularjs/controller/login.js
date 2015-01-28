/**
 * Created by jiangyukun on 2015/1/28.
 */

angular.module('login', [])
    .controller('loginController', function ($scope, $http) {
        $scope.message = '';
        $scope.enable = false;
        $scope.btnState = function btnState() {
            return $scope.message != 'ok';
        };
        $scope.blur = function () {
            if (!$scope.mobile) {
                $scope.message = '输入手机号';
                return;
            }
            $http.get('/user/checkMobile', {
                params: {
                    'mobile': $scope.mobile
                }
            }).success(function (data) {
                $scope.message = data;
            });
        };
    });
