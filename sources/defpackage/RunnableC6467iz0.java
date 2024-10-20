package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6467iz0 implements Runnable {
    public final ArrayList a;
    public final int g;

    public RunnableC6467iz0(List list, int i, Throwable th) {
        this.a = new ArrayList(list);
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        if (this.g != 1) {
            while (i < size) {
                ((AbstractC6125hz0) arrayList.get(i)).getClass();
                i++;
            }
        } else {
            while (i < size) {
                ((AbstractC6125hz0) arrayList.get(i)).a();
                i++;
            }
        }
    }
}
