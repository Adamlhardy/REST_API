package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Item;
import com.example.demo.Repositories.ItemRepository;

@Service
public class ItemService {
    
    @Autowired
    ItemRepository itemRepository;

    public Item AddItem(Item item) {
        var existingItem = itemRepository.findById(item.id).get();

        if(existingItem == null) {
            itemRepository.insert(item);
            itemRepository.save(item);
            return itemRepository.save(item);
        } else {
            existingItem.quantity += item.quantity;
            itemRepository.save(existingItem);
            return itemRepository.save(existingItem);
        }
    }

    public List<Item> GetAllItems() {
        return itemRepository.findAll();
    }

    public void DeleteItemById(String id) {
        itemRepository.deleteById(id);
    }
}
