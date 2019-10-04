package somdorrie.co.za.gettoknowsouthafrica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnGetFact;
    TextView factSpace;

    String[] knows = {
            "Sutherland in the Northern Karoo is known for its cold weather and the astounding star-filled skies. According to scientists, Sutherland is also one of the most stable areas in the world.",
            "Bones found in South Africa help support the theory that modern humans originated in Africa. Fossilised bones from hominids dating back between 4.5 and 2.5 million years were found in limestone caves some 50km northwest of Johannesburg.",
            "The South African flag was used for the first time on Freedom Day 1994. The V-shape symbolises the coming together of the different elements in South African society and moving ahead in unity.",
            "The world's largest themed resort hotel in the world \"The Palace of the Lost City\" is found in South Africa.",
            "South Africa has the world longest wine route, route 62, starting in Cape Town and ending in Port Elizabeth. The route spans some 850km.",
            "Table Mountain, one of the iconic landmarks of South Africa, is one of the oldest mountains in the world and has more than 2,200 species of plants, 70 percent of which are endemic.",
            "South Africa is home to the largest land mammal (elephant), largest bird (ostrich), tallest animal (giraffe), largest fish (whale shark), largest reptile (leatherback turtle), fastest land mammal (cheetah) and largest antelope (eland).",
            "The Karoo region in the Western Cape is home to some of the best fossils of early dinosaurs. It is estimated that some 80% of the mammalian fossils found to date were found in the Karoo.",
            "It's been estimated there are around 3,000 shipwrecks off the coast of South Africa. All shipwrecks are now protected under South African law.",
            "In Mpumalanga, the Barberton Mountain range is over 3.5 billion years old, and remains one of the best preserved and least altered early Archaean rock formations in the world.",
            "South Africa is home to the oldest meteor scar in the world, the Vredefort Dome in a town called Parys. The site is a UNESCO World Heritage Site.",
            "The Bloukrans Bridge in Western Cape is the highest commercial natural bungee jump in the world.",
            "South Africa, in 2006, was the first African country and the fifth country in the world to recognise same sex marriage.",
            "For nearly 50 years, there was a state of apartheid \"white minority rule\" in South Africa. When the Afrikaaner Nationalist Party came to power in 1948 their policy of apartheid (separateness) segregated blacks and whites.",
            "The national animal of South Africa is the Springbok, the only southern African gazelle.",
            "The swimming pool vacuum cleaner is a South African invention.",
            "South Africa is part of BRICS. This is an acronym referring to an association of the top five main emerging world markets. Consisting of Brazil, Russia, India, China and South Africa.",
            "South Africa hosts the world’s largest bicycle race.",
            "South Africa has one of the world’s most luxurious trains. ",
            "South Africa is the largest producer of platinum in the world.",
            "The world’s largest diamond was found in the Premier Mine in Pretoria, South Africa on 25 January 1905.",
            "South Africa has three capital cities. Cape Town (Legislative), Pretoria (Administrative) and Bloemfontein (Judicial)",
            "A South African fish migration \"Sardine Run\" is so huge it can be seen from space. Between May and July every year millions of small silver fish travel in vast shoals from the cold waters off South Africa’s Cape Point up to the coastlines of the northern Eastern Cape and southern KwaZulu-Natal.",
            "A circular stone structure was discovered in Mpumalanga in 2005, which dates back to around 75 000 years ago, which happens to be a functional, mostly in-tact monolithic stone calendar.",
            "The first successful heart transplant was carried out in a Cape Town hospital by Dr Christian Barnard on 3 December 1967.",
            "The CAT (Computed Axial Tomography) Scan was developed by South African physicist Allan Cormack and British colleague Godfrey Hounsfield. They shared the Nobel Prize for Physiology and Medicine in 1979.",
            "Rooibos tea has become a worldwide favourite for its fresh taste and excellent health properties. It is only grown in a small region (in the Cederberg) of South Africa.",
            "South Africa has the most diverse and unique floral kingdom in the world, and 70% of the Cape floral kingdom occurs nowhere else on earth.",
            "There are 11 official languages in South Africa: isiZulu, Afrikaans, isiXhosa, siSwati, Sesotho, Xitsonga, Sepedi, isiNdebele, Setswana, Tshivenda, and English.",
            "The world's second largest brewing company is in South Africa. SABMiller was founded as South African Breweries in 1895.",
            "South Africa is the only country in the world to have two nobel peace prize winners who had houses on the same street, Vilakazi Street in Soweto, and the nobel prize winners were Nelson Mandela and Archbishop Desmond Tutu.",
            "South Africa has hosted the football (2010), cricket (2003) and rugby (1995) world cups â€“ it is the only country in the world other than England to have done so.",
            "South Africa is the largest producer of platinum in the world. In 2014 it produced 110,000kg, more than four times the amount of the next biggest producer, Russia.",
            "South Africa is the only country in the world to build and then decide to dismantle the whole of its nuclear weapons programme.",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGetFact = findViewById(R.id.btnGetFact);
        factSpace = findViewById(R.id.factSpace);
        btnGetFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int randObj = new Random().nextInt(knows.length);
                String fact = knows[randObj];
                factSpace.setVisibility(View.VISIBLE);
                factSpace.setText(fact);
            }
        });
    }
}
