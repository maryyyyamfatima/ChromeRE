package defpackage;

import J.N;
import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: je0 */
/* loaded from: classes.dex */
public final class C6687je0 implements V02, InterfaceC0186Bl0 {
    public final Activity a;
    public final C4620dd0 g;
    public final C2468Sz3 h;
    public final PC i;
    public final QS3 j;
    public C7031ke0 k;
    public WH0 l;
    public C6001he0 m;
    public C6345ie0 n;
    public int o;
    public String p;
    public Bitmap q;
    public boolean r;
    public Bitmap s;

    public C6687je0(Activity activity, C4620dd0 c4620dd0, C2468Sz3 c2468Sz3, PC pc, I5 i5, QS3 qs3) {
        this.a = activity;
        this.g = c4620dd0;
        this.h = c2468Sz3;
        this.i = pc;
        this.j = qs3;
        i5.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:            if (((r2.getIntent().getFlags() & 268959744) != 0) != false) goto L99;     */
    @Override // defpackage.V02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            r6 = this;
            PC r0 = r6.i
            In4 r1 = r0.F()
            android.app.Activity r2 = r6.a
            r3 = 1
            if (r1 != 0) goto L1e
            android.content.Intent r4 = r2.getIntent()
            int r4 = r4.getFlags()
            r5 = 268959744(0x10080000, float:2.682127E-29)
            r4 = r4 & r5
            r5 = 0
            if (r4 == 0) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r5
        L1c:
            if (r4 == 0) goto L1f
        L1e:
            r5 = r3
        L1f:
            if (r5 != 0) goto L22
            return
        L22:
            r4 = 2131165485(0x7f07012d, float:1.7945188E38)
            int r4 = r2.getColor(r4)
            r6.o = r4
            if (r1 == 0) goto L5b
            MW r4 = r0.j()
            boolean r4 = r4.f()
            if (r4 == 0) goto L41
            MW r4 = r0.j()
            int r4 = r4.d()
            r6.o = r4
        L41:
            Jn4 r4 = r1.d
            android.graphics.Bitmap r4 = r4.a()
            r6.q = r4
            java.lang.String r1 = r1.f
            r6.p = r1
            boolean r0 = r0.K()
            if (r0 == 0) goto L5b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L5b
            r6.r = r3
        L5b:
            ke0 r0 = new ke0
            r0.<init>(r2)
            r6.k = r0
            WH0 r0 = new WH0
            r0.<init>()
            r6.l = r0
            he0 r0 = new he0
            r0.<init>(r6)
            r6.m = r0
            Sz3 r1 = r6.h
            r1.d(r0)
            android.graphics.Bitmap r0 = r6.q
            if (r0 != 0) goto L87
            boolean r0 = r6.r
            if (r0 != 0) goto L87
            ie0 r0 = new ie0
            r0.<init>(r6)
            r6.n = r0
            r1.d(r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6687je0.U():void");
    }

    public static void a(C6687je0 c6687je0) {
        Tab tab;
        c6687je0.d();
        if (c6687je0.q != null || (tab = c6687je0.g.b) == null) {
            return;
        }
        final GURL url = tab.getUrl();
        WH0 wh0 = c6687je0.l;
        Profile b = Profile.b(tab.b());
        GURL url2 = tab.getUrl();
        FaviconHelper$FaviconImageCallback faviconHelper$FaviconImageCallback = new FaviconHelper$FaviconImageCallback() { // from class: ge0
            @Override // org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback
            public final void onFaviconAvailable(Bitmap bitmap, GURL gurl) {
                C6687je0 c6687je02 = C6687je0.this;
                Tab tab2 = c6687je02.g.b;
                if (tab2 != null) {
                    if (url.equals(tab2.getUrl())) {
                        c6687je02.b(bitmap);
                    }
                }
            }
        };
        wh0.getClass();
        wh0.a(b, url2.i(), 0, faviconHelper$FaviconImageCallback);
    }

    public final void b(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        if (this.s == null || bitmap.getWidth() > this.s.getWidth() || bitmap.getHeight() > this.s.getHeight()) {
            this.s = bitmap;
            d();
        }
    }

    public final void d() {
        String b;
        boolean isEmpty = TextUtils.isEmpty(this.p);
        Bitmap bitmap = null;
        C4620dd0 c4620dd0 = this.g;
        if (isEmpty) {
            Tab tab = c4620dd0.b;
            if (tab == null) {
                b = null;
            } else {
                String title = tab.getTitle();
                b = T34.b(tab.getUrl().i(), false);
                if (!TextUtils.isEmpty(title)) {
                    b = title;
                }
            }
        } else {
            b = this.p;
        }
        if (!this.r) {
            Bitmap bitmap2 = this.q;
            if (bitmap2 != null) {
                bitmap = bitmap2;
            } else {
                Tab tab2 = c4620dd0.b;
                if (tab2 != null && !tab2.isIncognito()) {
                    C7031ke0 c7031ke0 = this.k;
                    GURL url = tab2.getUrl();
                    Bitmap bitmap3 = this.s;
                    if (bitmap3 != null) {
                        c7031ke0.getClass();
                        int width = bitmap3.getWidth();
                        int i = c7031ke0.b;
                        if (width >= i && bitmap3.getHeight() >= i) {
                            bitmap = bitmap3;
                        }
                    }
                    if (url.equals(c7031ke0.c)) {
                        bitmap = c7031ke0.d;
                    } else {
                        if (c7031ke0.e == null) {
                            c7031ke0.e = new C6964kR2(c7031ke0.a.getResources(), 64, 64, 3, -13487566, 30);
                        }
                        c7031ke0.c = url;
                        C6964kR2 c6964kR2 = c7031ke0.e;
                        c6964kR2.getClass();
                        Bitmap b2 = c6964kR2.b(url.i(), false);
                        c7031ke0.d = b2;
                        bitmap = b2;
                    }
                }
            }
        }
        Tab tab3 = c4620dd0.b;
        int i2 = this.o;
        QS3 qs3 = this.j;
        if (tab3 != null) {
            if (!qs3.q) {
                i2 = qs3.a;
            }
        } else {
            qs3.getClass();
        }
        this.a.setTaskDescription(new ActivityManager.TaskDescription(b, bitmap, AbstractC3899bX.d(i2)));
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        WH0 wh0 = this.l;
        if (wh0 != null) {
            N.Mz5mgjYL(wh0.a);
            wh0.a = 0L;
        }
        C6001he0 c6001he0 = this.m;
        C2468Sz3 c2468Sz3 = this.h;
        c2468Sz3.j(c6001he0);
        c2468Sz3.j(this.n);
    }
}
