package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FJ2 implements Runnable {
    public final /* synthetic */ C11703yE1 a;

    @Override // java.lang.Runnable
    public final void run() {
        C0772Fy1 c0772Fy1;
        C11703yE1 c11703yE1 = this.a;
        ComponentTree componentTree = c11703yE1.D;
        if (componentTree == null || (c0772Fy1 = componentTree.V) == null) {
            return;
        }
        ArrayList arrayList = c0772Fy1.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC11101wV0 interfaceC11101wV0 = ((C10131tf4) arrayList.get(i)).i;
            if (interfaceC11101wV0 != null) {
                if (AbstractC10474uf4.b == null) {
                    AbstractC10474uf4.b = new C9217qz1();
                }
                C9217qz1 c9217qz1 = AbstractC10474uf4.b;
                c9217qz1.a = c11703yE1;
                c9217qz1.b = null;
                ((C6206iD0) interfaceC11101wV0).d(c9217qz1);
                C9217qz1 c9217qz12 = AbstractC10474uf4.b;
                c9217qz12.a = null;
                c9217qz12.b = null;
            }
        }
    }

    public FJ2(C11703yE1 c11703yE1) {
        this.a = c11703yE1;
    }
}
