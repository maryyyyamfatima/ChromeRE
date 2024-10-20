package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Pair;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GN implements K60 {
    public final Context a;
    public final C60 b;
    public final int c;
    public final InterfaceC0079Ap3 d;
    public final C4502dG0 e;
    public final ContextMenuParams f;
    public final Origin g;
    public C9568s04 h;
    public final ContextMenuNativeDelegateImpl i;
    public Boolean j;

    public GN(C60 c60, InterfaceC0079Ap3 interfaceC0079Ap3, int i, C4502dG0 c4502dG0, Context context, ContextMenuParams contextMenuParams, ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl) {
        this.b = c60;
        this.d = interfaceC0079Ap3;
        this.c = i;
        this.e = c4502dG0;
        this.a = context;
        this.f = contextMenuParams;
        if (((C7136kv3) c60).a.l != null) {
            TabImpl tabImpl = ((C7136kv3) c60).a;
            if (tabImpl.l.P0() != null) {
                this.g = tabImpl.l.P0().b();
                this.i = contextMenuNativeDelegateImpl;
            }
        }
        this.g = null;
        this.i = contextMenuNativeDelegateImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04ca  */
    @Override // defpackage.K60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a() {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GN.a():java.util.List");
    }

    @Override // defpackage.K60
    public final boolean isIncognito() {
        return ((C7136kv3) this.b).a();
    }

    @Override // defpackage.K60
    public final String d() {
        return ((C7136kv3) this.b).a.getTitle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0508, code lost:            if (defpackage.AbstractC3017Xf2.b(r7, 0).isEmpty() != false) goto L810;     */
    @Override // defpackage.K60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r29) {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GN.b(int):boolean");
    }

    @Override // defpackage.K60
    public final void e() {
        Boolean bool = this.j;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        KU3 a = LU3.a(h());
        if (a.isInitialized()) {
            a.dismissed("IPH_EphemeralTab");
        }
    }

    public final WindowAndroid i() {
        return ((C7136kv3) this.b).a.l.Q0();
    }

    @Override // defpackage.K60
    public final NK c() {
        boolean isIncognito = isIncognito();
        Context context = this.a;
        boolean a = DeviceFormFactor.a(context);
        C0257Bz1 c0257Bz1 = C0127Az1.f;
        Uri uri = Uri.EMPTY;
        C2336Rz1 c2336Rz1 = new C2336Rz1();
        c2336Rz1.h = 2;
        c2336Rz1.a = uri;
        c2336Rz1.b = null;
        c2336Rz1.c = null;
        c2336Rz1.d = null;
        c2336Rz1.e = null;
        c2336Rz1.f = null;
        c2336Rz1.g = isIncognito;
        c2336Rz1.i = a;
        if (!C0127Az1.f.a(c2336Rz1)) {
            return null;
        }
        ContextMenuParams contextMenuParams = this.f;
        return new C0127Az1(contextMenuParams.b.i(), contextMenuParams.e, contextMenuParams.g.i(), d(), isIncognito(), DeviceFormFactor.a(context), ((C7136kv3) this.b).a.l, this.i, new Callback() { // from class: AN
            public /* synthetic */ AN() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                GN gn = GN.this;
                gn.getClass();
                int intValue = ((Integer) obj).intValue();
                if (intValue == 0) {
                    gn.l(34);
                } else {
                    if (intValue == 1) {
                        gn.l(35);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid chip type provided to callback.");
                }
            }
        }, new Callback() { // from class: BN
            public /* synthetic */ BN() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                String str;
                GN gn = GN.this;
                gn.getClass();
                int intValue = ((Integer) obj).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        str = null;
                    } else if (!AbstractC7222lA1.a("ContextMenuTranslateWithGoogleLens")) {
                        return;
                    } else {
                        str = "TranslateWithGoogleLensChip";
                    }
                } else if (!AbstractC7222lA1.a("ContextMenuGoogleLensChip")) {
                    return;
                } else {
                    str = "ShopWithGoogleLensChip";
                }
                gn.k(str);
            }
        });
    }

    public static boolean j(GURL gurl) {
        return gurl == null || gurl.k() || gurl.i().equals("about:blank");
    }

    public final void l(int i) {
        C7136kv3 c7136kv3 = (C7136kv3) this.b;
        WebContents webContents = c7136kv3.a.l;
        ContextMenuParams contextMenuParams = this.f;
        int i2 = 0;
        String format = String.format("ContextMenu.SelectedOptionAndroid.%s", L60.b(contextMenuParams));
        boolean z = contextMenuParams.k;
        boolean z2 = contextMenuParams.p;
        if (z2 && !z && !contextMenuParams.j && (i != 36 || i != 37 || i != 38)) {
            format = "ContextMenu.SelectedOptionAndroid.Link";
        }
        EI2.h(i, 41, format);
        boolean z3 = contextMenuParams.i;
        if (z3 && !z && !z2 && !CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:enable_tab_group_auto_creation"), true)) {
            boolean b = CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:show_open_in_tab_group_menu_item_first"), false);
            if (i == 0) {
                if (b) {
                    i2 = 2;
                }
            } else if (i == 39) {
                i2 = b ? 3 : 1;
            }
            EI2.h(i2, 4, format + ".NewTabOption");
        }
        if (z3 && N.MO0TyD6h(webContents, contextMenuParams.c) == 2) {
            EI2.h(i, 41, format + ".PerformanceClassFast");
        }
        if (!AbstractC7222lA1.b() || c7136kv3.a()) {
            return;
        }
        if (this.h == null) {
            this.h = new C9568s04();
        }
        WebContents webContents2 = c7136kv3.a.l;
        if (webContents2 != null) {
            this.h.getClass();
            N.MCnWTXic(webContents2, "ContextMenuAndroid.Selected", "Action", i);
        }
    }

    public final C7272lK1 f(int i, boolean z) {
        HashMap e = PropertyModel.e(D60.c);
        ND2 nd2 = D60.b;
        int i2 = AbstractC12089zN.a[i];
        DD2 dd2 = new DD2();
        dd2.a = i2;
        e.put(nd2, dd2);
        PD2 pd2 = D60.a;
        CharSequence c = AbstractC12089zN.c(i, this.a, z);
        GD2 gd2 = new GD2();
        gd2.a = c;
        return new C7272lK1(2, AbstractC5266fV2.a(e, pd2, gd2, e));
    }

    public final C7272lK1 g(int i, int i2) {
        Intent intent;
        if (!(i == 12)) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.addFlags(524288);
            intent2.setType("image/jpeg");
            intent2.addFlags(1);
            intent2.putExtra("android.intent.extra.STREAM", (Parcelable) null);
            intent = intent2;
        } else {
            intent = N63.b();
        }
        Pair g = O63.g(intent);
        HashMap e = PropertyModel.e(E60.h);
        ND2 nd2 = D60.b;
        int[] iArr = AbstractC12089zN.a;
        int i3 = iArr[i];
        DD2 dd2 = new DD2();
        dd2.a = i3;
        e.put(nd2, dd2);
        PD2 pd2 = D60.a;
        CharSequence c = AbstractC12089zN.c(i, this.a, false);
        GD2 gd2 = new GD2();
        gd2.a = c;
        e.put(pd2, gd2);
        PD2 pd22 = E60.d;
        Drawable drawable = (Drawable) g.first;
        GD2 gd22 = new GD2();
        gd22.a = drawable;
        e.put(pd22, gd22);
        PD2 pd23 = E60.e;
        CharSequence charSequence = (CharSequence) g.second;
        GD2 gd23 = new GD2();
        gd23.a = charSequence;
        e.put(pd23, gd23);
        ND2 nd22 = E60.f;
        int i4 = iArr[i2];
        DD2 dd22 = new DD2();
        dd22.a = i4;
        e.put(nd22, dd22);
        return new C7272lK1(3, new PropertyModel(e));
    }

    public final void k(String str) {
        C7136kv3 c7136kv3 = (C7136kv3) this.b;
        if (c7136kv3.a()) {
            return;
        }
        if (this.h == null) {
            this.h = new C9568s04();
        }
        WebContents webContents = c7136kv3.a.l;
        if (webContents != null) {
            this.h.getClass();
            N.M$ejnyHh(webContents, "ContextMenuAndroid.Shown", str);
        }
    }

    public final Profile h() {
        return Profile.b(((C7136kv3) this.b).a.l);
    }
}
