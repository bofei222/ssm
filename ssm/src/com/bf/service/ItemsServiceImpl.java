package com.bf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bf.mapper.ItemsMapper;
import com.bf.pojo.Items;
import com.bf.pojo.ItemsExample;

@Service
public class ItemsServiceImpl implements ItemsService {
	
	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<Items> getItemsList() {
		ItemsExample itemsExample = new ItemsExample();
		List<Items> itemsList = itemsMapper.selectByExampleWithBLOBs(itemsExample);
		return itemsList;
	}
	
}
