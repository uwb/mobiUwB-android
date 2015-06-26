package pl.edu.uwb.mobiuwb.parsers.xml.parser;

import pl.edu.uwb.mobiuwb.parsers.xml.model.Website;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tunczyk on 2015-05-11.
 */
public class ConfigXmlResult
{
    private UniversityUnit currentUniversityUnit;
    public UniversityUnit getCurrentUniversityUnit()
    {
        return universityUnits.get(0);
    }

    public List<UniversityUnit> universityUnits;
    public List<String> authors;

    public ConfigXmlResult()
    {
        this.universityUnits = new ArrayList<UniversityUnit>();
        this.authors = new ArrayList<String>();
    }
}
