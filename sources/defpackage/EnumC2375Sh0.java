package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2375Sh0 {
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY_PADDED('H'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_OF_DAY('k'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H_PADDED('I'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_HOUR_12H('l'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MINUTE_OF_HOUR_PADDED('M'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_SECONDS_OF_MINUTE_PADDED('S'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_MILLIS_OF_SECOND_PADDED('L'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_NANOS_OF_SECOND_PADDED('N'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_AM_PM('p'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_NUMERIC('z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TZ_SHORT('Z'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_SECONDS('s'),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_EPOCH_MILLIS('Q'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_FULL('B'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT('b'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_SHORT_ALT('h'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_FULL('A'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_SHORT('a'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_CENTURY_PADDED('C'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_PADDED('Y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_YEAR_OF_CENTURY_PADDED('y'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_YEAR_PADDED('j'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_MONTH_PADDED('m'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH_PADDED('d'),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_DAY_OF_MONTH('e'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES('R'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS('T'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_HOURS_MINUTES_SECONDS_12H('r'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_MONTH_DAY_YEAR('D'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_YEAR_MONTH_DAY('F'),
    /* JADX INFO: Fake field, exist only in values array */
    DATETIME_FULL('c');

    public static final Map g;
    public final char a;

    static {
        HashMap hashMap = new HashMap();
        for (EnumC2375Sh0 enumC2375Sh0 : values()) {
            if (hashMap.put(Character.valueOf(enumC2375Sh0.a), enumC2375Sh0) != null) {
                throw new IllegalStateException("duplicate format character: " + enumC2375Sh0);
            }
        }
        g = Collections.unmodifiableMap(hashMap);
    }

    EnumC2375Sh0(char c) {
        this.a = c;
    }
}
