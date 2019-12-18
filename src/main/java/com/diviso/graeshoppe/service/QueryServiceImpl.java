package com.diviso.graeshoppe.service;


import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.elasticsearch.action.search.SearchType.QUERY_THEN_FETCH;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.administration.model.Banner;
//import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.store.domain.Store;
//import com.diviso.graeshoppe.client.store.model.Banner;
import com.diviso.graeshoppe.service.AggregateQueryService;

import com.hazelcast.map.impl.query.Query.QueryBuilder;

import com.diviso.graeshoppe.web.rest.util.ServiceUtility;

@Service
public class QueryServiceImpl implements QueryService {

	@Autowired
	ServiceUtility serviceUtility;
	

	private final Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findDeliveryinfobydatebetween(
	 * java.time.Instant, java.time.Instant)
	 */
  //replaced

	@Override
	public Page<Order> findOrderByDatebetweenAndStoreId(Instant from, Instant to, String storeId) {
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.AggregateQueryService#
	 * findOrderCountByDateAndStatusName(java.lang.String, java.time.Instant)
	 */
  //replaced
	@Override
	public Long findOrderCountByDateAndStatusName(String statusName, Instant date) {

		
		return count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.AggregateQueryService#
	 * findOrderCountByStatusName(java.lang.String)
	 */

  //replaced

	@Override
	public Long findOrderCountByStatusName(String statusName) {
	
		return count;
	}
//findStoreBySearchTerm
	@Override
	public Page<Store> findStoreByName(String name, Pageable pageable) {
		log.debug("<<<<<<<<< findStoreByName>>>>>>>>>", name);
		MatchQueryBuilder queryDsl =matchQuery("name", name).prefixLength(3);

		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(queryDsl);
		SearchResponse sr = serviceUtility.searchResponseForPage("store", builder, pageable);

		return serviceUtility.getPageResult(sr, pageable, new Store());
		
	}

  //replaced	@Override
	public Page<Order> findOrderByDatebetween(Instant from, Instant to) {


	}
// not needed
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.AggregateQueryService#
	 * getOrderCountByDateAndStatusName(java.lang.String, java.time.Instant)
	 */
	/*@Override
	public Long getOrderCountByDateAndStatusName(String statusName, Instant date) {
		log.info(".............." + statusName + ".............." + date);
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(termQuery("status.name", statusName))).build();

		List<Order> ordersOFDate = new ArrayList<Order>();

		elasticsearchOperations.queryForPage(searchQuery, Order.class).getContent().forEach(o -> {

			log.info("............o........." + Date.from(o.getDate()).toString() + "......p....."
					+ Date.from(date).toString());
			if (Date.from(o.getDate()).toString().subSequence(4, 10)
					.equals(Date.from(date).toString().subSequence(4, 10))) {
				ordersOFDate.add(o);
			}
		});

		log.info(
				"......................" + elasticsearchOperations.queryForPage(searchQuery, Order.class).getContent());
		// return (long) elasticsearchOperations.queryForPage(searchQuery,
		// Order.class).getContent().size();
		return (long) ordersOFDate.size();
	}*/
//return type changed List<Banner> to Page<Banner>
	@Override
	public Page<Banner> getAllPremiumBanners(Pageable pageable) {
		
		log.info("<<<<<<<<<<<<getAllPremiumBanners >>>>>>>>>>>");
		QueryBuilder qb = ;
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(qb);
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("banner", builder, pageable);
		return serviceUtility.getPageResult(searchResponse, pageable, new Banner());
		/*SearchQuery sq =new NativeSearchQueryBuilder().withQuery(matchAllQuery()).withPageable(pageable).build();
		// System.out.println("sizzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"+elasticsearchOperations.queryForPage(sq, Banner.class).getContent().size());
		return elasticsearchOperations.queryForPage(sq, Banner.class).getContent();*/
	}

}