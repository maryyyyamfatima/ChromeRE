package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oK2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8305oK2 {
    public final C8648pK2 a = new C8648pK2();
    public boolean g = false;
    public final int h = 1;

    public void A(RecyclerView recyclerView) {
    }

    public abstract void C(d dVar, int i);

    public abstract d E(int i, RecyclerView recyclerView);

    public void F(RecyclerView recyclerView) {
    }

    public boolean G(d dVar) {
        return false;
    }

    public void H(d dVar) {
    }

    public void I(d dVar) {
    }

    public abstract int q();

    public long r(int i) {
        return -1L;
    }

    public int s(int i) {
        return 0;
    }

    public void D(d dVar, int i, List list) {
        C(dVar, i);
    }

    public final void K(boolean z) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.g = z;
    }

    public final void J(AbstractC8991qK2 abstractC8991qK2) {
        this.a.registerObserver(abstractC8991qK2);
    }

    public final void L(AbstractC8991qK2 abstractC8991qK2) {
        this.a.unregisterObserver(abstractC8991qK2);
    }

    public final void t() {
        this.a.b();
    }

    public final void x(Object obj, int i, int i2) {
        this.a.d(obj, i, i2);
    }

    public final void w(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void y(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void z(int i, int i2) {
        this.a.f(i, i2);
    }

    public final void v(int i) {
        this.a.d(null, i, 1);
    }
}
