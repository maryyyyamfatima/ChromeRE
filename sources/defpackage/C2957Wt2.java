package defpackage;

import J.N;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.LinkedList;
import org.chromium.base.ThreadUtils;
import org.chromium.components.webapps.AppBannerManager;
import org.chromium.components.webapps.AppData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wt2 */
/* loaded from: classes.dex */
public final class C2957Wt2 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ int j;
    public final /* synthetic */ C1320Ke k;
    public final /* synthetic */ ServiceConnectionC3087Xt2 l;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        String str = this.h;
        ServiceConnectionC3087Xt2 serviceConnectionC3087Xt2 = this.l;
        InterfaceC0657Fb1 interfaceC0657Fb1 = serviceConnectionC3087Xt2.h;
        if (interfaceC0657Fb1 != null) {
            try {
                return ServiceConnectionC3087Xt2.a(serviceConnectionC3087Xt2, str, this.i, ((C0397Db1) interfaceC0657Fb1).a(str), this.j);
            } catch (RemoteException e) {
                Log.e("PhoneskyDetailsDelegate", "Remote exception: " + e);
            } catch (NullPointerException e2) {
                Log.e("PhoneskyDetailsDelegate", "Crash in the remote Service: " + e2);
            }
        }
        return null;
    }

    public C2957Wt2(ServiceConnectionC3087Xt2 serviceConnectionC3087Xt2, String str, String str2, String str3, int i, C1320Ke c1320Ke) {
        this.l = serviceConnectionC3087Xt2;
        this.h = str;
        this.i = str3;
        this.j = i;
        this.k = c1320Ke;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        AppData appData = (AppData) obj;
        C1320Ke c1320Ke = this.k;
        if (appData == null) {
            c1320Ke.getClass();
        } else if (c1320Ke.a.a != 0 && !TextUtils.isEmpty(appData.c)) {
            AppBannerManager appBannerManager = c1320Ke.a;
            N.MpPa5KMX(appBannerManager.a, appBannerManager, appData, appData.b, appData.a, appData.c);
        }
        ServiceConnectionC3087Xt2 serviceConnectionC3087Xt2 = this.l;
        serviceConnectionC3087Xt2.getClass();
        Object obj2 = ThreadUtils.a;
        LinkedList linkedList = serviceConnectionC3087Xt2.a;
        if (linkedList.isEmpty()) {
            serviceConnectionC3087Xt2.b();
        } else {
            ((AbstractC0185Bl) linkedList.pop()).c(AbstractC0185Bl.e);
        }
    }
}
