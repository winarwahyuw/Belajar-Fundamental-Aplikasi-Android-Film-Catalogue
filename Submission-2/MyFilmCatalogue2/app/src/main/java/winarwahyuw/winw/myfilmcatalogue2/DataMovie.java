package winarwahyuw.winw.myfilmcatalogue2;

import java.util.ArrayList;

import javax.security.auth.Destroyable;

public class DataMovie {
    public static String[]title={
            "A Star Is Born",
            "Aquaman",
            "Avengers Infinity",
            "Bird Box",
            "Bohemian",
            "BumbleBee",
            "Creed II",
            "Deadpool",
            "How to Train Your Dragon",
            "Spiderman Into the Spider-Verse"
    };
    public static String [] genre= {
            "Genre :Musical-Romantic Drama",
            "Genre :Action and Adventure, Fantasy, Sci-Fi",
            "Genre :Fantasy, Sci-Fi",
            "Genre :Post-Apocalyptic",
            "Genre :Progressive Rock",
            "Genre :Action and Adventure, Fantasy, Sci-Fi",
            "Genre :Action and Adventure, Comedy, Superhero",
            "Genre :Action and Adventure, Drama, Sports",
            "Genre :Action and Adventure, Fantasy, Animation",
            "Genre :Superhero, Fantasy, Action",
    };
    public static String [] desc={
            "A Star Is Born is a 2018 American musical romantic drama film produced and directed by\n" +
                            "                Bradley Cooper and written by Eric Roth, Cooper and Will Fetters. It stars Cooper, Lady Gaga, Dave Chappelle,\n" +
                            "                Andrew Dice Clay, and Sam Elliott, and follows a hard-drinking musician (Cooper) who discovers and falls in\n" +
                            "                love with a young singer (Gaga). It is the third remake of the original 1937 film, after the 1954 musical and the 1976 musical.\n" +
                            "                Talks of a remake of A Star Is Born began in 2011, with Clint Eastwood attached to direct and Beyoncé set to star.\n" +
                            "                The film was in development hell for several years with various actors approached to co-star,\n" +
                            "                including Christian Bale, Leonardo DiCaprio, Jennifer Lopez, Will Smith, and Tom Cruise. In March 2016, Cooper signed on to star\n" +
                            "                and direct, and Lady Gaga joined the cast in August 2016. Principal photography began at the Coachella Valley Music and Arts\n" +
                            "                Festival in April 2017. A Star Is Born premiered at the 75th Venice International Film Festival on August 31, 2018,\n" +
                            "                and was theatrically released in the United States on October 5, 2018, by Warner Bros. It was a critical and commercial success,\n" +
                            "                grossing over $434 million worldwide and receiving praise for Cooper, Gaga, and Elliott\\'s performances and Cooper\\'s direction,\n" +
                            "                as well as the screenplay, cinematography and music. It was chosen by both the National Board of Review and American Film Institute\n" +
                            "                as one of the Top 10 Films of 2018.",

            "Aquaman is a 2018 American superhero film based on the DC Comics character of the same name. Distributed by Warner Bros.\n" +
                            "                Pictures, it is the sixth film in the DC Extended Universe (DCEU). The film was directed by James Wan, from a screenplay by David\n" +
                            "                Leslie Johnson-McGoldrick and Will Beall and stars Jason Momoa as Aquaman, with Amber Heard, Willem Dafoe, Patrick Wilson, Dolph\n" +
                            "                Lundgren, Yahya Abdul-Mateen II, and Nicole Kidman in supporting roles. In the film, Aquaman sets out to lead the underwater\n" +
                            "                kingdom of Atlantis, replacing his half-brother, King Orm, who seeks to unite the seven underwater kingdoms against the surface world.",
            "Avengers: Infinity War is a 2018 American superhero film based on the Marvel Comics superhero team the Avengers, produced by\n" +
                            "                Marvel Studios and distributed by Walt Disney Studios Motion Pictures. It is the sequel to 2012\\'s The Avengers and 2015\\'s Avengers:\n" +
                            "                Age of Ultron, and the nineteenth film in the Marvel Cinematic Universe (MCU). It was directed by Anthony and Joe Russo, written by\n" +
                            "                Christopher Markus and Stephen McFeely, and features an ensemble cast including Robert Downey Jr., Chris Hemsworth, Mark Ruffalo,\n" +
                            "                Chris Evans, Scarlett Johansson, Benedict Cumberbatch, Don Cheadle, Tom Holland, Chadwick Boseman, Paul Bettany, Elizabeth Olsen,\n" +
                            "                Anthony Mackie, Sebastian Stan, Danai Gurira, Letitia Wright, Dave Bautista, Zoe Saldana, Josh Brolin, and Chris Pratt. In the film,\n" +
                            "                the Avengers and the Guardians of the Galaxy attempt to prevent Thanos from collecting the six all-powerful Infinity Stones as part\n" +
                            "                of his quest to kill half of all life in the universe.",
            "Bird Box can be viewed as one of the most intelligent movies in the current climate. It is a cleverly disguised science fiction film\n" +
                            "                where art imitates life. The viewer is brought along a metaphorical path submerged into the depths of ignorance as forced behavior.\n" +
                            "                Bird Box sensitively tackles the question of mental health in society. It delves into how it is perceived from those directly affected,\n" +
                            "                to those who view it and how those attitudes are communicated. The movie suggests a split in society, an \\‘us and them\\’ situation.\n" +
                            "                And one wonders whether the film would have been such a roaring success if these themes had been addressed more directly within its\n" +
                            "                narrative. Through clever symbolism, director Susanne Bier (The Night Manager) subtly gets her point across. In Bird Box, we are told\n" +
                            "                an unseen force has the power to cause people who stare towards it to become unbalanced and overwhelmed with the suggestion of suicide.\n" +
                            "                This in turn leads to the protagonist and main characters of the story wearing blindfolds in public to remain unaffected.",
            "Bohemian Rhapsody is a song by the British rock band Queen. It was written by Freddie Mercury for the band\\'s 1975 album A Night at\n" +
                            "                the Opera. It is a six-minute suite, consisting of several sections without a chorus: an intro, a ballad segment, an operatic passage,\n" +
                            "                a hard rock part and a reflective coda. The song is a more accessible take on the 1970s progressive rock genre. Upon its release as a\n" +
                            "                single, \\'Bohemian Rhapsody\\' became a commercial success, topping the UK Singles Chart for nine weeks and selling more than a million\n" +
                            "                copies by the end of January 1976. It reached number one again in 1991 for another five weeks when the same version was re-released\n" +
                            "                following Mercury\\'s death, eventually becoming the UK\\'s third-best-selling single of all time. It is also the only song to be the\n" +
                            "                UK Christmas number one twice by the same artist. It topped the charts in several other markets as well, including Canada, Australia,\n" +
                            "                New Zealand, Ireland, and The Netherlands, later becoming one of the best-selling singles of all time selling over six million\n" +
                            "                copies worldwide. In the United States, the song originally peaked at number nine in 1976, but returned to the chart in 1992 after\n" +
                            "                being used in the film Wayne\\'s World and reached a new peak of number two on the Billboard Hot 100. The release of the film of the\n" +
                            "                same name in 2018 resulted in renewed popularity and chart success worldwide for the song.",
            "Bumblebee is a 2018 American science fiction action film centered on the Transformers character of the same name. It is the\n" +
                            "                sixth installment of the live-action Transformers film series. Developed as a spin-off and prequel, it was later declared a reboot\n" +
                            "                of the franchise. Directed by Travis Knight and written by Christina Hodson, the film stars Hailee Steinfeld, John Cena, Jorge\n" +
                            "                Lendeborg Jr., John Ortiz, Jason Drucker, and Pamela Adlon and stars Dylan O\\'Brien (as the title character), Angela Bassett,\n" +
                            "                Justin Theroux, and Peter Cullen in voice roles. It was Knight\\'s first live-action film, as well as the first live-action\n" +
                            "                Transformers film not to be directed by Michael Bay, who instead acts as a producer. Principal photography on the film began on\n" +
                            "                July 31, 2017, in Los Angeles and San Francisco, California.",
            "Creed II is a 2018 American sports drama film directed by Steven Caple Jr., and written by Sylvester Stallone and Juel Taylor,\n" +
                            "                from a story by Sascha Penn and Cheo Hodari Coker. A sequel to Creed (2015) and the eighth installment in the Rocky film series,\n" +
                            "                it stars Michael B. Jordan, Stallone, Tessa Thompson, Dolph Lundgren, Florian Munteanu, Wood Harris, and Phylicia Rashad.\n" +
                            "                Creed writer-director Ryan Coogler serves as an executive producer on the film. The film follows a fight over 33 years in the making,\n" +
                            "                as Adonis Creed meets a new adversary in the ring: Viktor Drago, son of Ivan Drago, the powerful athlete who killed Adonis\\'\n" +
                            "                father Apollo Creed in 1985\\'s Rocky IV. A Creed sequel was confirmed in January 2016, although due to both Coogler and Jordan\\'s\n" +
                            "                involvement in Black Panther, the film was delayed, with Coogler ultimately being replaced by Caple. Stallone completed the script\n" +
                            "                in July 2017 and announced Lundgren would be reprising his role as Drago, and filming began in Philadelphia in March 2018,\n" +
                            "                lasting through June.",
            "Deadpool (Wade Winston Wilson) is a fictional character appearing in American comic books published by Marvel Comics. Created\n" +
                            "                by writer Fabian Nicieza and artist/writer Rob Liefeld, the character first appeared in The New Mutants #98 (cover-dated February\n" +
                            "                1991). Initially Deadpool was depicted as a supervillain when he made his first appearance in The New Mutants and later in issues\n" +
                            "                of X-Force, but later evolved into his more recognizable antiheroic persona. Deadpool, whose real name is Wade Wilson, is a\n" +
                            "                disfigured mercenary with the superhuman ability of an accelerated healing factor and physical prowess. The character is known\n" +
                            "                as the \"Merc with a Mouth\" because of his tendency to talk and joke constantly, including breaking the fourth wall for humorous\n" +
                            "                effect and running gags.",
            "How to Train Your Dragon: The Hidden World is a 2019 American computer-animated action fantasy film loosely based on the book\n" +
                            "                series of the same name by Cressida Cowell, produced by DreamWorks Animation and distributed by Universal Pictures. It is the\n" +
                            "                sequel to How to Train Your Dragon 2 (2014) and the final installment in the How to Train Your Dragon film trilogy. Written and\n" +
                            "                directed by Dean DeBlois, the film stars the voices of Jay Baruchel, America Ferrera, Cate Blanchett, Craig Ferguson, and F.\n" +
                            "                Murray Abraham. The film\\'s plot follows Hiccup seeking a dragon utopia called \"The Hidden World\" while coming to terms with\n" +
                            "                Toothless\\' new bond with a female Light Fury. How to Train Your Dragon: The Hidden World was released on January 3, 2019, in\n" +
                            "                Australia, and on February 22 in the United States. It is the first DreamWorks Animation film to be distributed by Universal\n" +
                            "                Pictures, after the end of their distribution deal with the now Disney-owned 20th Century Fox and its parent company NBCUniversal\n" +
                            "                acquiring DWA in 2016.",
            "Spider-Man: Into the Spider-Verse is a 2018 American computer-animated superhero film featuring the Marvel Comics character\n" +
                            "                Miles Morales or Spider-Man, produced by Columbia Pictures and Sony Pictures Animation in association with Marvel, and distributed\n" +
                            "                by Sony Pictures Releasing. It is the first animated feature film in the Spider-Man franchise, and is set in a shared multiverse\n" +
                            "                called the Spider-Verse, which has alternate universes. The film was directed by Bob Persichetti, Peter Ramsey, and Rodney\n" +
                            "                Rothman from a screenplay by Phil Lord and Rothman, and a story by Lord. It stars the voices of Shameik Moore, Jake Johnson,\n" +
                            "                Hailee Steinfeld, Mahershala Ali, Brian Tyree Henry, Lily Tomlin, Luna Lauren Velez, John Mulaney, Kimiko Glenn, Nicolas Cage,\n" +
                            "                and Liev Schreiber. In the film, Miles Morales joins other Spider-Men from various dimensions who team up to save New York City\n" +
                            "                from Kingpin."
    };
    public static int[] imgMovie={
            R.drawable.a_poster_a_star,
            R.drawable.b_poster_aquaman,
            R.drawable.c_poster_avengerinfinity,
            R.drawable.d_poster_birdbox,
            R.drawable.e_poster_bohemian,
            R.drawable.f_poster_bumblebee,
            R.drawable.g_poster_creed,
            R.drawable.h_poster_deadpool,
            R.drawable.i_poster_dragon,
            R.drawable.j_poster_spiderman
    };

    public static ArrayList<Movie> getListData(){
        ArrayList<Movie> list=new ArrayList<>();
        for(int i=0; i<title.length; i++){
            Movie movie=new Movie();
            movie.setMovieTitle(title[i]);
            movie.setMovieDesc(desc[i]);
            movie.setMoviePhoto(imgMovie[i]);
            list.add(movie);
        }
        return list;
    }
}
