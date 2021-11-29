package com.example.checktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox price1, price2, price3, price4, distance0, distance1, distance2;
    CheckBox asian, cafe, mexican, fastFood, pizza, italian, sandwiches, burgers, dessert, chicken;
    CheckBox american, bar, foreign, seafood, bakery, other;
    PreferenceObj prefMaster = new PreferenceObj();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate views
        price1 = (CheckBox) findViewById(R.id.price1CheckBox);
        price1.setOnClickListener(this);
        price2 = (CheckBox) findViewById(R.id.price2CheckBox);
        price2.setOnClickListener(this);
        price3 = (CheckBox) findViewById(R.id.price3CheckBox);
        price3.setOnClickListener(this);
        price4 = (CheckBox) findViewById(R.id.price4CheckBox);
        price4.setOnClickListener(this);
        distance0= (CheckBox) findViewById(R.id.distance0CheckBox);
        distance0.setOnClickListener(this);
        distance1= (CheckBox) findViewById(R.id.distance1CheckBox);
        distance1.setOnClickListener(this);
        distance2= (CheckBox) findViewById(R.id.distance2CheckBox);
        distance2.setOnClickListener(this);
        asian = (CheckBox) findViewById(R.id.asianCheckBox);
        asian.setOnClickListener(this);
        cafe = (CheckBox) findViewById(R.id.cafeCheckBox);
        cafe.setOnClickListener(this);
        mexican = (CheckBox) findViewById(R.id.mexicanCheckBox);
        mexican.setOnClickListener(this);
        fastFood = (CheckBox) findViewById(R.id.fastFoodCheckBox);
        fastFood.setOnClickListener(this);
        pizza = (CheckBox) findViewById(R.id.pizzaCheckBox);
        pizza.setOnClickListener(this);
        italian = (CheckBox) findViewById(R.id.italianCheckBox);
        italian.setOnClickListener(this);
        sandwiches = (CheckBox) findViewById(R.id.sandwichesCheckBox);
        sandwiches.setOnClickListener(this);
        burgers = (CheckBox) findViewById(R.id.burgersCheckBox);
        burgers.setOnClickListener(this);
        dessert = (CheckBox) findViewById(R.id.dessertCheckBox);
        dessert.setOnClickListener(this);
        chicken = (CheckBox) findViewById(R.id.chickenCheckBox);
        chicken.setOnClickListener(this);
        american = (CheckBox) findViewById(R.id.americanCheckBox);
        american.setOnClickListener(this);
        bar = (CheckBox) findViewById(R.id.barCheckBox);
        bar.setOnClickListener(this);
        foreign = (CheckBox) findViewById(R.id.foreignCheckBox);
        foreign.setOnClickListener(this);
        seafood = (CheckBox) findViewById(R.id.seafoodCheckBox);
        seafood.setOnClickListener(this);
        bakery = (CheckBox) findViewById(R.id.bakeryCheckBox);
        bakery.setOnClickListener(this);
        other = (CheckBox) findViewById(R.id.otherCheckBox);
        other.setOnClickListener(this);

        prefMaster.setReset();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.price1CheckBox:
                if (price1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "price1", Toast.LENGTH_LONG).show();
                    prefMaster.setPrice(1);
                }
                break;
            case R.id.price2CheckBox:
                if (price2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "price2", Toast.LENGTH_LONG).show();
                    prefMaster.setPrice(2);
                }
                break;
            case R.id.price3CheckBox:
                if (price3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "price3", Toast.LENGTH_LONG).show();
                    prefMaster.setPrice(3);
                }
                break;
            case R.id.price4CheckBox:
                if (price4.isChecked()) {
                    Toast.makeText(getApplicationContext(), "price4", Toast.LENGTH_LONG).show();
                    prefMaster.setPrice(4);
                }
                break;
            case R.id.distance0CheckBox:
                if (distance0.isChecked()) {
                    Toast.makeText(getApplicationContext(), "distance0", Toast.LENGTH_LONG).show();
                    prefMaster.setDistance(0);
                }
                break;
            case R.id.distance1CheckBox:
                if (distance1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "distance1", Toast.LENGTH_LONG).show();
                    prefMaster.setDistance(1);
                }
                break;
            case R.id.distance2CheckBox:
                if (distance2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "distance2", Toast.LENGTH_LONG).show();
                    prefMaster.setDistance(2);
                }
                break;
            case R.id.asianCheckBox:
                if (asian.isChecked()) {
                    Toast.makeText(getApplicationContext(), "asian", Toast.LENGTH_LONG).show();
                    prefMaster.setAsian(true);
                }
                if (asian.isChecked() == false) {
                    Toast.makeText(getApplicationContext(), "asian", Toast.LENGTH_LONG).show();
                    prefMaster.setAsian(false);
                }
                break;
            case R.id.cafeCheckBox:
                if (cafe.isChecked()) {
                    Toast.makeText(getApplicationContext(), "cafe", Toast.LENGTH_LONG).show();
                    prefMaster.setCafe(true);
                }
                if (cafe.isChecked() == false) {
                    Toast.makeText(getApplicationContext(), "cafe", Toast.LENGTH_LONG).show();
                    prefMaster.setCafe(false);
                }
                break;
            case R.id.mexicanCheckBox:
                if (mexican.isChecked()){
                    Toast.makeText(getApplicationContext(), "mexican", Toast.LENGTH_LONG).show();
                    prefMaster.setMexicanHispanic(true);
                }
                if (mexican.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "mexican", Toast.LENGTH_LONG).show();
                    prefMaster.setMexicanHispanic(false);
                }
                break;
            case R.id.fastFoodCheckBox:
                if (fastFood.isChecked()){
                    Toast.makeText(getApplicationContext(), "fastFood", Toast.LENGTH_LONG).show();
                    prefMaster.setFastFood(true);
                }
                if (fastFood.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "fastFood", Toast.LENGTH_LONG).show();
                    prefMaster.setFastFood(false);
                }
                break;
            case R.id.pizzaCheckBox:CheckBox:
                if (pizza.isChecked()){
                    Toast.makeText(getApplicationContext(), "pizza", Toast.LENGTH_LONG).show();
                    prefMaster.setPizza(true);
                }
                if (pizza.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "pizza", Toast.LENGTH_LONG).show();
                    prefMaster.setPizza(false);
                }
                break;
            case R.id.italianCheckBox:
                if (italian.isChecked()){
                    Toast.makeText(getApplicationContext(), "italian", Toast.LENGTH_LONG).show();
                    prefMaster.setItalian(true);
                }
                if (italian.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "italian", Toast.LENGTH_LONG).show();
                    prefMaster.setItalian(false);
                }
                break;
            case R.id.sandwichesCheckBox:
                if (sandwiches.isChecked()){
                    Toast.makeText(getApplicationContext(), "sandwiches", Toast.LENGTH_LONG).show();
                    prefMaster.setSandwiches(true);
                }
                if (sandwiches.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "sandwiches", Toast.LENGTH_LONG).show();
                    prefMaster.setSandwiches(false);
                }
                break;
            case R.id.burgersCheckBox:
                if (burgers.isChecked()){
                    Toast.makeText(getApplicationContext(), "burgers", Toast.LENGTH_LONG).show();
                    prefMaster.setBurgers(true);
                }
                if (burgers.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "burgers", Toast.LENGTH_LONG).show();
                    prefMaster.setBurgers(false);
                }
                break;
            case R.id.dessertCheckBox:
                if (dessert.isChecked()){
                    Toast.makeText(getApplicationContext(), "dessert", Toast.LENGTH_LONG).show();
                    prefMaster.setDessert(true);
                }
                if (dessert.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "dessert", Toast.LENGTH_LONG).show();
                    prefMaster.setDessert(false);
                }
                break;
            case R.id.chickenCheckBox:
                if (chicken.isChecked()){
                    Toast.makeText(getApplicationContext(), "chicken", Toast.LENGTH_LONG).show();
                    prefMaster.setChickenWings(true);
                }
                if (chicken.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "chicken", Toast.LENGTH_LONG).show();
                    prefMaster.setChickenWings(false);
                }
                break;
            case R.id.americanCheckBox:
                if (american.isChecked()){
                    Toast.makeText(getApplicationContext(), "american", Toast.LENGTH_LONG).show();
                    prefMaster.setAmerican(true);
                }
                if (american.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "american", Toast.LENGTH_LONG).show();
                    prefMaster.setAmerican(false);
                }
                break;
            case R.id.barCheckBox:
                if (bar.isChecked()){
                    Toast.makeText(getApplicationContext(), "bar", Toast.LENGTH_LONG).show();
                    prefMaster.setBar(true);
                }
                if (bar.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "bar", Toast.LENGTH_LONG).show();
                    prefMaster.setBar(false);
                }
                break;
            case R.id.foreignCheckBox:
                if (foreign.isChecked()){
                    Toast.makeText(getApplicationContext(), "foreign", Toast.LENGTH_LONG).show();
                    prefMaster.setForeign(true);
                }
                if (foreign.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "foreign", Toast.LENGTH_LONG).show();
                    prefMaster.setForeign(false);
                }
                break;
            case R.id.seafoodCheckBox:
                if (seafood.isChecked()){
                    Toast.makeText(getApplicationContext(), "seafood", Toast.LENGTH_LONG).show();
                    prefMaster.setSeafood(true);
                }
                if (seafood.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "seafood", Toast.LENGTH_LONG).show();
                    prefMaster.setSeafood(false);
                }
                break;
            case R.id.bakeryCheckBox:
                if (bakery.isChecked()){
                    Toast.makeText(getApplicationContext(), "bakery", Toast.LENGTH_LONG).show();
                    prefMaster.setBakery(true);
                }
                if (bakery.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "bakery", Toast.LENGTH_LONG).show();
                    prefMaster.setBakery(false);
                }
                break;
            case R.id.otherCheckBox:
                if (other.isChecked()){
                    Toast.makeText(getApplicationContext(), "other", Toast.LENGTH_LONG).show();
                    prefMaster.setOther(true);
                }
                if (other.isChecked() == false){
                    Toast.makeText(getApplicationContext(), "other", Toast.LENGTH_LONG).show();
                    prefMaster.setOther(false);
                }
                break;
        }
    }
}