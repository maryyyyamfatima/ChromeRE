package defpackage;

import android.content.Context;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D00 implements Runnable {
    public final /* synthetic */ ComponentTree a;

    public D00(ComponentTree componentTree) {
        this.a = componentTree;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9173qr2 interfaceC9173qr2;
        int i;
        Context context;
        InterfaceC9750sZ1 a;
        ComponentTree componentTree = this.a;
        boolean z = componentTree.l;
        synchronized (componentTree) {
            C0772Fy1 c0772Fy1 = componentTree.V;
            if (c0772Fy1 == null && (c0772Fy1 = componentTree.W) == null) {
                return;
            }
            C5524gE1 c5524gE1 = componentTree.h0;
            if (c5524gE1 == null) {
                c5524gE1 = componentTree.p.e();
            }
            if (c5524gE1 != null) {
                C7849n00 c7849n00 = componentTree.p;
                interfaceC9173qr2 = VH1.a(c7849n00, c5524gE1, c5524gE1.b(c7849n00, 8));
            } else {
                interfaceC9173qr2 = null;
            }
            int i2 = componentTree.h;
            ArrayList arrayList = c0772Fy1.h;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                while (i < size) {
                    WZ wz = ((C9006qN2) arrayList.get(i)).b.j.i;
                    if (z) {
                        wz.getClass();
                        i = wz instanceof C6531j94 ? 0 : i + 1;
                    }
                    boolean z2 = B10.a;
                    if (WZ.i0(wz) && (a = D10.a((context = c0772Fy1.c.a), wz, i2)) != null) {
                        a.c(context, wz);
                    }
                }
            }
            if (interfaceC9173qr2 != null) {
                c5524gE1.getClass();
                C5524gE1.a(interfaceC9173qr2);
            }
        }
    }
}
