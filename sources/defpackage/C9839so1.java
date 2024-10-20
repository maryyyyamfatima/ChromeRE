package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.android.chrome.R;
import com.google.android.gms.instantapps.LaunchData;
import java.util.HashSet;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.instantapps.InstantAppsBannerData;
import org.chromium.chrome.browser.instantapps.InstantAppsMessageDelegate;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.webapps.WebappsIconUtils;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: so1 */
/* loaded from: classes.dex */
public final class C9839so1 implements InterfaceC1702Nc2 {
    public final /* synthetic */ Tab a;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Uri i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ C10868vo1 k;

    public C9839so1(C10868vo1 c10868vo1, Tab tab, String str, boolean z, Uri uri, Context context) {
        this.k = c10868vo1;
        this.a = tab;
        this.g = str;
        this.h = z;
        this.i = uri;
        this.j = context;
    }

    @Override // defpackage.InterfaceC1702Nc2
    public final void b(AF3 af3) {
        Tab tab;
        WebContents b;
        boolean z;
        NavigationEntry w;
        if (af3.l()) {
            LaunchData launchData = (LaunchData) af3.k();
            if (launchData == null || launchData.a == null || (b = (tab = this.a).b()) == null) {
                return;
            }
            String i = b.u().i();
            String str = this.g;
            if (!str.equals(i) && ((w = b.i().w()) == null || !str.equals(w.b.i()))) {
                AbstractC4851eH1.d("InstantAppsHandlerI", "Not showing the Instant Apps banner because the user has navigated away from the page.", new Object[0]);
                return;
            }
            if (!tab.n()) {
                C10868vo1 c10868vo1 = this.k;
                C10525uo1 c10525uo1 = c10868vo1.c;
                c10525uo1.getClass();
                String host = Uri.parse(str).getHost();
                HashSet hashSet = c10525uo1.b;
                boolean z2 = host != null && hashSet.contains(host);
                boolean z3 = this.h;
                if ((!z3 || z2) && !N.M0gHjCEI(b, str)) {
                    if (z3 && z2) {
                        EI2.h(4, 5, "Android.InstantApps.ShouldShowBanner");
                    }
                    z = false;
                } else {
                    EI2.h(0, 5, "Android.InstantApps.ShouldShowBanner");
                    hashSet.add(host);
                    z = true;
                }
                if (z) {
                    String str2 = launchData.h;
                    Bitmap bitmap = launchData.j;
                    String str3 = this.g;
                    Uri uri = this.i;
                    Intent intent = launchData.a;
                    Context context = this.j;
                    String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140541);
                    boolean z4 = this.h;
                    InstantAppsBannerData instantAppsBannerData = new InstantAppsBannerData(str2, bitmap, str3, uri, intent, string, b, z4);
                    c10868vo1.c.getClass();
                    C7928nE c7928nE = UN.a;
                    if (N.M09VlOh_("MessagesForAndroidInstantApps")) {
                        InterfaceC4578dV1 a = AbstractC5609gV1.a(b.Q0());
                        final InstantAppsMessageDelegate instantAppsMessageDelegate = new InstantAppsMessageDelegate(context, b, a, instantAppsBannerData);
                        BD2 bd2 = new BD2(HU1.F);
                        bd2.c(HU1.a, 27);
                        bd2.e(HU1.f, String.format(context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140540), str2));
                        bd2.e(HU1.g, String.format(context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14013c), str2));
                        bd2.e(HU1.i, AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f0901a5));
                        bd2.b(HU1.j, true);
                        bd2.e(HU1.l, new BitmapDrawable(bitmap));
                        bd2.c(HU1.p, 0);
                        bd2.b(HU1.n, true);
                        bd2.c(HU1.o, WebappsIconUtils.getIdealIconCornerRadiusPxForPromptUI());
                        bd2.e(HU1.c, string);
                        bd2.e(HU1.d, new InterfaceC0079Ap3() { // from class: wo1
                            @Override // defpackage.InterfaceC0079Ap3
                            public final /* synthetic */ boolean i() {
                                return AbstractC12248zp3.a(this);
                            }

                            @Override // defpackage.InterfaceC0079Ap3
                            public final Object get() {
                                InstantAppsBannerData instantAppsBannerData2 = InstantAppsMessageDelegate.this.b;
                                N.M$0UHZ8o(instantAppsBannerData2.h);
                                C9496ro1.a().getClass();
                                C9496ro1.d(instantAppsBannerData2);
                                return 1;
                            }
                        });
                        bd2.e(HU1.x, new Callback() { // from class: xo1
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj) {
                                return new ZE(this, obj);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj) {
                                ((Integer) obj).intValue();
                                InstantAppsMessageDelegate instantAppsMessageDelegate2 = InstantAppsMessageDelegate.this;
                                InstantAppsBannerData instantAppsBannerData2 = instantAppsMessageDelegate2.b;
                                N.MpokfXYA(instantAppsMessageDelegate2.a, instantAppsBannerData2.c, instantAppsBannerData2.h);
                            }
                        });
                        PropertyModel a2 = bd2.a();
                        instantAppsMessageDelegate.d = a2;
                        if (a != null) {
                            ((C5265fV1) a).b(a2, b, 1, false);
                            N.MVnykCj2(b, str3, z4);
                            return;
                        }
                        return;
                    }
                    N.MWjsnbGf(b, instantAppsBannerData, str3, z4);
                    return;
                }
                return;
            }
            AbstractC4851eH1.d("InstantAppsHandlerI", "Not showing the Instant Apps banner because the user is viewing an error page", new Object[0]);
            return;
        }
        Exception j = af3.j();
        if (j != null) {
            if ((j instanceof C10114td) && ((C10114td) j).a.g == 19500) {
                return;
            }
            AbstractC4851eH1.a("InstantAppsHandlerI", "Exception when calling getInstantAppLaunchData", j);
        }
    }
}
