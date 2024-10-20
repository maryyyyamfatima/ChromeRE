package defpackage;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.components.signin.base.AccountCapabilities;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class W2 extends AbstractC0185Bl {
    public final /* synthetic */ Account h;
    public final /* synthetic */ MC2 i;
    public final /* synthetic */ Y2 j;

    public W2(Y2 y2, Account account, MC2 mc2) {
        this.j = y2;
        this.h = account;
        this.i = mc2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.i.b((AccountCapabilities) obj);
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        HashMap hashMap = new HashMap();
        Iterator it = AbstractC8890q2.a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hashMap.put(str, Integer.valueOf(this.j.a.b(this.h, str.startsWith("accountcapabilities/") ? str.substring(20) : str)));
        }
        HashMap hashMap2 = new HashMap();
        Iterator it2 = AbstractC8890q2.a.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (intValue != 0) {
                hashMap2.put(str2, Boolean.valueOf(intValue == 1));
            }
        }
        return new AccountCapabilities(hashMap2);
    }
}
