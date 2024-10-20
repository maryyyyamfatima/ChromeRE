package defpackage;

import J.N;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.content_creation.notes.bridges.NoteServiceBridge;
import org.chromium.components.content_creation.reactions.ReactionServiceBridge;
import org.chromium.ui.base.Clipboard;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CP {
    public static final ComponentName q = new ComponentName("CHROME", "CHROME_FEATURE");
    public final Activity a;
    public final WindowAndroid b;
    public final InterfaceC0079Ap3 c;
    public final QB d;
    public final I73 e;
    public final C6862k73 f;
    public final Callback g;
    public final long h;
    public final ArrayList i;
    public final QO j;
    public final String k;
    public final InterfaceC10140th1 l;
    public final KU3 m;
    public final int n;
    public final S73 o;
    public final InterfaceC0079Ap3 p;

    public CP(Activity activity, WindowAndroid windowAndroid, InterfaceC0079Ap3 interfaceC0079Ap3, QB qb, I73 i73, C6862k73 c6862k73, Callback callback, boolean z, long j, QO qo, InterfaceC10140th1 interfaceC10140th1, KU3 ku3, String str, int i, S73 s73, InterfaceC0079Ap3 interfaceC0079Ap32) {
        int i2;
        this.a = activity;
        this.b = windowAndroid;
        this.c = interfaceC0079Ap3;
        this.d = qb;
        this.e = i73;
        this.f = c6862k73;
        this.g = callback;
        this.h = j;
        this.l = interfaceC10140th1;
        this.m = ku3;
        this.j = qo;
        this.k = str;
        this.n = i;
        this.o = s73;
        this.p = interfaceC0079Ap32;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        Profile profile = (Profile) interfaceC0079Ap32.get();
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("UpcomingSharingFeatures");
        if (N.M09VlOh_("WebNotesStylize")) {
            boolean z2 = ku3.isInitialized() && ku3.shouldTriggerHelpUI("IPH_SharingHubWebnotesStylize");
            BP bp = new BP(this, 3);
            bp.a = R.drawable.0_resource_name_obfuscated_res_0x7f0904ea;
            bp.b = R.string.0_resource_name_obfuscated_res_0x7f140a3d;
            bp.c = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140a3c);
            bp.d = "SharingHubAndroid.WebnotesStylize";
            final String str2 = c6862k73.b;
            bp.e = new Callback() { // from class: mP
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    String str3 = str2;
                    CP cp = CP.this;
                    cp.m.notifyEvent("sharing_hub_webnotes_stylize_used");
                    Activity activity2 = cp.a;
                    C6862k73 c6862k732 = cp.f;
                    WindowAndroid windowAndroid2 = c6862k732.a;
                    String str4 = cp.k;
                    String trim = c6862k732.c.trim();
                    P52 p52 = new P52(activity2, windowAndroid2, (NoteServiceBridge) N.MD7uW37V(Profile.d()), cp.j, str4, str3, trim);
                    p52.i = System.currentTimeMillis();
                    EI2.h(0, 3, "NoteCreation.Funnel");
                    p52.e.Q0(((VS0) activity2).h0(), null);
                }
            };
            bp.j = z2;
            arrayList.add(bp.a());
        }
        boolean z3 = ku3.isInitialized() && ku3.shouldTriggerHelpUI("IPH_ShareScreenshot");
        BP bp2 = new BP(this, 0, 2, 3, 5);
        bp2.h = new Integer[]{6, 5};
        bp2.a = R.drawable.0_resource_name_obfuscated_res_0x7f09047b;
        bp2.b = R.string.0_resource_name_obfuscated_res_0x7f140a3a;
        bp2.d = "SharingHubAndroid.ScreenshotSelected";
        bp2.f = true;
        bp2.j = z3;
        bp2.k = false;
        bp2.e = new Callback() { // from class: uP
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CP cp = CP.this;
                cp.m.notifyEvent("share_screenshot_clicked");
                C10084tX2 c10084tX2 = new C10084tX2(cp.a, cp.f.a, cp.k, cp.j, cp.d, cp.l);
                m mVar = (m) cp.d;
                mVar.a(c10084tX2);
                mVar.l(cp.e, true, 0);
            }
        };
        arrayList.add(bp2.a());
        if (N.M09VlOh_("ChromeShareLongScreenshot") && interfaceC0079Ap3.i() && Build.VERSION.SDK_INT >= 24) {
            BP bp3 = new BP(this, 0, 2, 3, 5);
            bp3.h = new Integer[]{6, 5};
            bp3.a = R.drawable.0_resource_name_obfuscated_res_0x7f090377;
            bp3.b = R.string.0_resource_name_obfuscated_res_0x7f140a31;
            bp3.d = "SharingHubAndroid.LongScreenshotSelected";
            bp3.f = true;
            bp3.k = false;
            bp3.e = new Callback() { // from class: rP
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    CP cp = CP.this;
                    cp.m.notifyEvent("share_screenshot_clicked");
                    MI1 mi1 = new MI1(cp.a, (Tab) cp.c.get(), cp.k, cp.j, cp.d, cp.l);
                    m mVar = (m) cp.d;
                    mVar.a(mi1);
                    mVar.l(cp.e, true, 0);
                }
            };
            arrayList.add(bp3.a());
        }
        if (N.M09VlOh_("LightweightReactions") || M09VlOh_) {
            i2 = 1;
            BP bp4 = new BP(this, 0, 2, 3, 5);
            bp4.h = new Integer[]{6, 5};
            bp4.a = R.drawable.0_resource_name_obfuscated_res_0x7f09036d;
            bp4.b = R.string.0_resource_name_obfuscated_res_0x7f140a30;
            bp4.d = "SharingHubAndroid.LightweightReactions";
            bp4.f = true;
            bp4.k = false;
            bp4.e = new Callback() { // from class: xP
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    CP cp = CP.this;
                    C7227lB1 c7227lB1 = new C7227lB1(cp.a, cp.f.a, cp.k, cp.j, cp.d, (ReactionServiceBridge) N.MsTbHhrg(Profile.d()));
                    m mVar = (m) cp.d;
                    mVar.a(c7227lB1);
                    mVar.l(cp.e, true, 0);
                }
            };
            arrayList.add(bp4.a());
        } else {
            i2 = 1;
        }
        Integer[] numArr = new Integer[2];
        numArr[0] = 0;
        numArr[i2] = 1;
        BP bp5 = new BP(this, numArr);
        Integer[] numArr2 = new Integer[i2];
        numArr2[0] = 4;
        bp5.g = numArr2;
        bp5.a = R.drawable.0_resource_name_obfuscated_res_0x7f0901df;
        bp5.b = R.string.0_resource_name_obfuscated_res_0x7f140a24;
        bp5.d = "SharingHubAndroid.CopyURLSelected";
        bp5.e = new Callback() { // from class: wP
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CP cp = CP.this;
                Activity activity2 = cp.a;
                ClipboardManager clipboardManager = (ClipboardManager) activity2.getSystemService("clipboard");
                C6862k73 c6862k732 = cp.f;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(c6862k732.b, c6862k732.e));
                ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f1405c7, 0, activity2).d();
            }
        };
        arrayList.add(bp5.a());
        BP bp6 = new BP(this, 5, 7);
        bp6.a = R.drawable.0_resource_name_obfuscated_res_0x7f0901df;
        bp6.b = R.string.0_resource_name_obfuscated_res_0x7f140a21;
        bp6.h = new Integer[]{1, 5, 0};
        bp6.d = "SharingHubAndroid.CopyGifSelected";
        bp6.e = new Callback() { // from class: sP
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CP cp = CP.this;
                C6862k73 c6862k732 = cp.f;
                if (c6862k732.g.isEmpty()) {
                    return;
                }
                Clipboard.getInstance().f((Uri) c6862k732.g.get(0));
                ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f1404c8, 0, cp.a).d();
            }
        };
        arrayList.add(bp6.a());
        BP bp7 = new BP(this, 5, 7);
        bp7.a = R.drawable.0_resource_name_obfuscated_res_0x7f0901df;
        bp7.b = R.string.0_resource_name_obfuscated_res_0x7f140a22;
        bp7.d = "SharingHubAndroid.CopyImageSelected";
        bp7.h = new Integer[]{2, 6};
        bp7.e = new Callback() { // from class: oP
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CP cp = CP.this;
                C6862k73 c6862k732 = cp.f;
                if (c6862k732.g.isEmpty()) {
                    return;
                }
                Clipboard.getInstance().f((Uri) c6862k732.g.get(0));
                ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140512, 0, cp.a).d();
            }
        };
        arrayList.add(bp7.a());
        BP bp8 = new BP(this, 4);
        bp8.a = R.drawable.0_resource_name_obfuscated_res_0x7f0901df;
        bp8.b = R.string.0_resource_name_obfuscated_res_0x7f140a20;
        bp8.d = "SharingHubAndroid.CopySelected";
        bp8.e = new Callback() { // from class: vP
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CP cp = CP.this;
                Activity activity2 = cp.a;
                ClipboardManager clipboardManager = (ClipboardManager) activity2.getSystemService("clipboard");
                C6862k73 c6862k732 = cp.f;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(c6862k732.b, c6862k732.b()));
                ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140a1f, 0, activity2).d();
            }
        };
        arrayList.add(bp8.a());
        BP bp9 = new BP(this, 2, 3);
        bp9.g = new Integer[]{4};
        bp9.a = R.drawable.0_resource_name_obfuscated_res_0x7f0901df;
        bp9.b = R.string.0_resource_name_obfuscated_res_0x7f140a23;
        bp9.d = "SharingHubAndroid.CopyTextSelected";
        bp9.e = new Callback() { // from class: lP
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                CP cp = CP.this;
                Activity activity2 = cp.a;
                ClipboardManager clipboardManager = (ClipboardManager) activity2.getSystemService("clipboard");
                C6862k73 c6862k732 = cp.f;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(c6862k732.b, c6862k732.a()));
                ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140b25, 0, activity2).d();
            }
        };
        arrayList.add(bp9.a());
        if (C33.a(str, profile).c() || !N.M09VlOh_("SendTabToSelfSigninPromo")) {
            BP bp10 = new BP(this, 0, 1, 5);
            bp10.h = new Integer[]{6, 5};
            bp10.a = R.drawable.0_resource_name_obfuscated_res_0x7f090484;
            bp10.b = R.string.0_resource_name_obfuscated_res_0x7f1409f5;
            bp10.d = "SharingHubAndroid.SendTabToSelfSelected";
            bp10.e = new Callback() { // from class: nP
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    CP cp = CP.this;
                    new I33(cp.a, cp.b, cp.k, cp.f.b, cp.d, (Profile) cp.p.get()).a();
                }
            };
            arrayList.add(bp10.a());
        }
        if (!z) {
            BP bp11 = new BP(this, 0, 1, 5);
            bp11.h = new Integer[]{6, 5};
            bp11.a = R.drawable.0_resource_name_obfuscated_res_0x7f09041f;
            bp11.b = R.string.0_resource_name_obfuscated_res_0x7f140921;
            bp11.d = "SharingHubAndroid.QRCodeSelected";
            bp11.e = new Callback() { // from class: tP
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    CP cp = CP.this;
                    WindowAndroid windowAndroid2 = cp.f.a;
                    FF2 ff2 = new FF2();
                    Bundle bundle = new Bundle();
                    bundle.putString("url_key", cp.k);
                    ff2.setArguments(bundle);
                    ff2.a(windowAndroid2);
                    ff2.show(cp.a.getFragmentManager(), (String) null);
                }
            };
            arrayList.add(bp11.a());
        }
        if (interfaceC0079Ap3.i() && R44.a(profile).a("printing.enabled")) {
            BP bp12 = new BP(this, 0);
            bp12.a = R.drawable.0_resource_name_obfuscated_res_0x7f090494;
            bp12.b = R.string.0_resource_name_obfuscated_res_0x7f14088b;
            bp12.d = "SharingHubAndroid.PrintSelected";
            bp12.e = new Callback() { // from class: qP
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    CP cp = CP.this;
                    cp.g.onResult((Tab) cp.c.get());
                }
            };
            arrayList.add(bp12.a());
        }
        BP bp13 = new BP(this, 5, 7);
        bp13.a = R.drawable.0_resource_name_obfuscated_res_0x7f09047a;
        bp13.b = R.string.0_resource_name_obfuscated_res_0x7f140a39;
        bp13.d = "SharingHubAndroid.SaveImageSelected";
        bp13.h = new Integer[]{6};
        bp13.e = new Callback() { // from class: yP
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final CP cp = CP.this;
                C6862k73 c6862k732 = cp.f;
                if (c6862k732.g.isEmpty()) {
                    return;
                }
                new C3426a73(cp.a, (Uri) c6862k732.g.get(0), new Callback() { // from class: pP
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        CP cp2 = CP.this;
                        new VU2(cp2.a, (Bitmap) obj2, R.string.0_resource_name_obfuscated_res_0x7f14099f, null, cp2.f.a).a();
                    }
                }).c(AbstractC0185Bl.e);
            }
        };
        arrayList.add(bp13.a());
    }

    public final ArrayList a(HashSet hashSet, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            C12099zP c12099zP = (C12099zP) it.next();
            if (!Collections.disjoint(hashSet, c12099zP.a) && Collections.disjoint(hashSet, c12099zP.b) && !c12099zP.c.contains(Integer.valueOf(i)) && (!z || !c12099zP.e)) {
                arrayList.add(c12099zP.d);
            }
        }
        return arrayList;
    }
}
