package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ke4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7035ke4 {
    public Interpolator c;
    public InterfaceC7379le4 d;
    public boolean e;
    public long b = -1;
    public final C6691je4 f = new C6691je4(this);
    public final ArrayList a = new ArrayList();

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C6349ie4 c6349ie4 = (C6349ie4) it.next();
            long j = this.b;
            if (j >= 0) {
                c6349ie4.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) c6349ie4.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                c6349ie4.d(this.f);
            }
            View view2 = (View) c6349ie4.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((C6349ie4) it.next()).b();
            }
            this.e = false;
        }
    }
}
