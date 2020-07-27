package com.example.tarotmeaningbg;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MinorArcana extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_arcana);

        Button buttons[] = new Button[56];

        //setting all the buttons in the array buttons[]
        for (int i = 0, j = 1; i < 14; i++, j++) {
            int id = getResources().getIdentifier("button_wands_"+j, "id", getPackageName());
            buttons[i] = (Button) findViewById(id);
        }
        for (int i = 14, j = 1; i < 28; i++, j++) {
            int id = getResources().getIdentifier("button_cups_"+j, "id", getPackageName());
            buttons[i] = (Button) findViewById(id);
        }
        for (int i = 28, j = 1; i < 42; i++, j++) {
            int id = getResources().getIdentifier("button_swords_"+j, "id", getPackageName());
            buttons[i] = (Button) findViewById(id);
        }
        for (int i = 42, j = 1; i < 56; i++, j++) {
            int id = getResources().getIdentifier("button_pentacles_"+j, "id", getPackageName());
            buttons[i] = (Button) findViewById(id);
        }

        for(int i = 0; i < 56; i++) {
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Intent readCard = new Intent(getApplicationContext(), ReadCard.class);
        switch(v.getId()) {
            case R.id.button_wands_1:
                readCard.putExtra("my_key", "▲ СЪЗДАВАНЕ/ ОТКРИВАНЕ/ НАЧИНАНИЕ (СИЛИТЕ, КОИТО ВОДЯТ ДО ТОВА)/ ПРИНЦИПЪТ/ НАЧАЛОТО/ ИЗТОЧНИКЪТ/ РАЖДАНЕ/ СЕМЕЙСТВО/ ПРОИЗХОД/ НАЧАЛНА ТОЧКА НА НАЧИНАНИЕ/ ПАРИ/ СЪСТОЯНИЕ/ НАСЛЕДСТВО \n\n ▼ ПАДЕНИЕ/ ЗАПАДАНЕ/ СРИВАНЕ/ ПРОКЛЯТИЕ/ ЗАГИВАНЕ/ НЯКАКВА ЗАГУБЕНА РАДОСТА");
                readCard.putExtra("name", "АСО ЖЕЗЛИ");
                break;
            case R.id.button_wands_2:
                readCard.putExtra("my_key", "▲ БОГАТСТВО/ КЪСМЕТ/ ВЕЛИКОЛЕПИЕ/ ФИЗИЧЕСКИ СТРАДАНИЯ/ БОЛЕСТ/ РАЗОЧАРОВАНИЕ/ ТЪГА/ ОГОРЧЕНИЕ \n\n ▼ ИЗНЕНАДА/ ЧУДО/ ОЧАРОВАНИЕ/ ВЪЛНЕНИЕ/ ТРЕВОГА/ УЖАС");
                readCard.putExtra("name", "II ЖЕЗЛИ");
                break;
            case R.id.button_wands_3:
                readCard.putExtra("my_key", "▲ ДОКАЗАНА СИЛА/ ПРЕДПРИЕМЧИВОСТ/ УСИЛИЕ/ ЗАНАЯТ/ ТЪРГОВИЯ/ ОТКРИТИЕ/ ПЛОДОРОДНО СЪТРУДНИЧЕСТВО В БИЗНЕСА \n\n ▼ КРАЙ НА ТРЕВОГИТЕ, БЕЗСПОКОЙСТВОТО, НЕЩАСТИЕТО, НА ТЕЖКАТА РАБОТА И РАЗОЧАРОВАНИЕТО");
                readCard.putExtra("name", "III ЖЕЗЛИ");
                break;
            case R.id.button_wands_4:
                readCard.putExtra("my_key", "▲ СЕЛСКИ ЖИВОТ/ УБЕЖИЩЕ ЗА СПАСЕНИЕ/ ЖЕТВАРСКИ ПРАЗНИК/ ПОКОЙ/ МИР/ ХАРМОНИЯ/ БЛАГОДЕНСТВИЕ \n\n ▼ БЛАГОДЕНСТВИЕ/ РАСТЕЖ/ ЩАСТИЕ/ КРАСОТА/ РАЗКРАСЯВАНЕ");
                readCard.putExtra("name", "IV ЖЕЗЛИ");
                break;
            case R.id.button_wands_5:
                readCard.putExtra("my_key", "▲ ИМИТАЦИЯ/ НАПРЕГНАТО СЪРЕВНОВАНИЕ/ БОРБА В СТРЕМЕЖА КЪМ БОГАТСТВОТО И БЛАГОСЪСТОЯНИЕТО/ БИТКАТА НА ЖИВОТА/ КАРТАТА НА ЗЛОТО, ПЕЧАЛБАТА, БОГАТСТВОТО \n\n ▼ СПОР/ ПРОТИВОРЕЧИЕ/ ИЗМАМА/ ПРОТИВОПОСТАВЯНЕ");
                readCard.putExtra("name", "V ЖЕЗЛИ");
                break;
            case R.id.button_wands_6:
                readCard.putExtra("my_key", "▲ ГОЛЕМИ НОВИНИ/ ОЧАКВАНЕ/ НАДЕЖДА \n\n ▼ ОПАСЕНИЕ/ СТРАХ/ ПОДЛОСТ/ ПРЕДАТЕЛСТВО/ НЕОПРЕДЕЛЕНО ЗАКЪСНЕНИЕ");
                readCard.putExtra("name", "VI ЖЕЗЛИ");
                break;
            case R.id.button_wands_7:
                readCard.putExtra("my_key", "▲ КАРТАТА НА МЪЖЕСТВОТО/ СПОР/ СЛОВЕСНА БОРБА/ ПРЕГОВОРИ (В БИЗНЕСА)/ ТЪРГОВСКА ВОЙНА/ РАЗМЯНА / КОНКУРЕНЦИЯ/ КАРТАТА НА УСПЕХА (ВРАГОВЕТЕ НЕ МОГАТ ДА НИ ДОСТИГНАТ) \n\n ▼ ОБЪРКАНОСТ/ СМУЩЕНИЯ/ БЕЗПОКОЙСТВО/ ПРЕДУПРЕЖДЕНИЕ СРЕЩУ НЕРЕШИТЕЛНОСТТА");
                readCard.putExtra("name", "VII ЖЕЗЛИ");
                break;
            case R.id.button_wands_8:
                readCard.putExtra("my_key", "▲ АКТИВНОСТ В НАЧИНАНИЯТА, ПЪТЯТ ЗА ТАЗИ АКТИВНОСТ/ БЪРЗИНА/ ГОЛЯМО БЪРЗАНЕ/ ГОЛЯМА НАДЕЖДА/ СКОРОСТ ЗА ПОСТИГАНЕ НА КРАЙНАТА ЦЕЛ, КОЯТО ПРЕДВЕЩАВА СИГУРНО ЩАСТИЕ/ НЕЩО В ПРОЦЕС НА НАСТЪПЛЕНИЕ/ СТРЕЛИТЕ НА ЛЮБОВТА \n\n ▼ РЕВНОСТ/ ВЪТРЕШНО ПРОТИВОРЕЧИЕ/ УГРИЗЕНИЯ НА СЪВЕСТТА/ РАЗПРАВИИ И ПРОТИВОРЕЧИЯ В ДОМА (ЗА СЕМЕЙНИ ХОРА)");
                readCard.putExtra("name", "VIII ЖЕЗЛИ");
                break;
            case R.id.button_wands_9:
                readCard.putExtra("my_key", "▲ СИЛАТА НА ПРОТИВОПОСТАВЯНЕТО/ ТРУДЕН ПРОТИВНИК/ ОЧАКВАНЕ/ ОТСРОЧКА \n\n ▼ ПРЕЧКИ/ ПРЕПЯТСТВИЕ/ НЕЩАСТИЕ/ БЕДСТВИЕ");
                readCard.putExtra("name", "IX ЖЕЗЛИ");
                break;
            case R.id.button_wands_10:
                readCard.putExtra("my_key", "▲ ПОТИСНАТОСТ/ ЩАСТИЕ, ПЕЧАЛБА, УСПЕХИ, (ПОТИСНАТОСТТА ОТ ТЯХ)/ ЛЪЖЛИВА ПРИВИДНОСТ (ВЪНШНОСТ)/ ИЗМАМА, ЗАБЛУДА (ПРИ СЪДЕБЕН ПРОЦЕС) \n\n ▼ ПРОТИВОРЕЧИЯ/ ТРУДНОСТИ/ ИНТРИГИ");
                readCard.putExtra("name", "X ЖЕЗЛИ");
                break;
            case R.id.button_wands_11:
                readCard.putExtra("my_key", "▲ МУРГАВ МЛАД МЪЖ, ПРЕДАН ЛЮБОВНИК/ БЛАГОПРИЯТНИ НОВИНИ ЗА МЪЖ (АКО ДО КАРТАТА ИМА МЪЖ КАРТА)/ ОПАСЕН СЪПЕРНИК (АКО Е СЛЕДВАН ОТ ПАЖ НА ЧАШИТЕ)/ НОВИНА, СВЪРЗАНА СЪС СЕМЕЙСТВОТО \n\n ▼ АНЕКДОТИ/ СЪОБЩЕНИЯ/ ЛОШИ НОВИНИ/ НЕРЕШИТЕЛНОСТ (СЪПЪТСТВАЩА Я НЕУСТОЙЧИВОСТ)");
                readCard.putExtra("name", "ПАЖ ЖЕЗЛИ");
                break;
            case R.id.button_wands_12:
                readCard.putExtra("my_key", "▲ ОТПЪТУВАНЕ/ ОТСЪСТВИЕ/ ПОЛЕТ/ ЕМИГРИРАНЕ/ ПРОМЯНА НА МЕСТОЖИТЕЛСТВОТО/ ДРУЖЕЛЮБЕН МУРГАВ МЛАД МЪЖ \n\n ▼ РАЗЦЕПЛЕНИЕ/ РАЗДЯЛА/ РАЗЕДИНЕНИЕ/ НЕСЪГЛАСИЕ");
                readCard.putExtra("name", "РИЦАР ЖЕЗЛИ");
                break;
            case R.id.button_wands_13:
                readCard.putExtra("my_key", "▲ МЪРГАВА ДРУЖЕЛЮБНА ОБИКНОВЕНА ЖЕНА, ЦЕЛОМЪДРЕНА, ЛЮБЯЩА, ПОЧТЕНА (АКО Е ДО КАРТА МЪЖ, ТО ТЯ Е БЛАГОРАЗПОЛОЖЕНА КЪМ НЕГО, АКО Е ДО ЖЕНА, ТО ТЯ СЕ ИНТЕРЕСУВА ОТ ПИТАЩИЯ)/ ЛЮБОВ КЪМ ПАРИТЕ/ НЯКАКЪВ УСПЕХ В БИЗНЕСА \n\n ▼ ДОБРА, ПЕСТЕЛИВА, ВНИМАТЕЛНА И УСЛУЖЛИВА ЖЕНА/ ПРОТИВОПОСТАВЯНЕ/ РЕВНОСТ/ ИЗМАМА/ ИЗНЕВЯРА (САМО С НЕПРАВИЛНИТЕ СЪСЕДИ)");
                readCard.putExtra("name", "КРАЛИЦА ЖЕЗЛИ");
                break;
            case R.id.button_wands_14:
                readCard.putExtra("my_key", "▲ МУРГАВ ДРУЖЕЛЮБЕН МЪЖ, ОБИКНОВЕН ЧОВЕК (НАЙ-ЧЕСТО ЖЕНЕН), ЧЕСТЕН И ДОБРОСЪВЕСТЕН/ ЧЕСТНОСТ  \n\n ▼ МЪЖ, ДОБЪР, НО СУРОВ, СТРОГ НО ТЪРПЕЛИВ");
                readCard.putExtra("name", "КРАЛ ЖЕЗЛИ");
                break;
            case R.id.button_cups_1:
                readCard.putExtra("my_key", "▲ ДОМ НА ВЯРНОТО СЪРЦЕ/ РАДОСТ/ ЗАДОВОЛСТВО/ ДОМ/ ХРАНА/ ИЗОБИЛИЕ/ ПЛОДОРОДИЕ \n\n ▼ ДОМ НА НЕВЯРНОТО СЪРЦЕ/ ПОВРАТ/ НЕСТАБИЛНОСТ/ НЕДОВОЛСТВО");
                readCard.putExtra("name", "АСО ЧАШИ");
                break;
            case R.id.button_cups_2:
                readCard.putExtra("my_key", "▲ ЛЮБОВ/ СТРАСТ/ ПРИЯТЕЛСТВО/ ПРИВЪРЗАНОСТ/ СЪЮЗ/ РАЗБИРАТЕЛСТВО/ СЪСТРАДАТЕЛНОСТ/ ВЗАИМООТНОШЕНИЯ МЕЖДУ ПОЛОВЕТЕ \n\n ▼ ↑ СЪЩОТО");
                readCard.putExtra("name", "II ЧАШИ");
                break;
            case R.id.button_cups_3:
                readCard.putExtra("my_key", "▲ ЗАВЪРШЕК ОВЕНЧАН С ИЗОБИЛИЕ/ СЪВЪРШЕНСТВО/ ДОВОЛСТВО/ ЩАСТЛИВ РЕЗУЛТАТ/ ПОБЕДА/ ДОСТИЖЕНИЕ/ УТЕХА/ ИЗЦЕЛЕНИЕ \n\n ▼ ПЪТУВАНЕ/ ОТПРАВЯНЕ НА ПЪТ/ ДОСТИЖЕНИЯ/ ЗАВЪРШЕК/ ВРЪХНАТА ТОЧКА НА ФИЗИЧЕСКИТЕ И СЕТИВНИ УДОВОЛСТВИЯ ");
                readCard.putExtra("name", "III ЧАШИ");
                break;
            case R.id.button_cups_4:
                readCard.putExtra("my_key", "▲ УМОРА/ ОТВРАЩЕНИЕ/ ОМРАЗА/ ВЪОБРАЖАЕМО ОГУРЧЕНИЕ/ ПРЕЛИВАЩО УДОВОЛСТВИЕ \n\n ▼ НОВОСТ/ ПРЕДЧУВСТВИЕ/ НОВО УКАЗАНИЕ/ НОВИ ВРЪЗКИ");
                readCard.putExtra("name", "IV ЧАШИ");
                break;
            case R.id.button_cups_5:
                readCard.putExtra("my_key", "▲ ЗАГУБА (НО НЕЩО ПРОДЪЛЖАВА ДА СЪЩЕСТВУВА)/ НАСЛЕДСТВО ИЛИ ПРИДОБИВКА (КОЯТО НЕ ОТГОВАРЯ НА ОЧАКВАНИЯТА)/ СВАТБА (БЕЗ ГОРЧИВИНА И ПРЕПЯТСТВИЯ) \n\n ▼ НОВИНИ/ СЪЮЗИ/ ВЛЕЧЕНИЕ/ КРЪВНО РОДСТВО/ СЕМЕЕН ПРОИЗХОД/ ЗАВРЪЩАНЕ/ ЛЪЖЛИВИ НАМЕРЕНИЯ");
                readCard.putExtra("name", "V ЧАШИ");
                break;
            case R.id.button_cups_6:
                readCard.putExtra("my_key", "▲ МИНАЛОТО И СПОМЕНИТЕ/ ПОГЛЕД НАЗАД/ НЕЩА, КОИТО ВЕЧЕ СА ИЗЧЕЗНАЛИ/ ВЕСЕЛИЕ/ЩАСТИЕ (В РЕЗУЛТАТ НА МИНАЛОТО)/ НОВИ ВРЪЗКИ/ НОВО ПОЗНАНИЕ/ НОВА СРЕДА \n\n ▼ БЪДЕЩЕТО/ ОБНОВЛЕНИЕ/ ТОВА, КОЕТО ЩЕ ДОЙДЕ ЗА ДА ОТМИНЕ СКОРО");
                readCard.putExtra("name", "VI ЧАШИ");
                break;
            case R.id.button_cups_7:
                readCard.putExtra("my_key", "▲ ВЪЛШЕБНО ПОКРОВИТЕЛСТВО/ ВЪОБРАЖАЕМИ ОБРАЗИ/ ЧУВСТВЕНОСТ/ ВЪОБРАЖЕНИЕ/ (ПОСТИЖЕНИЯ В ТЕЗИ ОБЛАСТИ, НО НИЩО ПОСТОЯННО И ЗНАЧИМО) \n\n ▼ ЖЕЛАНИЕ/ ВОЛЯ/ РЕШИТЕЛНОСТ/ НАМЕРЕНИЕ");
                readCard.putExtra("name", "VII ЧАШИ");
                break;
            case R.id.button_cups_8:
                readCard.putExtra("my_key", "▲ ДАРЯВАНЕ НА РАДОСТ/ ДОБРОДУШИЕ/ БОЯЗЛИВОСТ/ БЛАГОРОТСТВО/ СКРОМНОСТ/ ЗАВЪРШЕК/ НЕЩО, КОЕТО Е БИЛО СМЯТАНО ЗА ВАЖНО, ВСЪЩНОСТ НЯМА ГОЛЯМО ЗНАЧЕНИЕ (ЗА ДОБРО ИЛИ ЗА ЗЛО) \n\n ▼ ГОЛЯМА РАДОСТ/ ОТСЪСТВИЩАСТИЕЕ/ ТЪРЖЕСТВУВАНЕ");
                readCard.putExtra("name", "VIII ЧАШИ");
                break;
            case R.id.button_cups_9:
                readCard.putExtra("my_key", "▲ СЪГЛАСИЕ/ ЗАДОВОЛСТВО/ ДОБРО САМОЧУВСТВИЕ/ ПОБЕДА/ УСПЕХ/ ПРЕИМУЩЕСТВО/ УДОВЛЕТВОРЕНИЕ ЗА ПИТАЩИЯ ИЛИ ЧОВЕКА ЗА КОГОТО Е ПИТАЛ \n\n ▼ ИСТИНА/ ЛОЯЛНОСТ/ СВОБОДА/ ГРЕШКИ/ НЕДОСТАТЪЦИ");
                readCard.putExtra("name", "IX ЧАШИ");
                break;
            case R.id.button_cups_10:
                readCard.putExtra("my_key", "▲ УДОВЛЕТВОРЕНИЕ/ СПОКОЙСТВИЕ/ ПРЕЛЕСТТА НА ЛЮБОВТА И ПРИЯТЕЛСТВОТО/ ГРАДЪТ, СЕЛОТО ИЛИ СТРАНАТА НА ПИТАЩИЯ (АКО Е ЗАЕДНО С ДВОРЦОВИ КАРТИ) \n\n ▼ ПОКОЙ НА ЛИЦЕМЕРНОТО СЪРЦЕ/ НЕГОДУВАНИЕ/ ЯРОСТ");
                readCard.putExtra("name", "X ЧАШИ");
                break;
            case R.id.button_cups_11:
                readCard.putExtra("my_key", "▲ СВЕТЪЛ МЛАД МЪЖ, ПОДТИКНАТ ДА СЛУЖИ ДОБРОВОЛНО И С КОГОТО ПИТАЩИЯТ ДА БЪДЕ СВЪРЗАН/ УСЪРДЕН МЛАДЕЖ/ НОВИНИ/ СЪОБЩЕНИЕ/ РАЗМИСЪЛ/ СЪЗЕРЦАНИЕ/ ТЕЗИ НЕЩА В СВЕРАТА НА БИЗНЕСА \n\n ▼ ВКУС/ ВЛЕЧЕНИЕ/ ВЯРНОСТ/ СЪБЛАЗЪН/ ЗАБЛУДА/ ХИТРОСТ");
                readCard.putExtra("name", "ПАЖ ЧАШИ");
                break;
            case R.id.button_cups_12:
                readCard.putExtra("my_key", "▲ ПРИСТИГАНЕ/ ПРИБЛИЖАВАНЕ/ УСПЕХИ/ ПРИЛОЖЕНИЕ/ ИЗТЪНЧЕНОСТ/ ПОКАНА/ СТИМУЛ \n\n ▼ МОШЕННИЧЕСТВО/ ХИТРОСТ/ КОВАРНОСТ/ ЛЪЖА/ ЛИЦЕМЕРИЕ/ ИМАМА");
                readCard.putExtra("name", "РИЦАР ЧАШИ");
                break;
            case R.id.button_cups_13:
                readCard.putExtra("my_key", "▲ СВЕТЛА, ДОБРА, ЧЕСТНА, ВСЕОТДАЙНА ЖЕНА, КОЯТО ЩЕ СЛУЖИ НА ПИТАЩИЯ/ ЛЮБЯЩ РАЗУМ/ ПРОЗРИТЕЛНА/ УСПЕХ/ ЩАСТИЕ/ УДОВОЛСТВИЕ/ МЪДРОСТ/ ДОБРОДЕТЕЛНОСТ/ ПРЕКРАСНА СЪПРУГА/ ДОБРА МАЙКА \n\n ▼ ДОБРА ЖЕНА/ ЗАБЕЛЕЖИТЕЛНА СВОЕНРАВНА ЖЕНА НА КОЯТО НЕ МОЖЕ ДА СЕ ДОВЕРИШ/ ПОРОК/ БЕЗЧЕСТИЕ/ ПОКВАРА");
                readCard.putExtra("name", "КРАЛИЦА ЧАШИ");
                break;
            case R.id.button_cups_14:
                readCard.putExtra("my_key", "▲ СВЕТЪЛ ОТГОВОРЕН МЪЖ, ГОТОВ ДА СЛУЖИ НА ПИТАЩИЯ/ ЧОВЕК НА БИЗНЕСА/ РАВЕНСТВО/ ИЗКУСТВО/ НАУКА/ ПРАВО/ СЪЗИДАТЕЛЕН УМ \n\n ▼ БЕЗЧЕСТИЕ/ ДВУЛИЧЕН ЧОВЕК/ МОШЕННИЧЕСТВО/ ИЗНУДВАНЕ/ НЕСПРАВЕДЛИВОСТ/ ПОРОК/ СВАДА/ ОГРАБВАНЕ/ ЗНАЧИТЕЛНА ЗАГУБА");
                readCard.putExtra("name", "КРАЛ ЧАШИ");
                break;
            case R.id.button_swords_1:
                readCard.putExtra("my_key", "▲ ТРИУМФ/ КУЛМИНАЦИЯ/ ЗАВЛАДЯВАНЕ/ ТЪРЖЕСТВО НА СИЛАТА/ ВЕЛИКА СИЛА (КАТО ЛЮБОВТА/ОМРАЗАТА) \n\n ▼ ↑ СЪЩОТО, НО РЕЗУЛТАТИТЕ СА БЕДСТВЕНИ/ ЗАЧЕВАНЕ/ РАЖДАНЕ НА ДЕТЕ/ ПРИДОБИВКА/ МНОГОЧИСЛЕНОСТ");
                readCard.putExtra("name", "АСО МЕЧОВЕ");
                break;
            case R.id.button_swords_2:
                readCard.putExtra("my_key", "▲ СЪГЛАВИЕ (И РАВНОВЕСИЕТО ОТ НЕГО)/ ХРАБРОСТ/ ПРИЯТЕЛСТВО/ ХАРМОНИЯ/ НЕЖНОСТ/ ПРИВЛИЧАНЕ/ БЛИЗОСТ (НО МЕЧОВЕТЕ НЕ СА СИМВОЛ НА БЛАГОПРИЯТНИ ВЗАИМООТНОШЕНИЯ) \n\n ▼ ИЗМАМА/ ЛЪЖА/ ДВУЛИЧНОСТ/ БЕЗЧЕСТИЕ");
                readCard.putExtra("name", "II МЕЧОВЕ");
                break;
            case R.id.button_swords_3:
                readCard.putExtra("my_key", "▲ ПРЕМЕСТВАНЕ/ ОТСЪСТВИЕ/ ЗАКЪСНЕНИЕ/ РАЗДЕЛЯНЕ/ РАЗДЯЛА/ РАЗПРЪСКВАНЕ/ ОЧЕВИДНИТЕ ЗНАЧЕНИЯ ОТ ИЗОБРАЖЕНИЕТО \n\n ▼ ДУШЕВНО ОТЧУЖДЕНИЕ/ ГРЕШКА/ ЗАГУБА/ ОБЪРКАНОСТ/ БЕЗПОРЯДЪК/ СМУЩЕНИЕ");
                readCard.putExtra("name", "III МЕЧОВЕ");
                break;
            case R.id.button_swords_4:
                readCard.putExtra("my_key", "▲ БДИТЕЛНОСТ/ УЕДИНЕНИЕ/ САМОТА/ ПОКОЯТ НА ОТШЕЛНИКА/ ЗАТОЧЕНИЕ/ ГРОБ/ КОФЧЕГ \n\n ▼ МЪДРО УПРАВЛЕНИЕ/ БЛАГОРАЗУМИЕ/ ПЕСТЕЛИВОСТ/ СКЪПЕРНИЧЕСТВО/ ПРЕДПАЗЛИВОСТ/ ЗАВЕЩАНИЕ");
                readCard.putExtra("name", "IV МЕЧОВЕ");
                break;
            case R.id.button_swords_5:
                readCard.putExtra("my_key", "▲ ДЕГРАДАЦИЯ/ РАЗРУШЕНИЕ/ ОТСТРАНЯВАНЕ/ ПОЗОР/ БЕЗЧЕСТИЕ/ ЗАГУБА \n\n ▼ ↑ СЪЩОТО/ ПОГРЕБЕНИЕ И ПОГРЕБАЛНИ ОБРЕДИ");
                readCard.putExtra("name", "V МЕЧОВЕ");
                break;
            case R.id.button_swords_6:
                readCard.putExtra("my_key", "▲ ПЪТУВАНЕ ПО ВОДА/ МАРШРУТ/ ПЪТ/ ПРАТЕНИК/ ПОРЪЧКА/ УЛОВКА \n\n ▼ ОБЯСНЕНИЕ В ЛЮБОВ/ ПРИЗНАНИЕ/ ПУБЛИЧНОСТ/ ЛЮБОВНО ПРЕДЛОЖЕНИЕ");
                readCard.putExtra("name", "VI МЕЧОВЕ");
                break;
            case R.id.button_swords_7:
                readCard.putExtra("my_key", "▲ НАМЕРЕНИЕ/ ОПИТ/ ЖЕЛАНИЕ/ НАДЕЖДА/ УВЕРЕНОСТ/ СВАДА/ ПЛАН, КОЙТО МОЖЕ ДА СЕ ОСУЕТИ/ ТРЕВОГА/ (ЗНАЧЕНИЯТА НЕ СЕ СЪГЛАСУВАТ!) \n\n ▼ ДОБЪР СЪВЕТ/ ДОПИТВАНЕ/ НАПЪТСТВИЕ/ КЛЕВЕТА/ БРЪТВЕЖ");
                readCard.putExtra("name", "VII МЕЧОВЕ");
                break;
            case R.id.button_swords_8:
                readCard.putExtra("my_key", "▲ ЛОША НОВИНА/ ЖЕСТОКО РАЗОЧАРОВАНИЕ/ КРИЗА/ ПОРИЦАНИЕ/ СИЛАТА НА ОКОВИТЕ/ КОНФЛИКТ/ КЛЕВЕТА/ БОЛЕСТ \n\n ▼ ТРЕВОГА/ ТРУДНОСТ/ ПРОТИВОПОСТАВЯНЕ/ ЗЛОПОЛУКА/ ПРЕДАТЕЛСТВО/ НЕЩО НЕПРЕДВИДЕНО/ НЕЩАСТЕН КРАЙ");
                readCard.putExtra("name", "VIII МЕЧОВЕ");
                break;
            case R.id.button_swords_9:
                readCard.putExtra("my_key", "▲ СМЪРТ/ ПРОПАДАНЕ/ НЕУСПЕХ/ ЗАКЪСНЕНИЕ/ ИЗМАМА/ РАЗОЧАРОВАНИЕ/ ОТЧАЯНИЕ \n\n ▼ ЗАТВОР/ ПОДОЗРЕНИЕ/ СЪМНЕНИЕ/ ОСНОВАТЕЛЕН СТРАХ/ СРАМ");
                readCard.putExtra("name", "IX МЕЧОВЕ");
                break;
            case R.id.button_swords_10:
                readCard.putExtra("my_key", "▲ БОЛКА/ СКРЪБ/ СЪЛЗИ/ ТЪГА/ САМОТА/ ВСИЧКО ЗАГАТНАТО ОТ ИЗОБРАЖЕНИЕТО \n\n ▼ ПРЕИМУЩЕСТВО/ ПЕЧАЛБА/ УСПЕХ/ УСЛУГА/ СИЛА/ ВЛАСТ (НО НИТО ЕДНО ОТ ТЕЗИ НЕЩА НЕ Е ТРАЙНО)");
                readCard.putExtra("name", "X МЕЧОВЕ");
                break;
            case R.id.button_swords_11:
                readCard.putExtra("my_key", "▲ ВЛАСТ/ ЛИДЕРСТВО/ ТАЙНА СЛУЖБА/ БДИТЕЛНОСТ/ ШПИОНИРАНЕ/ ИЗСЛЕДВАНЕ \n\n ▼ НЕЩО НЕПРЕДВИДЕНО/ НЕПОДГОТВЕНОСТ/ ЗАГАТВА СЕ БОЛЕСТ");
                readCard.putExtra("name", "ПАЖ МЕЧОВЕ");
                break;
            case R.id.button_swords_12:
                readCard.putExtra("my_key", "▲ УМЕНИЕ/ ХРАБРОСТ/ СПОСОБНОСТ/ ЗАЩИТА/ ЛОВКОСТ/ ВРАЖДЕБНОСТ/ ГНЯВ/ ВОЙНА/ РАЗРУШЕНИЕ/ ПРОТИВОПОСТАВЯНЕ/ СЪПРОТИВА/ СРИВАНЕ/ СМЪРТ (ЗАЕДНО С КАРТИ ЗА НЕЩАСТИЕ) \n\n ▼ НЕБЛАГОРАЗУМИЕ/ ЛИПСА НА СПОСОБНОСТИ/ РАЗТОЧИТЕЛСТВО");
                readCard.putExtra("name", "РИЦАР МЕЧОВЕ");
                break;
            case R.id.button_swords_13:
                readCard.putExtra("my_key", "▲ ОВДОВЯВАНЕ/ ЖЕНСКА ТЪГА И ОБЪРКАНОСТ/ ОТСЪСТВИЕ/ БЕЗПЛОДИЕ/ ОЧАКВАНЕ/ ЛИШЕНИЕ/ РАЗДЯЛА \n\n ▼ ЗЛОБА/ ФАНАТИЗЪМ/ ХИТРОСТ/ ПРЕВЗЕТОСТ/ БЕДА/ ИЗМАМА");
                readCard.putExtra("name", "КРАЛИЦА МЕЧОВЕ");
                break;
            case R.id.button_swords_14:
                readCard.putExtra("my_key", "▲ СПРАВЕДЛИВОСТ/ СИЛА/ УПРАВЛЕНИЕ/ ВЛАСТ/ ВОЙНСТВЕН РАЗУМ/ ЗАКОН/ СЛУЖБА НА КОРОНАТА \n\n ▼ ЖЕСТОКОСТ/ ИЗВРАТЕНОСТ/ БЕЗЧОВЕЧНОСТ/ КОВАРСТВО/ ЛОШО НАМЕРЕНИЕ");
                readCard.putExtra("name", "КРАЛ МЕЧОВЕ");
                break;
            case R.id.button_pentacles_1:
                readCard.putExtra("my_key", "▲ ИСТИНСКО ЗАДОВОЛСТВО/ ЩАСТИЕ/ ЕКСТАЗ/ БЪРЗ УМ/ ЗЛАТО/ ПОЛОЖИТЕЛНО ЗА ПИТАЩИЯ \n\n ▼ ЛОШАТА СТРАНА НА БОГАТСТВОТО/ ЗЪЛ УМ/ ОГРОМНИ БОГАТСТВА (НО С НЕГАТИВНО ЗНАЧЕНИЕ)");
                readCard.putExtra("name", "АСО ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_2:
                readCard.putExtra("my_key", "▲ РАДОСТ/ ОТМОРА/ НОВИНА, ПИСМЕНО СЪОБЩЕИЕ (КОЕТО Е ТРЕВОГА/ПРЕЧКА/РАЗПРАВА) \n\n ▼ ПРЕСТОРЕНО ВЕСЕЛИЕ/ ПРИВИДНА РАДОСТ/ ЧУВСТВО БЕЗ ВЪОБРАЖЕНИЕ/ РЪКОПИС/ ЛИТЕРАТУРНО ПРОИЗВЕДЕНИЕ/ РАЗМЯНА НА ПИСМА");
                readCard.putExtra("name", "II ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_3:
                readCard.putExtra("my_key", "▲ ПРОФЕСИЯ/ ТЪРГОВИЯ/ КВАЛИФИЦИРАН ТРУД/ БЛАГОРОДИЕ/ АРИСТОКРАЦИЯ/ ИЗВЕСТНОСТ/ СЛАВА \n\n ▼ ПОСРЕДСТВЕНОСТ (ЧЕСТО В РАБОТАТА)/ ДЕТИНЩИНА/ ДРЕБНАВОСТ/ СЛАБОСТ");
                readCard.putExtra("name", "III ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_4:
                readCard.putExtra("my_key", "▲ СИГУРНОСТТА ОТ ПРИТЕЖАНИЯТА/ ПРИДЪРЖАНЕ КЪМ ПРИТЕЖАВАНОТО/ ДАР/ ЗАВЕЩАНИЕ/ НАСЛЕДСТВО \n\n ▼ НЕСИГУРНОСТ/ ЗАБАВА/ ПРОТИВОПОСТАВЯНЕ");
                readCard.putExtra("name", "IV ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_5:
                readCard.putExtra("my_key", "▲ МАТЕРИАЛНИ ТРЕВОГИ/ ЛЮБОВТА И ЛЮБОВНИЦИТЕ (СЪПРУГ/СЪПРУГА, ПРИЯТЕЛ, ЛЮБОВНИЦА)/ СЪГЛАСИЕ/ ПРИВЛИЧАНЕ/ (ЗНАЧЕНИЯТА НЕ СЕ СЪГЛАСУВАТ!) \n\n ▼ БЕЗРЕДИЕ/ ХАОС/ РАЗРУХА/ РАЗНОГЛАСИЕ/ БЕЗПЪТСТВО");
                readCard.putExtra("name", "V ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_6:
                readCard.putExtra("my_key", "▲ ПОДАРЪЦИ/ ДАРОВЕ/ ВЪЗНАГРАЖДЕНИЕ/ ВНИМАНИЕ/ БДИТЕЛНОСТ/ СЕГА Е БЛАГОПРИЯТНОТО ВРЕМЕ/ НАСТОЯЩИЯТ УСПЕХ \n\n ▼ ЖЕЛАНИЕ/ АЛЧНОСТ/ ЗАВИСТ/ РЕВНОСТ/ ЗАБЛУДА");
                readCard.putExtra("name", "VI ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_7:
                readCard.putExtra("my_key", "▲ КАРТАТА НА ПАРИТЕ, БИЗНЕСА И РАЗМЯНАТА/ СПОР/ КЪВГА/ НЕВИННОСТ/ ИЗОБРЕТАТЕЛНОСТ/ ОПРАВДАВАНЕ \n\n ▼ ОСНОВАНИЕ ЗА ТРЕВОГА, СВЪРЗАНА С ПАРИ (ВЕРОЯТНО ДАДЕНИ НАЗАЕМ)");
                readCard.putExtra("name", "VII ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_8:
                readCard.putExtra("my_key", "▲ РАБОТА/ ЗАЕТОСТ/ ПОРЪЧЕНИЕ/ ЗАНАЯТ/ УМЕНИЕ В ЗАНАЯТА И БИЗНЕСА (ВЕРОЯТНО В НАЧАЛЕН ЕТАП) \n\n ▼ ИЗОСТАВЕНА АМБИЦИЯ/ СУЕТА/ АЛЧНОСТ/ ИЗНУДВАНЕ/ ЛИХВАРСТВО/ ИЗОБРЕТАТЕЛЕН УМ (НАСОЧЕН КЪМ ИЗМАМА, ЛУКАВОСТ И ИНТРИГА)");
                readCard.putExtra("name", "VIII ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_9:
                readCard.putExtra("my_key", "▲ БЛАГОРАЗУМИЕ/ СИГУРНОСТ/ УСПЕХ/ ДОСТИЖЕНИЕ/ УВЕРЕНОСТ/ ПРОЗОРЛИВОСТ \n\n ▼ МОШЕННИЧЕСТВО/ ИЗМАМА/ ИЗОСТАВЕНО НАМЕРЕНИЕ/ ПДЛОСТ");
                readCard.putExtra("name", "IX ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_10:
                readCard.putExtra("my_key", "▲ ПРИДОБИВКА/ БОГАТСТВО/ СЕМЕЙНИ ДЕЛА/ МИНАЛОТО/ ПРОИЗХОДЪТ НА ДОМА И СЕМЕЙСТВОТО \n\n ▼ ШАНС/ УЧАСТ/ ЗАГУБА/ КРАЖБА/ ХАЗРТНИ ИГРИ/ ДАР/ ЗЕСТРА/ ПЕНСИЯ");
                readCard.putExtra("name", "X ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_11:
                readCard.putExtra("my_key", "▲ ПРИТЕЖАНИЕ/ УЧЕНИЕ/ НАЧЕТЕНОСТ/ РАЗМИСЪЛ/ НОВИНА/ СЪОБЩЕНИЕ И ПРИНОСИТЕЛЯ МУ/ ВЛАДЕЕНЕ И УПРАВЛЕНИЕ \n\n ▼ РАЗТОЧИТЕЛСТВО/ ПРАХОСВАНЕ/ ЩЕДРОСТ/ РАЗКОШ/ НЕПРИЯТНА НОВИНА");
                readCard.putExtra("name", "ПАЖ ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_12:
                readCard.putExtra("my_key", "▲ ПОЛЗА/ УСЛУЖЛИВОСТ/ ИНТЕРЕС/ ОТГОВОРНОСТ/ СПРАВЕДЛИВОСТ (ВСИЧКО Е НА ВЪНШНО НИВО) \n\n ▼ МУДНОСТ/ МЪРЗЕЛ/ ПОЧИВКА/ ЗАСТОЙ/ СПОКОЙСТВИЕ/ ОБЕЗСЪРЧАВАНЕ/ НЕВНИМАНИЕ");
                readCard.putExtra("name", "РИЦАР ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_13:
                readCard.putExtra("my_key", "▲ БОГАТСТВО/ ЩЕДРОСТ/ ПРИВЛЕКАТЕЛНОСТ/ СИГУРНОСТ/ СВОБОДА \n\n ▼ ЗЛИНА/ ПОДОЗРЕНИЕ/ НАПРЕЖЕНИЕ/ СТРАХ/ НЕДОВЕРИЕ");
                readCard.putExtra("name", "КРАЛИЦА ПЕНТАКЛИ");
                break;
            case R.id.button_pentacles_14:
                readCard.putExtra("my_key", "▲ ХРАБРОСТ/ СЪЗИДАТЕЛЕН УМ/ БИЗНЕС. ОБИКНОВЕНА ИНТЕЛЕКТУАЛНА СПОСОБНОСТ \n\n ▼ ПОРОК/ СЛАБОСТ/ НЕПРИВЛЕКАТЕЛНОСТ/ ПОКВАРЕНОСТ/ КОРУПЦИЯ/ ОПАСНОСТ");
                readCard.putExtra("name", "КРАЛ ПЕНТАКЛИ");
                break;
        }

        startActivity(readCard);
    }
}
