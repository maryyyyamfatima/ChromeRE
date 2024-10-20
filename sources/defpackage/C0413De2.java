package defpackage;

import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: De2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413De2 extends C implements RandomAccess {
    public final C3804bE[] a;
    public final int[] g;

    @Override // defpackage.AbstractC8877q, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3804bE) {
            return super.contains((C3804bE) obj);
        }
        return false;
    }

    @Override // defpackage.C, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3804bE) {
            return super.indexOf((C3804bE) obj);
        }
        return -1;
    }

    @Override // defpackage.C, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3804bE) {
            return super.lastIndexOf((C3804bE) obj);
        }
        return -1;
    }

    public C0413De2(C3804bE[] c3804bEArr, int[] iArr) {
        this.a = c3804bEArr;
        this.g = iArr;
    }

    @Override // defpackage.AbstractC8877q
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.C, java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x016d, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.C0413De2 b(defpackage.C3804bE... r14) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0413De2.b(bE[]):De2");
    }
}
