<template>
	<view class="chat-body">
		<view class="status_bar">
			<!-- 这里是状态栏 -->
		</view>

		<view class="box">
			<uni-nav-bar height="50px" title="首页" />
		</view>

		<!-- 头部 -->
		<view class="chat-header">
			<uni-search-bar placeholder="搜索" bgColor="#EEEEEE" />
			<!-- <uni-notice-bar show-icon style="height: 20px;" scrollable text="JR-在线聊天室,欢迎您的使用." /> -->
		</view>

		<!-- 群列表 -->
		<view class="chat-list">
			<!-- 我的聊天群列表 -->
			<view class="chat-list-item" @click="toCommiuncation()">
				<!-- 群头像、基础信息 -->
				<view class="chat-object-info">
					<image src="http://q2.qlogo.cn/headimg_dl?dst_uin=21171326&spec=100" mode=""></image>
					<view class="chat-object-bease-info">
						<p>靓仔队</p>
						<text>[未读]我未成年</text>
					</view>
				</view>
				<!-- 聊天时间 -->
				<view class="chat-info-time">
					2023-01-01
				</view>
			</view>

			<!-- 我的聊天群列表 -->
			<view class="chat-list-item">
				<!-- 群头像、基础信息 -->
				<view class="chat-object-info">
					<image src="http://q2.qlogo.cn/headimg_dl?dst_uin=2369668922&spec=100" mode=""></image>
					<view class="chat-object-bease-info">
						<p>靓仔队</p>
						<text>昨天你在群内积极发言最积极,获得龙王标识</text>
					</view>
				</view>
				<!-- 聊天时间 -->
				<view class="chat-info-time">
					2023-01-01
				</view>
			</view>
			<!-- 我的聊天群列表 -->
			<view class="chat-list-item">
				<!-- 群头像、基础信息 -->
				<view class="chat-object-info">
					<image src="http://q2.qlogo.cn/headimg_dl?dst_uin=12540701&spec=100" mode=""></image>
					<view class="chat-object-bease-info">
						<p>Java开发</p>
						<text>java 明天早上9点以后考试 4小时内 根据老师出的一道题进行数据爬取</text>
					</view>
				</view>
				<!-- 聊天时间 -->
				<view class="chat-info-time">
					2023-01-01
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello',
				search: ''
			}
		},
		onLoad() {

		},
		methods: {
			toCommiuncation(){
				uni.navigateTo({
					url:"/pages/index/commiuncation/commiuncation"
				})
			}
		}
	}
</script>

<style>
	.chat-body {
		width: 100%;
		padding: 8px 0px;
		box-sizing: border-box;
	}
	.chat-header{
		position: relative;
		width:100%;
	}
	.chat-header,.chat-body .chat-list{
		width: 100%;
		padding:0 16px ;
		box-sizing: border-box;
	}

	.chat-body .chat-list .chat-list-item {
		height: 2.8985rem;
		display: flex;
		justify-content: space-between;
		padding: 5px 0;
		box-sizing: border-box;
	}

	.chat-body .chat-list .chat-list-item:not(:last-child) {
		box-shadow: 0px 0.3px 0px rgba(0, 0, 0, .1);
	}

	.chat-body .chat-list .chat-list-item .chat-object-info {
		height: 100%;
		display: flex;
		align-items: center;
	}

	.chat-body .chat-list .chat-list-item .chat-object-info>image {
		display: inline-block;
		width: 2.3188rem;
		height: 2.3188rem;
		border-radius: 50%;
		margin-right: 10px;
	}

	.chat-body .chat-list .chat-list-item .chat-object-info .chat-object-bease-info {
		font-size: 0.5797rem;
	}

	.chat-body .chat-list .chat-list-item .chat-object-info .chat-object-bease-info>p {
		font-size: 0.7246rem;

	}

	.chat-body .chat-list .chat-list-item .chat-object-info .chat-object-bease-info>text {
		display: block;
		width: 7.2463rem;
		font-size: 0.5797rem;
		overflow: hidden;
		text-overflow: ellipsis;
		-webkit-line-clamp: 1;
		white-space: nowrap;
		color: #ccc;
	}

	.chat-body .chat-list .chat-list-item .chat-info-time {
		font-size: 0.5797rem;
		line-height: 2.8985rem;
		text-align: center;
		color: #ccc;
	}
</style>
