package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.webapps.AppBannerManager;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yi */
/* loaded from: classes.dex */
public class C3159Yi implements InterfaceC2379Si {
    public PropertyModel a;
    public final Context b;
    public final boolean c;
    public final C6166i6 d;
    public final C7507m02 e;
    public final InterfaceC10590uz3 f;
    public final C9707sQ3 g;
    public final View h;
    public C4496dF i;
    public final InterfaceC7697ma2 j;
    public boolean k;
    public final C7212l83 l;
    public int m;
    public boolean n;
    public C1347Kj1 o;
    public InterfaceC1422Ky1 p;
    public InterfaceC0408Dd2 q;
    public C2899Wi r;
    public int s;
    public RunnableC3029Xi t;

    @Override // defpackage.InterfaceC2379Si
    public int a() {
        return 0;
    }

    @Override // defpackage.InterfaceC2379Si
    public void c() {
    }

    @Override // defpackage.InterfaceC2379Si
    public void d(C1340Ki c1340Ki, View view) {
    }

    @Override // defpackage.InterfaceC2379Si
    public void e() {
    }

    @Override // defpackage.InterfaceC2379Si
    public boolean f() {
        return false;
    }

    public int h() {
        return R.menu.0_resource_name_obfuscated_res_0x7f100008;
    }

    public boolean n(Tab tab) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(android.view.MenuItem r5, org.chromium.chrome.browser.tab.Tab r6, boolean r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L34
            boolean r7 = defpackage.AbstractC8293oI0.a()
            java.lang.String r2 = "BookmarksRefresh"
            if (r7 == 0) goto L1e
            nE r7 = defpackage.UN.a
            boolean r7 = J.N.M09VlOh_(r2)
            if (r7 == 0) goto L1e
            java.lang.String r7 = "bookmarks_refresh_min_version"
            int r7 = J.N.M37SqSAy(r2, r7, r1)
            if (r7 > 0) goto L1e
            r7 = r0
            goto L1f
        L1e:
            r7 = r1
        L1f:
            if (r7 == 0) goto L2d
            nE r7 = defpackage.UN.a
            java.lang.String r7 = "bookmark_in_app_menu"
            boolean r7 = J.N.M6bsIDpc(r2, r7, r1)
            if (r7 == 0) goto L2d
            r7 = r0
            goto L2e
        L2d:
            r7 = r1
        L2e:
            if (r7 == 0) goto L34
            r5.setVisible(r1)
            return
        L34:
            ma2 r7 = r4.j
            r2 = r7
            oa2 r2 = (defpackage.C8385oa2) r2
            r2.getClass()
            boolean r3 = defpackage.AbstractC12248zp3.a(r2)
            if (r3 == 0) goto L51
            if (r6 != 0) goto L45
            goto L51
        L45:
            java.lang.Object r2 = r2.g
            org.chromium.chrome.browser.bookmarks.BookmarkBridge r2 = (org.chromium.chrome.browser.bookmarks.BookmarkBridge) r2
            boolean r2 = r2.m()
            r5.setEnabled(r2)
            goto L54
        L51:
            r5.setEnabled(r1)
        L54:
            android.content.Context r2 = r4.b
            if (r6 == 0) goto L8c
            oa2 r7 = (defpackage.C8385oa2) r7
            r7.getClass()
            boolean r3 = defpackage.AbstractC12248zp3.a(r7)
            if (r3 != 0) goto L64
            goto L75
        L64:
            java.lang.Object r7 = r7.g
            org.chromium.chrome.browser.bookmarks.BookmarkBridge r7 = (org.chromium.chrome.browser.bookmarks.BookmarkBridge) r7
            r7.getClass()
            java.lang.Object r3 = org.chromium.base.ThreadUtils.a
            org.chromium.components.bookmarks.BookmarkId r6 = r7.l(r6)
            if (r6 == 0) goto L75
            r6 = r0
            goto L76
        L75:
            r6 = r1
        L76:
            if (r6 == 0) goto L8c
            r6 = 2131296468(0x7f0900d4, float:1.8210854E38)
            r5.setIcon(r6)
            r5.setChecked(r0)
            r6 = 2132018276(0x7f140464, float:1.9674854E38)
            java.lang.String r6 = r2.getString(r6)
            r5.setTitleCondensed(r6)
            goto L9f
        L8c:
            r6 = 2131296467(0x7f0900d3, float:1.8210852E38)
            r5.setIcon(r6)
            r5.setChecked(r1)
            r6 = 2132018715(0x7f14061b, float:1.9675744E38)
            java.lang.String r6 = r2.getString(r6)
            r5.setTitleCondensed(r6)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3159Yi.p(android.view.MenuItem, org.chromium.chrome.browser.tab.Tab, boolean):void");
    }

    public C3159Yi(Context context, C6166i6 c6166i6, C7507m02 c7507m02, InterfaceC10590uz3 interfaceC10590uz3, C9707sQ3 c9707sQ3, View view, C0538Ed2 c0538Ed2, C0538Ed2 c0538Ed22, C8385oa2 c8385oa2, C0538Ed2 c0538Ed23) {
        C4496dF c4496dF = new C4496dF();
        this.i = new C4496dF();
        this.b = context;
        this.c = DeviceFormFactor.a(context);
        this.d = c6166i6;
        this.e = c7507m02;
        this.f = interfaceC10590uz3;
        this.g = c9707sQ3;
        this.h = view;
        if (c0538Ed23 != null) {
            c0538Ed23.j(c4496dF.b(new Callback() { // from class: Ti
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C3159Yi.this.o = (C1347Kj1) obj;
                }
            }));
        }
        if (c0538Ed2 != null) {
            c0538Ed2.j(this.i.b(new Callback() { // from class: Ui
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C3159Yi.this.p = (InterfaceC1422Ky1) obj;
                }
            }));
        }
        if (c0538Ed22 != null) {
            this.q = c0538Ed22;
            c0538Ed22.j(this.i.b(new Callback() { // from class: Vi
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C3159Yi c3159Yi = C3159Yi.this;
                    c3159Yi.getClass();
                    ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = ((C10154tj3) ((InterfaceC7408lj3) obj)).c;
                    c3159Yi.s = viewOnClickListenerC0699Fj3.w;
                    C2899Wi c2899Wi = new InterfaceC7064kj3() { // from class: Wi
                        public /* synthetic */ C2899Wi() {
                        }

                        @Override // defpackage.InterfaceC7064kj3
                        public final void b(int i, boolean z) {
                            C3159Yi.this.s = i;
                        }
                    };
                    c3159Yi.r = c2899Wi;
                    viewOnClickListenerC0699Fj3.l.a(c2899Wi);
                }
            }));
        }
        this.j = c8385oa2;
        this.l = new C7212l83();
    }

    @Override // defpackage.InterfaceC2379Si
    public List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5459g24());
        arrayList.add(new C9466rj1());
        arrayList.add(new C10879vq0());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:374:0x0742, code lost:            if (r11 == com.android.chrome.R.id.PAGE_MENU) goto L2510;     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x004e, code lost:            if (r7 != false) goto L2096;     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0589 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0284  */
    /* JADX WARN: Type inference failed for: r3v81, types: [Xi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.view.Menu r22, final defpackage.InterfaceC0950Hi r23) {
        /*
            Method dump skipped, instructions count: 2031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3159Yi.m(android.view.Menu, Hi):void");
    }

    public final boolean j() {
        InterfaceC1422Ky1 interfaceC1422Ky1 = this.p;
        if (interfaceC1422Ky1 == null || !((C9897sy1) interfaceC1422Ky1).G(2)) {
            return false;
        }
        C9897sy1 c9897sy1 = (C9897sy1) this.p;
        return ((c9897sy1.G(2) && c9897sy1.r.q) || i()) ? false : true;
    }

    public final boolean i() {
        InterfaceC0408Dd2 interfaceC0408Dd2 = this.q;
        return (interfaceC0408Dd2 == null || interfaceC0408Dd2.get() == null || this.s != 1) ? false : true;
    }

    public final boolean o() {
        if (!UN.G.a()) {
            return false;
        }
        C7851n02 c7851n02 = C7851n02.i;
        boolean z = (Build.VERSION.SDK_INT < 30 ? false : UN.D.a()) && C7851n02.r();
        boolean z2 = this.c;
        C7507m02 c7507m02 = this.e;
        if (z) {
            c7507m02.getClass();
            if (C7851n02.f() >= C7851n02.g()) {
                return false;
            }
            if (!z2) {
                c7507m02.getClass();
                C7851n02 c7851n022 = C7851n02.i;
                c7851n022.getClass();
                Activity activity = c7507m02.a;
                if (C7851n02.e(activity) != null) {
                    return false;
                }
                c7851n022.getClass();
                if (!C7851n02.p(activity)) {
                    c7851n022.getClass();
                    if (!C7851n02.n(activity)) {
                        return false;
                    }
                }
            }
            return true;
        }
        c7507m02.getClass();
        C7851n02 c7851n023 = C7851n02.i;
        c7851n023.getClass();
        Activity activity2 = c7507m02.a;
        if (C7851n02.a(activity2)) {
            return false;
        }
        c7851n023.getClass();
        if (!C7851n02.b() || !z2) {
            c7851n023.getClass();
            if (!C7851n02.p(activity2)) {
                c7851n023.getClass();
                if (!C7851n02.n(activity2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void l(Menu menu, Tab tab, boolean z) {
        C1450Le c1450Le;
        MenuItem findItem = menu.findItem(R.id.add_to_homescreen_id);
        MenuItem findItem2 = menu.findItem(R.id.open_webapk_id);
        this.m = 0;
        if (tab != null && z) {
            Context context = V60.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AppBannerManager appBannerManager = null;
            ResolveInfo b = AbstractC3641al4.b(context, AbstractC3641al4.e(context, tab.getUrl().i(), null));
            EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Android.PrepareMenu.OpenWebApkVisibilityCheck");
            if ((b == null || b.activityInfo.packageName == null) ? false : true) {
                findItem2.setTitle(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140639, b.loadLabel(context.getPackageManager()).toString()));
                findItem.setVisible(false);
                findItem2.setVisible(true);
                return;
            }
            WebContents b2 = tab.b();
            if (b2 != null) {
                Object obj = ThreadUtils.a;
                appBannerManager = (AppBannerManager) N.MbHcYdCX(b2);
            }
            if (appBannerManager != null && (!TextUtils.equals("", N.MvBgz9uo(b2)))) {
                c1450Le = AppBannerManager.b;
            } else {
                c1450Le = AppBannerManager.c;
            }
            int i = c1450Le.a;
            findItem.setTitle(i);
            findItem.setVisible(true);
            findItem2.setVisible(false);
            if (i == R.string.0_resource_name_obfuscated_res_0x7f140617) {
                this.m = 1;
                return;
            } else {
                if (i == R.string.0_resource_name_obfuscated_res_0x7f140618) {
                    this.m = 2;
                    return;
                }
                return;
            }
        }
        findItem.setVisible(false);
        findItem2.setVisible(false);
    }

    @Override // defpackage.InterfaceC2379Si
    public Bundle g(int i) {
        Bundle bundle = new Bundle();
        if (i == R.id.add_to_homescreen_id) {
            bundle.putInt("AppMenuTitleShown", this.m);
        }
        return bundle;
    }

    public final void k(boolean z) {
        int integer;
        if (this.a != null) {
            Resources resources = this.b.getResources();
            Drawable drawable = (Drawable) this.a.i(AbstractC1470Li.h);
            if (z) {
                integer = resources.getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0091);
            } else {
                integer = resources.getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0090);
            }
            drawable.setLevel(integer);
            this.a.o(AbstractC1470Li.b, resources.getString(z ? R.string.0_resource_name_obfuscated_res_0x7f140120 : R.string.0_resource_name_obfuscated_res_0x7f14011f));
            this.a.o(AbstractC1470Li.c, resources.getString(z ? R.string.0_resource_name_obfuscated_res_0x7f140645 : R.string.0_resource_name_obfuscated_res_0x7f140949));
        }
    }

    public final void q(Menu menu, Tab tab, boolean z, boolean z2) {
        String string;
        MenuItem findItem = menu.findItem(R.id.request_desktop_site_row_menu_id);
        MenuItem findItem2 = menu.findItem(R.id.request_desktop_site_id);
        MenuItem findItem3 = menu.findItem(R.id.request_desktop_site_check_id);
        boolean z3 = (tab == null || !z || (z2 && !tab.isNativePage()) || AbstractC2290Rq0.c(tab.getUrl()) || tab.b() == null) ? false : true;
        findItem.setVisible(z3);
        if (z3) {
            boolean m = tab.b().i().m();
            if (UN.c.a()) {
                findItem2.setTitle(m ? R.string.0_resource_name_obfuscated_res_0x7f14062f : R.string.0_resource_name_obfuscated_res_0x7f14062e);
                findItem2.setIcon(m ? R.drawable.0_resource_name_obfuscated_res_0x7f09049b : R.drawable.0_resource_name_obfuscated_res_0x7f0901e3);
                findItem3.setVisible(false);
                return;
            }
            findItem2.setTitle(R.string.0_resource_name_obfuscated_res_0x7f14063f);
            findItem3.setVisible(true);
            findItem3.setChecked(m);
            Context context = this.b;
            if (m) {
                string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140641);
            } else {
                string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140640);
            }
            findItem2.setTitleCondensed(string);
        }
    }
}
