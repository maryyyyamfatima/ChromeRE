package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8965qF1 {
    public static final /* synthetic */ int b = 0;
    public final InterfaceC9993tF1 a;

    public C8965qF1(InterfaceC9993tF1 interfaceC9993tF1) {
        this.a = interfaceC9993tF1;
    }

    static {
        Locale[] localeArr = new Locale[0];
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC8622pF1.a(localeArr);
        } else {
            new C9650sF1(localeArr);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8965qF1) {
            if (this.a.equals(((C8965qF1) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
