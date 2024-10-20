package defpackage;

import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaQueueItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10724vO1 extends AbstractC12087zM2 {
    public final /* synthetic */ C11067wO1 a;

    public C10724vO1(C11067wO1 c11067wO1) {
        this.a = c11067wO1;
    }

    @Override // defpackage.AbstractC12087zM2
    public final void d(int[] iArr) {
        ArrayList g = WH.g(iArr);
        C11067wO1 c11067wO1 = this.a;
        if (c11067wO1.d.equals(g)) {
            return;
        }
        c11067wO1.g();
        c11067wO1.f.evictAll();
        c11067wO1.g.clear();
        c11067wO1.d = g;
        C11067wO1.b(c11067wO1);
        c11067wO1.f();
        c11067wO1.e();
    }

    @Override // defpackage.AbstractC12087zM2
    public final void e(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = this.a.d.size();
        } else {
            i2 = this.a.e.get(i, -1);
            if (i2 == -1) {
                this.a.h();
                return;
            }
        }
        this.a.g();
        this.a.d.addAll(i2, WH.g(iArr));
        C11067wO1.b(this.a);
        C11067wO1 c11067wO1 = this.a;
        synchronized (c11067wO1.m) {
            Iterator it = c11067wO1.m.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
        this.a.e();
    }

    @Override // defpackage.AbstractC12087zM2
    public final void i(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (true) {
            C11067wO1 c11067wO1 = this.a;
            if (i < length) {
                int i2 = iArr[i];
                c11067wO1.f.remove(Integer.valueOf(i2));
                int i3 = c11067wO1.e.get(i2, -1);
                if (i3 == -1) {
                    c11067wO1.h();
                    return;
                } else {
                    arrayList.add(Integer.valueOf(i3));
                    i++;
                }
            } else {
                Collections.sort(arrayList);
                c11067wO1.g();
                WH.f(arrayList);
                C11067wO1.a(c11067wO1);
                c11067wO1.e();
                return;
            }
        }
    }

    @Override // defpackage.AbstractC12087zM2
    public final void g(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.a.f.remove(Integer.valueOf(i));
            int i2 = this.a.e.get(i, -1);
            if (i2 == -1) {
                this.a.h();
                return;
            } else {
                this.a.e.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        this.a.g();
        this.a.d.removeAll(WH.g(iArr));
        C11067wO1.b(this.a);
        C11067wO1 c11067wO1 = this.a;
        WH.f(arrayList);
        synchronized (c11067wO1.m) {
            Iterator it = c11067wO1.m.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
        this.a.e();
    }

    @Override // defpackage.AbstractC12087zM2
    public final void f(MediaQueueItem[] mediaQueueItemArr) {
        HashSet hashSet = new HashSet();
        C11067wO1 c11067wO1 = this.a;
        c11067wO1.g.clear();
        int length = mediaQueueItemArr.length;
        int i = 0;
        while (true) {
            SparseIntArray sparseIntArray = c11067wO1.e;
            if (i < length) {
                MediaQueueItem mediaQueueItem = mediaQueueItemArr[i];
                int i2 = mediaQueueItem.g;
                c11067wO1.f.put(Integer.valueOf(i2), mediaQueueItem);
                int i3 = sparseIntArray.get(i2, -1);
                if (i3 == -1) {
                    c11067wO1.h();
                    return;
                } else {
                    hashSet.add(Integer.valueOf(i3));
                    i++;
                }
            } else {
                ArrayList arrayList = c11067wO1.g;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i4 = sparseIntArray.get(((Integer) it.next()).intValue(), -1);
                    if (i4 != -1) {
                        hashSet.add(Integer.valueOf(i4));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                c11067wO1.g();
                WH.f(arrayList2);
                C11067wO1.a(c11067wO1);
                c11067wO1.e();
                return;
            }
        }
    }

    @Override // defpackage.AbstractC12087zM2
    public final void h(ArrayList arrayList, ArrayList arrayList2, int i) {
        ArrayList arrayList3 = new ArrayList();
        if (i == 0) {
            this.a.d.size();
        } else if (arrayList2.isEmpty()) {
            this.a.a.g("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
        } else if (this.a.e.get(i, -1) == -1) {
            this.a.e.get(((Integer) arrayList2.get(0)).intValue(), -1);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int i2 = this.a.e.get(((Integer) it.next()).intValue(), -1);
            if (i2 == -1) {
                this.a.h();
                return;
            }
            arrayList3.add(Integer.valueOf(i2));
        }
        this.a.g();
        C11067wO1 c11067wO1 = this.a;
        c11067wO1.d = arrayList;
        C11067wO1.b(c11067wO1);
        C11067wO1 c11067wO12 = this.a;
        synchronized (c11067wO12.m) {
            Iterator it2 = c11067wO12.m.iterator();
            if (it2.hasNext()) {
                X5.a(it2.next());
                throw null;
            }
        }
        this.a.e();
    }

    @Override // defpackage.AbstractC12087zM2
    public final void l() {
        C11067wO1 c11067wO1 = this.a;
        long d = c11067wO1.d();
        if (d != c11067wO1.b) {
            c11067wO1.b = d;
            c11067wO1.c();
            if (c11067wO1.b != 0) {
                c11067wO1.h();
            }
        }
    }

    @Override // defpackage.AbstractC12087zM2
    public final void k() {
        this.a.h();
    }
}
