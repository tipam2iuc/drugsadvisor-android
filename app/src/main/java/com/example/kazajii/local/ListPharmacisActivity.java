package com.example.kazajii.local;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListPharmacisActivity extends AppCompatActivity {

    private RecyclerView pharmacie;
    private List<Pharmacie> pharmacies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pharmacis);

        pharmacie = findViewById(R.id.List_Pharmacis);


        pharmacies = new ArrayList<>();
        pharmacies.add(new Pharmacie("Pharmacie De LOGPOM","Ouvert de LUNDI a DIMANCHE CONTACT:002376940334556",9.770459,4.082797));
        pharmacies.add(new Pharmacie("Pharmacie NOTRE DAME DE VICTOIRE","Ouvert tous les jours 8h 22h CONTACT:2 33 06 42 44",9.764889,4.087271));
        pharmacies.add(new Pharmacie("Pharmacie De MAKEPE","Ouvert de 8h a 16h CONTACT:233475555",9.755205,4.084965));
        pharmacies.add(new Pharmacie("Pharmacie De KOTTO","Ouvert de 8h a 16h CONTACT:697041056",9.749494 ,4.092272));
        pharmacies.add(new Pharmacie("Pharmacie SACRE COEUR","Ouvert de 8h a 16h CONTACT:non renseigner",9.759854 ,4.065940));
        pharmacies.add(new Pharmacie("Pharmacie De PK 11","Ouvert de 8h a 16h CONTACT:6 99 12 24 49",9.776792 ,4.051216));
        pharmacies.add(new Pharmacie("Pharmacie De LA REPUBLIQUE PK 14","Ouvert de 8h a 16h CONTACT:6 96 23 57 75",9.741312 ,4.090018));
        pharmacies.add(new Pharmacie("Pharmacie De PK 8","Ouvert de 07h30 a 21h CONTACT:2 33 37 64 96",9.753631 ,4.046282));
        pharmacies.add(new Pharmacie("Pharmacie De L'AEROPORT","Ouvert de 8h a 21h CONTACT:2 33 42 28 76",9.741312 ,4.090018));
        pharmacies.add(new Pharmacie("Pharmacie OLYMPIQUE DE NDOKOTTI","Ouvert de 8h a 16h CONTACT:2 33 37 02 97",9.741312 ,4.090018));
        pharmacies.add(new Pharmacie("Pharmacie Du RAIL","Ouvert de 07h30 a 20h CONTACT:2 33 42 66 18",9.711910 ,4.037775));
        pharmacies.add(new Pharmacie("Pharmacie De L'ALLIANCE","Ouvert de 8h a 21h CONTACT:2 33 42 99 15",9.709864 ,4.043532));
        pharmacies.add(new Pharmacie("Pharmacie Des HOPITAUX","Ouvert de 07h30 a 21h CONTACT:2 33 42 29 46",9.701124 ,4.048718));
        pharmacies.add(new Pharmacie("Pharmacie COSMOS SANTE","Ouvert de 8h a 20h CONTACT:2 43 74 00 68",9.732223 ,4.046116));
        pharmacies.add(new Pharmacie("Pharmacie De L'ESSEC","Ouvert de 07h30 a 21h CONTACT:2 43 60 49 62",9.735730 ,4.053454));
        pharmacies.add(new Pharmacie("Pharmacie GABRIEL SARL","Ouvert tous les jours 24h/24h CONTACT:2 33 41 52 32",9.724795 ,4.059761));
        pharmacies.add(new Pharmacie("Pharmacie De la Bourse","Ouvert de 7h a 22h CONTACT:2 33 41 48 64",9.719983 ,4.063015));
        pharmacies.add(new Pharmacie("Pharmacie La Coupole","Ouvert de 7h30 a 21h CONTACT:2 33 40 25 36",9.714661 ,4.063764));
        pharmacies.add(new Pharmacie("Pharmacie La Marine","Ouvert de 7h30 a 22h30 CONTACT:2 33 40 45 97",9.706129 ,4.063512));
        pharmacies.add(new Pharmacie("Pharmacie De la Rive Deido","Ouvert de 7h30 a 22h30 CONTACT:2 33 40 36 49",9.712711 ,4.067761));
        pharmacies.add(new Pharmacie("Pharmacie Axiale","Ouvert de 7h30 a 21h30 CONTACT:6 74 14 57 57",9.718758 ,4.070836));
        pharmacies.add(new Pharmacie("Pharmacie Lilas","Ouvert de 8h a 22h CONTACT:2 33 40 00 61",9.725905 ,4.069880));
        pharmacies.add(new Pharmacie("Pharmacie D'Akwa-Nord","Ouvert de 7h a 22h CONTACT:2 33 40 77 02",9.716831 ,4.073363));
        pharmacies.add(new Pharmacie("Pharmacie LA PATIENCE","Ouvert de 8h a 21h CONTACT:6 99 11 21 00",9.747019 ,4.081158));
        pharmacies.add(new Pharmacie("Pharmacie Du Genie","Ouvert de 8h a 16h CONTACT:6 96 79 20 06",9.734964 ,4.024960));
        pharmacies.add(new Pharmacie("Pharmacie OUAMBO VICTOR","Ouvert de 8h a 22h CONTACT:6 77 96 64 53",9.729812 ,4.013022));
        pharmacies.add(new Pharmacie("Pharmacie De BONAPRISO","Ouvert de 8h a 18h CONTACT:2 33 43 48 61",9.698808 ,4.024380));
        pharmacies.add(new Pharmacie("Pharmacie Des Oliviers","Ouvert de 6h a 22h30 CONTACT:2 33 40 34 22",9.724475 ,4.073062));
        pharmacies.add(new Pharmacie("Pharmacie De La TRINITE","Ouvert de 7h30 a 21h CONTACT:2 33 42 46 44",9.702399 ,4.056695));


        pharmacies.add(new Pharmacie("Pharmacy Mondial Ltd","Ouvert de 07h30 à 21h CONTACT:2 33 40 21 95",9.710207,4.057865));
        pharmacies.add(new Pharmacie("Pharmacie Jamot","Ouvert tous les jours 24h/24h CONTACT:2 33 42 03 18",9.703067,4.051745));
        pharmacies.add(new Pharmacie("Pharmacie De La Jouvence","Ouvert de 8h a 16h CONTACT:2 33 42 47 79",9.698283,4.050780));
        pharmacies.add(new Pharmacie("Pharmacie Du Centre","Ouvert tous les jours 24h/24h CONTACT:2 33 42 78 31",9.694394 ,4.047927));
        pharmacies.add(new Pharmacie("Pharmacie Des Portiques","Ouvert de 7h30 a 21h CONTACT:2 33 42 93 27",9.695675 ,4.047601));
        pharmacies.add(new Pharmacie("Pharmacie Les Sapeurs","Ouvert de 8h a 16h CONTACT:2 33 42 63 06",9.705422 ,4.045263));
        pharmacies.add(new Pharmacie("Pharmacie St James","Ouvert de 07h30 a 21h CONTACT:Non renseigné",9.706562 ,4.042751));
        pharmacies.add(new Pharmacie("Pharmacie De La Charité","Ouvert de 07h30 a 21h CONTACT:2 43 06 52 40",9.704825 ,4.042687));
        pharmacies.add(new Pharmacie("Pharmacie De La Cote","Ouvert de 7h30 a 21h CONTACT:6 96 83 62 34",9.693476 ,4.040431));
        pharmacies.add(new Pharmacie("Pharmacie Les Miracles","Ouvert de 8h a 16h CONTACT:2 33 13 74 25",9.695419 ,4.042524));
        pharmacies.add(new Pharmacie("Pharmacie La FLECHE","Ouvert de 07h30 a 20h CONTACT:2 33 42 25 05",9.701653 ,4.043997));
        pharmacies.add(new Pharmacie("Pharmacie De L'ESTUAIRE","Ouvert de 8h a 21h CONTACT:2 33 42 39 99",9.701264 ,4.046171));
        pharmacies.add(new Pharmacie("Pharmacie Du Bon Secours","Ouvert de 07h30 a 21h CONTACT:2 33 42 08 68",9.701987 ,4.047719));
        pharmacies.add(new Pharmacie("Pharmacie De Douala","Ouvert 24h/24h CONTACT:2 33 42 74 80",9.699448 ,4.045736));
        pharmacies.add(new Pharmacie("Pharmacie GABELOU","Ouvert de Lundi à Samedi CONTACT:Non renseigné",9.695696 ,4.032307));
        pharmacies.add(new Pharmacie("Pharmacie De Koumassi","Ouvert de 7h a 22h CONTACT:2 33 03 37 87",9.696200 ,4.036028));
        pharmacies.add(new Pharmacie("Pharmacie De la Cote","Ouvert de 7h30 a 21h CONTACT:6 96 83 62 34",9.693467 ,4.040433));
        pharmacies.add(new Pharmacie("Pharmacie Njo-Njo","Ouvert du lundi à samedi de 7h30 a 22h30 CONTACT:2 33 42 39 25",9.699713 ,4.027090));
        pharmacies.add(new Pharmacie("Pharmacie De L'OMNISPORT","Ouvert de 7h30 a 22h30 CONTACT:2 33 40 81 69",9.690856 ,4.051397));
        pharmacies.add(new Pharmacie("Pharmacie St Laurent","Ouvert de 7h30 a 21h CONTACT:2 33 43 16 08",9.701575 ,4.039385));
        pharmacies.add(new Pharmacie("Pharmacie De Nylon","Ouvert de 8h a 20h CONTACT:2 43 08 79 66",9.728123 ,4.027631));
        pharmacies.add(new Pharmacie("Pharmacie DE NDOG-BONG","Ouvert de 7h30 a 21h CONTACT:6 96 13 05 98",9.748256 ,4.051729));
        pharmacies.add(new Pharmacie("Pharmacie MERCY","Ouvert tous les jours 24h/24h CONTACT:6 77 71 24 69",9.723255 ,4.067891));
        pharmacies.add(new Pharmacie("Pharmacie KING DEIDO","Ouvert de 7h30 a 22h30 CONTACT:2 33 40 05 07",9.709327 ,4.066753));
        pharmacies.add(new Pharmacie("Pharmacie L'Agora","Ouvert de 8h a 20h CONTACT:6 72 93 37 92",9.782014 ,3.995369));
        pharmacies.add(new Pharmacie("Pharmacie Du ROCHER","Ouvert de 7h30 a 21h CONTACT:2 33 40 92 88",9.740887 ,4.048598));
        pharmacies.add(new Pharmacie("Pharmacie Le FLEURON","Ouvert de 8h a 18h CONTACT:2 43 77 55 40",9.741318 ,4.090015));
        pharmacies.add(new Pharmacie("Pharmacie De BONAMOUSSADI","Ouvert de 7h30 a 21h CONTACT:6 91 96 54 38",9.735502 ,4.08684));


        PharmacieAdapter adapter = new PharmacieAdapter(pharmacies,ListPharmacisActivity.this);
        pharmacie.setLayoutManager(new LinearLayoutManager(ListPharmacisActivity.this));
        pharmacie.setAdapter(adapter);

    }
}
