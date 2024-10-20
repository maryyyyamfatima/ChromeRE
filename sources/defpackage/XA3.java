package defpackage;

import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XA3 extends C10656vA3 {
    public final /* synthetic */ VA3 c;
    public final /* synthetic */ Callback d;
    public final /* synthetic */ C4136cB3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XA3(C4136cB3 c4136cB3, InterfaceC12028zA3 interfaceC12028zA3, int i, VA3 va3, Callback callback) {
        super(interfaceC12028zA3, i);
        this.e = c4136cB3;
        this.c = va3;
        this.d = callback;
    }

    @Override // defpackage.C10656vA3
    public final void a(ArrayList arrayList, InterfaceC10590uz3 interfaceC10590uz3) {
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        abstractC11276wz3.g().getCount();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(Integer.valueOf(((Tab) arrayList.get(i)).getId()));
        }
        this.e.getClass();
        this.d.onResult(new WA3(this.c, 2, arrayList2));
        super.a(arrayList, abstractC11276wz3);
    }
}
