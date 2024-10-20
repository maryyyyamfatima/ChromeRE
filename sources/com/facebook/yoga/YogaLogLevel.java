package com.facebook.yoga;

import defpackage.AbstractC9076qb1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public enum YogaLogLevel {
    a,
    g,
    h,
    i,
    j,
    k;

    YogaLogLevel() {
    }

    public static YogaLogLevel fromInt(int i2) {
        if (i2 == 0) {
            return a;
        }
        if (i2 == 1) {
            return g;
        }
        if (i2 == 2) {
            return h;
        }
        if (i2 == 3) {
            return i;
        }
        if (i2 == 4) {
            return j;
        }
        if (i2 == 5) {
            return k;
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", i2));
    }
}
