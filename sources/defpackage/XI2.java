package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XI2 implements Runnable {
    public final /* synthetic */ List a;

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((O00) list.get(i)).i();
        }
    }

    public XI2(ArrayList arrayList) {
        this.a = arrayList;
    }
}
