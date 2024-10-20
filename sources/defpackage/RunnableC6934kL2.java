package defpackage;

import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6934kL2 implements Runnable {
    public final /* synthetic */ C7622mL2 a;

    public RunnableC6934kL2(C7622mL2 c7622mL2) {
        this.a = c7622mL2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray = this.a.h;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C8996qL2) sparseArray.valueAt(i)).getClass();
        }
        sparseArray.clear();
    }
}
