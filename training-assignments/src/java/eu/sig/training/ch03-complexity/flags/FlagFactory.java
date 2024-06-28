package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

private static final Map<Nationality, Flag> FLAGS =
    new HashMap<Nationality, Flag>();

static {
    FLAGS.put(DUTCH, new DutchFlag());
    FLAGS.put(GERMAN, new GermanFlag());
    FLAGS.put(BELGIAN, new BelgianFlag());
    FLAGS.put(FRENCH, new FrenchFlag());
    FLAGS.put(ITALIAN, new ItalianFlag());
    FLAGS.put(ROMANIA, new RomaniaFlag());
    FLAGS.put(IRELAND, new IrelandFlag());
}

public List<Color> getFlagColors(Nationality nationality) {
    Flag flag = FLAGS.get(nationality);
    flag = flag != null ? flag : new DefaultFlag();
    return flag.getColors();
}

public class DutchFlag implements Flag {
    public List<Color> getColors() {
    return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
    }
}

public class GermanFlag implements Flag {
    public List<Color> getColors() {
    return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
    }
}

public class BelgiumFlag implements Flag {
    public List<Color> getColors() {
    return Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
    }
}

public class FrenchFlag implements Flag {
    public List<Color> getColors() {
    return Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
    }
}

public class ItalianFlag implements Flag {
    public List<Color> getColors() {
    return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
    }
}

public class RomaniaFlag implements Flag {
    public List<Color> getColors() {
    return Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
    }
}

public class IrelandFlag implements Flag {
    public List<Color> getColors() {
    return Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
    }
}
