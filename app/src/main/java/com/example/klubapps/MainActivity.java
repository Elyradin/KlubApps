package com.example.klubapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Klub> klub = new ArrayList<>();
    private KlubAdapter klubAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        klubAdapter = new KlubAdapter(this, klub);
        recyclerView = findViewById(R.id.rv_animal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(klubAdapter);

    }
    private void addData(){
        klub.add(new Klub("Bayern Munchen", "red", "Fußball-Club Bayern München e.V., juga dikenal sebagai Bayern München (pengucapan bahasa Jerman: [ʔɛf ˈt͡seː ˈbaɪ̯ɐn ˈmʏnçən]), FC Bayern Minga (dalam bahasa Bayern), atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bayern. Klub ini terkenal sebagai klub paling sukses dalam sejarah sepak bola Jerman, setelah memenangkan rekor 31 gelar nasional dan 20 piala nasional.[4]\n" +
                "\n" +
                "FC Bayern didirikan pada tahun 1900 oleh sebelas pemain sepak bola yang dipimpin oleh Franz John.[5] Meskipun Bayern memenangkan kejuaraan nasional pertamanya pada tahun 1932,[6] klub tersebut tidak dipilih untuk Bundesliga pada awal tahun 1963.[7] Klub memiliki periode yang sukses terbesar di tengah tahun 1970-an, di bawah kapten dari Franz Beckenbauer, memenangkan Piala Champions tiga kali berturut-turut (1974-1976). Secara keseluruhan, Bayern telah mencapai sebelas final Piala Champions/Liga Champions, yang terakhir memenangkan gelar keenam mereka pada tahun 2020 sebagai bagian dari treble benua. Bayern juga telah memenangkan satu Piala UEFA, satu Piala Winners UEFA, satu Piala Super UEFA, dua Piala Interkontinental dan satu Piala Dunia Antarklub FIFA, membuatnya menjadi salah satu klub Eropa yang paling sukses di dunia. Sejak pembentukan Bundesliga, Bayern telah menjadi klub yang dominan dalam sepak bola Jerman dengan 28 gelar dan telah memenangkan 10 dari 14 gelar terakhir. Mereka memiliki persaingan lokal tradisional dengan TSV 1860 München dan 1. FC Nürnberg, serta persaingan kontemporer dengan Borussia Dortmund."));
        klub.add(new Klub("Manchester City", "lightblue", "\n" +
                "Manchester City Football Club (dikenal pula sebagai Man City atau The Citizens) adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester.\n" +
                "\n" +
                "Pertandingan pertama dimainkan pada bulan November 1880. Pada saat itu masih bernama St Mark's (West Gorton). Pada tahun 1887 berubah nama menjadi Ardwick A.F.C., dan pada tahun 1894 menjadi Manchester City F.C.\n" +
                "\n" +
                "Manchester City telah memenangi Liga Inggris sebanyak 8 kali, Piala FA 6 kali, Piala Liga Inggris 8 kali, dan Piala Winners Eropa 1 kali. Periode tersukses klub ini terjadi pada era akhir tahun 1960-an dan awal 1970-an. Pada saat itu City di bawah asuhan manager Joe Mercer dengan asistennya Malcolm Allison dan beberapa pemain seperti Colin Bell, Mike Summerbee, dan Francis Lee.\n" +
                "\n" +
                "Pada awal tahun 1980-an City mengalami masa penuh gejolak penurunan yang berpuncak pada degradasi ke tingkat ketiga sistem liga sepak bola Inggris pada tahun 1998 untuk pertama kalinya dalam sejarah mereka. Pada saat era Liga Primer Inggris pertama kali dibentuk tahun 1992, City adalah salah satu pencetus liga premier untuk pertama kali. Namun, prestasi klub ini tidak kunjung membaik, bahkan City harus terdegradasi kembali ke tingkat kedua hingga 2 kali, sementara di ajang Piala FA sejak bergulirnya Liga Primer Inggris, prestasi terbaik City hanya sampai pada perempat-final."));
        klub.add(new Klub("Liverpool", "red", "Soccerball current event.svg Musim ini\n" +
                "Liverpool Football Club /ˈlɪvərpuːl/ (dikenal pula sebagai Liverpool atau The Reds) adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris.\n" +
                "\n" +
                "Liverpool didirikan pada tahun 1892 dan bergabung dengan Football League pada tahun berikutnya. Klub ini telah bermain di Stadion Anfield sejak pembentukannya yang terletak sekitar 4,8 km dari pusat kota Liverpool.\n" +
                "\n" +
                "Periode paling sukses dalam sejarah Liverpool adalah pada tahun 1970-an dan 1980-an ketika Bill Shankly dan Bob Paisley memimpin klub dengan sebelas gelar liga dan tujuh piala Eropa.\n" +
                "\n" +
                "Kompetisi Domestik, Liverpool adalah klub dengan raihan total (59) Piala Kompetisi Domestik. Total (19) Juara Liga Inggris dengan rincian (18) Divisi Pertama Liga Inggris, (1) Liga Premier Inggris, (8) Piala FA, (9) Piala Liga, (16) FA Community Shield, (4) Divisi kedua, (1) Lancashire League, (1) Football League Super Cup, (1) Sheriff of London Charity Shield.\n" +
                "\n" +
                "Kompetisi Eropa, Liverpool adalah klub dengan raihan total (13) Juara Kompetisi Eropa, dengan rincian (6) Liga Champions UEFA, (3) Liga Eropa UEFA, (4) Piala Super UEFA. (terbanyak dari klub inggris manapun)\n" +
                "\n" +
                "Turnamen Dunia, Liverpool adalah klub dengan raihan total (1) Juara Piala Dunia, dengan rincian (1) Piala Dunia Antarklub FIFA. (Liverpool pernah tercatat 2 kali masuk final turnamen Piala Interkontinental tetapi kalah di kedua final tersebut pada tahun 1981 oleh Flamengo dan 1984 oleh Independiente)\n" +
                "\n" +
                "Liverpool memiliki sejarah persaingan yang panjang dengan klub tetangganya Everton dan juga dengan Manchester United. Persaingan dengan klub sekota terkenal dengan nama Derby Merseyside. Sedangkan dengan Manchester United di kenal dengan sebutan North West Derby.[3]\n" +
                "\n" +
                "Dalam sepanjang sejarah Premier League, Liverpool termasuk salah satu dari enam tim yang belum pernah terdegradasi.[4]"));
        klub.add(new Klub("Chelsea", "blue", "Chelsea Football Club /ˈtʃɛlsiː/ adalah sebuah klub sepak bola yang bermarkas di Fulham, London. Didirikan pada 1905, klub ini kini berkompetisi di Liga Utama Inggris dan memainkan pertandingan kandang mereka di Stamford Bridge.[1][4] Chelsea merupakan salah satu klub sepak bola di Inggris tersukses, dengan telah memenangkan lebih dari tiga puluh gelar juara kompetisi klub domestik dan internasional.\n" +
                "\n" +
                "Kesuksesan pertama Chelsea diraih saat meraih gelar juara Divisi 1 Liga Inggris pada 1955. Klub ini memenangkan gelar juara Piala Liga Inggris untuk pertama kali pada 1965, gelar juara Piala FA untuk pertama kali pada 1970, dan gelar juara kompetisi klub Eropa, Piala Winners Eropa untuk pertama kali pada 1971. Beberapa gelar dari berbagai kompetisi juga berhasil diraih pada dekade 1990-an, 2000-an, 2010-an, dan 2020-an. Dalam 25 tahun terakhir merupakan periode terbaik kesuksesan Chelsea dengan meraih lima gelar juara Liga Utama Inggris, termasuk untuk pertama kali meraih gelar ganda Liga Utama Inggris dan Piala FA pada 2010; tujuh gelar juara Piala FA, empat gelar juara Piala Liga Inggris, dua gelar juara Liga Champions UEFA, dua gelar juara Liga Eropa UEFA, dua gelar juara Piala Super UEFA, dan satu gelar juara Piala Dunia Antarklub FIFA.[5] Klub ini merupakan salah satu dari lima klub yang telah memenangkan ketiga kompetisi klub utama UEFA, klub asal Inggris pertama dengan pencapaian tersebut. Chelsea juga merupakan satu-satunya klub asal London yang berhasil meraih gelar juara Liga Champions UEFA dan Piala Dunia Antarklub FIFA.[6]\n" +
                "\n" +
                "Kostum utama Chelsea adalah kaus dan celana berwarna biru royal dengan kaus kaki berwarna putih. Kombinasi tersebut telah digunakan sejak dekade 1960-an. Lambang klub telah berganti beberapa kali dalam upaya memodernisasi dan mengubah pencitraan. Lambang yang kini digunakan, yang menampilan seekor singa seremonial memegang sebuah tongkat, merupakan modifikasi dari lambang yang pernah digunakan pada dekade 1950-an.[7] Klub ini memiliki rivalitas dengan klub satu kota London Arsenal dan Tottenham Hotspur; dengan klub-klub sekitar London Barat, serta rivalitas bersejarah dengan Leeds United.\n" +
                "\n"));
        klub.add(new Klub("Real Madrid", "white", "Real Madrid Club de Fútbol (pengucapan bahasa Spanyol: [reˈal maˈðɾið ˈkluβ ðe ˈfutβol]; Royal Madrid Football Club), umumnya dikenal sebagai Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol.\n" +
                "\n" +
                "Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih. Kata Real (\"dari kerajaan\") Spanyol dan dianugerahkan ke klub oleh Raja Alfonso XIII pada tahun 1920 bersama-sama dengan mahkota kerajaan di lambang klub. Klub ini telah memainkan pertandingan kandang di Stadion Santiago Bernabéu dengan kapasitas 85.454 di pusat kota Madrid sejak tahun 1947.\n" +
                "\n" +
                "Klub ini merupakan salah satu klub sepak bola terkaya di dunia dalam hal pendapatan, senilai €757,3 juta dan total aset yang senilai €3,8 miliar (atau $4,2 miliar) di 2019.[4][5] Ini adalah salah satu dari tiga klub untuk tidak pernah terdegradasi dari papan atas sepak bola Spanyol, bersama dengan Athletic Bilbao dan Barcelona. Real Madrid memiliki banyak persaingan lama, terutama El Clásico dengan Barcelona dan El Derbi madrileño dengan Atlético Madrid.\n" +
                "\n" +
                "Klub ini memantapkan dirinya sebagai kekuatan utama dalam sepak bola Spanyol dan Eropa selama tahun 1950. Di dalam negeri, Klub ini juga merupakan salah satu klub terbaik abad ke-20 menurut FIFA. Klub ini menjuarai Liga Champions 3 musim berturut-turut dibawah kepelatihan Zinedine Zidane dan dengan mesin golnya yaitu pemain terbaik dunia Cristiano Ronaldo. Dalam kompetisi domestik, klub ini telah meraih 35 gelar La Liga (rekor), 19 gelar Piala Raja Spanyol, 11 Piala Super Spanyol, 1 Copa Eva Duarte, 1 Copa de la Liga,[6]. Di kompetisi tingkat Eropa dan Dunia, klub ini telah meraih 14 gelar Piala Champions Eropa/Liga Champions UEFA (rekor), 2 Piala UEFA, 4 Piala Super UEFA, dan 8 kejuaraan dunia antar klub (3 Piala Interkontinental , 4 Piala Dunia Antarklub FIFA dan 1 Piala Ibero-American )."));
        klub.add(new Klub("PSG", "darkblue", "Paris Saint-Germain (pengucapan bahasa Prancis: [paʁi sɛ̃ ʒɛʁmɛ̃]) atau dikenal luas dengan sebutan PSG merupakan sebuah tim sepak bola Prancis yang bermain di Ligue 1, Prancis. Bermarkas di Paris, Prancis. Klub ini didirikan pada 12 Agustus 1970, berkat penggabungan Paris FC dan Stade Saint-Germain."));
        klub.add(new Klub("Juventus", "blackwhite", "Juventus Football Club S.p.A. (BIT: JUVE) (dari bahasa Latin:[6] iuventus: masa muda [juˈvɛntus]), biasa disebut sebagai Juventus dan populer dengan nama Juve (pengucapan [ˈjuːve]),[7] adalah klub sepak bola profesional asal Italia yang berbasis di kota Turin, Piemonte. Klub ini didirikan pada tahun 1897 dengan nama Sport Club Juventus oleh sekelompok pelajar muda di kota Turin yang dipimpin oleh Eugenio Canfari dan saudaranya Enrico.[3][8][9]\n" +
                "\n" +
                "Sejak bulan September 2011, mereka berkandang di Juventus Stadium yang berkapasitas 41.507 tempat duduk.[10] Stadion tersebut dibangun di lokasi yang sama dengan stadion yang mereka gunakan sebelumnya, yaitu Stadion Delle Alpi, yang harus dirobohkan demi membangun Juventus Stadium.[11]\n" +
                "\n" +
                "Juventus adalah klub tertua kedua di Italia,[12] setelah Genoa yang didirikan pada tahun 1893. Mereka tampil untuk pertama kalinya di liga divisi teratas Italia pada tahun 1900, setelah berganti nama menjadi Football Club Juventus. Mereka terus berada di kompetisi tertinggi tersebut (yang menggunakan nama Serie A sejak tahun 1929), kecuali pada musim 2006–2007.[13]\n" +
                "\n" +
                "Pada tanggal 24 Juli 1923, direksi Juventus menunjuk Edoardo Agnelli, anak dari pendiri FIAT, untuk menjadi presiden klub yang baru.[3] Sejak saat itu, Juventus mulai dikelola oleh keluarga Agnelli. Hubungan antara klub sepak bola dan dinasti bisnis tersebut merupakan yang tertua dan terpanjang dalam sejarah olahraga di Italia. Hal tersebut menjadikan Juventus sebagai klub olahraga profesional pertama di negara tersebut.[14][15] Mereka pun menjadi kekuatan besar di Italia sejak era 1930-an, dan juga di Eropa sejak pertengahan 1970-an.[16] Sejak pertengahan tahun 1990-an, Juventus menjadi salah satu dari 10 klub sepak bola terkaya di dunia dari sisi nilai aset, pendapatan, dan keuntungan.[17] Mereka pun telah masuk bursa saham Borsa Italiana sejak tahun 2001.[18]"));
        klub.add(new Klub("Manchester United", "red", "Manchester United Football Club adalah sebuah klub sepak bola profesional yang berbasis di old Trafford, Manchester Raya, yang bermain di Liga Utama Inggris dengan gelar Liga Utama Inggris terbanyak sepanjang masa. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.\n" +
                "\n" +
                "Manchester United telah memenangkan banyak trofi di sepak bola Inggris, termasuk rekor 20 gelar Liga, 12 Piala FA,[3] empat Piala Liga dan rekor 21 FA Community Shield. Klub ini juga telah memenangkan tiga Piala Eropa, satu Piala UEFA, satu Piala Winners UEFA, satu Piala Super UEFA, satu Piala Interkontinental dan satu Piala Dunia Antarklub FIFA. Pada 1998-1999, klub memenangkan treble dari Liga Premier, Piala FA dan Liga Champions, prestasi belum pernah terjadi sebelumnya untuk klub Inggris. Manchester United merupakan salah satu klub terbesar di Liga Utama Inggris sepanjang masa.\n" +
                "\n" +
                "Bencana Udara München 1958 merenggut nyawa delapan pemain. Pada tahun 1968, di bawah manajemen Matt Busby, Manchester United adalah klub sepak bola Inggris pertama yang memenangkan Piala Eropa. sedangkan Alex Ferguson memenangkan total 38 gelar utama, dari bulan November 1986 sampai Mei 2013,[4][5] ketika ia mengumumkan pensiun setelah 26 tahun di klub.[6] Rekan senegaranya David Moyes diangkat sebagai penggantinya pada tanggal 9 Mei 2013.[7]"));

    }
}