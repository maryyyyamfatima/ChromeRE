package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class E10 {
    public static void a(int i, String str, String str2) {
        EnumC11375xH1 enumC11375xH1;
        YC0 a = XC0.a();
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                enumC11375xH1 = EnumC11375xH1.ERROR;
                if (i2 != 1 && i2 == 2) {
                    enumC11375xH1 = EnumC11375xH1.FATAL;
                }
            } else {
                enumC11375xH1 = EnumC11375xH1.WARNING;
            }
            a.b(enumC11375xH1, str, str2);
            return;
        }
        throw null;
    }
}
