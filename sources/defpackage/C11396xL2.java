package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11396xL2 {
    public final Context a;
    public final C11420xQ1 b;
    public final PackageManager d;
    public boolean f;
    public final ArrayList e = new ArrayList();
    public final C10710vL2 g = new C10710vL2(this);
    public final RunnableC11053wL2 h = new RunnableC11053wL2(this);
    public final Handler c = new Handler();

    public C11396xL2(Context context, C11420xQ1 c11420xQ1) {
        this.a = context;
        this.b = c11420xQ1;
        this.d = context.getPackageManager();
    }

    public final void a() {
        ArrayList arrayList;
        C11420xQ1 c11420xQ1;
        int i;
        boolean z;
        if (this.f) {
            ArrayList<ServiceInfo> arrayList2 = new ArrayList();
            int i2 = Build.VERSION.SDK_INT;
            PackageManager packageManager = this.d;
            if (i2 >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it2.hasNext();
                arrayList = this.e;
                boolean z2 = true;
                c11420xQ1 = this.b;
                if (!hasNext) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if (MQ1.c == null ? false : MQ1.c().g()) {
                        if (!arrayList2.isEmpty()) {
                            for (ServiceInfo serviceInfo2 : arrayList2) {
                                if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i4 = -1;
                            break;
                        }
                        ComponentName componentName = ((ServiceConnectionC10024tL2) arrayList.get(i4)).n;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 < 0) {
                        ServiceConnectionC10024tL2 serviceConnectionC10024tL2 = new ServiceConnectionC10024tL2(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        serviceConnectionC10024tL2.u = new C10367uL2(this, serviceConnectionC10024tL2);
                        if (!serviceConnectionC10024tL2.q) {
                            serviceConnectionC10024tL2.q = true;
                            serviceConnectionC10024tL2.m();
                        }
                        i = i3 + 1;
                        arrayList.add(i3, serviceConnectionC10024tL2);
                        c11420xQ1.a(serviceConnectionC10024tL2);
                    } else if (i4 >= i3) {
                        ServiceConnectionC10024tL2 serviceConnectionC10024tL22 = (ServiceConnectionC10024tL2) arrayList.get(i4);
                        if (!serviceConnectionC10024tL22.q) {
                            serviceConnectionC10024tL22.q = true;
                            serviceConnectionC10024tL22.m();
                        }
                        if (serviceConnectionC10024tL22.s == null) {
                            if (!serviceConnectionC10024tL22.q || (serviceConnectionC10024tL22.j == null && serviceConnectionC10024tL22.p.isEmpty())) {
                                z2 = false;
                            }
                            if (z2) {
                                serviceConnectionC10024tL22.l();
                                serviceConnectionC10024tL22.i();
                            }
                        }
                        i = i3 + 1;
                        Collections.swap(arrayList, i4, i3);
                    }
                    i3 = i;
                }
            }
            if (i3 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i3; size2--) {
                    ServiceConnectionC10024tL2 serviceConnectionC10024tL23 = (ServiceConnectionC10024tL2) arrayList.get(size2);
                    c11420xQ1.j(serviceConnectionC10024tL23);
                    arrayList.remove(serviceConnectionC10024tL23);
                    serviceConnectionC10024tL23.u = null;
                    if (serviceConnectionC10024tL23.q) {
                        serviceConnectionC10024tL23.q = false;
                        serviceConnectionC10024tL23.m();
                    }
                }
            }
        }
    }
}
