package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sl */
/* loaded from: classes.dex */
public final class C2394Sl {
    public C4979ef4 a;
    public final HashMap b = new HashMap();
    public final SoftReference c;
    public final Map d;

    public final C6168i61 b(C6168i61 c6168i61, View view, H74 h74, boolean z) {
        C6168i61 f;
        if (h74 != null && this.d.containsKey(view)) {
            C4979ef4 c4979ef4 = this.a;
            int i = h74.f;
            VT vt = h74.e;
            synchronized (c4979ef4) {
                c4979ef4.f.b(Integer.valueOf(i), vt, h74);
            }
            c6168i61.b(Integer.valueOf(h74.f), h74.e, h74);
        }
        if (!z || h74 == null) {
            f = C6168i61.f();
        } else {
            C4979ef4 c4979ef42 = this.a;
            int i2 = h74.f;
            A0 a0 = (A0) c4979ef42.g.g(Integer.valueOf(i2), h74.e);
            if (a0 == null) {
                f = null;
            } else {
                C6168i61 f2 = C6168i61.f();
                f2.c(a0);
                f = f2;
            }
            if (f == null) {
                f = C6168i61.f();
            }
        }
        if (view instanceof ViewGroup) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i3);
                H74 a = a(childAt);
                if (a == null || !this.d.containsKey(childAt)) {
                    f.c(b(c6168i61, childAt, a, z));
                } else {
                    f.b(Integer.valueOf(a.f), a.e, a);
                    b(c6168i61, childAt, a, z);
                }
                i3++;
            }
            if (h74 != null && !f.e(Integer.valueOf(h74.f), h74.e)) {
                C4979ef4 c4979ef43 = this.a;
                int i4 = h74.f;
                VT vt2 = h74.e;
                synchronized (c4979ef43) {
                    c4979ef43.g.b(Integer.valueOf(i4), vt2, f);
                }
            }
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:            if (r10.b == 0) goto L145;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.H74 a(android.view.View r13) {
        /*
            r12 = this;
            java.util.Map r0 = r12.d
            java.lang.Object r1 = r0.get(r13)
            Pn r1 = (defpackage.C2014Pn) r1
            r2 = 0
            if (r1 != 0) goto Ld
            r8 = r2
            goto L10
        Ld:
            VT r1 = r1.a
            r8 = r1
        L10:
            if (r8 != 0) goto L13
            goto L64
        L13:
            ef4 r1 = r12.a
            int r3 = defpackage.Jf4.a
            if (r13 != 0) goto L1a
            goto L50
        L1a:
            int r3 = r8.j
            r3 = r3 & 2048(0x800, float:2.87E-42)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L24
            r3 = r4
            goto L25
        L24:
            r3 = r5
        L25:
            if (r3 != 0) goto L28
            goto L50
        L28:
            r3 = 2
            int[] r3 = new int[r3]
            r13.getLocationOnScreen(r3)
            r9 = -1
            H74 r10 = new H74
            int r6 = r13.getWidth()
            int r7 = r13.getHeight()
            r11 = r3[r5]
            r3 = r3[r4]
            int r1 = r1.b
            int r1 = r1 + r3
            r3 = r10
            r4 = r6
            r5 = r7
            r6 = r11
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r1 = r10.a
            if (r1 != 0) goto L51
            int r1 = r10.b
            if (r1 != 0) goto L51
        L50:
            r10 = r2
        L51:
            java.lang.Object r13 = r0.get(r13)
            Pn r13 = (defpackage.C2014Pn) r13
            if (r13 != 0) goto L5a
            goto L5c
        L5a:
            Zk r2 = r13.b
        L5c:
            if (r2 == 0) goto L63
            java.util.HashMap r13 = r12.b
            r13.put(r10, r2)
        L63:
            r2 = r10
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2394Sl.a(android.view.View):H74");
    }

    public C2394Sl(RecyclerView recyclerView, HashMap hashMap) {
        this.c = new SoftReference(recyclerView);
        this.d = hashMap;
    }
}
