pckage com.example.appnobel;

import android.net.Uri;
import android.database.sqlite.SQLiteDatabase;
import java.net.HttpURLConnection;

import androidx.annotation.Nullable;

public class Conexao {

    private static final String Legends = "https://localhost:44355/API/Legend";
    private static final String Armas = "https://localhost:44355/API/Arma";
    private static final String QUERY_PARAM = "name";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL ("CREATE TABLE tbLegend(" +
               "legendId int primary key auto_increment," +
               "bioName varchar(50) not null, " +
               "weaponOne varchar (20) not null, " +
               "weaponTwo varchar (20) not null, " +
               "biofrom varchar(60) not null)"
);
        db.execSQL("CREATE TABLE tbArma(
               "armaId int primary key auto_increment," +
               "weaponName varchar(50))"
);
        db.execSQL("CREATE TABLE tbLegendArma(
                "fkArmaID int not null, +
                "fkLegendID int not null, + 
                "primary key(fkArmaID, fkLegendID), +
                "foreign key(fkArmaID) references tbArma (ArmaId), +
                "foreign key(fkLegendID) references tbLegend (LegendId))" 
                  S);
    }

        static void AddLegend(Legend legend){
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String characterJSONString = null;

        try {
            Uri builtURI;
            if(character == null){
                builtURI = Uri.parse(Legends).buildUpon()
                        .build();
            }
            else {
                String url1 = Legends;
                //Construção da URI de Busca
                builtURI = Uri.parse(url1).buildUpon()
                        .build();
            }
  
        static String CatchLegends(String queryString){
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String characterJSONString = null;

        try {
            Uri builtURI;
            if(queryString == null){
                builtURI = Uri.parse(Legends).buildUpon()
                        .build();
            }
            else {
                String url1 = Legends + queryString;
                 //URI de Busca
                builtURI = Uri.parse(url1).buildUpon()
                        .build();
              
       
        static String CatchArma(String queryString){
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String characterJSONString = null;

        try {
            Uri builtURI;
            if(queryString == null){
                builtURI = Uri.parse(Armas).buildUpon()
                        .build();
            }
            else {
                String url1 = Armas + queryString;
                 //URI de Busca
                builtURI = Uri.parse(url1).buildUpon()
                        .build();    
