package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import android.widget.BaseAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lY1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7342lY1 extends BaseAdapter {
    public final C7616mK1 a;
    public final SparseArray g = new SparseArray();

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public C7342lY1(C7616mK1 c7616mK1) {
        this.a = c7616mK1;
        c7616mK1.l(new C6998kY1(this));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.a.get(i);
    }

    public final void a(int i, InterfaceC7960nK1 interfaceC7960nK1, TD2 td2) {
        this.g.put(i, new Pair(interfaceC7960nK1, td2));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return ((C7272lK1) this.a.get(i)).a;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return Math.max(1, this.g.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098 A[LOOP:0: B:16:0x0092->B:18:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[SYNTHETIC] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            r0 = 2130774155(0x7f01088b, float:1.7151477E38)
            if (r10 == 0) goto L14
            java.lang.Object r1 = r10.getTag(r0)
            if (r1 == 0) goto L14
            java.lang.Object r1 = r10.getTag(r0)
            UD2 r1 = (defpackage.UD2) r1
            r1.b()
        L14:
            int r1 = r8.getItemViewType(r9)
            android.util.SparseArray r2 = r8.g
            r3 = 2130774156(0x7f01088c, float:1.7151479E38)
            r4 = 2130774162(0x7f010892, float:1.7151491E38)
            r5 = 0
            if (r10 == 0) goto L42
            java.lang.Object r6 = r10.getTag(r4)
            if (r6 == 0) goto L37
            java.lang.Object r6 = r10.getTag(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != r1) goto L37
            r6 = 1
            goto L38
        L37:
            r6 = r5
        L38:
            if (r6 != 0) goto L3b
            goto L42
        L3b:
            java.lang.Object r11 = r10.getTag(r3)
            org.chromium.ui.modelutil.PropertyModel r11 = (org.chromium.ui.modelutil.PropertyModel) r11
            goto L58
        L42:
            java.lang.Object r10 = r2.get(r1)
            android.util.Pair r10 = (android.util.Pair) r10
            java.lang.Object r10 = r10.first
            nK1 r10 = (defpackage.InterfaceC7960nK1) r10
            android.view.View r10 = r10.a(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r10.setTag(r4, r11)
            r11 = 0
        L58:
            mK1 r1 = r8.a
            java.lang.Object r4 = r1.get(r9)
            lK1 r4 = (defpackage.C7272lK1) r4
            org.chromium.ui.modelutil.PropertyModel r4 = r4.b
            java.lang.Object r9 = r1.get(r9)
            lK1 r9 = (defpackage.C7272lK1) r9
            int r9 = r9.a
            java.lang.Object r9 = r2.get(r9)
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r9 = r9.second
            TD2 r9 = (defpackage.TD2) r9
            UD2 r1 = new UD2
            r1.<init>(r4, r10, r9, r5)
            r10.setTag(r0, r1)
            r10.setTag(r3, r4)
            java.util.ArrayList r0 = r4.b()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r2 = r4.b
            java.util.Set r3 = r2.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L92:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto La8
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            FD2 r6 = (defpackage.FD2) r6
            r1.add(r6)
            goto L92
        La8:
            java.util.Iterator r1 = r1.iterator()
        Lac:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lf1
            java.lang.Object r3 = r1.next()
            FD2 r3 = (defpackage.FD2) r3
            if (r11 == 0) goto Le6
            boolean r6 = r2.containsKey(r3)
            if (r6 == 0) goto Le2
            java.util.Map r6 = r11.b
            boolean r7 = r6.containsKey(r3)
            if (r7 != 0) goto Lc9
            goto Le2
        Lc9:
            boolean r7 = r3 instanceof defpackage.PD2
            if (r7 == 0) goto Ld5
            r7 = r3
            PD2 r7 = (defpackage.PD2) r7
            boolean r7 = r7.b
            if (r7 == 0) goto Ld5
            goto Le2
        Ld5:
            java.lang.Object r7 = r2.get(r3)
            java.lang.Object r6 = r6.get(r3)
            boolean r6 = java.util.Objects.equals(r7, r6)
            goto Le3
        Le2:
            r6 = r5
        Le3:
            if (r6 == 0) goto Led
            goto Lac
        Le6:
            boolean r6 = r0.contains(r3)
            if (r6 != 0) goto Led
            goto Lac
        Led:
            r9.d(r4, r10, r3)
            goto Lac
        Lf1:
            r10.jumpDrawablesToCurrentState()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7342lY1.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
