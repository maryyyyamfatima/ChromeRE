package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wp3 */
/* loaded from: classes.dex */
public abstract class AbstractC11219wp3 implements InterfaceC10876vp3 {
    public final ArrayList a = new ArrayList();
    public final C9162qp3 b;
    public final C7857n12 c;
    public final C0167Bh1 d;

    public AbstractC11219wp3(C9162qp3 c9162qp3, Profile profile, C7857n12 c7857n12) {
        this.b = c9162qp3;
        this.d = new C0167Bh1(profile);
        this.c = c7857n12;
    }

    public final void a() {
        C0167Bh1 c0167Bh1 = this.d;
        LargeIconBridge largeIconBridge = c0167Bh1.b;
        if (largeIconBridge != null) {
            largeIconBridge.a();
            c0167Bh1.b = null;
        }
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0316Cl0) it.next()).onDestroy();
        }
        arrayList.clear();
    }

    @Override // defpackage.InterfaceC10876vp3
    public boolean isVisible() {
        C7857n12 c7857n12 = this.c;
        return c7857n12.a == ((AbstractC11276wz3) c7857n12.c).h();
    }
}
