package defpackage;

import com.google.android.libraries.elements.converters.g;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q13 */
/* loaded from: classes.dex */
public abstract class AbstractC8888q13 implements InterfaceC4487dD0 {
    public EK d(C3390a13 c3390a13) {
        return null;
    }

    public void e(C3390a13 c3390a13) {
    }

    public Object f(C6206iD0 c6206iD0, Object obj) {
        return null;
    }

    public void g(C3390a13 c3390a13, MI mi, Y03 y03, Y03 y032) {
    }

    public boolean h() {
        return this instanceof C2105Qf0;
    }

    public void k(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
    }

    @Override // defpackage.InterfaceC4487dD0
    public final Object c(C6206iD0 c6206iD0, Object obj) {
        try {
            return f(c6206iD0, obj);
        } catch (Exception e) {
            if (c6206iD0.h != null) {
                Object obj2 = c6206iD0.h[0];
                if (obj2 instanceof C7849n00) {
                    throw A10.e((C7849n00) obj2, e);
                }
            }
            throw e;
        }
    }

    public static C6206iD0 i(C3390a13 c3390a13, int i, Object[] objArr) {
        if (c3390a13 == null || c3390a13.q() == null) {
            E10.a(3, "SectionContext:NoScopeEventHandler", "Creating event handler without scope.");
            return C8225o52.i;
        }
        if (g.class != c3390a13.q().getClass()) {
            E10.a(2, AbstractC4809e90.a("SectionLifecycle:WrongContextForEventHandler:", c3390a13.q().j), String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a SectionContext from its Section.", "DataDrivenCollectionSection", c3390a13.q().j));
        }
        C6206iD0 j = c3390a13.j(i, objArr);
        A13 a13 = c3390a13.q;
        if (a13 != null) {
            a13.u.c(c3390a13.q().o, j);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:            if (r4 == false) goto L135;     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j(defpackage.Y03 r4, defpackage.Y03 r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L7
            boolean r1 = r5.g
            r1 = r1 | r0
            goto L8
        L7:
            r1 = r0
        L8:
            r2 = 1
            if (r1 != 0) goto L3b
            if (r4 != r5) goto Le
            goto L36
        Le:
            if (r4 == 0) goto L38
            jk3 r1 = r4.k
            if (r5 != 0) goto L16
            r3 = 0
            goto L18
        L16:
            jk3 r3 = r5.k
        L18:
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L38
            if (r1 != 0) goto L24
            if (r3 != 0) goto L24
            r4 = r2
            goto L33
        L24:
            if (r1 != 0) goto L2a
            if (r3 == 0) goto L2a
        L28:
            r4 = r0
            goto L33
        L2a:
            if (r1 == 0) goto L2f
            if (r3 != 0) goto L2f
            goto L28
        L2f:
            boolean r4 = defpackage.A10.d(r1, r3)
        L33:
            if (r4 != 0) goto L36
            goto L38
        L36:
            r4 = r0
            goto L39
        L38:
            r4 = r2
        L39:
            if (r4 == 0) goto L3c
        L3b:
            r0 = r2
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8888q13.j(Y03, Y03):boolean");
    }
}
