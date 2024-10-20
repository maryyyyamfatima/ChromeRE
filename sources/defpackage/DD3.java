package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DD3 implements InterfaceC11179wj {
    public final C2000Pk0 a;
    public final C10505ul g;
    public final int h;
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();

    public DD3(C2000Pk0 c2000Pk0, C10505ul c10505ul, int i) {
        this.a = c2000Pk0;
        this.g = c10505ul;
        ApplicationStatus.f(this);
        this.h = i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.i.add(null);
        }
    }

    public final int a(Activity activity) {
        InterfaceC10590uz3 interfaceC10590uz3;
        int indexOf;
        if (activity == null || (interfaceC10590uz3 = (InterfaceC10590uz3) this.j.get(activity)) == null || (indexOf = this.i.indexOf(interfaceC10590uz3)) == -1) {
            return -1;
        }
        return indexOf;
    }

    public final Tab b(int i) {
        Tab m;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                C10505ul c10505ul = this.g;
                if (c10505ul.a.get(i) != null) {
                    return ((InterfaceC9819sl) c10505ul.a.get(i)).a();
                }
                return null;
            }
            InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) arrayList.get(i2);
            if (interfaceC10590uz3 != null && (m = ((AbstractC11276wz3) interfaceC10590uz3).m(i)) != null) {
                return m;
            }
            i2++;
        }
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        ArrayList arrayList;
        int indexOf;
        if (i == 6) {
            HashMap hashMap = this.j;
            if (!hashMap.containsKey(activity) || (indexOf = (arrayList = this.i).indexOf(hashMap.remove(activity))) < 0) {
                return;
            }
            arrayList.set(indexOf, null);
        }
    }
}
