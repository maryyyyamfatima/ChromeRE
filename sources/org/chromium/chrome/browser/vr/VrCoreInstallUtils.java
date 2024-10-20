package org.chromium.chrome.browser.vr;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.chrome.R;
import com.google.vr.ndk.base.DaydreamApi;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5609gV1;
import defpackage.BD2;
import defpackage.C5265fV1;
import defpackage.C6372ii4;
import defpackage.HU1;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC4578dV1;
import defpackage.V60;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.vr.VrCoreInstallUtils;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VrCoreInstallUtils {
    public static VrCoreInstallUtils b;
    public static C6372ii4 c;
    public static Integer d;
    public long a;

    public static VrCoreInstallUtils create(long j) {
        return new VrCoreInstallUtils(j);
    }

    public static int getVrSupportLevel() {
        if (d == null) {
            if (c == null) {
                c = new C6372ii4();
            }
            if (c != null && C6372ii4.a() == 3) {
                if (DaydreamApi.isDaydreamReadyPlatform(V60.a)) {
                    d = 3;
                } else {
                    d = 2;
                }
            } else {
                d = 1;
            }
        }
        return d.intValue();
    }

    public static boolean vrSupportNeedsUpdate() {
        return getVrSupportLevel() == 1;
    }

    public VrCoreInstallUtils(long j) {
        this.a = j;
    }

    public final void onNativeDestroy() {
        this.a = 0L;
    }

    public void requestInstallVrCore(WebContents webContents) {
        String string;
        String string2;
        if (webContents != null) {
            WindowAndroid Q0 = webContents.Q0();
            final Activity activity = Q0 == null ? null : (Activity) Q0.k().get();
            if (activity != null) {
                d = null;
                getVrSupportLevel();
                if (vrSupportNeedsUpdate()) {
                    if (c == null) {
                        c = new C6372ii4();
                    }
                    c.getClass();
                    int a = C6372ii4.a();
                    Context context = V60.a;
                    if (a == 1) {
                        string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bb7);
                        string2 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bb6);
                    } else if (a == 2) {
                        string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bb9);
                        string2 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bb8);
                    } else {
                        AbstractC4851eH1.a("VrCoreInstallUtils", "Unknown VrCore compatibility: " + a, new Object[0]);
                        return;
                    }
                    InterfaceC4578dV1 a2 = AbstractC5609gV1.a(webContents.Q0());
                    if (a2 == null) {
                        return;
                    }
                    BD2 bd2 = new BD2(HU1.F);
                    bd2.c(HU1.a, 24);
                    bd2.e(HU1.f, string);
                    bd2.e(HU1.h, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bb5));
                    bd2.c(HU1.m, R.drawable.0_resource_name_obfuscated_res_0x7f0904e5);
                    bd2.e(HU1.c, string2);
                    bd2.e(HU1.d, new InterfaceC0079Ap3() { // from class: ei4
                        @Override // defpackage.InterfaceC0079Ap3
                        public final /* synthetic */ boolean i() {
                            return AbstractC12248zp3.a(this);
                        }

                        @Override // defpackage.InterfaceC0079Ap3
                        public final Object get() {
                            VrCoreInstallUtils vrCoreInstallUtils = VrCoreInstallUtils.this;
                            vrCoreInstallUtils.getClass();
                            VrCoreInstallUtils.b = vrCoreInstallUtils;
                            activity.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.vr.vrcore")), 7213);
                            return 1;
                        }
                    });
                    bd2.e(HU1.x, new Callback() { // from class: fi4
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            ((Integer) obj).intValue();
                            VrCoreInstallUtils.this.a(false);
                        }
                    });
                    ((C5265fV1) a2).b(bd2.a(), webContents, 2, false);
                    return;
                }
                a(true);
                return;
            }
            a(false);
            return;
        }
        a(false);
    }

    public final void a(boolean z) {
        long j = this.a;
        if (j != 0) {
            N.MfwMBbhe(j, z);
        }
    }
}
