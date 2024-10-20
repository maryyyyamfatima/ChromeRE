package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gb3 */
/* loaded from: classes.dex */
public final class C0789Gb3 extends AbstractC6471j {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Set f;
    public final BW1 g;

    @Override // defpackage.AbstractC6232iI1
    public final boolean c(Level level) {
        return true;
    }

    public C0789Gb3(String str, String str2, boolean z, boolean z2, Level level, boolean z3, Set set, BW1 bw1) {
        super(str2);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = set;
        this.g = bw1;
    }

    @Override // defpackage.AbstractC6232iI1
    public final void d(InterfaceC6913kH1 interfaceC6913kH1) {
        AbstractC5118f31 abstractC5118f31 = (AbstractC5118f31) interfaceC6913kH1;
        String str = (String) abstractC5118f31.r().a(C9.a);
        if (str == null) {
            str = a();
        }
        if (str == null) {
            OH1 oh1 = abstractC5118f31.d;
            if (oh1 == null) {
                throw new IllegalStateException("cannot request log site information prior to postProcess()");
            }
            str = oh1.a();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        String a = WH1.a(this.b, str, this.c);
        boolean z = true;
        if (!this.e) {
            Level level = Level.SEVERE;
            z = Log.isLoggable(a, 6) || Log.isLoggable("all", 6);
        }
        if (z) {
            C0919Hb3.e(interfaceC6913kH1, a, this.d, this.f, this.g);
        }
    }
}
