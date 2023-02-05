<template>
	<view>
		<image src="../../static/logo-2.png" mode="widthFix" class="logo"></image>
		<view class="register-container">
			<input type="text" placeholder="输入你的邀请码" class="register-code" maxlength="6" v-model="registerCode" />
			<view class="register-desc">管理员创建员工证账号之后，你可以从你的个人邮箱中获得注册邀请码</view>
			<button class="register-btn" open-type="getUserInfo" @tap="register()">执行注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				registerCode: ""
			}
		},
		methods: {
			register: function() {
				let that = this;


				//校验邀请码
				if (that.registerCode == null || that.registerCode.length == 0) {
					uni.showToast({
						icon: "none",
						title: "邀请码不能为空"
					})
					return
				}
				//注册（登录）
				uni.login({
					provider: 'weixin',
					success: function(resp) {
						console.log(resp.code)
						let code = resp.code;
						uni.getUserInfo({
							provider: 'weixin',
							success: function(resp) {
								let nickName = resp.userInfo.nickName;
								let avatarUrl = resp.userInfo.avatarUrl;
								// console.log(nickName);
								// console.log(avatarUrl);
								let data = {
									code: code,
									nickname: nickName,
									photo: avatarUrl,
									registerCode: that.registerCode
								}
								console.log(that.$url)
								that.$ajax(
									that.$url.register,
									"POST",
									data,
									function(resp) {
										//设置权限
										let permission = resp.data.permission
										uni.setStorageSync("permission", permission)
										console.log(permission)
										//跳转到index页面
										uni.navigateTo({
											url: "../index/index"
										})
									})
							}
						});
					}
				});
			}
		}
	}
</script>

<style lang="less">
	@import url("register.less");
</style>
