package com.cg.historicalfiguresquiz;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;

import java.util.Random;

public class QuestionList {


    public int nQuestions[] = new int[] {R.drawable.lenin, R.drawable.bismark, R.drawable.caesar,R.drawable.che, R.drawable.churchill,R.drawable.dalai ,R.drawable.lizebeth,
            R.drawable.fidelcastro, R.drawable.franzferdinand, R.drawable.gandhi, R.drawable.gorbaciov, R.drawable.henryxiii, R.drawable.hiroto, R.drawable.hollande,
            R.drawable.husein,R.drawable.kenedy, R.drawable.ogedankhan, R.drawable.kimjongil, R.drawable.louisxiii, R.drawable.louisxiv,R.drawable.mandela, R.drawable.marcusaurelius, R.drawable.merkel,
            R.drawable.bonaparte, R.drawable.nixon, R.drawable.obama, R.drawable.pericles, R.drawable.peterthegreat, R.drawable.queenelizabeth, R.drawable.roosevelt, R.drawable.stalin,
            R.drawable.thatcher};

    public String nChoiches[][] = {

            {"Joseph Stalin","Vladimir Putin","Vladimir Lenin","Georgy Malenkov"},
            {"Wilhelm II", "Frederic I", "Otto Von Bismark", "Herman Goring"},
            {"Julius Caesar", "Marcus Aurelius", "Caligula", "Marcus Traianus"},
            {"Abel Santamaria", "Raul Castro", "Fidel Castro", "Cheguevara"},
            {"Harry Truman", "Franklin Roosevelt", "Winston Churchill", "Hermann Goering"},
            {"Sun Yat-sen", "Dalailama", "Mao Zedong", "Deng Xiaoping"},
            {"Queen Elizabeth", "Queen Mary", "Queen Elizabeth II", "Queen Mary II"},
            {"Carlos Hevia", "Carlos Davila", "Raul Castro", "Fidel Castro"},
            {"Franz Ferdinand", "Frederic I", "Franz Joseph I", "Friedrich von Beust"},
            {"Wilhelm II", "Martin Luther King", "Mahatma Gandhi", "Desmond Tutu"},
            {"Dmitry Medvedev", "Leonid Brezhnev", "Georgy Malenkov", "Mihail Gorbaciov"},
            {"Louis XIII", "Louis XIV", "Henry VIII", "Ludovic XIV"},
            {"Emperor Hirohito", "Emperor Kenzo", "Emperor Akihito", "Emperor Yoshihito"},
            {"Nicolas Sarkozy", "Francois Hollande", "Jacques Chirac", "Francois Mitterand"},
            {"Uday Hussein", "Muammar Al-Gaddafi", "Saddam Hussein", "Osama Bin Laden"},
            {"Lee Harvey Oswald", "John Kennedy", "Ronald Reagan", "Richard Nixon"},
            {"Tolui Khan", "Genghis Khan", "Ogedai Khan", "Godan Khan"},
            {"Kim Il-Sung", "Kim Jong-Il", "Kim Jong-Un", "Kim Ju-Ae"},
            {"Edward V", "Edward I", "Louis XIV", "Louis XIII"},
            {"Louis XIV", "James II", "Harold Godwinson", "Herman Goring"},
            {"Nelson Mandela", "Martin Luthor King", "Winnie Mandela", "Jacob Zuma"},
            {"Nero", "Marcus Aurelius", "Marcus Antonius", "Augustus"},
            {"Margaret Thatcher", "Julia Gillard", "Hillary Clinton", "Angela Merkel"},
            {"Napoleon III", "Napoleon Bonaparte", "Joseph Bonaparte", "Napoleon II"},
            {"George W.Bush", "Jimmy Carter", "Richard Nixon", "Bill Clinton"},
            {"Barack Obama", "George H.W.Bush", "Gerald Ford", "Herbert Hoover"},
            {"Pericles", "Socrate", "Solon", "Plato"},
            {"Nicholas II", "Alexander II", "Peter The Great", "Ivan The Terrible"},
            {"Catherine The Great", "Elizabeth II", "Elizabeth Of Russia", "Queen Victoria"},
            {"Theodore Roosevelt", "Dwight Eisenhower", "Warren Harding", "Franklin Roosevelt"},
            {"Adolf Hitler", "Joseph Stalin", "Benito Mussolini", "Leon Trotsky"},
            {"Princess Diana", "Carol Thatcher", "Theresa May", "Margaret Thatcher"},

    };


    public String nAnswers[] = {"Vladimir Lenin", "Otto Von Bismark", "Julius Caesar", "Cheguevara", "Winston Churchill", "Dalailama", "Queen Elizabeth", "Fidel Castro", "Franz Ferdinand", "Mahatma Gandhi", "Mihail Gorbaciov", "Henry VIII", "Emperor Hirohito",
            "Francois Hollande", "Saddam Hussein", "John Kennedy", "Ogedai Khan", "Kim Jong-Il", "Louis XIII", "Louis XIV", "Nelson Mandela", "Marcus Aurelius", "Angela Merkel", "Joseph Bonaparte", "Richard Nixon",
            "Barack Obama", "Pericles", "Peter The Great", "Elizabeth II", "Franklin Roosevelt", "Joseph Stalin", "Margaret Thatcher"};




    public int nScientistsQuestions[] = new int[]  {R.drawable.alan_turing, R.drawable.albert_einstein, R.drawable.alfrednobel , R.drawable.anton_van_leeuwenhoek, R.drawable.arhimed, R.drawable.aristotle, R.drawable.carver,
            R.drawable.copernicus, R.drawable.dalton, R.drawable.darwin, R.drawable.davinci, R.drawable.dirak, R.drawable.edison, R.drawable.faraday, R.drawable.fermi, R.drawable.galileo, R.drawable.gordsonmoore,
            R.drawable.guth_alan, R.drawable.james_clerk_maxwell, R.drawable.kepler, R.drawable.knuth, R.drawable.louispasteur, R.drawable.mendel, R.drawable.mendeleev, R.drawable.newton,
            R.drawable.noamchomsky, R.drawable.richarddawkins, R.drawable.robertboyle, R.drawable.stephen_hawking, R.drawable.tesla, R.drawable.tim_berners_lee };


    public String nScientistsAnswers[] = {"Alan Turing","Albert Einstein","Alfred Nobel","Anton Van Leeuwenhoek","Archimedes","Aristotle","George Washington Carver",
            "Nicolaus Copernicus","John Dalton","Charles Darwin","Leonardo da Vinci","Paul Dirak","Thomas Edison","Michael Faraday","Enrico Fermi","Galileo Galilei","Gordon Moore",
             "Alan Guth","James Clerk Maxwell","Johannes Kepler","Donald Knuth","Louis Pasteur","Gregor Mendel","Dmitri Mendeleev","Isaac Newton","Noam Chomsky","Richard Dawkins",
             "Robert Boyle","Stephen Hawking","Nikola Tesla","Tim Berners-Lee"};


}
