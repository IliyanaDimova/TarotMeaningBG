package com.example.tarotmeaningbg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MajorArcana extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_arcana);

        Button buttons[] = new Button[22];
        buttons[0] = (Button)findViewById(R.id.button_0);
        buttons[1] = (Button)findViewById(R.id.button_1);
        buttons[2] = (Button)findViewById(R.id.button_2);
        buttons[3] = (Button)findViewById(R.id.button_3);
        buttons[4] = (Button)findViewById(R.id.button_4);
        buttons[5] = (Button)findViewById(R.id.button_5);
        buttons[6] = (Button)findViewById(R.id.button_6);
        buttons[7] = (Button)findViewById(R.id.button_7);
        buttons[8] = (Button)findViewById(R.id.button_8);
        buttons[9] = (Button)findViewById(R.id.button_9);
        buttons[10] = (Button)findViewById(R.id.button_10);
        buttons[11] = (Button)findViewById(R.id.button_11);
        buttons[12] = (Button)findViewById(R.id.button_12);
        buttons[13] = (Button)findViewById(R.id.button_13);
        buttons[14] = (Button)findViewById(R.id.button_14);
        buttons[15] = (Button)findViewById(R.id.button_15);
        buttons[16] = (Button)findViewById(R.id.button_16);
        buttons[17] = (Button)findViewById(R.id.button_17);
        buttons[18] = (Button)findViewById(R.id.button_18);
        buttons[19] = (Button)findViewById(R.id.button_19);
        buttons[20] = (Button)findViewById(R.id.button_20);
        buttons[21] = (Button)findViewById(R.id.button_21);

        for(int i = 0; i < 22; i++){
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Intent readCard = new Intent(getApplicationContext(), ReadCard.class);
        switch(v.getId()) {
            case R.id.button_0:
                readCard.putExtra("my_key", "▲ БЕЗРАСЪДНОСТ/ МАНИЯ/ ЕКСТРАВАГАНТНОСТ/ ОПИЯНИЕ/ ДЕЛИРИУМ/ БЕЗУМИЕ/ РАЗКРИВАНЕ НА ТАЙНИ \n\n ▼ НЕБРЕЖНОСТ/ ОТСЪСТВИЕ/ РАЗДАВАНЕ/ НЕВНИМАНИЕ/ АПАТИЯ/ НИЩОЖНОСТ/ СУЕТА");
                readCard.putExtra("name", "0  ГЛУПАКЪТ");
                break;
            case R.id.button_1:
                readCard.putExtra("my_key", "▲ СПОСОБНОСТ/ ДИПЛОМАТИЧНОСТ/ УМЕНИЕ/ ИЗТЪНЧЕНОСТ/ БОЛЕСТ/ БОЛКА/ ЗАГУБА/ БЕДСТВИЕ/ КЛОПКА НА ВРАГОВЕ/ САМОУВЕРЕНОСТ/ ВОЛЯ/ ПИТАЩИЯТ (АКО Е МЪЖ) \n\n ▼ ЛЕКАР/ МАГ/ ДУШЕВНО СТРАДАНИЕ/ УНИЖЕНИЕ/ БЕЗПОКОЙСТВО");
                readCard.putExtra("name", "I  МАГЬОСНИКЪТ");
                break;
            case R.id.button_2:
                readCard.putExtra("my_key", "▲ ТАЙНИ/ МИСТЕРИИ/ ВСЕ ОЮЕ НЕЯСНОТО БЪДЕЩЕ/ ЖЕНАТА ОТ КОЯТО СЕ ИНТЕРЕСУВА ПИТАЩИЯТ (АКО Е МЪЖ)/ ПИТАЩИЯТ (АКО Е ЖЕНА)/ СПОКОЙСТВИЕ/ УПОРИТОСТ/ ЗАГАДКА/ МЪДРОСТ/ ПОЗНАНИЕ \n\n ▼ СТРАСТ/ ДУХОВНО И ФИЗИЧЕСКО ЖЕЛАНИЕ/ САМОНАДЕЯНОСТ/ ПОВЪРХНОСТНИ ПОЗНАНИЯ");
                readCard.putExtra("name", "II  ВИСШАТА ЖРИЦА");
                break;
            case R.id.button_3:
                readCard.putExtra("my_key", "▲ ПЛОДОВИТОСТ/ ДЕЙСТВЕНОСТ/ ИНИЦИАТИВА/ ПРОДЪЛЖИТЕЛНОСТТА НА ЖИВОТА/ НЕИЗВЕСТНОТО/ ТАЙНОТО/ ТРУДНОСТ/ СЪМНЕНИЕ/ НЕВЕЖЕСТВО \n\n ▼ СВЕТЛИНА/ ИСТИНА/ РАЗГАДАВАНЕ НА ЗАПЛЕТЕНИ ВЪПРОСИ/ ПУБЛИЧНО ВЕСЕЛИЕ/ КОЛЕБАНИЕ");
                readCard.putExtra("name", "III  ИМПЕРАТРИЦАТА");
                break;
            case R.id.button_4:
                readCard.putExtra("my_key", "▲ СТАБИЛНОСТ/ МОЩ/ ЗАЩИТА/ РЕАЛИЗАЦИЯ/ ВЕЛИК ЧОВЕК/ ПОМОЩ/ РАЗУМ/ УБЕЖДЕНИЕ/ ВЛАСТ/ ВОЛЯ \n\n ▼ ЩЕДРОСТ/ СЪСТРАДАНИЕ/ ДОВЕРИЕ/ ОБЪРКВАНЕ НА ВРАГОВЕТЕ/ ПРЕПЯТСТВИЕ/ НЕЗРЯЛОСТ");
                readCard.putExtra("name", "IV  ИМПЕРАТОРЪТ");
                break;
            case R.id.button_5:
                readCard.putExtra("my_key", "▲ БРАК/ СЪЮЗ/ ПЛЕННИЧЕСТВО/ РОБСТВО/ МИЛОСТ/ ДОБРОТА/ ВДЪХНОВЕНИЕ/ ЧОВЕКЪТ КЪМ КОГОТО ПИТАЩИЯТ СЕ ОБРЪЩА ЗА ПОМОЩ \n\n ▼ ОБЩЕСТВО/ ПРИЗНАНИЕ/ СЪГЛАСИЕ/ ПРЕКАЛЕНА ДОБРОТА/ СЛАБОСТ");
                readCard.putExtra("name", "V  ЖРЕЦЪТ");
                break;
            case R.id.button_6:
                readCard.putExtra("my_key", "▲ ПРИВЛИЧАНЕ/ ЛЮБОВ/ КРАСОТА/ ПРЕОДОЛЯНИ ТРУДНОСТИ \n\n ▼ ПАДЕНИЕ/ ГЛУПАВИ НАМЕРЕНИЯ/ СУЕТЕН БРАК/ ПРОТИВОРЕЧИЕ");
                readCard.putExtra("name", "VI  ЛЮБОВНИЦИТЕ");
                break;
            case R.id.button_7:
                readCard.putExtra("my_key", "▲ ПОМОЩ/ ПРОВИДЕНИЕ/ ВОЙНА/ ТРИУМФ/ САМОНАДЕЯНОСТ/ ОТМЪЩЕНИЕ/ НЕПРИЯТНОСТ \n\n ▼ БУНТ/ СВАДА/ ПРОТИВОРЕЧИЕ/ СПОР/ ПОРАЖЕНИЕ");
                readCard.putExtra("name", "VII  КОЛЕСНИЦАТА");
                break;
            case R.id.button_8:
                readCard.putExtra("my_key", "▲ СИЛА/ ЕНЕРГИЯ/ ДЕЙСТВЕНОСТ/ СМЕЛОСТ/ ВЕЛИКОДУШИЕ/ ПЪЛЕН УСПЕХ/ ПОЧЕСТИ \n\n ▼ ДЕСПОТИЗЪМ/ ЗЛОУПОТРЕБА С ВЛАСТТА/ СЛАБОСТ/ НЕСЪГЛАСИЕ/ НЕМИЛОСТ");
                readCard.putExtra("name", "VIII  СИЛА");
                break;
            case R.id.button_9:
                readCard.putExtra("my_key", "▲ БЛАГОРАЗУМИЕ/ ПРЕДПАЗЛИВОСТ/ ИЗМЯНА/ ЛИЦЕМЕРИЕ/ ПРЕДАТЕЛСТВО/ КОРУПЦИЯ \n\n ▼ ПРИКРИВАНЕ/ МАСКИРАНЕ/ ХИТРОСТ/ СТРАХ/ НЕОСНОВАТЕЛНА ПРЕДПАЗЛИВОСТ");
                readCard.putExtra("name", "IX  ОТШЕЛНИКЪТ");
                break;
            case R.id.button_10:
                readCard.putExtra("my_key", "▲ СЪДБА/ СПОЛУКА/ УСПЕХ/ ВЕЛИЧИЕ/ КЪСМЕТ/ ЩАСТИЕ \n\n ▼ НАРАСТВАНЕ/ ИЗОБИЛИЕ/ УМНОЖАВАНЕ");
                readCard.putExtra("name", "X  КОЛЕЛОТО НА СЪДБАТА");
                break;
            case R.id.button_11:
                readCard.putExtra("my_key", "▲ РАВЕНСТВО/ СПРАВЕДЛИВОСТ/ ЧЕСТНОСТ/ ИЗПЪЛНЕНИЕ/ ПОБЕДА НА ЗАКОННОСТТА \n\n ▼ ЗАКОНЪТ/ ЮРИДИЧЕСКИ ПРОЦЕДУРИ/ СЛЯПА ПРИВЪРЗАНОСТ/ ПРЕДУБЕЖДЕНИЕ/ ИЗКЛЮЧИТЕЛНА СТРОГОСТ");
                readCard.putExtra("name", "XI  СПРАВЕДЛИВОСТ");
                break;
            case R.id.button_12:
                readCard.putExtra("my_key", "▲ МЪДРОСТ/ ПРЕДПАЗЛИВОСТ/ ПРОНИЦАТЕЛНОСТ/ ТРУДНОСТИ/ ЖЕРТВА/ ИНТУИЦИЯ/ ГАДАЕНЕ/ ПРОРОЧЕСТВО \n\n ▼ ЕГОИЗЪМ/ ТЪЛПАТА/ ДЪРЖАВАТА");
                readCard.putExtra("name", "XII  ОБЕСЕНИЯТ");
                break;
            case R.id.button_13:
                readCard.putExtra("my_key", "▲ КРАЙ/ СМЪРТНОСТ/ РАЗРУШЕНИЕ/ КОРУПЦИЯ/ ЗАГУБА НА БЛАГОДЕТЕЛ (ЗА МЪЖ)/ МНОГО ПРОТИВОРЕЧИЯ (ЗА ЖЕНА)/ ПРОВАЛЯНЕ ПЛАНОВЕТЕ ЖА ЗЕНИТБА (ЗА ЖЕНА) \n\n ▼ МУДНОСТИ/ ПОКОЙ/ ЛЕТАРГИЯ/ ИЗУМЛЕНИЕ/ СОМНАМБУЛИЗЪМ/ РАЗБИТИ НАДЕЖДИ");
                readCard.putExtra("name", "XIII  СМЪРТ");
                break;
            case R.id.button_14:
                readCard.putExtra("my_key", "▲ РАЗУМНОСТ/ УМЕРЕНОСТ/ ПЕСТЕЛИВОСТ/ УПРАВЛЯВАНЕ/ ПРИСПОСОБЯВАНЕ \n\n ▼ НЕЩА СВЪРЗАНИ С ЦЪРКВИТЕ, РЕЛИГИИТЕ, СЕКТИТЕ, ДУХОВЕНСТВОТО/ ДУХОВНИК (КОЙТО ЩЕ БРАКОСЪЧЕТАЕ ПИТАЩИЯТ)/ РАЗДЕЛЕНИЕ/ НЕБЛАГОПРИЯТНИ КОМБИНАЦИИ/ КОНКУРИРАЩИ СЕ ИНТЕРЕСИ");
                readCard.putExtra("name", "XIV  УМЕРЕНОСТ");
                break;
            case R.id.button_15:
                readCard.putExtra("my_key", "▲ ОПУСТОШЕНИЕ/ НАСИЛИЕ/ ЯРОСТ/ НЕОБИЧАЙНИ УСИЛИЯ/ СИЛА/ ОБРЕЧЕНОСТ/ ТОВА, КОЕТО ВЕЧЕ Е ПРЕДОПРЕДЕЛЕНО (НО НЕ ПОРАДИ ТОВА Е ЗЛО) \n\n ▼ НЕЩАСТНО СТЕЧЕНИЕ/ СЛАБОСТ/ ДРЕБНАВОСТ/ ЗАСЛЕПЕНОСТ");
                readCard.putExtra("name", "XV  ДЯВОЛЪТ");
                break;
            case R.id.button_16:
                readCard.putExtra("my_key", "▲ НЕЩАСТИЕ/ ТРЕВОГА/ НИЩЕТА/ БЕДА/ БЕДСТВИЕ/ УНИЖЕНИЕ/ ИЗМАМА/ РАЗРУШЕНИЕ/ НЕПРЕДВИДЕНО БЕДСТВИЕ \n\n ▼ ↑ СЪЩОТО, НО В ПО-СЛАБА СТЕПЕН/ ПОТИСНИЧЕСТВО/ ЗАТВАРЯНЕ/ ТИРАНИЯ");
                readCard.putExtra("name", "XVI  КУЛАТА");
                break;
            case R.id.button_17:
                readCard.putExtra("my_key", "▲ ЗАГУБА/ КРАЖБА/ ЛИШЕНИЯ/ ИЗОСТАВЯНЕ/ НАДЕЖДА И СВЕТЛО БЪДЕЩЕ \n\n ▼ АРОГАНТНОСТ/ НАДМЕННОСТ/ БЕЗСИЛИЕ");
                readCard.putExtra("name", "XVII  ЗВЕЗДАТА");
                break;
            case R.id.button_18:
                readCard.putExtra("my_key", "▲ ТАЙНИ ВРАГОВЕ/ ОПАСНОСТ/ КЛЕВЕТА/ МРАК/ УЖАС/ ИЗМАМА/ ГРЕШКА \n\n ▼ НЕСТАБИЛНОСТ/ НЕПОСТОЯНСТВО/ ТИШИНА/ ИЗМАМА/ ГРЕШКА (В ПО-СЛАБА СТЕПЕН)");
                readCard.putExtra("name", "XVIII  ЛУНАТА");
                break;
            case R.id.button_19:
                readCard.putExtra("my_key", "▲ МАТЕРИАЛНО БЛАГОПОЛУЧИЕ/ СПОЛУЧЛИВ БРАК/ ЗАДОВОЛСТВО \n\n ▼ ↑ СЪЩОТО, НО В ПО-СЛАБА СТЕПЕН");
                readCard.putExtra("name", "XIX  СЛЪНЦЕТО");
                break;
            case R.id.button_20:
                readCard.putExtra("my_key", "▲ ПРОМЯНА В ПОЛОЖЕНИЕТО/ ПОДНОВЯВАНЕ/ ИЗХОД/ ПЪЛНА ЗАГУБА НА СЪДЕБЕН ПРОЦЕС \n\n ▼ СЛАБОСТ/ МАЛОДУШИЕ/ ПРОСТОТА/ ПРЕДПАЗЛИВОСТ/ РЕШЕНИЕ/ ПРИСЪДА");
                readCard.putExtra("name", "XX  СТРАШНИЯТ СЪД");
                break;
            case R.id.button_21:
                readCard.putExtra("my_key", "▲ СИГУРЕН УСПЕХ/ ВЪЗНАГРАЖДЕНИЕ/ ПЪТУВАНЕ/ ПЪТЕШЕСТВИЕ/ ЕМИГРАЦИЯ/ ПОЛЕТ/ ПРОМЯНА \n\n ▼ МУДНОСТ/ НЕПОДВИЖНОСТ/ ЗАСТОЙ/ ПОСТОЯНСТВО");
                readCard.putExtra("name", "XXI  СВЕТЪТ");
                break;
        }

        startActivity(readCard);
    }
}
