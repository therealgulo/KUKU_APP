package com.example.kukuapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kukuapp.models.Product;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Product>> products;

    public HomeViewModel() {
        products = new MutableLiveData<>();
        ArrayList<Product> data = new ArrayList<Product>();
        data.add(
                new Product(
                        "Chicken", "https://cdn.shopify.com/s/files/1/0039/4647/9689/files/isa-brown-sex-link-chickens-in-backyard.jpg", 700
                )
        );
        data.add(
                new Product(
                        "Goose", "https://wildlife-species.canada.ca/bird-status/statique-static/oiseau-bird/rogo_ken_billington_wiki.jpg", 2399
                )
        );


        data.add(
                new Product(
                        "Eggs", "https://www.foodnavigator.com/var/wrbm_gb_food_pharma/storage/images/_aliases/wrbm_large/publications/food-beverage-nutrition/foodnavigator.com/news/science/cholesterol-in-eggs-linked-to-cardiac-disease-study/9557077-1-eng-GB/Cholesterol-in-eggs-linked-to-cardiac-disease-study.jpg", 10
                )
        );
        data.add(
                new Product(
                        "chicks", "https://zootecnicainternational.com/wp-content/uploads/2019/11/Chick-quality.png", 200
                )
        );
        products.setValue(data);
    }



    LiveData<ArrayList<Product>> getData(){
        return products;
    }

}