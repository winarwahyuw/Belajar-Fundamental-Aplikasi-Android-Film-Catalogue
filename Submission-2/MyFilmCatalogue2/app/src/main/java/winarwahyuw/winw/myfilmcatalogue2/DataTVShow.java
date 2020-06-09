package winarwahyuw.winw.myfilmcatalogue2;

import java.util.ArrayList;

public class DataTVShow {
    public static String[] Title={
            "Grey Anatomi",
            "The Umbrella",
            "The Simpson",
            "Shameless",
            "NCIS",
            "Naruto Shipudden",
            "Dragon Ball",
            "Flash",
            "Family Guy",
            "Supergirl",
    };
    public static String [] Desc={
            "Grey's Anatomy is a medical drama television series that premiered on March 27, 2005, on the American Broadcasting Company (ABC) as a mid-season replacement. The fictional series focuses on the lives of surgical interns, residents, and attending doctors, as they develop into seasoned doctors while trying to maintain personal lives and relationships. The title is an allusion to Gray's Anatomy, a classic human anatomy textbook first published in 1858 in London and written by Henry Gray. Shonda Rhimes developed the pilot and continues to write for the series; she is also one of the executive producers, along with Betsy Beers, Mark Gordon, Krista Vernoff, Rob Corn, Mark Wilding, and Allan Heinberg.",
            "The Umbrella Academy is an American superhero web television series based on the comic book series of the same name published by Dark Horse Comics. Developed by Steve Blackman and Jeremy Slater for Netflix, it revolves around a dysfunctional family of adopted sibling superheroes who reunite to solve the mystery of their father's death and the threat of an impending apocalypse. The series is produced by Borderline Entertainment, Dark Horse Entertainment, and Universal Cable Productions.",
            "The Simpsons is an American animated sitcom created by Matt Groening for the Fox Broadcasting Company. The series is a satirical depiction of working-class life, epitomized by the Simpson family, which consists of Homer, Marge, Bart, Lisa, and Maggie. The show is set in the fictional town of Springfield and parodies American culture and society, television, and the human condition.The Simpsons is an American animated sitcom created by Matt Groening for the Fox Broadcasting Company. The series is a satirical depiction of working-class life, epitomized by the Simpson family, which consists of Homer, Marge, Bart, Lisa, and Maggie. The show is set in the fictional town of Springfield and parodies American culture and society, television, and the human condition.",
            "Shameless is an American comedy-drama television series developed by John Wells which debuted on Showtime on January 9, 2011. It is an adaptation of Paul Abbott's British series of the same name and features an ensemble cast led by William H. Macy and Emmy Rossum. The show is set in the South Side of Chicago and filmed throughout the city, as well as Los Angeles.\n With the premiere of the ninth season on September 9, 2018, Shameless became the longest-running original scripted series in Showtime's history. In January 2019, the series was renewed for a tenth season, which premiered on November 10, 2019. In January 2020, the series was renewed for its eleventh and final season to premiere in mid-2020.",
            "NCIS: Los Angeles is an American action television series combining elements of the military drama and police procedural genres, which premiered on CBS on September 22, 2009, and stars Chris O'Donnell and LL Cool J. The series follows the exploits of the Los Angeles–based Office of Special Projects (OSP), an elite division of the Naval Criminal Investigative Service that specializes in undercover assignments. NCIS: Los Angeles is the first spin-off of the successful series NCIS. Nia Long joined the cast as Shay Mosley for the ninth season after Miguel Ferrer's death. On April 18, 2018, CBS renewed the series for a tenth season, which premiered on September 30, 2018. On April 22, 2019, CBS renewed the series for an eleventh season which premiered on September 29, 2019.",
            "Naruto (ナルト) is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks to gain recognition from his peers and also dreams of becoming the Hokage, the leader of his village. The story is in two parts, the first set in Naruto's pre-teen years, and the second in his teens. The series is based on two one-shot manga by Kishimoto: Karakuri (1995), which earned Kishimoto an honorable mention in Shueisha's monthly Hop Step Award the following year, and Naruto",
            "Dragon Ball (Japanese: ドラゴンボール, Hepburn: Doragon Bōru) is a Japanese media franchise created by Akira Toriyama in 1984. The initial manga, written and illustrated by Toriyama, was serialized in Weekly Shōnen Jump from 1984 to 1995, with the 519 individual chapters collected into 42 tankōbon volumes by its publisher Shueisha. Dragon Ball was initially inspired by the classical Chinese novel Journey to the West, as well as Hong Kong martial arts films. The series follows the adventures of the protagonist, Son Goku, from his childhood through adulthood as he trains in martial arts. He spends his childhood far from civilization until he meets a teen girl named Bulma, who encourages him to join her quest in exploring the world in search of the seven orbs known as the Dragon Balls, which summon a wish-granting dragon when gathered. Along his journey, Goku makes several other friends, becomes a family man, discovers his alien heritage, and battles a wide variety of villains, many of whom also seek the Dragon Balls.",
            "The Flash is an American superhero television series developed by Greg Berlanti, Andrew Kreisberg, and Geoff Johns, airing on The CW. It is based on the DC Comics character Barry Allen / Flash, a costumed superhero crime-fighter with the power to move at superhuman speeds. It is a spin-off from Arrow, existing in the same fictional universe. The series follows Barry Allen, portrayed by Grant Gustin, a crime scene investigator who gains super-human speed, which he uses to fight criminals, including others who have also gained superhuman abilities.",
            "Family Guy is an American animated sitcom television series created by Seth MacFarlane for the Fox Broadcasting Company. The series centers on the Griffins, a family consisting of parents Peter and Lois; their children, Meg, Chris, and Stewie; and their anthropomorphic pet dog, Brian. The show is set in the fictional city of Quahog, Rhode Island, and exhibits much of its surreal & dark humor[2] in the form of metafictional cutaway gags that often lampoon American culture.",
            "Supergirl is an American superhero television series developed by Ali Adler, Greg Berlanti and Andrew Kreisberg that originally aired on CBS and premiered on October 26, 2015. It is based on the DC Comics character Supergirl, created by Otto Binder and Al Plastino, and stars Melissa Benoist in the title role. Supergirl is a costumed superheroine who is Superman's cousin and one of the last surviving Kryptonians. The series is the third series set in the Arrowverse, sharing continuity with the other television series of the franchise."

    };

    private static int[]imgData={
            R.drawable.tv1_poster_grey_anatomy,
            R.drawable.tv2_poster_the_umbrella,
            R.drawable.tv3_poster_the_simpson,
            R.drawable.tv4_poster_shameless,
            R.drawable.tv5_poster_ncis,
            R.drawable.tv6_poster_naruto_shipudden,
            R.drawable.tv7_poster_dragon_ball,
            R.drawable.tv8_poster_flash,
            R.drawable.tv9_poster_family_guy,
            R.drawable.tv10_poster_supergirl
    };

    public static ArrayList<TVShow>getListData(){
        ArrayList<TVShow> list=new ArrayList<>();
        for(int i=0; i< imgData.length; i++){
            TVShow tvShow=new TVShow();
            tvShow.setTVShowTitle(Title[i]);
            tvShow.setTVShowDesc(Desc[i]);
            tvShow.setTVShowPhoto(imgData[i]);
            list.add(tvShow);
        }

        return list;
    }
}
