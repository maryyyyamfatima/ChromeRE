package defpackage;

import J.N;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription;
import org.chromium.chrome.browser.subscriptions.CommerceSubscriptionsStorage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: So3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2413So3 implements Callback {
    public final /* synthetic */ C3063Xo3 a;
    public final /* synthetic */ List g;
    public final /* synthetic */ Callback h;

    public /* synthetic */ C2413So3(List list, Callback callback, C3063Xo3 c3063Xo3) {
        this.a = c3063Xo3;
        this.g = list;
        this.h = callback;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        List<CommerceSubscription> list;
        CommerceSubscriptionsStorage commerceSubscriptionsStorage;
        List list2 = (List) obj;
        C3063Xo3 c3063Xo3 = this.a;
        c3063Xo3.getClass();
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.g;
            commerceSubscriptionsStorage = c3063Xo3.a;
            if (!hasNext) {
                break;
            }
            CommerceSubscription commerceSubscription = (CommerceSubscription) it.next();
            if (!list.contains(commerceSubscription)) {
                N.MZZN0mUK(commerceSubscriptionsStorage.a, CommerceSubscriptionsStorage.a(commerceSubscription), null);
            }
        }
        for (CommerceSubscription commerceSubscription2 : list) {
            if (!list2.contains(commerceSubscription2)) {
                N.MkyzGPJh(commerceSubscriptionsStorage.a, CommerceSubscriptionsStorage.a(commerceSubscription2), commerceSubscription2.b, commerceSubscription2.c, commerceSubscription2.d, commerceSubscription2.e, commerceSubscription2.a, null);
            }
        }
        this.h.onResult(0);
    }
}
