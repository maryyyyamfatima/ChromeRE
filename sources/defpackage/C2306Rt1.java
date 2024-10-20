package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2306Rt1 implements K74 {
    public static final SimpleDateFormat a;

    @Override // defpackage.JA0
    public final void a(Object obj, Object obj2) {
        ((L74) obj2).b(a.format((Date) obj));
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
