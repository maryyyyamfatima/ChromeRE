package defpackage;

import android.os.IBinder;
import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9693sO extends AbstractC1598Mh3 {
    public final int b;

    @Override // defpackage.AbstractC1598Mh3
    public final IBinder a() {
        return null;
    }

    public AbstractC9693sO(int i) {
        this.b = i;
    }

    @Override // defpackage.AbstractC1598Mh3
    public void c() {
        SparseArray sparseArray = AbstractC8667pO1.a;
        int i = this.b;
        C6948kO1 c6948kO1 = (C6948kO1) sparseArray.get(i);
        if (c6948kO1 != null) {
            c6948kO1.a = null;
        }
        C6948kO1 c6948kO12 = (C6948kO1) sparseArray.get(i);
        if (c6948kO12 == null) {
            return;
        }
        c6948kO12.b();
        sparseArray.remove(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    @Override // defpackage.AbstractC1598Mh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(android.content.Intent r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9693sO.e(android.content.Intent, int, int):int");
    }
}
