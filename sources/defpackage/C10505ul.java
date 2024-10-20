package defpackage;

import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10505ul {
    public final SparseArray a = new SparseArray();
    public boolean b;

    public final void a(int i, InterfaceC9819sl interfaceC9819sl) {
        this.a.put(i, interfaceC9819sl);
        if (this.b) {
            return;
        }
        C11187wk1 a = C11187wk1.a();
        a.a.add(new C10162tl(this));
        this.b = true;
    }

    public final boolean b() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return false;
            }
            if (((InterfaceC9819sl) sparseArray.get(sparseArray.keyAt(i))).a() != null) {
                return true;
            }
            i++;
        }
    }

    public final InterfaceC9819sl c(int i) {
        SparseArray sparseArray = this.a;
        InterfaceC9819sl interfaceC9819sl = (InterfaceC9819sl) sparseArray.get(i);
        sparseArray.remove(i);
        return interfaceC9819sl;
    }
}
