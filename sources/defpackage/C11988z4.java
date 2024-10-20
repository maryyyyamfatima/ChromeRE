package defpackage;

import J.N;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.base.CoreAccountId;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.identitymanager.AccountTrackerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z4 */
/* loaded from: classes2.dex */
public final class C11988z4 extends AbstractC0185Bl {
    public final /* synthetic */ List h;
    public final /* synthetic */ AccountManagerFacade i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ AccountTrackerService k;

    public C11988z4(ArrayList arrayList, AccountManagerFacade accountManagerFacade, AccountTrackerService accountTrackerService, boolean z) {
        this.k = accountTrackerService;
        this.h = arrayList;
        this.i = accountManagerFacade;
        this.j = z;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        List list = (List) obj;
        int size = list.size();
        List list2 = this.h;
        int size2 = list2.size();
        boolean z = this.j;
        AccountTrackerService accountTrackerService = this.k;
        if (size == size2) {
            accountTrackerService.getClass();
            N.MyqrKXjt(accountTrackerService.a, (String[]) list.toArray(new String[0]), (String[]) list2.toArray(new String[0]));
            accountTrackerService.c = 2;
            if (accountTrackerService.f) {
                accountTrackerService.a(true);
                accountTrackerService.f = false;
                return;
            }
            ConcurrentLinkedDeque concurrentLinkedDeque = accountTrackerService.b;
            for (Runnable runnable = (Runnable) concurrentLinkedDeque.poll(); runnable != null; runnable = (Runnable) concurrentLinkedDeque.poll()) {
                runnable.run();
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                String str = (String) list2.get(i);
                String str2 = (String) list.get(i);
                arrayList.add(new CoreAccountInfo(new CoreAccountId(str2), str, str2));
            }
            Iterator it = accountTrackerService.d.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    return;
                } else {
                    ((A4) c11814ya2.next()).a(arrayList, z);
                }
            }
        } else {
            accountTrackerService.c = 0;
            accountTrackerService.a(z);
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.iterator();
        while (true) {
            if (it.hasNext()) {
                String c = this.i.c((String) it.next());
                if (c == null) {
                    break;
                }
                arrayList.add(c);
            } else {
                EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Signin.AndroidGetAccountIdsTime");
                break;
            }
        }
        return arrayList;
    }
}
