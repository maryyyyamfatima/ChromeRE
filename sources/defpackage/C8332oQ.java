package defpackage;

import J.N;
import android.app.Activity;
import android.content.Intent;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oQ */
/* loaded from: classes.dex */
public final class C8332oQ extends AbstractC10569uv3 {
    public final Activity a;
    public final boolean b;
    public WindowAndroid c;
    public TabModel d;
    public InterfaceC9904sz3 e;
    public final InterfaceC0079Ap3 f;
    public final ER g;
    public final C10505ul h;
    public final InterfaceC0079Ap3 i;
    public final InterfaceC0079Ap3 j;

    @Override // defpackage.AbstractC10569uv3
    public final boolean d() {
        return false;
    }

    public C8332oQ(Activity activity, WindowAndroid windowAndroid, InterfaceC0079Ap3 interfaceC0079Ap3, boolean z, ER er, C10505ul c10505ul, InterfaceC0079Ap3 interfaceC0079Ap32, InterfaceC0079Ap3 interfaceC0079Ap33) {
        this.a = activity;
        this.c = windowAndroid;
        this.f = interfaceC0079Ap3;
        this.b = z;
        this.g = er;
        this.h = c10505ul;
        this.i = interfaceC0079Ap32;
        this.j = interfaceC0079Ap33;
    }

    @Override // defpackage.AbstractC10569uv3
    public final Tab b(int i, Tab tab, LoadUrlParams loadUrlParams) {
        return i(loadUrlParams, i, tab, null);
    }

    public final Tab i(LoadUrlParams loadUrlParams, int i, Tab tab, Intent intent) {
        int s = this.d.s(tab);
        return h(loadUrlParams, i, tab, s != -1 ? s + 1 : -1, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:            if ((r13.V0 != null) != false) goto L463;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f1 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:35:0x0078, B:37:0x007d, B:38:0x0083, B:39:0x0091, B:42:0x0095, B:47:0x00a4, B:49:0x00be, B:51:0x00c6, B:53:0x00cc, B:55:0x00fc, B:57:0x0105, B:62:0x01f1, B:64:0x01f6, B:66:0x01fc, B:70:0x020d, B:76:0x010d, B:78:0x0113, B:80:0x012f, B:81:0x0138, B:83:0x0166, B:84:0x0176, B:87:0x018b, B:89:0x0191, B:92:0x01b1, B:94:0x01b9, B:97:0x01c2, B:100:0x01df), top: B:34:0x0078 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.chromium.chrome.browser.tab.Tab h(org.chromium.content_public.browser.LoadUrlParams r20, int r21, org.chromium.chrome.browser.tab.Tab r22, int r23, android.content.Intent r24) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8332oQ.h(org.chromium.content_public.browser.LoadUrlParams, int, org.chromium.chrome.browser.tab.Tab, int, android.content.Intent):org.chromium.chrome.browser.tab.Tab");
    }

    @Override // defpackage.AbstractC10569uv3
    public final boolean c(Tab tab, WebContents webContents, int i, GURL gurl) {
        int id = tab != null ? tab.getId() : -1;
        if (this.d.z(id)) {
            return false;
        }
        int d = AbstractC1558Lz3.d(this.d, id);
        int i2 = d != -1 ? d + 1 : -1;
        C10247tz3 c10247tz3 = (C10247tz3) this.e;
        boolean z = this.b;
        boolean b = c10247tz3.b(i, z);
        InterfaceC11941yv3 g = tab == null ? g() : null;
        boolean z2 = !b;
        C3353Zu3 c3353Zu3 = new C3353Zu3();
        c3353Zu3.g = Integer.valueOf(z2 ? 1 : 0);
        c3353Zu3.b = tab;
        c3353Zu3.d = z;
        c3353Zu3.e = this.c;
        c3353Zu3.b(i);
        c3353Zu3.i = webContents;
        c3353Zu3.j = g;
        c3353Zu3.k = z2;
        this.d.e(c3353Zu3.a(), i2, i, b ? 0 : i == 17 ? 3 : 1);
        return true;
    }

    @Override // defpackage.AbstractC10569uv3
    public final Tab f(int i, String str) {
        LoadUrlParams loadUrlParams = new LoadUrlParams(str, 0);
        loadUrlParams.p = 0L;
        return i(loadUrlParams, i, null, null);
    }

    @Override // defpackage.AbstractC10569uv3
    public final Tab a(IA3 ia3, C6844k43 c6844k43, int i, boolean z, int i2) {
        Tab tab;
        C7988nQ c7988nQ = new C7988nQ((InterfaceC10590uz3) this.i.get());
        boolean b = ((C10247tz3) this.e).b(3, z);
        InterfaceC9819sl c = this.h.c(i);
        int i3 = 1;
        if (c == null || c.a() == null) {
            tab = null;
            i3 = 2;
        } else {
            C10313uA3 c10313uA3 = (C10313uA3) c;
            tab = c10313uA3.a;
            if (tab.isIncognito() != z) {
                throw new IllegalStateException("Incognito state mismatch. TabState: " + z + ". Tab: " + tab.isIncognito());
            }
            C10720vN2 a = C10720vN2.a(tab);
            CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.j.get();
            WindowAndroid windowAndroid = this.c;
            InterfaceC11941yv3 g = g();
            a.getClass();
            compositorViewHolder.u();
            Tab tab2 = a.a;
            tab2.G(windowAndroid, g);
            N.MM6uB79X(tab2.b());
            if (!tab2.isDestroyed()) {
                JA3.a(tab2).b(true);
            }
            Runnable runnable = c10313uA3.b;
            if (runnable != null) {
                runnable.run();
            }
            if (tab.getUrl().h().equals("file")) {
                tab.D();
            } else if (tab.g()) {
                tab.c();
            }
        }
        if (tab == null) {
            C3353Zu3 c3353Zu3 = new C3353Zu3();
            c3353Zu3.b(3);
            c3353Zu3.g = 2;
            c3353Zu3.a = i;
            c3353Zu3.c = c7988nQ;
            c3353Zu3.d = z;
            c3353Zu3.e = this.c;
            c3353Zu3.j = g();
            c3353Zu3.k = !b;
            c3353Zu3.l = ia3;
            c3353Zu3.m = c6844k43;
            tab = c3353Zu3.a();
        }
        boolean z2 = this.b;
        if (z != z2) {
            throw new IllegalStateException("Incognito state mismatch. TabState: " + ia3.h + ". Creator: " + z2);
        }
        this.d.e(tab, i2, 3, i3);
        return tab;
    }

    public final InterfaceC11941yv3 g() {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.f;
        if (interfaceC0079Ap3 != null) {
            return (InterfaceC11941yv3) interfaceC0079Ap3.get();
        }
        return null;
    }
}
