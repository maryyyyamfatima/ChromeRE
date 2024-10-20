package defpackage;

import J.N;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qz2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2207Qz2 {
    public static String a(long j, C8395oc0 c8395oc0) {
        String format;
        if (j < 10000000) {
            N.M6ORVMPQ(c8395oc0.a, 2);
            format = String.format(Locale.getDefault(), "%.2f", Double.valueOf(((j * 100) / 1000000) / 100.0d));
        } else {
            N.M6ORVMPQ(c8395oc0.a, 0);
            format = String.format(Locale.getDefault(), "%d", Long.valueOf((long) Math.floor((j + 500000) / 1000000.0d)));
        }
        return c8395oc0.b(format);
    }
}
