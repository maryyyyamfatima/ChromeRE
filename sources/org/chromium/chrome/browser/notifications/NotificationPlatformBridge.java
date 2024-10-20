package org.chromium.chrome.browser.notifications;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import defpackage.AbstractC3641al4;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC8650pL;
import defpackage.C10712vM;
import defpackage.C11876yk4;
import defpackage.C4705dr2;
import defpackage.C7089kn4;
import defpackage.C7549m72;
import defpackage.G72;
import defpackage.InterfaceC11533xk4;
import defpackage.InterfaceC4322ck4;
import defpackage.MC2;
import defpackage.NZ3;
import defpackage.RR;
import defpackage.TX3;
import defpackage.V60;
import defpackage.VX3;
import java.net.URISyntaxException;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.webapk.lib.runtime_library.IWebApkApi;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationPlatformBridge {
    public static final int[] e = new int[0];
    public static NotificationPlatformBridge f;
    public final long a;
    public final C7549m72 b = new C7549m72(V60.a);
    public long c;
    public VX3 d;

    public static NotificationPlatformBridge create(long j) {
        if (f != null) {
            throw new IllegalStateException("There must only be a single NotificationPlatformBridge.");
        }
        NotificationPlatformBridge notificationPlatformBridge = new NotificationPlatformBridge(j);
        f = notificationPlatformBridge;
        return notificationPlatformBridge;
    }

    public NotificationPlatformBridge(long j) {
        this.a = j;
    }

    public final void destroy() {
        f = null;
    }

    public static String b(Intent intent) {
        CharSequence charSequence;
        if (intent.getStringExtra("notification_reply") != null) {
            return intent.getStringExtra("notification_reply");
        }
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent == null || (charSequence = resultsFromIntent.getCharSequence("key_text_reply")) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public static Uri e(int i, String str, String str2) {
        return Uri.parse(str2).buildUpon().fragment(str + "," + i).build();
    }

    public static C4705dr2 f(Context context, String str, String str2, int i, String str3, String str4, String str5, boolean z, String str6, int i2, boolean z2) {
        Intent intent = new Intent(str, e(i2, str2, str3));
        intent.setClass(context, NotificationServiceImpl$Receiver.class);
        intent.putExtra("notification_id", str2);
        intent.putExtra("notification_type", i);
        intent.putExtra("notification_info_origin", str3);
        intent.putExtra("notification_info_scope", str4);
        intent.putExtra("notification_info_profile_id", str5);
        intent.putExtra("notification_info_profile_incognito", z);
        intent.putExtra("notification_info_webapk_package", str6);
        intent.putExtra("notification_info_action_index", i2);
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(268435456);
        }
        return C4705dr2.b(context, 0, intent, 134217728, z2);
    }

    public static String c(String str) {
        if (str != null && str.startsWith("p#")) {
            String[] split = str.split("#");
            try {
                if (new NZ3(split[1]).d() != null) {
                    return split[1];
                }
                return null;
            } catch (URISyntaxException e2) {
                AbstractC4851eH1.a("NotificationPlatformBridge", "Expected to find a valid url in the notification tag extra.", e2);
            }
        }
        return null;
    }

    public final void displayNotification(final String str, final int i, final String str2, final String str3, final String str4, Profile profile, final String str5, final String str6, final Bitmap bitmap, final Bitmap bitmap2, final Bitmap bitmap3, final int[] iArr, final long j, final boolean z, final boolean z2, final ActionInfo[] actionInfoArr) {
        MC2 mc2;
        final boolean a = AbstractC8650pL.a("notifications.vibrate_enabled");
        final boolean i2 = profile.i();
        final String d = AbstractC3641al4.d(V60.a, str3);
        if (d == null) {
            mc2 = MC2.c("");
        } else {
            final MC2 mc22 = new MC2();
            RR.a(d, new InterfaceC4322ck4() { // from class: F72
                @Override // defpackage.InterfaceC4322ck4
                public final void a(String str7, boolean z3) {
                    MC2.this.b(z3 ? d : "");
                }
            });
            mc2 = mc22;
        }
        mc2.g(new Callback() { // from class: D72
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                */
            @Override // org.chromium.base.Callback
            public final void onResult(java.lang.Object r34) {
                /*
                    Method dump skipped, instructions count: 822
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.D72.onResult(java.lang.Object):void");
            }
        });
    }

    public final void closeNotification(String str, String str2, boolean z, String str3) {
        String d;
        C7089kn4 a = C7089kn4.a();
        if (!a.d() && !a.f) {
            a.f = true;
            a.b("Close");
            a.c("TimeToClose");
        }
        if (!z && (d = AbstractC3641al4.d(V60.a, str2)) != null) {
            RR.a(d, new G72(this, str, d, str2));
        } else {
            a(str, str3, str2);
        }
    }

    public final void a(final String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            C11876yk4 a = C11876yk4.a();
            a.getClass();
            InterfaceC11533xk4 interfaceC11533xk4 = new InterfaceC11533xk4() { // from class: qk4
                public final /* synthetic */ int b = -1;

                @Override // defpackage.Gk4
                public final /* synthetic */ void a(IBinder iBinder) {
                    AbstractC11190wk4.a(this, iBinder);
                }

                @Override // defpackage.InterfaceC11533xk4
                public final void b(InterfaceC3952bg1 interfaceC3952bg1) {
                    String str4 = str;
                    int i = this.b;
                    C3276Zf1 c3276Zf1 = (C3276Zf1) interfaceC3952bg1;
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                        obtain.writeString(str4);
                        obtain.writeInt(i);
                        c3276Zf1.a.transact(3, obtain, obtain2, 0);
                        obtain2.readException();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            };
            a.a.a(V60.a, str2, interfaceC11533xk4);
            return;
        }
        if (d().c(Uri.parse(str3))) {
            VX3 d = d();
            Uri parse = Uri.parse(str3);
            d.getClass();
            d.b(parse, new TX3() { // from class: JX3
                public final /* synthetic */ int b = -1;

                @Override // defpackage.TX3
                public final /* synthetic */ void a() {
                }

                @Override // defpackage.TX3
                public final void b(C1193Je2 c1193Je2, ZX3 zx3) {
                    C7688mY3 c7688mY3 = zx3.a;
                    c7688mY3.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", str);
                    bundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.b);
                    C1067If1 c1067If1 = (C1067If1) c7688mY3.a;
                    c1067If1.getClass();
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
                        AbstractC1327Kf1.b(obtain, bundle);
                        c1067If1.a.transact(3, obtain, obtain2, 0);
                        obtain2.readException();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            });
        }
        this.b.a(-1, str);
    }

    public final VX3 d() {
        if (this.d == null) {
            this.d = (VX3) C10712vM.e().k.get();
        }
        return this.d;
    }
}
