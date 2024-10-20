package defpackage;

import android.content.res.Configuration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10812vf {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }
}
