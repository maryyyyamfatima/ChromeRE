package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OH extends YG {
    public final /* synthetic */ QH a;

    public OH(QH qh) {
        this.a = qh;
    }

    @Override // defpackage.YG
    public final void b(int i) {
        QH qh = this.a;
        QH.d(qh);
        qh.c(i);
        qh.h();
        Iterator it = new HashSet(qh.d).iterator();
        while (it.hasNext()) {
            ((YG) it.next()).b(i);
        }
    }

    @Override // defpackage.YG
    public final void d() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((YG) it.next()).d();
        }
    }

    @Override // defpackage.YG
    public final void c(ApplicationMetadata applicationMetadata) {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((YG) it.next()).c(applicationMetadata);
        }
    }

    @Override // defpackage.YG
    public final void a(int i) {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((YG) it.next()).a(i);
        }
    }

    @Override // defpackage.YG
    public final void e(int i) {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((YG) it.next()).e(i);
        }
    }

    @Override // defpackage.YG
    public final void f() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((YG) it.next()).f();
        }
    }
}
