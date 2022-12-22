package com.example.resepmakanan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.resepmakanan2.Adapter.AdaperResep;
import com.example.resepmakanan2.Adapter.Resep;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {

    private List<Resep> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView buttonBack = findViewById(R.id.butttonBackMenu); buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ImageView profile = findViewById(R.id.profile); profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this,profil.class));
            }
        });
        RecyclerView recyclerView = findViewById(R.id.recycleView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for (int i = 0; i < judulResep.length; i++) {
            Resep resep = new Resep(gambarResep[i],judulResep[i],bahanResep[i],tahapanResep[i],idResepVideo[i]);
            list.add(resep);
        }
        recyclerView.setAdapter(new AdaperResep(this,list));
    }

    private int[] gambarResep = {
            R.drawable.nasigoreng,
            R.drawable.asemdaging,
            R.drawable.tumiskangkung,
            R.drawable.tumisbrokoli,
            R.drawable.tumisbungapepaya,
            R.drawable.sayurasem,
            R.drawable.sayurasem,

    };

    private String[] judulResep = {
            "Nasi Goreng",
            "Asem-asem Daging",
            "Tumis Kangkung",
            "Tumis Brokoli",
            "Tumis Bunga Pepaya",
            "Sayur Asem",
            "Oseng-Oseng Tempe"

    };

    private String[] bahanResep = {
            "- 4 buah bakso\n1 porsi nasi putih\n- 1 sdm kecap inggris\n- 2 sdm saus tiram\n- 1 bawang putih, cincang halus\n- 1/2 sdt lada\n- Garam dan penyedap rasa secukupnya",
            "- 1/4 daging rebus lalu potong kotak-kotak\n- Buncis iris-iris (sesuai selera)\n- 8 bawang merah\n- 6 bawang putih iris-iris\n- 4 daun jeruk\n- 2 daun salam\n- 2 ruas jari jahe\n- 2 ruas jari laos + sereh\n- 15 cabai ijo iris-iris + cabai rawit utuh (sesuai selera)\n- 2 tomat ijo\n- 3 belimbing wuluh\n- garam, gula pasir, penyedap non msg\n- kecap manis",
            "- 2 siung bawang merah (iris tipis)\n - Kaldu ayam bubuk (secukupnya)\n - Gula secukupnya\n - 1 ikat sayur kangkung segar (siangi, buang batang)\n - 1 buah tomat ceri (belah empat)\n - 4 siung bawang putih (memarkan)\n - Udang goreng (secukupnya)\n - 4 buah cabai rawit (iris serong tipis)\n - Garam (secukupnya)\n - Margarin",
            "- 4 buah bonggol brokoli potong\n - 5 butir bawang putih iris\n - 1,5 sdm saus tiram\n - 1 sdm kecap manis\n - 1 sdt merica\n - Air secukupnya",
            "- 1 mangkuk bunga pepaya, rebus dengan beberapa lembar daun jambu biji (untuk mengurangi rasa pahit)\n - 1 genggam ikan teri, goreng garing\n - 2 siung bawang putih, iris tipis\n - 3 butir bawang merah, iris tipis\n - 4 buah/sesuai selera cabai rawit iris serong\n - 4 buah/sesuai selera cabai merah iris serong\n - secukupnya garam, penyedap rasa dan gula\n - seruas jari lengkuas, memarkan\n - 1 lembar daun salam",
            "- 1 bonggol jagung, potong-potong\n- 1 buah labu siam ukuran sedang potong-potong\n- 1/2 buah terong, potong\n- 4 buah kacang panjang, potong-potong\n- 10 buah melinjo\n- 1 genggam daun melinjo\n- 4 butir buah asam\n- 2 sdm asam jawa\n- 3 lembar daun salam\n- 2 ruas lengkuas, geprek\n- garam secukupnya\n- gula pasir secukupnya\n- gula jawa secukupnya\n- 1,5 liter air",
            "- Minyak goreng secukupnya\n- 400 gram tempe, iris dadu\n- 2 cm lengkuas, memarkan\n- 2 lembar daun salam\n- 4 lembar daun jeruk\n- 3 siung bawang putih, iris-iris\n- 8 butir bawang merah, iris-iris\n- 5 cabai rawit merah, iris serong\n- 5 cabai merah keriting, iris serong\n- 3 sdm kecap manis\n- 1/2 sdt garam\n- 2 sdm gula merah sisir\n- 200 ml kaldu air"
    };

    private String[] tahapanResep = {
            "1. Iris bakso sesuai selera lalu sisihkan.\n2. Panaskan wajan, tumis bawang putih hingga harum.\n3. Masukkan nasi dan bakso.\n4. Tuang kecap inggris, saus tiram, lada, garam, dan penyedap rasa.\n5. Aduk hingga tercampur rata.\n6. Terakhir, koreksi rasa nasi goreng orientalnya.\n7. Matikan api lalu angkat.\n8. Siap untuk dihidangkan di atas piring saji.",
            "1. Tumis bawang merah dan putih, kemudian cabai ijo\n 2. Lalu tuang ke rebusan daging dan masakan semua bumbu kecuali belimbing wuluh dan tomat masak sampai mendidih\n 3. Masukkan buncis\n 4. Masukkan tomat dan belimbing, garam, gula, penyedap, kecap manis.",
            "1. Tumis bawang putih, bawang merah dan cabai dengan margarin. Masukkan sayur kangkung, aduk.\n 2. Beri gula, garam, kaldu ayam bubuk, buah tomat, dan udang goreng. Aduk rata semua bahan, masak dengan api besar.",
            "1. Tumis bawang putih hingga harum.\n 2. Masukkan brokoli, aduk, tunggu sedikit layu.\n 3. Tambahkan air secukupnya.\n 4. Masukkan saus tiram dan kecap, aduk rata. Tes rasa dan sajikan.",
            "1. Tumis bawang putih, bawang merah, cabai, lengkuas dan daun salam sampai harum.\n2. Masukkan bunga pepaya kemudian aduk rata, tambahkan sedikit air.\n3. Bumbui garam, penyedap rasa dan gula.\n4. Masukkan ikan teri dan aduk rata lagi.\n5. Koreksi rasa, angkat dan siap dihidangkan dengan nasi hangat.",
            "1. Masak air di panci hingga mendidih. Masukkan jagung dan melinjo, masak hingga matang.\n 2. Masukkan bumbu halus, lengkuas, daun salam, buah asam, dan asam jawa. Aduk rata.\n 3. Masukkan labu siam, masak hingga matang. Beri garam, gula pasir, dan gula jawa.\n 4. Masukkan terong, masak sebentar. Masukkan kacang panjang dan daun melinjo, masak selama 1 menit dan matikan api.",
            "1. Goreng tempe hingga matang, angkat, dan tiriskan.\n2. Tumis lengkuas, daun salam, dan daun jeruk hingga layu.\n3. Masukkan bawang putih dan bawang merah, aduk hingga harum.\n4. Masukkan cabai rawit dan cabai merah keriting, aduk hingga cabai layu.\n5. Masukkan tempe, kecap manis, garam, dan gula merah. Aduk rata.\n6. Tuang air, aduk dan masak hingga agak mengering."
    };

    private String[] idResepVideo = {
            "OV25x3a55pk",
            "OV25x3a55pk",
            "OV25x3a55pk",
            "OV25x3a55pk",
            "OV25x3a55pk",
            "OV25x3a55pk",
            "OV25x3a55pk",
    };

}