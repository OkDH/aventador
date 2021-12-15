app.service("infiniteService", function(httpService){
	
	// 내 계좌 리스트 조회
	var promiseMyAcounts = null;
	this.getMyAccounts = function(){
		if(promiseMyAcounts){
			httpService.stop(promiseMyAcounts);
		}
		promiseMyAcounts = httpService.get({
			url: meta.baseUrl + "api/infinite/my-account",
		}).then(function(response){
			return response.data;
		});
		return promiseMyAcounts;
	}
	
	// 계좌 내 종목 조회
	var promiseStocks = null;
	this.getStocks = function(params){
		if(promiseStocks){
			httpService.stop(promiseStocks);
		}
		promiseStocks = httpService.post({
			url: meta.baseUrl + "api/infinite/stocks",
			data: params
		}).then(function(response){
			return response.data;
		});
		return promiseStocks;
	}
	
	// 계좌 내 종목 현황 조회
	var promiseAccountState = null;
	this.getAccountState = function(params){
		if(promiseAccountState){
			httpService.stop(promiseAccountState);
		}
		promiseAccountState = httpService.post({
			url: meta.baseUrl + "api/infinite/account/state",
			data: params
		}).then(function(response){
			return response.data;
		});
		return promiseAccountState;
	}
	
	// 계좌 내 종목 추가
	var promiseAddStock = null;
	this.addStock = function(params){
		if(promiseAddStock){
			httpService.stop(promiseAddStock);
		}
		promiseAddStock = httpService.post({
			url: meta.baseUrl + "api/infinite/stock/add",
			data: params
		}).then(function(response){
			return response.data;
		});
		return promiseAddStock;
	}
	
	// 계좌 내 종목 수정
	var promiseUpdateStock = null;
	this.updateStock = function(params){
		if(promiseUpdateStock){
			httpService.stop(promiseUpdateStock);
		}
		promiseUpdateStock = httpService.post({
			url: meta.baseUrl + "api/infinite/stock/update",
			data: params
		}).then(function(response){
			return response.data;
		});
		return promiseUpdateStock;
	}
	
	// 종목 매매내역
	var promiseGetHistory = null;
	this.getStockHistory = function(params){
		if(promiseGetHistory){
			httpService.stop(promiseGetHistory);
		}
		promiseGetHistory = httpService.post({
			url: meta.baseUrl + "api/infinite/stock/history",
			data: params
		}).then(function(response){
			return response.data;
		});
		return promiseGetHistory;
	}
	
	// 매매내역 추가
	var promiseAddHistory = null;
	this.addHistory = function(params){
		if(promiseAddHistory){
			httpService.stop(promiseAddHistory);
		}
		promiseAddHistory = httpService.post({
			url: meta.baseUrl + "api/infinite/stock/history/add",
			data: params
		}).then(function(response){
			return response.data;
		});
		return promiseAddHistory;
	}
	
	// 매매내역 변경
	var promiseUpdateHistory = null;
	this.updateHistory = function(params){
		if(promiseUpdateHistory){
			httpService.stop(promiseUpdateHistory);
		}
		promiseUpdateHistory = httpService.post({
			url: meta.baseUrl + "api/infinite/stock/history/update",
			data: params
		}).then(function(response){
			return response.data;
		});
		return promiseUpdateHistory;
	}
	
	// 통계 조회
	var promiseGetStatistics = null;
	this.getStatistics = function(type, params){
		if(promiseGetStatistics){
			httpService.stop(promiseGetStatistics);
		}
		promiseGetStatistics = httpService.post({
			url: meta.baseUrl + "api/infinite/stock/statistics/"+type,
			data: params
		}).then(function(response){
			return response.data;
		});
		return promiseGetStatistics;
	}
});
