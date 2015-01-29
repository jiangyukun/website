/**
 * Created by jiangyukun on 2015/1/28.
 */

angular.module('login', [])
    .controller('loginController', function ($scope, $http, $window) {
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
        $scope.submit = function () {
            $http({
                url: '/user/userLogin',
                method: 'POST',
                params: {
                    mobile: $scope.mobile,
                    password: hex_md5($scope.password)
                }
            }).success(function (text) {
                if (text === '1') {
                    $window.location.href = '/index';
                } else {
                    $scope.password = '';
                    $scope.loginResult = '登录失败';
                }
            });
        };
    });
