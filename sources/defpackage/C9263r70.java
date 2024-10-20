package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r70 */
/* loaded from: classes.dex */
public final class C9263r70 {
    public final S70 a;
    public final InterfaceC9606s70 b;
    public int c;
    public int d = 0;
    public int e = 0;

    public C9263r70(S70 s70, C70 c70) {
        this.a = s70;
        this.b = c70;
    }

    public final void c(Integer num) {
        this.c = 0;
        d(1, num);
    }

    public final void a(int i) {
        this.e = this.d;
        this.d = i;
        if (i == 2) {
            this.c = 2;
        } else if (i == 6) {
            this.c = 1;
        } else if (i == 15) {
            this.c = 3;
        } else {
            this.c = 0;
        }
        b(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:            if (r5 != false) goto L959;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r21, java.lang.Integer r22) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9263r70.d(int, java.lang.Integer):void");
    }

    public final void b(int i) {
        int i2 = this.d;
        if (i != i2) {
            return;
        }
        if (i2 == 1 || i2 == 0) {
            AbstractC4851eH1.f("ContextualSearch", "Warning, the " + String.valueOf(i) + " state was aborted.", new Object[0]);
            return;
        }
        int i3 = 8;
        switch (i) {
            case 2:
                d(9, null);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                d(17, null);
                return;
            case 4:
                int i4 = this.e;
                if (i4 == 0 || i4 == 1) {
                    c(7);
                    return;
                } else {
                    d(5, null);
                    return;
                }
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                c(7);
                return;
            case 6:
                int i5 = this.e;
                if (i5 != 0 && i5 != 1) {
                    i3 = 7;
                }
                d(i3, null);
                return;
            case 7:
                d(8, null);
                return;
            case 8:
                d(9, null);
                return;
            case 9:
                int i6 = this.c;
                if (i6 == 2) {
                    d(3, null);
                    return;
                } else if (i6 == 3) {
                    d(12, null);
                    return;
                } else {
                    d(10, null);
                    return;
                }
            case 10:
                d(11, null);
                return;
            case 11:
                d(12, null);
                return;
            case 12:
                this.a.getClass();
                d(S70.c() ? 13 : 14, null);
                return;
            case 13:
                d(this.c != 1 ? 16 : 14, null);
                return;
            case 14:
                d(17, null);
                return;
            case 15:
                d(9, null);
                return;
            case 16:
                d(17, null);
                return;
            case 17:
                return;
            default:
                AbstractC4851eH1.a("ContextualSearch", "The state " + String.valueOf(i) + " is not transitional!", new Object[0]);
                return;
        }
    }
}
