package defpackage;

import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iz2 */
/* loaded from: classes.dex */
public final class C6469iz2 {
    public static final long b;
    public static final long c;
    public C10307u93 a;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = timeUnit.toMillis(90L);
        c = timeUnit.toMillis(1L);
    }

    public C6469iz2(C10307u93 c10307u93) {
        this.a = c10307u93;
    }

    public final void a(long j, String str) {
        boolean z;
        long j2 = b;
        EnumC6127hz2 enumC6127hz2 = EnumC6127hz2.g;
        EnumC6127hz2 enumC6127hz22 = j >= j2 ? enumC6127hz2 : j < c ? EnumC6127hz2.i : EnumC6127hz2.h;
        if (enumC6127hz22 == enumC6127hz2) {
            return;
        }
        boolean z2 = !TextUtils.isEmpty(this.a.p.d);
        C8936q93 c8936q93 = this.a.p;
        long j3 = c8936q93.a;
        boolean z3 = j3 != -1;
        if (j3 != -1) {
            if (c8936q93.b != -1) {
                z = true;
                Locale locale = Locale.US;
                EI2.b(String.format(locale, "Commerce.PriceDrops.%s%s.IsProductDetailPage", enumC6127hz22, str), z2);
                EI2.b(String.format(locale, "Commerce.PriceDrops.%s%s.ContainsPrice", enumC6127hz22, str), z3);
                EI2.b(String.format(locale, "Commerce.PriceDrops.%s%s.ContainsPriceDrop", enumC6127hz22, str), z);
            }
        }
        z = false;
        Locale locale2 = Locale.US;
        EI2.b(String.format(locale2, "Commerce.PriceDrops.%s%s.IsProductDetailPage", enumC6127hz22, str), z2);
        EI2.b(String.format(locale2, "Commerce.PriceDrops.%s%s.ContainsPrice", enumC6127hz22, str), z3);
        EI2.b(String.format(locale2, "Commerce.PriceDrops.%s%s.ContainsPriceDrop", enumC6127hz22, str), z);
    }
}
