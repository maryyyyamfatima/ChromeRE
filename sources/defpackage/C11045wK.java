package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wK */
/* loaded from: classes2.dex */
public final class C11045wK implements Iterable {
    public final Handler a;
    public final int g;
    public final ArrayList h;
    public final Runnable i;
    public boolean j;
    public boolean k;

    public C11045wK() {
        this.a = new Handler();
        this.h = new ArrayList();
        this.i = new Runnable() { // from class: sK
            @Override // java.lang.Runnable
            public final void run() {
                C11045wK.a(C11045wK.this);
            }
        };
        this.g = -1;
    }

    public C11045wK(int i) {
        this.a = new Handler();
        this.h = new ArrayList();
        this.i = new Runnable() { // from class: sK
            @Override // java.lang.Runnable
            public final void run() {
                C11045wK.a(C11045wK.this);
            }
        };
        this.g = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10702vK(this);
    }

    public final int b(VJ vj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((C10016tK) arrayList.get(i)).a == vj) {
                return i;
            }
            i++;
        }
    }

    public final void d(int i) {
        ArrayList arrayList = this.h;
        C10016tK c10016tK = (C10016tK) arrayList.remove(i);
        int i2 = 0;
        while (i2 < arrayList.size() && AbstractC10359uK.a((C10016tK) arrayList.get(i2), c10016tK) < 0) {
            i2++;
        }
        arrayList.add(i2, c10016tK);
        if (this.j) {
            boolean a = c10016tK.a();
            VJ vj = c10016tK.a;
            if (a) {
                boolean z = i2 == 0;
                boolean z2 = i2 == arrayList.size() - 1;
                int i3 = z ? 0 : ((C10016tK) arrayList.get(i2 - 1)).a.A;
                int i4 = z2 ? Integer.MAX_VALUE : ((C10016tK) arrayList.get(i2 + 1)).a.A;
                int i5 = vj.A;
                if (i5 <= i3 || i5 >= i4) {
                    int i6 = i4 - i3;
                    if (i6 > 65536) {
                        vj.o(1, i4 - 32768);
                    } else if (i6 > 2) {
                        vj.o(1, (i6 / 2) + i3);
                    } else {
                        f();
                    }
                    if (this.k) {
                        return;
                    }
                    this.a.postDelayed(this.i, 1000L);
                    this.k = true;
                    return;
                }
                return;
            }
            if (vj.z != 0) {
                vj.o(0, 0);
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.h;
        int i = 2147450879;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C10016tK c10016tK = (C10016tK) arrayList.get(size);
            if (!c10016tK.a()) {
                return;
            }
            c10016tK.a.o(1, i);
            i -= 32768;
        }
    }

    public static void a(C11045wK c11045wK) {
        c11045wK.k = false;
        ArrayList arrayList = c11045wK.h;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C10016tK c10016tK = (C10016tK) arrayList.get(size);
            if (!c10016tK.a()) {
                VJ vj = c10016tK.a;
                if (vj.g()) {
                    vj.w.a();
                }
            }
        }
    }
}
