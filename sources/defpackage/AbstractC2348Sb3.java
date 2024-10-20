package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sb3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2348Sb3 {
    public C10362uK2 a = null;
    public final ArrayList b = new ArrayList();
    public final long c = 120;
    public final long d = 120;
    public long e = 250;
    public long f = 250;
    public boolean g = true;

    public abstract void a(d dVar);

    public abstract boolean b(d dVar, d dVar2, int i, int i2, int i3, int i4);

    public abstract boolean d(d dVar, int i, int i2, int i3, int i4);

    public abstract void e(d dVar);

    public abstract void i(d dVar);

    public abstract void j();

    public abstract boolean k();

    public abstract void m();

    public boolean g(d dVar, List list) {
        return !this.g || dVar.l();
    }

    public final boolean c(d dVar, d dVar2, C10019tK2 c10019tK2, C10019tK2 c10019tK22) {
        int i;
        int i2;
        int i3 = c10019tK2.a;
        int i4 = c10019tK2.b;
        if (dVar2.t()) {
            int i5 = c10019tK2.a;
            i2 = c10019tK2.b;
            i = i5;
        } else {
            i = c10019tK22.a;
            i2 = c10019tK22.b;
        }
        return b(dVar, dVar2, i3, i4, i, i2);
    }

    public static void f(d dVar) {
        int i = dVar.o & 14;
        if (!dVar.l() && (i & 4) == 0) {
            dVar.f();
        }
    }

    public final void h(d dVar) {
        C10362uK2 c10362uK2 = this.a;
        if (c10362uK2 != null) {
            boolean z = true;
            dVar.s(true);
            if (dVar.m != null && dVar.n == null) {
                dVar.m = null;
            }
            dVar.n = null;
            if ((dVar.o & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c10362uK2.a;
            recyclerView.v0();
            DJ dj = recyclerView.k;
            C7617mK2 c7617mK2 = dj.a;
            RecyclerView recyclerView2 = c7617mK2.a;
            View view = dVar.a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                dj.k(view);
            } else {
                CJ cj = dj.b;
                if (cj.d(indexOfChild)) {
                    cj.f(indexOfChild);
                    dj.k(view);
                    c7617mK2.b(indexOfChild);
                } else {
                    z = false;
                }
            }
            if (z) {
                d L = RecyclerView.L(view);
                b bVar = recyclerView.h;
                bVar.l(L);
                bVar.i(L);
            }
            recyclerView.w0(!z);
            if (z || !dVar.p()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final boolean l(InterfaceC9676sK2 interfaceC9676sK2) {
        boolean k = k();
        if (interfaceC9676sK2 != null) {
            if (!k) {
                interfaceC9676sK2.a();
            } else {
                this.b.add(interfaceC9676sK2);
            }
        }
        return k;
    }
}
