package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WR0 implements InterfaceC11989z40 {
    public final /* synthetic */ String a;

    public WR0(String str) {
        this.a = str;
    }

    @Override // defpackage.InterfaceC11989z40
    public final void accept(Object obj) {
        XR0 xr0 = (XR0) obj;
        synchronized (YR0.c) {
            C1439Lb3 c1439Lb3 = YR0.d;
            ArrayList arrayList = (ArrayList) c1439Lb3.get(this.a);
            if (arrayList == null) {
                return;
            }
            c1439Lb3.remove(this.a);
            for (int i = 0; i < arrayList.size(); i++) {
                ((InterfaceC11989z40) arrayList.get(i)).accept(xr0);
            }
        }
    }
}
