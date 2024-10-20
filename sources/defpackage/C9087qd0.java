package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9087qd0 implements MW {
    public final boolean a;
    public final int b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final int f;

    public C9087qd0(int i, Context context, Intent intent) {
        C9772sd0 c9772sd0;
        try {
            c9772sd0 = C3270Ze0.a(intent, i == 0 ? 1 : i);
        } catch (Throwable unused) {
            AbstractC4851eH1.a("CustomTabColorPrvdr", "Failed to parse CustomTabColorSchemeParams", new Object[0]);
            c9772sd0 = new C9772sd0(null, null, null, null);
        }
        Integer num = c9772sd0.a;
        boolean z = num != null;
        this.a = z;
        int d = AbstractC3899bX.d(z ? num.intValue() : AbstractC11746yN.a(context, false));
        this.b = d;
        Integer num2 = c9772sd0.b;
        this.c = AbstractC3899bX.d(num2 != null ? num2.intValue() : d);
        Integer num3 = c9772sd0.c;
        this.d = num3 != null ? Integer.valueOf(AbstractC3899bX.d(num3.intValue())) : null;
        this.e = c9772sd0.d;
        int p = AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.customtabs.EXTRA_INITIAL_BACKGROUND_COLOR");
        this.f = p != 0 ? AbstractC3899bX.d(p) : p;
    }

    @Override // defpackage.MW
    public final int d() {
        return this.b;
    }

    @Override // defpackage.MW
    public final boolean f() {
        return this.a;
    }

    @Override // defpackage.MW
    public final Integer a() {
        return this.d;
    }

    @Override // defpackage.MW
    public final Integer b() {
        return this.e;
    }

    @Override // defpackage.MW
    public final int c() {
        return this.c;
    }

    @Override // defpackage.MW
    public final int e() {
        return this.f;
    }
}
