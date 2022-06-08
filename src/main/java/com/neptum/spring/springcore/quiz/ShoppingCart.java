package com.neptum.spring.springcore.quiz;

import java.util.Set;

public class ShoppingCart
{
	private Set<Item> items;
	
	public ShoppingCart() { }

	public ShoppingCart(
		Item firstItem, Item secondItem, Item thirItem)
	{
		this.items.add(firstItem);
		this.items.add(secondItem);
		this.items.add(secondItem);
	}

	public Set<Item> getItems() { return items; }

	public void setItems(Set<Item> items) { this.items = items; }

	@Override
	public String toString() {
		return "ShoppingCart [Itens:" + items + "]";
	}	
}