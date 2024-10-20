package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vA3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10656vA3 {
    public final InterfaceC12028zA3 a;
    public final int b;

    public C10656vA3(InterfaceC12028zA3 interfaceC12028zA3, int i) {
        this.a = interfaceC12028zA3;
        this.b = i;
    }

    public void a(ArrayList arrayList, InterfaceC10590uz3 interfaceC10590uz3) {
        InterfaceC12028zA3 interfaceC12028zA3 = this.a;
        int i = this.b;
        if (i == 1) {
            int i2 = -1;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                i2 = Math.max(AbstractC1558Lz3.d(((AbstractC11276wz3) interfaceC10590uz3).g(), ((Tab) arrayList.get(i3)).getId()), i2);
            }
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
            ((C1024Hw3) abstractC11276wz3.c.d()).b0(arrayList, abstractC11276wz3.g().getTabAt(i2), false, true);
            ((GA3) interfaceC12028zA3).b();
            FI2.a("TabMultiSelect.Done");
            FI2.a("TabGroup.Created.TabMultiSelect");
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((AbstractC11276wz3) interfaceC10590uz3).g().p(arrayList);
            ((GA3) interfaceC12028zA3).b();
            return;
        }
        C1024Hw3 c1024Hw3 = (C1024Hw3) ((AbstractC11276wz3) interfaceC10590uz3).c.d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c1024Hw3.d0(((Tab) it.next()).getId(), true);
        }
        ((GA3) interfaceC12028zA3).b();
        FI2.a("TabGridDialog.RemoveFromGroup.TabMultiSelect");
    }
}
