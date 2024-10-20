package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ai0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3619ai0 {
    public final long a;

    static {
        new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault());
    }

    public C3619ai0(long j, long j2) {
        this.a = j2;
        String.format("%d%d", Long.valueOf(j2), Long.valueOf(j));
    }
}
