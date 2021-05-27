package fi.team12.travelmadeeasy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Long Pham
 */
public class Destinations {
    private static final Destinations destinations = new Destinations();

    /**
     * Get reference to Destinations storage (Singleton)
     * @return
     */

    public static Destinations getDestinations() {
        //cannot use this keyword for class level variable
        return destinations;
    }

    //List used to hold destinations at original order
    private List<Destination> leisureDestinations, familyDestinations, honeymoonDestinations, modernDestinations, historicDestinations, adventureDestinations;

    /**
     * private constructor
     */

    //adding all information to the storage
    private Destinations () {
        this.leisureDestinations = new ArrayList<>();
        this.familyDestinations = new ArrayList<>();
        this.honeymoonDestinations = new ArrayList<>();
        this.modernDestinations = new ArrayList<>();
        this.historicDestinations = new ArrayList<>();
        this.adventureDestinations = new ArrayList<>();
        this.leisureDestinations.add(new Destination("Mauritius", "Mauritius is one of the most popular tourist destinations in the world. Due to the quality of its infrastructures, services and the efforts of various parties in the Mauritian tourism, Mauritius won the trophy for the Best Travel Destination 2014 \n" +
                "Discover and experience something different! Man needs to engage in leisure travel. Indeed, if there is something that can make life unpleasant, it’s monotony. Yes, it is not by chance that many people leave their home country to spend their holidays elsewhere. For example, many French each year leave the hexagon to spend their holidays in Asia or other regions. Thus, for each person traveling is from, to pack, fly or other means of transport and go away from home. \n" +
                "As a tourist destination, the strength of Mauritius is of course its many beaches and beautiful landscapes, where one can admire the endemic species of its fauna or flora. Besides the many hotels and other tourist service providers that meet international standards of reception you will come across various activities that appeal to tourists who come in family, honeymoon, or in search of a recreational time.\n" +
                "With its coldest month as July, with an average of just over 20 degrees, Mauritius offers warmth all around the year. \n" +
                "Attractions:\n" +
                "•\tLa Grande Maison\n" +
                "•\tAnse Maquereau\n" +
                "•\tAnse Lazio\n" +
                "•\tAnse Marron\n" +
                "•\tSir Seewoosagur Ramgoolam Botanical Gardens\n" +
                "•\tVallee de Mai\n" +
                "•\tNational History Museum \n" +
                "•\tVallee de Ferney \n" +
                "•\tBlue Penny Museum \n" +
                "•\tEureka\n" +
                "•\tEbony Forest of Charamel \n" +
                "Hotels: \n" +
                "•\tChalets Chamarel Hotel\n" +
                "•\tLe clos du littoral\n" +
                "•\tVilla Cattleya\n" +
                "•\tVilla Altair\n" +
                "Eat:\n" +
                "•\tDomaine Anna Restaurant\n" +
                "•\tChateau Mon Désir Restaurant\n", "Leisure"));
        this.leisureDestinations.add(new Destination("Miami", "Miami is one of South Florida's premier vacation destinations, with beaches, great weather, history, culture, sports, and entertainment. Downtown Miami, separated from the Atlantic Ocean by the Biscayne Bay and Miami Beach, is a modern metropolis and cultural treasure trove.\n" +
                "From the museums to the streets of Little Havana, you can always find plenty of things to do. Across the bay, Miami Beach, with its Art Deco District, fantastic stretch of beachfront, and fun vibe, is a must-see in the area. Nearby, Everglades National Park is one of several popular day trip destinations from Miami.\n" +
                "Plan your time and discover the best places to visit with our list of the top tourist attractions in Miami.\n" +
                "Miami offers warm climate on average with its lowest being 16 degrees even in the winter. \n" +
                "Attractions:\n" +
                "•\tFairchild Tropical Garden \n" +
                "•\tArt Deco Historic District\n" +
                "•\tCubaocho\n" +
                "•\tVizcaya Museum & Gardens\n" +
                "•\tBayfront Park \n" +
                "•\tHistory Miami\n" +
                "•\tPerez Art Museum Miami\n" +
                "•\tArt Deco Museum\n" +
                "\n" +
                "Hotels:\n" +
                "•\tThe Ritz-Carlton, South Beach\n" +
                "•\tMarriott Stanton South Beach\n" +
                "•\tW South Beach\n" +
                "•\tCourtyard by Marriott Miami Beach South Beach\n" +
                "•\tResidence Inn by Marriott Miami Beach South Beach\n" +
                "•\tFontainebleau\n" +
                "•\t\n" +
                "Food:\n" +
                "•\tTanuki\n" +
                "•\tPane & Vino\n" +
                "•\tSantorini by Georgios\n" +
                "•\tLa Ventana Colombian Restaurant\n" +
                "•\tHoshi and Sushi Asian Cuisine\n" +
                "•\tSafron Grill\n" +
                "•\tSmith & Wollensky\n" +
                "•\tLa Cerveceria de Barrio Miami\n","Leisure"));
        this.leisureDestinations.add(new Destination("Barcelona","Barcelona's architectural treasures span 2000-plus years. Towering temple columns, ancient city walls and subterranean stone corridors provide a window into Roman-era Barcino. Fast forward a thousand years or so to the Middle Ages by taking a stroll through the shadowy lanes of the Gothic quarter, past tranquil plazas and soaring 14th-century cathedrals. In other parts of town bloom the sculptural masterpieces of Modernisme, a mix of ingenious and whimsical creations by Gaudí and his Catalan architectural contemporaries. Barcelona has also long inspired artists, including Pablo Picasso and Joan Miró, both of whom have major Barcelona museums devoted to their works.\n" +
                "Barcelona has a Mediterranean climate of hot summers and mild winters. \n" +
                "Attractions:\n" +
                "•\tLa Sagrada Familia\n" +
                "•\tPark Guell\n" +
                "•\tLa Pedrera/Casa Mila\n" +
                "•\tCasa Batllo\n" +
                "•\tMuseu Picasso\n" +
                "•\tBarceloneta\n" +
                "•\tCamp Nou Stadium \n" +
                "\n" +
                "Hotels:\n" +
                "•\tLe Meridien Barcelona\n" +
                "•\tH10 Casa Mimosa\n" +
                "•\tHotel Duquesa de Cardona\n" +
                "•\tH10 Cubik\n" +
                "•\tAxel Hotel Barcelona & Urban Spa\n" +
                "•\tWilson Boutique Hotel\n" +
                "•\tW Barcelona\n" +
                "•\tHotel Jazz\n" +
                "•\tHotel Miramar Barcelona\n" +
                "•\tHotel 1898\n" +
                "\n" +
                "Food:\n" +
                "•\tChalito Rambla\n" +
                "•\tLa Patsa Lab\n" +
                "•\tBelleBuon\n" +
                "•\tLe Romane\n" +
                "•\tChaka Khan\n" +
                "•\tTerrazza Ravello\n" +
                "•\tLa Gastronomica\n" +
                "•\tCorte & Brasa\n" +
                "•\tCon Gracia\n", "Leisure"));

        this.leisureDestinations.add(new Destination("Blue Lagoon", "With a combination of 70% sea water and 30% fresh water, the Blue Lagoon is a perfect 38°C. Spa lovers travel the world to soak in this combination of natural mineral salts, rich blue-green algae and silica mud. These super properties leave skin unbelievably soft and silky – some even believe they can heal certain skin conditions.\n" +
                "The Blue Lagoon has three modern hotels in close proximity, all with earthy aesthetics to compliment the natural features around them. Alternatively, staying in Reykjavík or towns along the Reykjanes Peninsula is more affordable and very accessible.\n" +
                " \n" +
                "Eat: \n" +
                "•\tPapa’s Restaurant\n" +
                "•\tBryggjan Grindavik\n" +
                "•\tHja Hollu\n" +
                "•\tFish House Bar & Grill\n" +
                "•\tLava Restaurant\n" +
                "•\tSalthusid\n" +
                "•\tMoss Restaurant\n" +
                "•\tMax’s Restaurant at Northern Light Inn\n" +
                "Sleep:\n" +
                "•\tThe Retreat at Blue Lagoon Iceland\n" +
                "•\tNorthern Light Inn\n" +
                "•\tAnita’s Guest House\n" +
                "•\tHarbour View\n" +
                "•\tReykjanes GuestHouse\n" +
                "•\tArctic Wind\n" +
                "•\tEidey Airport Hotel\n" +
                "•\tHotel Vogar\n" +
                "•\tKef Guesthouse\n", "Leisure"));

        this.leisureDestinations.add(new Destination("Zurich", "The lakeside city of Zürich is the canton's centre of attention, with a clutch of excellent museums and restaurants in the walkable Altstadt (Old Town), not to mention happening bars, galleries and boutiques with urban edge in the revitalised Zürich-West neighbourhood.\n" +
                "It’s also worth venturing beyond Switzerland’s financial capital for a day or two to delve deeper into this canton, where the Alps seem tantalisingly close on cloud-free days. Within half an hour of the city, you can try out walking trails or mountain-bike routes in the heights of 871m Uetliberg, or explore castle-topped Rapperswil and its medieval Old Town by the lake. Should art be more your bag, factor in a detour to Winterthur, something of a cultural hotspot, with a trio of terrific galleries and one of Europe’s foremost photography museums.\n" +
                "Zurich is a bit on the colder side with summer highest average being 18 degrees and lowest being 0 degrees. It is not recommended for travel during extreme winter months of November, December and January unless you love winter skis and snowfall. \n" +
                "Attractions:\n" +
                "•\tFrau Gerolds Garten \n" +
                "•\tDidi’s Frieden\n" +
                "•\tSchweizerisches Landesmuseum\n" +
                "•\tHaus Hiltl (oldest veg-restaurant)\n" +
                "•\tZoo Zurich \n" +
                "•\tFraumunster\n" +
                "Food : \n" +
                "•\tRestaurant Husafell\n" +
                "•\tKitchen and Wine\n" +
                "•\tOutback Lodge Zurich\n" +
                "•\tZunfthaus Kreuz\n" +
                "•\tParkhuus Restaurant\n" +
                "•\tCäsar Ritz - Walliserhof Grand-Hotel & Spa\n" +
                "Sleep: \n" +
                "•\tHotel Ork\n" +
                "•\tHappy Inn Lodge\n" +
                "•\tThe Swan House Hotel by Ylma\n" +
                "•\tMotel one Zurich\n" +
                "•\tApart-Hotel ZUrich Airport\n" +
                "•\tRadisson Blu Hotel\n" +
                "•\tDormero Hotel\n", "Leisure"));

        this.familyDestinations.add(new Destination("Hamilton", "Hamilton is New Zealand’s best kept secret when it comes to family holidays. Most favourite activities include the Waikato Museum with its dedicated kid’s discovery areas; the Zoo where cheeky Kaka land on your shoulder in the walk-through aviary; and the themed Hamilton gardens which will transport you into a new civilization at every turn!\n" +
                "But what really set Hamilton apart are the many ‘destination playgrounds’. These amazing parks have the usual fun fixtures, plus water features, in-ground trampolines and  multi-story playhouses. Great for keeping the little ones busy while you enjoy coffee from a nearby cafe!\n" +
                "Attractions:\n" +
                "- Hayes Common\n" +
                "- Waikato Museum\n" +
                "- Duck Island Ice Cream\n" +
                "- Madame Woo\n" +
                "- Hamilton Gardens\n" +
                "- Waikato River\n" +
                "Hotels:\n" +
                "- Atrium On ULster\n" +
                "- Backpackers Central Hamilton\n" +
                "- Westlands Lodge \n" +
                "- The York Apartments\n" +
                "- Bon Marie B&B\n" +
                "Restaurants:\n" +
                "- Hayes Common\n" +
                "- Gothenburg\n" +
                "- Duck Island Ice Cream\n" +
                "- Madame Woo\n" +
                "- Chim Choo Ree\n", "Family"));

        this.familyDestinations.add(new Destination("Florence", "Florence is wonderful for families because there is so much to do and see both indoors and outdoors. It is a great place to walk around in and explore and make memories that will last a lifetime. The whole family will enjoy the delicious Italian food, culture and attractions. Quality produce sourced locally, seasonally and sustainably is the holy trinity and Florentines share an enormous pride in their culinary tradition. Their city, surrounded by wine-rich hills, is a gourmet paradise where eating and drinking exceedingly well is mandatory.\n" +
                "\n" +
                "Attractions:\n" +
                "- Galleria degli Uffizi\n" +
                "- Basilica di Santa Maria Novella\n" +
                "- Palazzo Vecchio\n" +
                "- Duomo\n" +
                "- Museo dell’Opera del Duomo \n" +
                "Hotels:\n" +
                " · Pendry San Diego      \n" +
                " ·  Cosmopolitan Hotel\n" +
                " · La Valencia Hotel\n" +
                "  Restaurants:         \n" +
                " · Hash House a Go Go\n" +
                " · Juniper & Ivy\n" +
                " · Old Town Mexican Cafe\n" +
                " · Fish 101\n" +
                " · Hodad’s\n" +
                "\n", "Family"));

        this.familyDestinations.add(new Destination("Bali", "Bali has become one of people’s favourite family travel destinations the past several years. There is always something to do, from attending festivals (which seem to take place all the time) to visiting water parks to hiking through rice fields.\n" +
                "The weather is warm year-round, although the rainy season (November through March)\n" +
                "Is exactly what it sounds like. The food is excellent and inexpensive. The hotels are amazing and virtually all welcome kids. \n" +
                "\n" +
                "Attractions:\n" +
                "- Banyu Wana Amertha Waterfalls\n" +
                "- Ubud Writers & Readers Festival\n" +
                "- Museum Negeri Propinsi Bali\n" +
                "- Pura Rambut Siwi\n" +
                "- Sekumpul Waterfall\n" +
                "- Pura Besakih\n" +
                "Restaurants:\n" +
                "- Bali Asli\n" +
                "- Biku\n" +
                "- Single Fin\n" +
                "- Room4Dessert\n" +
                "-   Men Gabrug\n" +
                "Hotels:\n" +
                "- Mandapa, A Ritz-Carlton Reserve \n" +
                "- Tandjung Sari\n" +
                "-  Alila Villas Uluwatu\n" +
                "-   Bambu Indah\n" +
                "-  The Buah Bali Villas\n", "Family"));

        this.honeymoonDestinations.add(new Destination("Hawaii", "One of the most beautiful cities of the world, Hawaii, offers perfect ambience for couples looking for a romantic holiday out in the pristine nature. With its mesmerizing coral reefs, revitalizing colourful beaches and palm trees, love between you two gets intensified more and more with every second you spend here.\n" +
                "As they say, love is in the air, Hawaii culture carries it more than any other place. From the Hula dance to Gifting of Lei, the emotional aspect engraved in its activities brings out the love even out of a devil.\n" +
                "As for weather, forget about your Jackets and Gloves as Hawaii has a tropical climate where even the winter spreads warmth.\n" +
                "‘Aloha’ and ‘Mahalo’ could be handy at times as they speak their own language.\n" +
                "Attractions:\n" +
                "•\tPi’ilanihale Heiau & Kahanu Garden\n" +
                "•\tNational Tropical Botanical Garden \n" +
                "•\tMaruna Kea’s Summit Area\n" +
                "•\tMakaluapuna Point\n" +
                "•\tKilauea Point National Wildlife Refuge\n" +
                "•\tLumaha’i Beach\n" +
                "•\tKe’e Beach\n" +
                "•\tSalt Pond Beach Park\n" +
                "•\tAllerton Garden \n" +
                "\n" +
                "Places to grab your bites:\n" +
                "•\tThe Original Roy’s\n" +
                "•\tSenia, Earl’s\n" +
                "•\tMerriman’s Big Island\n" +
                "•\tHelena’s Hawaiian Food\n" +
                "•\t Greek Marina\n" +
                "Find a bed for your exhaustion:\n" +
                "•\tMaui Beach Vacation Club\n" +
                "•\tHana-Maui Resort\n" +
                "•\tThe Westin Maui Resort and Spa\n" +
                "•\tThe Ritz-Carlton\n" +
                "•\tRoyal Lahaina Resort\n", "Honeymoon"));

        this.honeymoonDestinations.add(new Destination("Venice", "Never was a thoroughfare so aptly named as the Grand Canal, reflecting the glories of centuries of Venetian architecture in the 50 palazzi and six churches lining its banks. At the end of Venice’s signature S-shaped waterway, the Palazzo Ducale and Basilica di San Marco add double exclamation points. But wait until you see what’s hiding in the narrow backstreets: neighbourhood churches lined with Veroneses and priceless marbles, convents graced with ethereal Bellinis, Tiepolo’s glimpses of heaven on homeless-shelter ceilings, and a single Titian painting that mysteriously lights up an entire basilica. \n" +
                "Garden islands and lagoon aquaculture yield speciality produce and seafood you won’t find elsewhere – all highlighted in inventive Venetian cuisine, with tantalising traces of ancient spice routes. The city knows how to put on a royal spread, as France’s King Henry III once found out when faced with 1200 dishes and 200 bonbons. Today such feasts are available in miniature at happy hour, when bars mount lavish spreads of cicheti (Venetian tapas). Save room and time for a proper sit-down Venetian meal, with lagoon seafood to match views at canalside bistros and toasts with Veneto’s signature bubbly, prosecco.\n" +
                "\n" +
                "It is therefore subject to high humidity year round. When combined with the summer heat, this can lead to fairly uncomfortable weather conditions. Despite this, July and August are the peak tourist months and the city becomes almost entirely booked out. So if you choose to endure the heat, humidity and throngs of tourists, be sure to book ahead!\n" +
                "Attractions:\n" +
                "•\tBasilica di San Marco \n" +
                "•\tPalazzo Ducale\n" +
                "•\tLa Biennale di Venezia\n" +
                "•\tTeatro La Fenice\n" +
                "•\tGallerie dell’Accademia\n" +
                "•\tBasilica di Santa Maria della Salute\n" +
                "•\tScuola Grande di San Rocco \n" +
                "•\tLa Fenice\n" +
                "\n" +
                "Food: \n" +
                "•\tTrattoria Al Gazzettino\n" +
                "•\tDal Moro’s Fresh Pasta to Go \n" +
                "•\tDa Mamo\n" +
                "•\tOsteria Olivia Nera\n" +
                "•\tAi Barbacani\n" +
                "•\tVenice Restaurant\n" +
                "•\tBistrot De Venise\n" +
                "•\tAntico Forno\n" +
                "•\tImpronta\n" +
                "\n" +
                "Sleep:\n" +
                "•\tHilton Garden Inn Venice Mestre San Giuliano\n" +
                "•\tHilton Molino Stucky Venice Hotel\n" +
                "•\tBest Western Plus Hotel Bologna\n" +
                "•\tHyatt Centric Murano Venice\n" +
                "•\tSplendid Venice - Starhotels Collezione\n" +
                "•\tJW Mariott Venice resort & Spa\n" +
                "•\tHotel Olimpia Venice\n" +
                "•\tHotel Indigo Venice\n", "Honeymoon"));

        this.honeymoonDestinations.add(new Destination("Santorini", "If you approach Santorini from the water, it's hard not to be awed by the sheer cliffs that soar above a turquoise sea, by the fact that you're sailing in an immense crater of a drowned volcano and that before you lies an island shaped by an ancient eruption cataclysmic beyond imagining.\n" +
                "High above, the main villages of Fira and Oia are a snow-drift of white Cycladic houses that line the cliff tops and spill like icy cornices down the terraced rock. And then there are the sunsets, with crowds breaking into applause as the sun disappears below the horizon.\n" +
                "In peak season, Santorini becomes a playground for the very wealthy, and while this has resulted in some stellar restaurants and superb wineries, the strain on the infrastructure is a concern. Still, there's relative seclusion found at the island's ancient sites, on hiking trails and beneath the waves.\n" +
                "Santorini enjoys a mild Mediterranean climate with year-round agreeable conditions with just two distinct seasons, the summer and the winter. Santorini was originally a single island but an enormous underwater volcanic eruption resulted in the creation of geographic calderas which has resulted in a jaw-shaped layout.\n" +
                "Attractions:\n" +
                "•\tAncient Thira \n" +
                "•\tMuseum of Prehistoric Thera\n" +
                "•\tArt Space\n" +
                "•\tAroma Avlis\n" +
                "•\tMetaxi Mas\n" +
                "•\tVolkan on the Rocks\n" +
                " \n" +
                "Food: \n" +
                "•\tSantorini by Georgios\n" +
                "•\tJaipur Palace Santorini\n" +
                "•\tSantorini Greek Cuisine\n" +
                "•\tMetaxy Mas\n" +
                "•\tSalt & Pepper\n" +
                "•\tTo Psaraki\n" +
                "Sleep:\n" +
                "•\tEvgenia Villas & Suites\n" +
                "•\tSantorini Princess\n" +
                "•\tEnigma Suites \n" +
                "•\tVilla llias Caldera Hotel\n" +
                "•\tAfroessa Hotel\n" +
                "•\tKatikies Chromata Hotel\n" +
                "•\tAenaon Villas\n" +
                "•\tAnteliz Suites\n", "Honeymoon"));

        this.honeymoonDestinations.add(new Destination("Paris", "Paris' monument-lined boulevards, museums, classical bistros and boutiques are enhanced by a new wave of multimedia galleries, creative wine bars, design shops and tech start-ups. The cloud-piercing, wrought-iron Eiffel Tower, broad Arc de Triomphe guarding the glamorous avenue des Champs-Élysées, flying buttressed Notre Dame cathedral, lamplit bridges spanning the Seine and art nouveau cafes' wicker-chair-lined terraces are enduring Parisian emblems. Despite initial appearances, however, Paris’ cityscape isn’t static: there are some stunning modern and contemporary icons, too, from the inside-out, industrial-style Centre Pompidou to the mur végétal (vertical garden) gracing the Musée du Quai Branly, the glass sails of the Fondation Louis Vuitton contemporary-art centre, and the gleaming steel egg-shaped concert venue La Seine Musicale.\n" +
                "France’s reputation for its cuisine (the French word for ‘kitchen’) precedes it, and whether you seek a cosy neighbourhood bistro or a triple-Michelin-starred temple to gastronomy, you'll find that every establishment prides itself on exquisite preparation and presentation of quality produce, invariably served with wine. Enticing patisseries, boulangeries (bakeries), fromageries (cheese shops) and crowded, colourful street markets are perfect for putting together a picnic to take to the city’s beautiful parks and gardens. \n" +
                "Paris in France has a temperate, oceanic climate with warm summers and cold winters. There is a marked difference between the seasons but extreme hot or cold temperatures are rare.\n" +
                "\n" +
                "Attractions:\n" +
                "•\tMusee du Louvre\n" +
                "•\tJardin du Luxembourg\n" +
                "•\tCentre Pompidou\n" +
                "•\tCimetiere du Pere Lachaise\n" +
                "•\tMusee Rodin\n" +
                "•\tEiffel Tower\n" +
                "•\tBasilique du Sacre-Coeur\n" +
                "•\tShakespeare & Company\n" +
                "•\tMusee d’Orsay\n" +
                "•\tMusee National Picasso \n" +
                "•\tGaleries Lafayette\n" +
                "\n" +
                "Food: \n" +
                "•\tAngelina\n" +
                "•\tParis House \n" +
                "•\tEiffel Tower Restaurant\n" +
                "•\tPetit Paris\n" +
                "•\tParis Texas Bar & Smokehouse\n" +
                "•\tMon Ami Gabi\n" +
                "•\tLe Florimond\n" +
                "•\tLittle Paris\n" +
                "•\tLe Procope\n" +
                "•\tL’As du Fallafel\n" +
                "\n" +
                "Sleep:\n" +
                "•\tParis Las vegas\n" +
                "•\tHilton Paris La Defense\n" +
                "•\tPark Hyatt Paris\n" +
                "•\tHotel Dream Castle Paris\n" +
                "•\tHilton Paris Opera\n" +
                "•\tThe Westin Paris - Vendome\n" +
                "•\tParis Hotel\n" +
                "•\tHotel Ares Paris\n" +
                "•\tMandarin Oriental Paris\n", "Honeymoon"));

        this.honeymoonDestinations.add(new Destination("Madeira", "Geologically dramatic, bursting with exotic colour and warmed year-round by the Atlantic sun, Portugal’s most enchanting island is a place that keeps all its subtropical holiday promises. Pearl of the Atlantic, island of eternal spring…Madeira well deserves its fanciful nicknames and the affection visitors and locals alike feel for this tiny volcanic island that offers so much.\n" +
                "Repeatedly voted Europe's, and even the world's, top island destination, Madeira is a diverse place when it comes to holidaymaking. Black sand beaches, the frothing Atlantic, towering rock walls and gushing streams and irrigation channels make this an outdoor nirvana. But it's also a place of gentler pleasures such as wine tasting, visiting lush botanical gardens and watching embroiderers and wicker weavers at work. Hiking the levada irrigation channels is the top activity, with tens of thousands pulling on hiking boots to discover Madeira's secret interior.\n" +
                "Summer is the most popular time of year to visit Madeira thanks to the great weather, which is almost always hot and sunny at this time of year. It's difficult to describe any period in Madeira as 'winter', since daytime temperatures are frequently around 20°C and almost never fall below 10°C. This makes Madeira a popular destination for northern Europeans seeking a bit of winter sun.\n" +
                "Attractions:\n" +
                "•\tCarnaval \n" +
                "•\tPorto Santo Beach \n" +
                "•\tQuinta das Cruzes\n" +
                "•\tMuseu da Baleia\n" +
                "•\tZona Velha \n" +
                "•\tMercado dos Lavradores\n" +
                "•\tCabo Girao \n" +
                "Food:\n" +
                "•\tMadeira Restaurant\n" +
                "•\tTaberna Madeira\n" +
                "•\tCasal Da Penha\n" +
                "•\tRestaurante Goya\n" +
                "•\tArmazem do Sal\n" +
                "•\tO Dragoeiro\n" +
                "•\tL’osteria\n" +
                "•\tDona Nina\n" +
                "•\tRestaurante Mozart\n" +
                "Sleep:\n" +
                "•\tPestana Carlton Madeira\n" +
                "•\tVidaMar Resort Hotel Madeira\n" +
                "•\tEnotel Lido Madeira\n" +
                "•\tQuintinha Sao Joao\n" +
                "•\tMadeira Regency Cliff\n" +
                "•\tHotel The Cliff Bay\n" +
                "•\tPorto Mare Hotel\n" +
                "•\tBelmonf Reid’s Palace\n", "Honeymoon"));

        this.modernDestinations.add(new Destination("New York City", "Where else could you visit an Amish family's farm, camp on a mountaintop, read the Declaration of Independence and view New York, New York from the 86th floor of an art-deco landmark – all in a few days? Even though this corner of the country is the most densely populated part of the US, it's full of places where jaded city dwellers escape to seek simple lives, where artists retreat for inspiration, and where pretty houses line main streets in small towns set amid stunning scenery.\n" +
                "New York City is often depicted as cold, especially in winter when it's covered in snow. But what many people don't realise is that although it's true the city can be bitingly cold during the winter months, it can also get swelteringly hot during the summer.\n" +
                "Attraction:\n" +
                "•\tTimes Square\n" +
                "•\tCentral Park\n" +
                "•\tBrooklyn Bridge Park \n" +
                "•\tEllis Island\n" +
                "•\tGrand Central Terminal \n" +
                "•\tAmerican Museum of Natural History\n" +
                "•\tEmpire State Building\n" +
                "•\tMuseum of Modern Art \n" +
                "•\tBrooklyn Bridge\n" +
                "•\tRockefeller Center\n" +
                "•\tHIgh Line \n" +
                "•\tThe Statue Of Liberty \n" +
                "\n" +
                "Food:\n" +
                "•\tKenny & Ziggy’s New York Deli\n" +
                "•\tNew York Grill\n" +
                "•\tHarveys New York Bar and Grill\n" +
                "•\tNew York Steakhouse\n" +
                "•\tNew York City Pizza\n" +
                "•\tNew York Luncheonette\n" +
                "•\t6 New York\n" +
                "Sleep:\n" +
                "•\tDisney’s Hotel New York\n" +
                "•\tHotel Riu Plaza New York Times Square\n" +
                "•\tHotel new York\n" +
                "•\tNovotel New York Times Square\n" +
                "•\tGrand Hyatt New York\n" +
                "•\tSanctuary Hotel New York Times Square\n" +
                "•\tWarwick New York\n" +
                "•\tConrad New York Downtown\n" +
                "•\tStaybridge Suites Times Square \n", "Modern"));

        this.modernDestinations.add(new Destination("Tokyo", "With its futuristic skyscrapers, unrivaled food scene, and wild nightlife, Tokyo is a rush of pure adrenaline. This vast and multifaceted city is famously cutting edge, yet its ancient Buddhist temples, vintage teahouses, and peaceful gardens offer a serene escape — and a poignant reminder of the city’s long history. And for those who know where to look, Tokyo’s smaller pleasures (secret ramen spots, shopping alleys, chill record bars) are often hiding in plain sight.\n" +
                "The best time to visit Tokyo, Japan, is generally in spring or autumn when the country is at its most beautiful thanks to the budding of cherry blossom and stunning autumnal colours. The weather is also great at this time with mild temperatures.\n" +
                "Attractions:\n" +
                "•\tSenso-ji\n" +
                "•\tMeiji-jingu\n" +
                "•\tRyogoku Kokugikan \n" +
                "•\tTokyo National Museum \n" +
                "•\tGolden Gai \n" +
                "•\tEdo-Tokyo Museum \n" +
                "•\tShibuya Crossing\n" +
                "\n" +
                "Food:\n" +
                "•\tMugi no Oto\n" +
                "•\tSalone Vendredi\n" +
                "•\tCedros\n" +
                "•\tTeppan Baby Shinjuku\n" +
                "•\tWagyu to Worldwide\n" +
                "•\tSakura Cafe jimbocho\n" +
                "•\tGyopao Gyoza Roppongi\n" +
                "•\tIse Sueyoshi\n" +
                "•\tJiromaru Akihabara\n" +
                "•\tGyukatsu Motomura Harajuku\n" +
                "\n" +
                "Sleep:\n" +
                "•\tThe Ritz-Carlton \n" +
                "•\tImperial Hotel Tokyo \n" +
                "•\tJR Kyushu Hotel Blossom Shinjuku\n" +
                "•\tHotel Metropolitan Tokyo Ikebukuro\n" +
                "•\tThe Westin Tokyo \n" +
                "•\tThe Prince Gallery Tokyo Kioicho\n" +
                "•\tThe Prince Park Tower Tokyo\n" +
                "•\tThe Prince Sakura Tower Tokyo\n", "Modern"));

        this.modernDestinations.add(new Destination("Seoul", "Fashion- and technology-forward but also deeply traditional, this dynamic city mashes up palaces, temples, cutting-edge design and mountain trails, all to a nonstop K-Pop beat.\n" +
                "Over the last decade Seoul has worked hard to soften its industrial hard edges into an appealing urban ideal of parks, culture and design. Glass, concrete and steel are crafted into natural forms at the spectacular Dongdaemun Design Plaza & Park and City Hall. The popularity of the beautifully landscaped parks alongside the central Cheong-gye stream and the Han River has spurred on the creation of more green spaces and cycle routes. Join Seoulites enjoying time out shopping in stylish boutiques and drinking at cool cafes and convivial bars.\n" +
                "Seoul's weather has extreme differences between summer and winter.  Summer months are influenced by Seoul's proximity to the ocean and the Pacific typhoon season.  Winters are influenced by the Siberian high-pressure systems, and northwesterly winds often bring bitter cold temperatures to Seoul.\n" +
                "Attractions:\n" +
                "•\tGyeongbokgung\n" +
                "•\tChangdeokgung\n" +
                "•\tLeeum Samsung Museum of Art\n" +
                "•\tGwangjang Market\n" +
                "•\tJogye-sa\n" +
                "•\tDeoksugung\n" +
                "•\tNational Museum of Korea\n" +
                "•\tSeoullo 7017\n" +
                "•\tBongeun-sa\n" +
                "•\tDongdaemun Design Plaza & Park \n" +
                "\n" +
                "Food: \n" +
                "•\tOh Beut\n" +
                "•\tKyochan Chicken Dongdaemun\n" +
                "•\tNekkid Wings\n" +
                "•\tLinus’ Bama Style BBQ\n" +
                "•\tThe Lounge\n" +
                "•\tGusto Taco \n" +
                "•\tFlavors\n" +
                "•\tJihwaja\n" +
                "•\tHemlagat\n" +
                "•\tGwanghwamun Ichungjib\n" +
                "\n" +
                "Sleep:\n" +
                "•\tL’Escape hotel\n" +
                "•\tSigniel Seoul\n" +
                "•\tLotte Hotel World\n" +
                "•\tImperial Palace Seoul\n" +
                "•\tThe Shilla Seoul\n" +
                "•\tConrad Seoul\n" +
                "•\tFour Seasons Hotel Seoul\n" +
                "•\tMillenium Hilton Seoul\n", "Modern"));

        this.modernDestinations.add(new Destination("Singapore", "Capitalising on its melting pot of cultures, Singapore is finally getting some spark, and is fast becoming one of Asia’s hit-list destinations. Whizzing around Singapore can take a matter of minutes, thanks to one of the world’s most efficient and widespread public transport systems. Hankering for breakfast in Little India, but want to visit the temples in Chinatown before lunch? No problem, you’ll be there in a jiffy using the sparkling MRT system – and why not stop at Marina Bay for a spot of shopping on your way? Plus, with new metro lines opening practically every two years, this tiny island just keeps on becoming easier to explore.\n" +
                " \n" +
                "The concrete jungles that once dominated Singapore’s skyline are slowly giving way to green skyscrapers, which look more like living ecosystems than business hubs. Fervently working towards its ‘City in a Garden’ dream, the nation is ploughing money into becoming more sustainable and, well, green. Head out of town a little and you’ll find plenty of walking trails, treetop jungle bridges, wildlife galore and the city's green jewel, the Unesco World Heritage–listed Singapore Botanic Gardens: these are the lungs of Singapore.\n" +
                "February is the hottest month in Singapore with an average temperature of 27°C (81°F) and the coldest is January at 26°C (79°F) with the most daily sunshine hours at 9 in September. The wettest month is December with an average of 269mm of rain. The best month to swim in the sea is in April when the average sea temperature is 30°C (86°F).\n" +
                "Top attractions: \n" +
                "•\tGardens by the Bay\n" +
                "•\tSingapore Botanic Gardens\n" +
                "•\tSingapore Zoo\n" +
                "•\tNational Orchid Garden\n" +
                "•\tCLoud Forest \n" +
                "•\tSands Skypark Observation Deck\n" +
                "•\tSingapore Mass Rapid Transit\n" +
                "•\tSingapore Flyer\n" +
                " \n" +
                "Eat here:\n" +
                "•\tHai Tien Lo\n" +
                "•\tColony\n" +
                "•\tBeast & Butterflies\n" +
                "•\tOscar’s \n" +
                "•\tMTR Singapore\n" +
                "•\tSpice Brasserie\n" +
                "•\tCrossroads\n" +
                "Sleep:\n" +
                "•\tOrchard Hotel Singapore\n" +
                "•\tOne Farrer Hotel\n" +
                "•\tMandarin Orchard Singapore\n" +
                "•\tMnadarin Oriental\n" +
                "•\tYOTEL Singapore\n" +
                "•\tAmara Singapore\n" +
                "•\tInterContinental Singapore\n" +
                "•\tPARKROYAL COLLECTION Pickering\n", "Modern"));

        this.modernDestinations.add(new Destination("Hong Kong", "Hong Kong welcomes with an iconic skyline, a legendary kitchen, and lush, protected nature where rare birds and colourful traditions thrive.\n" +
                "Hong Kong's enchanting neighbourhoods and islands offer a sensory feast. You may find yourself swaying along on a historic double-decker tram, cheering with the hordes at the city-centre horse races, or simply gazing out at the glorious harbour. What most visitors don't immediately realise is that over 70% of Hong Kong is mountains and sprawling country parks, some also home to geological and historical gems. Escape the city limits on one of the world’s smoothest transport systems and spend your day wandering in a Song dynasty village, hiking on a deserted island or kayaking among volcanic sea arches.\n" +
                "One of the world's top culinary capitals, the city that worships the God of Cookery has many a demon in the kitchen, whether the deliciousness in the pot is Cantonese, Sichuanese, Japanese or French. \n" +
                "Hong Kong has a humid sub-tropical climate. Summers are hot and wet while winters are dry but milder. Temperatures across the year vary from lows of 13C in January to highs of 31C in July and August.\n" +
                "Top attractions:\n" +
                "•\tHigh Island Reservoir East Dam\n" +
                "•\tVictoria Peak\n" +
                "•\tMan Mo Temple\n" +
                "•\tHappy Valley Racecourse\n" +
                "•\tBo Innovation \n" +
                "•\tPeak Tram\n" +
                "•\tHong Kong Museum of History\n" +
                "•\tTemple Street Night Market\n" +
                "•\tChi Lin Nunnery\n" +
                "Eat:\n" +
                "•\tChullschick\n" +
                "•\tOMG Mamaday\n" +
                "•\tTosca di Angelo \n" +
                "•\t8Five2 Restobar\n" +
                "•\tNagasakayaki\n" +
                "•\tYan toh Heen \n" +
                "•\tThe Lounge & Bar\n" +
                "•\tScarlett Cafe & Wine Bar\n" +
                "•\tTeppanyaki Sessyu\n" +
                "Sleep:\n" +
                "•\tHong Kong SkyCity Marriott Hotel\n" +
                "•\tL’hotel Nina et Convention Centre\n" +
                "•\tRoyal Plaza Hotel\n" +
                "•\tHong Kong Disneyland Hotel\n" +
                "•\tThe Ritz-Carlton, Hong Kong\n" +
                "•\tCourtyard Hong Kong\n" +
                "•\tHong Kong Gold Coast Hotel\n", "Modern"));

        this.historicDestinations.add(new Destination("London", "One of the world’s most visited cities, London has something for everyone: from history and culture to fine food and good times.\n" +
                "Immersed in history, London's rich seams of eye-opening antiquity are everywhere. The city's buildings are striking milestones in a unique and beguiling biography, and a great many of them – the Tower of London, Westminster Abbey, Big Ben – are instantly recognisable landmarks. There’s more than enough innovation (the Shard, the Tate Modern extension, the Sky Garden) to put a crackle in the air, but it never drowns out London’s seasoned, centuries-old narrative. Architectural grandeur rises up all around you in the West End, ancient remains dot the City and charming pubs punctuate the historic quarters, leafy suburbs and river banks. Take your pick.\n" +
                "\n" +
                "Attractions:\n" +
                "- Westminster Abbey\n" +
                "- St Paul’s Cathedral\n" +
                "- Natural History Museum\n" +
                "- Tower of London\n" +
                "- Tate Modern\n" +
                "- British Museum\n" +
                "- National Gallery\n" +
                "\n" +
                "Restaurants:\n" +
                "- Clove Club\n" +
                "- Silo\n" +
                "- Petersham Nurseries Cafe\n" +
                "- Rabbit\n" +
                "- Dans Le Noir\n" +
                "- Hawksmoor Spitalfields\n" +
                "\n" +
                "Hotels:\n" +
                "- Haymarket Hotel\n" +
                "- The Beaumont Hotel \n" +
                "- Lime Tree Hotel\n" +
                "- The Zetter Townhouse Marylebone\n" +
                "- Hazlitt’s\n" +
                "- The Rookery\n" +
                "- South Place Hotel\n", "Historic"));

        this.historicDestinations.add(new Destination("Rome", "A heady mix of haunting ruins, awe-inspiring art and vibrant street life, Italy’s hot-blooded capital is one of the world’s most romantic and charismatic cities.\n" +
                "The result of 3000 years of ad hoc urban development, Rome's cityscape is an exhilarating sight. Ancient icons such as the Colosseum, Roman Forum and Pantheon recall the city’s golden age as caput mundi (capital of the world), while monumental basilicas tell of its history as seat of the Catholic Church. Lording it over the skyline, St Peter’s Basilica towers over the Vatican, testifying to the ambition of Rome’s Renaissance popes and the genius of its game-changing architects. Elsewhere, ornate piazzas and showy fountains add a baroque flourish to the city's captivating streets.\n" +
                "\n" +
                "A trip to Rome is as much about lapping up the dolce vita lifestyle as gorging on art and culture. Idling around picturesque streets, whiling away hours at streetside cafes, people-watching on pretty piazzas – these are all central to the Roman experience. The tempo rises in the evening when fashionable drinkers descend on the city’s bars and cafes for a sociable aperitivo (drink with snacks) and trattorias hum with activity. Elsewhere, cheerful hordes mill around popular haunts before heading off to hip cocktail bars and late-night clubs.\n" +
                "\n" +
                "Attractions:\n" +
                "- Vatican Museums \n" +
                "- Roman Forum\n" +
                "- St Peter’s Basilica\n" +
                "- Palatino\n" +
                "- Colosseum\n" +
                "- Museo e Galleria Borghese\n" +
                "- Pantheon\n" +
                "- Piazza Navona\n" +
                "- Trevi Fountain\n" +
                "- Gallerie Nazionali: Palazzo Barberini\n" +
                "\n" +
                "Restaurants:\n" +
                "- Colline Emiliane \n" +
                "- Neve di Latte \n" +
                "- Rimessa Roscioli\n" +
                "- Bonci Pizzarium\n" +
                "- Le Levain\n" +
                "- Giselda\n" +
                "- Zia Restaurant\n" +
                "- Trapizzino\n" +
                "\n" +
                "Hotels:\n" +
                "- Villa della Fonte\n" +
                "- Residenza Maritti Contemporary Suite\n" +
                "- Villa Spalletti Trivelli-Small Luxury Hotels of the world\n" +
                "- The RomeHello\n" +
                "- Palazzo Scanderbeg\n" +
                "- Le Stanze Di Orazio\n" +
                "- 66 Imperial Inn Deluxe B&B\n" +
                "\n", "Historic"));

        this.historicDestinations.add(new Destination("Kathmandu", "For many, stepping off a plane into Kathmandu is an eye-pleasing experience, a riot of sights, sounds and smells that can quickly lead to sensory overload. Whether you’re barrelling through the traffic-jammed alleyways of the old town in a rickshaw, marvelling at the medieval temples or dodging trekking touts in the backpacker district of Thamel, Kathmandu can be an intoxicating, amazing and exhausting place.\n" +
                " \n" +
                "Stroll through the backstreets and Kathmandu’s timeless cultural and artistic heritage still reveals itself in hidden temples overflowing with marigolds, courtyards full of drying chillies and rice, and tiny hobbit-sized workshops.\n" +
                "This endlessly fascinating, sometimes infuriating city has enough sights to keep you busy for a week, but be sure to leave its backpacker comforts and explore the ‘real Nepal’ before your time runs out.\n" +
                "The climate here is mild, and generally warm and temperate. The summers are much rainier than the winters in Kathmandu. In Kathmandu, the average annual temperature is 18.1 °C | 64.5 °F.\n" +
                "Attractions:\n" +
                "•\tDurbar Square\n" +
                "•\tHanuman Dhoka\n" +
                "•\tItum Bahal\n" +
                "•\tJan Bahal\n" +
                "•\tAsan Tole\n" +
                "•\tTaleju Temple\n" +
                "•\tGarden of Dreams\n" +
                "Eat:\n" +
                "•\tKantipur Tandoori House\n" +
                "•\tWhite House Kitchen\n" +
                "•\tThakali Restaurant\n" +
                "•\tFusion Himalaya cafe & Restaurant\n" +
                "•\tLa Dolce Vita\n" +
                "•\tKathmandu Steak House Restaurant\n" +
                "•\tMelrose Restaurant & Bar\n" +
                "•\tFrench Creperie Kathmandu\n" +
                "•\tRoadhouse Cafe Thamel\n" +
                "•\tFire And Ice Pizzeria\n" +
                "Sleep:\n" +
                "•\tThe Dwarika’s Hotel\n" +
                "•\tKantipur Temple House\n" +
                "•\tHotel Tibet\n" +
                "•\tHotel Mulberry\n" +
                "•\tAmbassador Garden Home\n" +
                "•\tDalai-La Boutique Hotel\n" +
                "•\tHotel Moonlight\n" +
                "•\tWorld Heritage Hotel and Apartments\n" +
                "•\tHotel Shanker\n" +
                "•\tFuji Hotel\n" +
                " \n", "Historic"));

        this.historicDestinations.add(new Destination("Athens", "With equal measures of grunge and grace, Athens is a heady mix of ancient history and contemporary cool.\n" +
                "The cultural and social life of Athens plays out amid, around and in landmarks that are centuries old, if not millennia. The remnants of Ancient Greece get the most attention, of course, thanks to a little thing called democracy. Oh, and mythology, and drama, and philosophy. But don't overlook the 'later' years: thousand-year-old Byzantine churches, for instance, which squat, unruffled in the middle of streets and attached to hillsides. Ottoman traces can be seen in architecture and in food. And the neoclassical style of the 19th century adds elegance all over the centre.\n" +
                "Beyond Athens, down the Attica peninsula, are more spectacular antiquities, such as the Temple of Poseidon at Sounion and the site of Ancient Eleusis, as well as very good beaches, such as those near historical Marathon. Sure, you could zip across, west to east, in less than an hour, but it's far more fun to take a leisurely road trip to a thermally heated lake, say, or a monastery with dazzling Byzantine mosaics. If you'd rather not drive, most of these surprise sights (including great beaches) can be reached on public transport.\n" +
                "\n" +
                "Attractions:\n" +
                "- Acropolis Museum\n" +
                "- Parthenon\n" +
                "- Acropolis\n" +
                "- Kerameikos\n" +
                "- Ancient Agora \n" +
                "- Athens & Epidaurus Festival\n" +
                "- Temple of Athena Nike\n" +
                "- National Archaeological Museum\n" +
                "- Greek National Opera\n" +
                "Restaurants:\n" +
                "- Sushimou \n" +
                "- Ergon House Agora\n" +
                "- Hytra\n" +
                "- Veneti\n" +
                "- Diporto Agoras\n" +
                "- Damigos\n" +
                "- Akordeon\n" +
                "\n" +
                "Hotels:\n" +
                "- The Foundry Suites\n" +
                "- Athens Quinta\n" +
                "- COCO- MAT Athens Jumelle\n" +
                "- InnAthens\n" +
                "- Perianth Hotel\n" +
                "- AthensWas Design Hotel\n" +
                "- City Circus Athens\n", "Historic"));

        this.historicDestinations.add(new Destination("Egypt", "Egypt welcomes you with its mighty Nile and magnificent monuments, the beguiling desert and lush delta, and with its long past and welcoming, story-loving people.\n" +
                "The last remaining wonder of the ancient world; for nearly 4000 years, the extraordinary shape, impeccable geometry and sheer bulk of the Giza Pyramids have invited the obvious questions: ‘How were we built, and why?’. Centuries of research have given us parts of the answer. Built as massive tombs on the orders of the pharaohs, they were constructed by teams of workers tens-of-thousands strong. Today they stand as an awe-inspiring tribute to the might, organisation and achievements of ancient Egypt.\n" +
                "The old saying that Egypt is the gift of the Nile still rings true: without the river there would be no fertile land, no food and a lot less electricity. Although people’s lives are increasingly physically detached from the water, the Nile still exerts a uniquely powerful role. Luckily for visitors, the river is also the perfect place from which to see many of the most spectacular ancient monuments, which is one reason why a Nile cruise remains such a popular way to travel.\n" +
                "Attractions:\n" +
                "- Amun Temple Enclosure\n" +
                "- St Catherine’s Monastery\n" +
                "- Temple of Horus\n" +
                "- Temple of Seti I\n" +
                "- White Desert National Park\n" +
                "- Valley of the Kings\n" +
                "- Great Pyramid of Khufu\n" +
                "- Pyramids of Giza\n" +
                "- Egyptian Museum\n" +
                "- Saqqara\n" +
                "- Karnak\n" +
                "\n" +
                "Restaurants:\n" +
                "- Greek Club\n" +
                "- Kadoura\n" +
                "- Rangoli\n" +
                "- Abu Tarek\n" +
                "\n" +
                "Hotels:\n" +
                "- Nakhil Inn\n" +
                "- Hilton Luxor Resort & Spa\n" +
                "- Al Moudira\n" +
                "- Movenpick Resort El Quseir\n", "Historic"));

        this.historicDestinations.add(new Destination("Khiva", "The historic heart of Khiva(Xiva) has been so well preserved that it is sometimes criticized as lifeless – a ‘museum city’. But walk through the city gates and wander the fabled Ichon-Qala (inner walled city) in all its monotone, mud-walled glory and it is hard not to feel like you are stepping into another era.\n" +
                "Try to spend at least one night in Khiva. The old town is at its best at dawn, sunset and by night, when the moonlit silhouettes of the tilting minarets and medressas, viewed from twisting alleyways , work their real magic.\n" +
                "Story relates the name of the city that travelers passing through the city, upon drinking the excellent water, would exclaim: Khey vakh! (What a pleasure!) and hence the city became known as Kheyvakh, whence Khiva. \n" +
                "Attractions:\n" +
                "- Ichon-Qala\n" +
                "- Kuhna Ark\n" +
                "- Tosh-Hovli Palace\n" +
                "- Pahlavon Mahmud Mausoleum\n" +
                "- Kalta Minor Minaret\n" +
                "- City Walls\n" +
                "- Islom Hoja Minaret\n" +
                "- Juma Mosque\n" +
                "- Zindon\n" +
                "\n" +
                "Restaurants:\n" +
                "- Khorezm Art\n" +
                "- Terrasse\n" +
                "- Zarafshan\n" +
                "- Kheivak\n" +
                "\n" +
                "Hotels:\n" +
                "- Meros B&B\n" +
                "- Islambek Hotel\n" +
                "- Arkanchi Hotel\n" +
                "- Shaherezada Boutique Hotel \n","Historic"));

        this.adventureDestinations.add(new Destination("Amalfi Coast", "Deemed an outstanding example of a Mediterranean landscape by Unesco, the Amalfi Coast is one of Italy's most memorable destinations. Here, mountains plunge into the sea in a nail-biting vertical scene of precipitous crags, cliff-clinging abodes and verdant woodland.\n" +
                "\n" +
                "There are so many reasons the Amalfi Coast continues to be at the top of honeymooner’s bucket lists. It’s hard to picture a more classically romantic scene than Positano’s steep village streets, Moorish architecture, azure water and colorful loungers and umbrellas lining the dark sandy beaches. Its string of fabled towns read like a Hollywood cast list. There's jet-set favourite Positano, a pastel-coloured cascade of chic boutiques, spritz-sipping pin-ups and sun-kissed sunbathers. Further east, ancient Amalfi lures with its Arabic-Norman cathedral, while mountaintop Ravello stirs hearts with its cultured villas and Wagnerian connection. To the west lies Amalfi Coast gateway Sorrento, a handsome clifftop resort that has miraculously survived the onslaught of package tourism.\n" +
                "Turquoise seas and cinematic piazzas aside, the region is home to some of Italy's finest hotels and restaurants. It's also one of the country's top spots for hiking, with well-marked trails providing the chance to escape the star-struck coastal crowds.\n" +
                " \n" +
                "Amalfi Coast’s coldest winter of January sees lowest of 3 degrees while the summer days in July and August have an average of lowest 18 and highest of just below 30 degrees. \n" +
                "\n" +
                "Attractions:\n" +
                "- Cattedrale di Sant’Andrea\n" +
                "- Villa Rufolo\n" +
                "- Villa Cimbrone \n" +
                "- Marina di Praia\n" +
                "- Chiostro del Paradiso\n" +
                "- Baia di Ieranto\n" +
                "\n" +
                "Food:\n" +
                "•\tDa Gemma\n" +
                "•\tDa Ciccio Cielo Mare E TErra\n" +
                "•\tLe Bonta del Capo\n" +
                "•\tPizzeria Donna Stella\n" +
                "•\tTorre Normanna Restaurant\n" +
                "•\tRistorante Costa Diva\n" +
                "•\tTrattoria Da Maria\n" +
                "•\tLa Smeraldino\n" +
                "•\tRistorante Savo\n" +
                "•\tStella Maris\n" +
                "\n" +
                "Sleep:\n" +
                "•\tSanta Caterina Hotel\n" +
                "•\tHotel Margherita\n" +
                "•\tExcelsior Grand Hotel\n" +
                "•\tHotel Marina Riviera\n" +
                "•\tHotel Pellegrino<hotel Onda Verde\n" +
                "•\tPensione Maria Luisa\n" +
                "•\tHotel Luna Convento\n" +
                "•\tHotel Aurora\n" +
                "•\tHotel Tramonto d’Oro\n", "Adventure"));

        this.adventureDestinations.add(new Destination("Patagonia", "On South America’s southern frontier, nature grows wild, barren and beautiful. Spaces are large, as are the silences that fill them. For the newly arrived, such emptiness can be as impressive as the sight of Patagonia’s jagged peaks, pristine rivers and dusty backwater oases. In its enormous scale, Patagonia offers a wealth of potential experiences and landscapes.\n" +
                " \n" +
                "Though now mostly paved, lonely RN 40 remains the iconic highway that stirred affection in personalities as disparate as Butch Cassidy and Bruce Chatwin. On the eastern seaboard, paved RN 3 shoots south, connecting oil boomtowns with ancient petrified forests, Welsh settlements and the incredible Península Valdés. Then there is the other, trendy Patagonia where faux-fur hoodies outnumber the guanacos. Don’t miss the spectacular sights of El Calafate and El Chaltén, but remember that they’re a world apart from the whistling solitude of the steppe.\n" +
                "Attractions:\n" +
                "- Glaciar Perito Moreno\n" +
                "- Parque Nacional Los Glaciares \n" +
                "- Museo Paleontologico Egidio Feruglio\n" +
                "- Glaciarium\n" +
                "- EcoCentro\n" +
                " \n" +
                "Hotels:\n" +
                "- Aguas Arriba Lodge\n" +
                "- Hotel EI Pedral\n" +
                "- Bahia Bustamante Lodge\n" +
                "- Hi Patagonia Hostel\n" +
                "- Las Bayas\n" +
                " \n" +
                "Restaurants:\n" +
                "- En Mis Fuegos\n" +
                "- Pura Vida\n" +
                "- La Tapere\n" +
                "- Legua 50s\n", "Adventure"));

        this.adventureDestinations.add(new Destination("Austria", "Austria is mainly known for its alpine ski slopes in the winter and rolling green hills and mountain trails for hiking in the warmer months. But when two-thirds of the country is blanketed in snow, there’s plenty of ground for adventure activities that you might not know about. \n" +
                "\n" +
                "Beyond skiing and snowboarding, you can also carve the snow via a fat bike or Segway, or snowshoe your way around the valley fringes. For adventure travelers feeling a need for speed, you can toboggan down a mountain side. Or, if you want a more physically challenging extreme adventure, climb a frozen wall. \n" +
                "\n" +
                "Warmer months uncover countless deep, rocky caverns that are perfect for canyoning, forests fit for climbing parks and zip lines, and fast-flowing rivers awaiting whitewater rafters. You can get up high and take on a bridge bungee jump, clamber a mountain region on a Via Ferrara route, or take to the skies by paragliding over verdant valleys.\n" +
                "\n" +
                "Attractions:\n" +
                "- Schloss Ambras\n" +
                "- Staatsoper\n" +
                "- Schloss Hellbrunn\n" +
                "- Stephansdom\n" +
                "- Festung Hohensalzburg \n" +
                "- Eisriesenwelt\n" +
                "- MuseumsQuartier\n" +
                "- Burgtheater\n" +
                "\n" +
                "Hotels:\n" +
                "- HimmLhof\n" +
                "- Burg Bernstein\n" +
                "- Serviced Apartments VILLA LICHT\n" +
                "- Chalet Hotel Senger\n" +
                "- Hotel Sacher Wien\n" +
                "- Stadthotel Brunner\n" +
                "- Hotel Rita\n" +
                "- Hotel Gotthard\n" +
                "\n" +
                "Restaurants:\n" +
                "- Mamamon\n" +
                "- Steirereck im Stadtpark\n" +
                "- T.O.M.R\n" +
                "- Schulhaus\n" +
                "- Thomawirt\n", "Adventure"));

        this.adventureDestinations.add(new Destination("Galapagos Island", "You will see more wildlife in eight minutes underwater in the Galapagos than in eight hours on land, said my naturalist guide as I put on my mask.\n" +
                "\n" +
                "Within just a few minutes of snorkeling near Devil’s Crown, an extinct collapsed volcanic cone in the ocean near Floreana Island, I witnessed a beautiful spotted eagle ray gently flying underwater above lavender and green coral reefs. A giant sea turtle, a pretty chocolate chip starfish, and a few white-tip reef sharks cruised the reef as sea lions and vibrant fish swim around me near the surface. It was pure magic!\n" +
                "\n" +
                "Located in the Pacific Ocean approximately 600 miles west Ecuador, the Galapagos Islands are heaven on earth for animal lovers and outdoor adventurers.\n" +
                "\n" +
                "From sunbathing Galapagos sea lions on the beach at Gardner Bay and blue-footed boobies and waved albatrosses on the rocks of Española to wise old Galapagos tortoises in the highlands of Santa Cruz, there’s no doubt that exploring these enchanted isles by both land and sea yields many other-worldly wonders. \n" +
                " \n" +
                "Attractions:\n" +
                "- Charles Darwin Research Station\n" +
                "- Puerto Egas\n" +
                "- Darwin Lake\n" +
                "- Tortuga Bay\n" +
                "- Leon Dormido\n" +
                "- Volcan Wolf\n" +
                "- Interpretation Center\n" +
                "\n" +
                "Hotels:\n" +
                "- Casa Iguana Mar y Sol\n" +
                "- Hotel Casa Blanca \n" +
                "- Finch Bay Galapagos Hotel\n" +
                "- Hotel Albemarle\n" +
                "- Hotel Volcano\n" +
                "- La Casa de Marita\n" +
                " \n" +
                "Restaurants:\n" +
                "- Oasis\n" +
                "- Coco Surf\n" +
                "- Galapagos Deli\n" +
                "- Isla Grill\n" +
                "- Almar\n", "Adventure"));
    }




    //Used by listView to list all destinations

    /**
     * get all leisure destinations method, used by second listview when user chose leisure purpose then the second listview will use this method.
     * The same to other methods below
     *
     * @return
     */
    public List<Destination> getAllLeisureDestinations () {
        return this.leisureDestinations;
    }

    public List<Destination> getAllFamilyDestinations () { return this.familyDestinations; }

    public List<Destination> getAllHoneymoonDestinations () { return this.honeymoonDestinations; }

    public List<Destination> getAllModernDestinations () { return this.modernDestinations; }

    public List<Destination> getAllHistoricDestinations () { return this.historicDestinations; }

    public List<Destination> getAllAdventureDestinations () { return this.adventureDestinations; }

    /**
     * get a destination by knowing its index
     * @param indexOfDestination
     * @return
     */
    public Destination getLeisureDestination (int indexOfDestination) {
        return this.leisureDestinations.get(indexOfDestination);
    }

    public Destination getFamilyDestination (int indexOfDestination) {
        return this.familyDestinations.get(indexOfDestination);
    }

    public Destination getHoneymoonDestination (int indexOfDestination) {
        return this.honeymoonDestinations.get(indexOfDestination);
    }

    public Destination getModernDestination (int indexOfDestination) {
        return this.modernDestinations.get(indexOfDestination);
    }

    public Destination getHistoricDestination (int indexOfDestination) {
        return this.historicDestinations.get(indexOfDestination);
    }

    public Destination getAdventureDestination (int indexOfDestination) {
        return this.adventureDestinations.get(indexOfDestination);
    }

    /**
     * adding a destination to the list of its category
     * @param destination
     */

    public void addLeisureDestination (Destination destination) {
        this.leisureDestinations.add(destination);
    }

    public void addFamilyDestination (Destination destination) {
        this.familyDestinations.add(destination);
    }

    public void addHoneymoonDestination (Destination destination) {
        this.honeymoonDestinations.add(destination);
    }

    public void addModernDestination (Destination destination) {
        this.modernDestinations.add(destination);
    }

    public void addHistoricDestination (Destination destination) {
        this.historicDestinations.add(destination);
    }

    public void addAdventureDestination (Destination destination) {
        this.adventureDestinations.add(destination);
    }

}
