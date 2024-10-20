package defpackage;

import J.N;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.notifications.NotificationPlatformBridge;
import org.chromium.chrome.browser.usage_stats.UsageStatsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: js3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6774js3 implements Callback {
    public final /* synthetic */ C7806ms3 a;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ List h;
    public final /* synthetic */ MC2 i;

    public /* synthetic */ C6774js3(C7806ms3 c7806ms3, boolean z, List list, MC2 mc2) {
        this.a = c7806ms3;
        this.g = z;
        this.h = list;
        this.i = mc2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        final C7806ms3 c7806ms3 = this.a;
        c7806ms3.getClass();
        final boolean z = this.g;
        final List list = this.h;
        final MC2 mc2 = this.i;
        c7806ms3.c.h(new Callback() { // from class: ks3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                final boolean z2 = z;
                final List list2 = list;
                final MC2 mc22 = mc2;
                final List list3 = (List) obj2;
                final C7806ms3 c7806ms32 = C7806ms3.this;
                c7806ms32.getClass();
                ArrayList arrayList = new ArrayList(list3);
                if (z2) {
                    AbstractC7533m44.a(4);
                    arrayList.addAll(list2);
                } else {
                    AbstractC7533m44.a(5);
                    arrayList.removeAll(list2);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                Callback callback = new Callback() { // from class: ls3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj3) {
                        return new ZE(this, obj3);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj3) {
                        C7806ms3 c7806ms33 = c7806ms32;
                        c7806ms33.getClass();
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        MC2 mc23 = mc22;
                        if (booleanValue) {
                            boolean z3 = z2;
                            List list4 = list3;
                            List list5 = list2;
                            if (z3) {
                                list4.addAll(list5);
                            } else {
                                list4.removeAll(list5);
                            }
                            P72 p72 = c7806ms33.b;
                            p72.getClass();
                            if (!list5.isEmpty() && C10964w44.c()) {
                                int i = 0;
                                if (!z3) {
                                    if (!list5.isEmpty()) {
                                        String[] strArr2 = new String[list5.size() * 2];
                                        while (i < list5.size()) {
                                            int i2 = i * 2;
                                            strArr2[i2 + 0] = "http://" + ((String) list5.get(i));
                                            strArr2[i2 + 1] = "https://" + ((String) list5.get(i));
                                            i++;
                                        }
                                        N.MkLq9R0C(p72.a, strArr2);
                                    }
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    StatusBarNotification[] activeNotifications = p72.c.getActiveNotifications();
                                    int length = activeNotifications.length;
                                    while (i < length) {
                                        StatusBarNotification statusBarNotification = activeNotifications[i];
                                        if (statusBarNotification.getId() == -1) {
                                            String tag = statusBarNotification.getTag();
                                            String c = NotificationPlatformBridge.c(tag);
                                            if ((URLUtil.isHttpUrl(c) || URLUtil.isHttpsUrl(c)) && list5.contains(Uri.parse(c).getHost())) {
                                                arrayList2.add(new W72(statusBarNotification.getNotification(), new C7893n72(7, tag, -1)));
                                            }
                                        }
                                        i++;
                                    }
                                    p72.a(arrayList2);
                                }
                            }
                            mc23.b(null);
                            return;
                        }
                        mc23.e(null);
                    }
                };
                UsageStatsBridge usageStatsBridge = c7806ms32.a;
                N.M2UQ4Zbr(usageStatsBridge.b, usageStatsBridge, strArr, callback);
            }
        }, new DD0());
    }
}
