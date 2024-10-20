package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UD2 {
    public final Object a;
    public final WD2 b;
    public final TD2 c;
    public final SD2 d = new VD2() { // from class: SD2
        @Override // defpackage.VD2
        public final void d(WD2 wd2, Object obj) {
            UD2 ud2 = UD2.this;
            ud2.c.d(ud2.b, ud2.a, obj);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [SD2] */
    public UD2(WD2 wd2, Object obj, TD2 td2, boolean z) {
        this.b = wd2;
        this.a = obj;
        this.c = td2;
        if (z) {
            Iterator it = wd2.b().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                this.c.d(this.b, this.a, next);
            }
        }
        wd2.a(this.d);
    }

    public static UD2 a(WD2 wd2, Object obj, TD2 td2) {
        return new UD2(wd2, obj, td2, true);
    }

    public final void b() {
        this.b.d(this.d);
    }
}
