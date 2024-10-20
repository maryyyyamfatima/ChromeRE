package org.chromium.chrome.browser.sharing.shared_clipboard;

import J.N;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC4851eH1;
import defpackage.C4705dr2;
import defpackage.C6861k72;
import defpackage.C7629mN;
import defpackage.C7893n72;
import defpackage.K62;
import defpackage.PO;
import defpackage.R83;
import defpackage.U72;
import defpackage.V60;
import defpackage.W72;
import defpackage.X72;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sharing.SharingServiceProxy;
import org.chromium.chrome.browser.sharing.shared_clipboard.SharedClipboardMessageHandler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SharedClipboardMessageHandler {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class TapReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class TryAgainReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            R83.a(11, "SharedClipboard");
            final String w = AbstractC2281Ro1.w(intent, "SharedClipboard.EXTRA_DEVICE_GUID");
            final String w2 = AbstractC2281Ro1.w(intent, "SharedClipboard.EXTRA_DEVICE_CLIENT_NAME");
            final String w3 = AbstractC2281Ro1.w(intent, "android.intent.extra.TEXT");
            if (TextUtils.isEmpty(w) || TextUtils.isEmpty(w2) || TextUtils.isEmpty(w3)) {
                return;
            }
            Context context2 = V60.a;
            String string = context2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140a3b, w2);
            PO a = X72.a("sharing", new C7893n72(18, "SharedClipboard", 11));
            a.a.f(string);
            K62 k62 = a.a;
            k62.r = "SharedClipboard";
            k62.w = context2.getColor(R.color.0_resource_name_obfuscated_res_0x7f070112);
            k62.k = 1;
            a.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901e4);
            k62.o = 0;
            k62.p = 0;
            k62.q = true;
            a.k(true);
            k62.g(-1);
            W72 d = a.d();
            C6861k72 c6861k72 = new C6861k72(context2);
            Notification notification = d.a;
            if (notification == null) {
                AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
            } else {
                C7893n72 c7893n72 = d.b;
                c6861k72.c(c7893n72.b, c7893n72.c, notification);
            }
            U72.a.b(18, notification);
            C7629mN.a().d(false);
            if (SharingServiceProxy.a == null) {
                if (SharingServiceProxy.b == 0) {
                    N.MI$va2Pq(Profile.d());
                }
                SharingServiceProxy.a = new SharingServiceProxy();
            }
            Runnable runnable = new Runnable() { // from class: u83
                @Override // java.lang.Runnable
                public final void run() {
                    if (SharingServiceProxy.a == null) {
                        if (SharingServiceProxy.b == 0) {
                            N.MI$va2Pq(Profile.d());
                        }
                        SharingServiceProxy.a = new SharingServiceProxy();
                    }
                    final String str = w2;
                    final String str2 = w3;
                    final String str3 = w;
                    Callback callback = new Callback() { // from class: v83
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            String string2;
                            String string3;
                            C4705dr2 b;
                            Integer num = (Integer) obj;
                            if (num.intValue() == 0) {
                                R83.a(11, "SharedClipboard");
                                return;
                            }
                            int intValue = num.intValue();
                            Resources resources = V60.a.getResources();
                            String string4 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1402bf);
                            switch (intValue) {
                                case 1:
                                case 2:
                                case 4:
                                    string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c4, string4);
                                    break;
                                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c7);
                                    break;
                                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                                case 6:
                                    string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c5, string4);
                                    break;
                                default:
                                    string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c5, string4);
                                    break;
                            }
                            int intValue2 = num.intValue();
                            Resources resources2 = V60.a.getResources();
                            String str4 = str;
                            switch (intValue2) {
                                case 1:
                                    string3 = resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c1, str4);
                                    break;
                                case 2:
                                    string3 = resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c3);
                                    break;
                                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    string3 = resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c6);
                                    break;
                                case 4:
                                    string3 = resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c0, str4);
                                    break;
                                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                                case 6:
                                    string3 = resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c2);
                                    break;
                                default:
                                    string3 = resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f1402c2);
                                    break;
                            }
                            if (num.intValue() == 4 || num.intValue() == 2) {
                                Context context3 = V60.a;
                                b = C4705dr2.b(context3, 0, new Intent(context3, (Class<?>) SharedClipboardMessageHandler.TryAgainReceiver.class).putExtra("android.intent.extra.TEXT", str2).putExtra("SharedClipboard.EXTRA_DEVICE_GUID", str3).putExtra("SharedClipboard.EXTRA_DEVICE_CLIENT_NAME", str4), 134217728, false);
                            } else {
                                b = null;
                            }
                            Context context4 = V60.a;
                            Resources resources3 = context4.getResources();
                            PO a2 = X72.a("sharing", new C7893n72(18, "SharedClipboard", 11));
                            a2.a.f(string2);
                            K62 k622 = a2.a;
                            k622.r = "SharedClipboard";
                            k622.w = context4.getColor(R.color.0_resource_name_obfuscated_res_0x7f070559);
                            k622.k = 1;
                            a2.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901fb);
                            k622.e(string3);
                            k622.g(-1);
                            k622.d(true);
                            if (b != null) {
                                a2.f(b);
                                a2.a(R.drawable.0_resource_name_obfuscated_res_0x7f0901cf, resources3.getString(R.string.0_resource_name_obfuscated_res_0x7f140b5f), b, 11);
                            }
                            W72 e = a2.e(string3);
                            C6861k72 c6861k722 = new C6861k72(context4);
                            Notification notification2 = e.a;
                            if (notification2 == null) {
                                AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
                            } else {
                                C7893n72 c7893n722 = e.b;
                                c6861k722.c(c7893n722.b, c7893n722.c, notification2);
                            }
                            U72.a.b(18, notification2);
                        }
                    };
                    long j = SharingServiceProxy.b;
                    if (j == 0) {
                        callback.onResult(5);
                    } else {
                        N.ML9GlI7W(j, str3, str2, callback);
                    }
                }
            };
            long j = SharingServiceProxy.b;
            if (j == 0) {
                runnable.run();
            } else {
                N.MBEvP57R(j, runnable);
            }
        }
    }

    public static void showNotification(String str) {
        String string;
        Context context = V60.a;
        C4705dr2 b = C4705dr2.b(context, 0, new Intent(context, (Class<?>) TapReceiver.class), 134217728, false);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140a1e);
        } else {
            string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140a1d, str);
        }
        R83.b(18, "SharedClipboard", 10, b, null, null, null, string, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140a1c), R.drawable.0_resource_name_obfuscated_res_0x7f0901e4, R.drawable.0_resource_name_obfuscated_res_0x7f09048f, R.color.0_resource_name_obfuscated_res_0x7f070112, false);
    }
}
