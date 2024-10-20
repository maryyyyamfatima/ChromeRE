package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h50 */
/* loaded from: classes.dex */
public final class C5817h50 implements InterfaceC3345Zt0, InterfaceC2147Qn2, InterfaceC9536rv, InterfaceC9190qu1 {
    public final Matrix a;
    public final Path b;
    public final RectF c;
    public final String d;
    public final boolean e;
    public final List f;
    public final JJ1 g;
    public ArrayList h;
    public final C8704pV3 i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5817h50(defpackage.JJ1 r8, defpackage.AbstractC11937yv r9, defpackage.C3420a63 r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r10 = r10.b
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = r0
        L11:
            int r2 = r10.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r10.get(r1)
            C50 r2 = (defpackage.C50) r2
            Z40 r2 = r2.a(r8, r9)
            if (r2 == 0) goto L26
            r5.add(r2)
        L26:
            int r1 = r1 + 1
            goto L11
        L29:
            int r1 = r10.size()
            if (r0 >= r1) goto L40
            java.lang.Object r1 = r10.get(r0)
            C50 r1 = (defpackage.C50) r1
            boolean r2 = r1 instanceof defpackage.C9759sb
            if (r2 == 0) goto L3d
            sb r1 = (defpackage.C9759sb) r1
            r6 = r1
            goto L42
        L3d:
            int r0 = r0 + 1
            goto L29
        L40:
            r10 = 0
            r6 = r10
        L42:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5817h50.<init>(JJ1, yv, a63):void");
    }

    public C5817h50(JJ1 jj1, AbstractC11937yv abstractC11937yv, String str, boolean z, ArrayList arrayList, C9759sb c9759sb) {
        new C3356Zv1();
        new RectF();
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.g = jj1;
        this.e = z;
        this.f = arrayList;
        if (c9759sb != null) {
            C8704pV3 c8704pV3 = new C8704pV3(c9759sb);
            this.i = c8704pV3;
            c8704pV3.a(abstractC11937yv);
            c8704pV3.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Z40 z40 = (Z40) arrayList.get(size);
            if (z40 instanceof InterfaceC11990z41) {
                arrayList2.add((InterfaceC11990z41) z40);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((InterfaceC11990z41) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
            }
        }
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.d;
    }

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
        int size = list.size();
        List list3 = this.f;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            Z40 z40 = (Z40) list3.get(size2);
            z40.b(arrayList, list3.subList(0, size2));
            arrayList.add(z40);
        }
    }

    public final List e() {
        if (this.h == null) {
            this.h = new ArrayList();
            int i = 0;
            while (true) {
                List list = this.f;
                if (i >= list.size()) {
                    break;
                }
                Z40 z40 = (Z40) list.get(i);
                if (z40 instanceof InterfaceC2147Qn2) {
                    this.h.add((InterfaceC2147Qn2) z40);
                }
                i++;
            }
        }
        return this.h;
    }

    @Override // defpackage.InterfaceC2147Qn2
    public final Path h() {
        Matrix matrix = this.a;
        matrix.reset();
        C8704pV3 c8704pV3 = this.i;
        if (c8704pV3 != null) {
            matrix.set(c8704pV3.d());
        }
        Path path = this.b;
        path.reset();
        if (this.e) {
            return path;
        }
        List list = this.f;
        for (int size = list.size() - 1; size >= 0; size--) {
            Z40 z40 = (Z40) list.get(size);
            if (z40 instanceof InterfaceC2147Qn2) {
                path.addPath(((InterfaceC2147Qn2) z40).h(), matrix);
            }
        }
        return path;
    }

    @Override // defpackage.InterfaceC3345Zt0
    public final void g(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        C8704pV3 c8704pV3 = this.i;
        if (c8704pV3 != null) {
            matrix2.preConcat(c8704pV3.d());
            i = (int) (((((c8704pV3.j == null ? 100 : ((Integer) r6.f()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        this.g.getClass();
        List list = this.f;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = list.get(size);
            if (obj instanceof InterfaceC3345Zt0) {
                ((InterfaceC3345Zt0) obj).g(canvas, matrix2, i);
            }
        }
    }

    @Override // defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        C8704pV3 c8704pV3 = this.i;
        if (c8704pV3 != null) {
            matrix2.preConcat(c8704pV3.d());
        }
        RectF rectF2 = this.c;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.f;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Z40 z40 = (Z40) list.get(size);
            if (z40 instanceof InterfaceC3345Zt0) {
                ((InterfaceC3345Zt0) z40).d(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void c(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        String str = this.d;
        if (!c8847pu1.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            c8847pu12.getClass();
            C8847pu1 c8847pu13 = new C8847pu1(c8847pu12);
            c8847pu13.a.add(str);
            if (c8847pu1.a(i, str)) {
                C8847pu1 c8847pu14 = new C8847pu1(c8847pu13);
                c8847pu14.b = this;
                arrayList.add(c8847pu14);
            }
            c8847pu12 = c8847pu13;
        }
        if (!c8847pu1.d(i, str)) {
            return;
        }
        int b = c8847pu1.b(i, str) + i;
        int i2 = 0;
        while (true) {
            List list = this.f;
            if (i2 >= list.size()) {
                return;
            }
            Z40 z40 = (Z40) list.get(i2);
            if (z40 instanceof InterfaceC9190qu1) {
                ((InterfaceC9190qu1) z40).c(c8847pu1, b, arrayList, c8847pu12);
            }
            i2++;
        }
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        C8704pV3 c8704pV3 = this.i;
        if (c8704pV3 != null) {
            c8704pV3.c(tj1, obj);
        }
    }
}
