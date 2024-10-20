package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.MemoryPressureListener;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.app.feed.feedmanagement.FeedManagementActivity;
import org.chromium.chrome.browser.feed.FeedStream;
import org.chromium.chrome.browser.preferences.PrefChangeRegistrar;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.identitymanager.PrimaryAccountChangeEvent;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SK0 implements UK0, InterfaceC4226cT3, HG3, SC1, InterfaceC1072Ig1 {
    public int A;
    public int B;
    public C7616mK1 C;
    public boolean D;
    public PJ0 E;
    public InterfaceC1623Mm3 G;
    public boolean H;
    public final C12075zK0 a;
    public final Context g;
    public final InterfaceC2498Tf3 h;
    public final PrefChangeRegistrar i;
    public final PropertyModel k;
    public final QI0 l;
    public final FJ0 m;
    public KK0 n;
    public final C12075zK0 p;
    public GK0 q;
    public EK0 r;
    public NK0 s;
    public boolean u;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final C12157za2 o = new C12157za2();
    public final RK0 t = new RK0(this);
    public boolean v = true;
    public final HashMap F = new HashMap();
    public final SigninManager j = AbstractC9966tA.a(C1202Jg1.a());

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void m(AccountInfo accountInfo) {
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void v() {
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [GK0] */
    public SK0(C12075zK0 c12075zK0, Context context, C3018Xf3 c3018Xf3, PropertyModel propertyModel, int i, UI0 ui0, FJ0 fj0) {
        this.a = c12075zK0;
        this.p = c12075zK0;
        this.g = context;
        this.h = c3018Xf3;
        this.l = ui0;
        this.m = fj0;
        PrefChangeRegistrar prefChangeRegistrar = new PrefChangeRegistrar();
        this.i = prefChangeRegistrar;
        prefChangeRegistrar.a("ntp_snippets.enable", new InterfaceC8184ny2() { // from class: FK0
            @Override // defpackage.InterfaceC8184ny2
            public final void c() {
                SK0.this.s();
            }
        });
        if (i == -1) {
            this.A = AbstractC4860eJ0.a();
        } else {
            this.A = i;
        }
        this.k = propertyModel;
        this.q = new InterfaceC1494Lm3() { // from class: GK0
            @Override // defpackage.InterfaceC1494Lm3
            public final void onContentChanged() {
                final SK0 sk0 = SK0.this;
                sk0.getClass();
                Runnable runnable = new Runnable() { // from class: IK0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SK0 sk02 = SK0.this;
                        InterfaceC2498Tf3 interfaceC2498Tf3 = sk02.h;
                        if (interfaceC2498Tf3 != null) {
                            C3018Xf3 c3018Xf32 = (C3018Xf3) interfaceC2498Tf3;
                            View view = c3018Xf32.g;
                            RunnableC2758Vf3 runnableC2758Vf3 = c3018Xf32.d;
                            view.removeCallbacks(runnableC2758Vf3);
                            c3018Xf32.g.post(runnableC2758Vf3);
                        }
                        sk02.l.b();
                        sk02.D = false;
                        sk02.w = true;
                    }
                };
                final RK0 rk0 = sk0.t;
                if (rk0.b.a.A == null) {
                    return;
                }
                rk0.a = runnable;
                new Handler().post(new Runnable() { // from class: QK0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RK0.this.b();
                    }
                });
            }
        };
        if (c3018Xf3 == null) {
            return;
        }
        c12075zK0.o.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: JK0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                ((C3018Xf3) SK0.this.h).a();
            }
        });
    }

    public final void c(String str, final FeedStream feedStream) {
        Ve4 ve4;
        C8385oa2 c8385oa2;
        JD2 jd2 = AbstractC4077c13.b;
        PropertyModel propertyModel = this.k;
        this.F.put(Integer.valueOf(((C12042zD2) propertyModel.i(jd2)).size()), feedStream);
        PD2 pd2 = AbstractC4421d13.a;
        LD2 ld2 = AbstractC4421d13.b;
        PD2 pd22 = AbstractC4421d13.c;
        LD2 ld22 = AbstractC4421d13.d;
        HashMap e = PropertyModel.e(new FD2[]{pd2, ld2, pd22, ld22});
        GD2 gd2 = new GD2();
        gd2.a = str;
        e.put(pd2, gd2);
        AD2 ad2 = new AD2();
        ad2.a = false;
        e.put(ld2, ad2);
        final PropertyModel propertyModel2 = new PropertyModel(e);
        if (feedStream.h() || feedStream.f == 2) {
            ve4 = Ve4.INVISIBLE;
        } else {
            ve4 = Ve4.GONE;
        }
        propertyModel2.o(pd22, ve4);
        propertyModel2.k(ld22, false);
        C12042zD2 c12042zD2 = (C12042zD2) propertyModel.i(jd2);
        c12042zD2.s(propertyModel2);
        propertyModel2.a(c12042zD2.h);
        Callback callback = new Callback() { // from class: HK0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Boolean bool = (Boolean) obj;
                SK0 sk0 = SK0.this;
                sk0.getClass();
                propertyModel2.k(AbstractC4421d13.b, bool.booleanValue());
                int i = ((FeedStream) feedStream).f;
                boolean booleanValue = bool.booleanValue();
                C12075zK0 c12075zK0 = sk0.p;
                if (i == 2) {
                    c12075zK0.M = booleanValue;
                } else {
                    c12075zK0.getClass();
                }
            }
        };
        C7959nK0 c7959nK0 = feedStream.l;
        if (c7959nK0 != null) {
            c8385oa2 = c7959nK0.b;
        } else {
            c8385oa2 = new C8385oa2();
            c8385oa2.p(Boolean.FALSE);
        }
        callback.onResult((Boolean) c8385oa2.m(callback));
    }

    public final int h(int i) {
        HashMap hashMap = this.F;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (((FeedStream) ((InterfaceC1623Mm3) hashMap.get(Integer.valueOf(intValue)))).f == i) {
                return intValue;
            }
        }
        return -1;
    }

    public final void p() {
        if (h(1) == -1) {
            return;
        }
        boolean z = h(2) != -1;
        boolean b = AbstractC4860eJ0.b();
        if (z != b && b) {
            String string = this.g.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140705);
            C12075zK0 c12075zK0 = this.a;
            c(string, new FeedStream(c12075zK0.a, c12075zK0.b, c12075zK0.g, c12075zK0.d, c12075zK0.h, c12075zK0.i, 2, c12075zK0, c12075zK0.l, c12075zK0.m, c12075zK0));
        }
    }

    public final void d(InterfaceC1623Mm3 interfaceC1623Mm3, boolean z) {
        InterfaceC7610mJ0 lk0;
        LinearLayoutManager linearLayoutManager;
        InterfaceC1623Mm3 interfaceC1623Mm32 = this.G;
        if (interfaceC1623Mm32 == interfaceC1623Mm3) {
            return;
        }
        int i = 1;
        if (interfaceC1623Mm32 != null) {
            r(true);
        }
        C12075zK0 c12075zK0 = this.a;
        if (c12075zK0.p) {
            if (this.k.j(AbstractC4077c13.a)) {
                this.G = interfaceC1623Mm3;
                ((FeedStream) interfaceC1623Mm3).e.a(this.q);
                AX e = AX.e();
                if ((e == null ? false : e.g("feed-screenshot-mode")) && this.E == null) {
                    PJ0 pj0 = new PJ0();
                    pj0.a = 1;
                    pj0.b = 5;
                    this.E = pj0;
                }
                OJ0 oj0 = c12075zK0.I;
                InterfaceC1623Mm3 interfaceC1623Mm33 = this.G;
                C7555m82 c7555m82 = c12075zK0.z;
                PJ0 pj02 = this.E;
                C2070Py0 c2070Py0 = c12075zK0.B;
                InterfaceC6322ia1 interfaceC6322ia1 = c12075zK0.D;
                if (oj0 != null) {
                    lk0 = oj0.a;
                } else {
                    lk0 = new LK0();
                }
                int i2 = this.B;
                FeedStream feedStream = (FeedStream) interfaceC1623Mm33;
                feedStream.x = lk0;
                int i3 = feedStream.f;
                if (i3 != 1) {
                    i = 2;
                    if (i3 != 2) {
                        i = 0;
                    }
                }
                long j = feedStream.d;
                lk0.n(i, N.MI3u$s7A(j, feedStream));
                lk0.k(System.nanoTime());
                feedStream.w.b = lk0;
                feedStream.C = pj02;
                HashMap hashMap = feedStream.u;
                HashMap hashMap2 = c7555m82.c;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                C8303oK0 c8303oK0 = new C8303oK0(feedStream);
                RecyclerView recyclerView = c12075zK0.A;
                RJ0 rj0 = new RJ0(recyclerView, c7555m82, c8303oK0);
                feedStream.s = rj0;
                rj0.a.getViewTreeObserver().addOnPreDrawListener(rj0);
                recyclerView.i(feedStream.r);
                recyclerView.r.J(feedStream.q);
                feedStream.y = recyclerView;
                feedStream.z = c7555m82;
                feedStream.A = c2070Py0;
                feedStream.B = interfaceC6322ia1;
                feedStream.D = i2;
                AbstractC1895Op0 abstractC1895Op0 = feedStream.j.i;
                if (abstractC1895Op0 != null) {
                    abstractC1895Op0.a.put(feedStream.v, null);
                }
                if (feedStream.E) {
                    feedStream.y.getBackground().setAlpha(0);
                }
                C7928nE c7928nE = UN.a;
                if (N.M09VlOh_("WebFeedOnboarding") && z) {
                    ArrayList arrayList = new ArrayList();
                    feedStream.a(arrayList);
                    feedStream.i(arrayList);
                    if (N.M09VlOh_("WebFeedOnboarding") && (linearLayoutManager = (LinearLayoutManager) feedStream.y.s) != null) {
                        linearLayoutManager.i1(feedStream.D - 1, feedStream.c.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080803));
                    }
                }
                N.M5EFM3b8(j, feedStream);
                this.E = null;
                c12075zK0.D.j();
            }
        }
    }

    public final void r(boolean z) {
        if (this.G == null) {
            return;
        }
        C12075zK0 c12075zK0 = this.a;
        c12075zK0.D.o();
        FeedStream feedStream = (FeedStream) this.G;
        ArrayList arrayList = feedStream.G;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            feedStream.h.a((InterfaceC0679Ff3) it.next());
        }
        arrayList.clear();
        RJ0 rj0 = feedStream.s;
        RecyclerView recyclerView = rj0.a;
        if (recyclerView != null && recyclerView.getViewTreeObserver().isAlive()) {
            rj0.a.getViewTreeObserver().removeOnPreDrawListener(rj0);
        }
        rj0.a = null;
        rj0.j = null;
        rj0.g = null;
        rj0.k = null;
        feedStream.s = null;
        feedStream.A = null;
        feedStream.n = 0;
        feedStream.t.a();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            feedStream.a(arrayList2);
        }
        feedStream.i(arrayList2);
        feedStream.b();
        C7555m82 c7555m82 = feedStream.z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = c7555m82.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        feedStream.z = null;
        feedStream.y.h0(feedStream.r);
        feedStream.y.r.L(feedStream.q);
        feedStream.y = null;
        AbstractC1895Op0 abstractC1895Op0 = feedStream.j.i;
        if (abstractC1895Op0 != null) {
            abstractC1895Op0.a.remove(feedStream.v);
        }
        N.Mbe8Jcnk(feedStream.d, feedStream);
        InterfaceC1623Mm3 interfaceC1623Mm3 = this.G;
        ((FeedStream) interfaceC1623Mm3).e.d(this.q);
        this.G = null;
        OJ0 oj0 = c12075zK0.I;
        if (oj0 != null) {
            oj0.a(20, false);
        }
    }

    public final void l() {
        if (this.G != null) {
            return;
        }
        InterfaceC1623Mm3 interfaceC1623Mm3 = (InterfaceC1623Mm3) this.F.get(Integer.valueOf(this.k.h(AbstractC4077c13.c)));
        if (interfaceC1623Mm3 != null) {
            d(interfaceC1623Mm3, false);
        }
    }

    public final boolean k() {
        RecyclerView recyclerView = this.a.A;
        return recyclerView != null && recyclerView.getHeight() > 0;
    }

    public final void f() {
        HashMap hashMap = this.F;
        if (hashMap.isEmpty()) {
            return;
        }
        KK0 kk0 = this.n;
        C12075zK0 c12075zK0 = this.a;
        if (kk0 != null) {
            c12075zK0.A.h0(kk0);
            this.n = null;
        }
        EK0 ek0 = this.r;
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = MemoryPressureListener.a;
        if (c12157za2 != null) {
            c12157za2.d(ek0);
        }
        this.r = null;
        NK0 nk0 = this.s;
        if (nk0 != null) {
            C6666ja3 c6666ja3 = nk0.c;
            if (!c6666ja3.g) {
                c6666ja3.g = true;
                AbstractC7010ka3 abstractC7010ka3 = c6666ja3.h;
                abstractC7010ka3.d.f(c6666ja3);
                abstractC7010ka3.f.e(c6666ja3);
                c6666ja3.a.j(c6666ja3);
            }
            this.s = null;
        }
        r(false);
        for (InterfaceC1623Mm3 interfaceC1623Mm3 : hashMap.values()) {
            FeedStream feedStream = (FeedStream) interfaceC1623Mm3;
            feedStream.e.d(this.q);
            C7959nK0 c7959nK0 = feedStream.l;
            if (c7959nK0 != null) {
                N.MVfuS_0P(c7959nK0.a);
                c7959nK0.a = 0L;
            }
            N.MFvLOb3J(feedStream.w.a);
        }
        hashMap.clear();
        this.q = null;
        PrefChangeRegistrar prefChangeRegistrar = this.i;
        ArrayMap arrayMap = prefChangeRegistrar.a;
        if (((InterfaceC8184ny2) arrayMap.get("ntp_snippets.list_visible")) != null) {
            arrayMap.remove("ntp_snippets.list_visible");
            N.M0E$fVRB(prefChangeRegistrar.b, prefChangeRegistrar, "ntp_snippets.list_visible");
        }
        IG3.a().h(this);
        this.j.p().d(this);
        ((C12042zD2) this.k.i(AbstractC4077c13.b)).clear();
        C2070Py0 c2070Py0 = c12075zK0.B;
        if (c2070Py0 != null) {
            ((C6922kJ0) c2070Py0.a.s.get()).u();
        }
    }

    public final void t() {
        boolean a = AbstractC8650pL.a("ntp_snippets.list_visible");
        JD2 jd2 = AbstractC4077c13.b;
        PropertyModel propertyModel = this.k;
        ((PropertyModel) ((C12042zD2) propertyModel.i(jd2)).get(0)).o(AbstractC4421d13.a, g(a));
        n(a);
        propertyModel.o(AbstractC4077c13.e, e());
        NK0 nk0 = this.s;
        if (nk0 != null) {
            nk0.a = a;
            nk0.a();
        }
        if (a) {
            this.a.t.f();
        }
        this.w = true;
        C12042zD2 c12042zD2 = (C12042zD2) propertyModel.i(jd2);
        ND2 nd2 = AbstractC4077c13.c;
        PropertyModel propertyModel2 = (PropertyModel) c12042zD2.get(propertyModel.h(nd2));
        InterfaceC1623Mm3 interfaceC1623Mm3 = (InterfaceC1623Mm3) this.F.get(Integer.valueOf(propertyModel.h(nd2)));
        PD2 pd2 = AbstractC4421d13.c;
        if (a) {
            if (((FeedStream) interfaceC1623Mm3).h()) {
                propertyModel2.o(pd2, Ve4.VISIBLE);
            }
            l();
        } else {
            if (((FeedStream) interfaceC1623Mm3).h()) {
                propertyModel2.o(pd2, Ve4.INVISIBLE);
                propertyModel2.k(AbstractC4421d13.d, false);
            }
            r(false);
        }
    }

    public final String g(boolean z) {
        Resources resources = this.g.getResources();
        boolean e = IG3.a().e();
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("WebFeed");
        int i = R.string.0_resource_name_obfuscated_res_0x7f140701;
        if (!M09VlOh_ || !N.Moqc7YrQ() || !z) {
            if (!e) {
                i = z ? R.string.0_resource_name_obfuscated_res_0x7f140702 : R.string.0_resource_name_obfuscated_res_0x7f140700;
            } else if (!z) {
                i = R.string.0_resource_name_obfuscated_res_0x7f1406ff;
            }
        }
        return resources.getString(i);
    }

    public final C7616mK1 e() {
        C7272lK1 d;
        C7616mK1 c7616mK1 = new C7616mK1();
        if (N.Moqc7YrQ()) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("WebFeed")) {
                c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f140708, R.id.ntp_feed_header_menu_item_manage, 0));
            } else {
                c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f14070a, R.id.ntp_feed_header_menu_item_activity, 0));
                c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f140709, R.id.ntp_feed_header_menu_item_interest, 0));
                if (N.MqhKj56k()) {
                    c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f140707, R.id.ntp_feed_header_menu_item_autoplay, 0));
                }
                if (N.M09VlOh_("InterestFeedV2Hearts")) {
                    c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f14070b, R.id.ntp_feed_header_menu_item_reactions, 0));
                }
            }
        } else if (N.MqhKj56k()) {
            c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f140707, R.id.ntp_feed_header_menu_item_autoplay, 0));
        }
        c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f1405af, R.id.ntp_feed_header_menu_item_learn, 0));
        if (this.k.j(AbstractC4077c13.a)) {
            d = C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f14070f, R.id.ntp_feed_header_menu_item_toggle_switch, 0);
        } else {
            d = C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f140710, R.id.ntp_feed_header_menu_item_toggle_switch, 0);
        }
        c7616mK1.s(d);
        return c7616mK1;
    }

    @Override // defpackage.InterfaceC4226cT3
    public final void a(boolean z) {
        this.v = z;
    }

    public final int i() {
        LinearLayoutManager linearLayoutManager;
        View r;
        if (!k()) {
            return 0;
        }
        if (!j(0) || (linearLayoutManager = (LinearLayoutManager) this.a.A.s) == null || (r = linearLayoutManager.r(0)) == null) {
            return Integer.MIN_VALUE;
        }
        return -r.getTop();
    }

    public final boolean j(int i) {
        LinearLayoutManager linearLayoutManager;
        if (!k() || (linearLayoutManager = (LinearLayoutManager) this.a.A.s) == null) {
            return false;
        }
        int R0 = linearLayoutManager.R0();
        int T0 = linearLayoutManager.T0();
        return R0 != -1 && T0 != -1 && R0 <= i && i <= T0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:            if (r2.v.C == false) goto L177;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r7 = this;
            Tf3 r0 = r7.h
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r7.k()
            if (r1 != 0) goto Lc
            return
        Lc:
            int r1 = r7.i()
            Xf3 r0 = (defpackage.C3018Xf3) r0
            N32 r2 = r0.a
            t32 r2 = (defpackage.C9927t32) r2
            v32 r2 = r2.f
            boolean r3 = r2.E
            r4 = 0
            if (r3 == 0) goto L1e
            goto L33
        L1e:
            boolean r3 = r2.y
            boolean r5 = r2.o
            r6 = 1
            if (r5 != 0) goto L29
            if (r3 == 0) goto L29
            r3 = r6
            goto L2a
        L29:
            r3 = r4
        L2a:
            if (r3 == 0) goto L33
            org.chromium.chrome.browser.ntp.NewTabPageLayout r2 = r2.v
            boolean r2 = r2.C
            if (r2 != 0) goto L33
            goto L34
        L33:
            r6 = r4
        L34:
            if (r6 == 0) goto L68
            int r2 = r0.e
            int r3 = r4 + r2
            int r3 = r3 / 2
            if (r1 < 0) goto L45
            if (r1 <= r2) goto L41
            goto L45
        L41:
            if (r1 >= r3) goto L46
            r2 = r4
            goto L46
        L45:
            r2 = r1
        L46:
            org.chromium.chrome.browser.ntp.NewTabPageLayout r3 = r0.b
            vZ2 r3 = r3.j
            android.view.ViewGroup r3 = r3.b
            int r5 = r3.getTop()
            int r3 = r3.getPaddingTop()
            int r3 = r3 + r5
            int r0 = r0.f
            int r0 = r3 - r0
            int r5 = r0 + r3
            int r5 = r5 / 2
            if (r2 < r0) goto L69
            if (r2 <= r3) goto L62
            goto L69
        L62:
            if (r2 >= r5) goto L66
            r2 = r0
            goto L69
        L66:
            r2 = r3
            goto L69
        L68:
            r2 = r1
        L69:
            zK0 r0 = r7.a
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            int r2 = r2 - r1
            r0.t0(r4, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SK0.q():void");
    }

    @Override // defpackage.HG3
    public final void x() {
        t();
    }

    @Override // defpackage.SC1
    public final void b(PropertyModel propertyModel) {
        int h = propertyModel.h(AbstractC4144cD1.e);
        HashMap hashMap = this.F;
        ND2 nd2 = AbstractC4077c13.c;
        PropertyModel propertyModel2 = this.k;
        int i = ((FeedStream) ((InterfaceC1623Mm3) hashMap.get(Integer.valueOf(propertyModel2.h(nd2))))).f;
        if (h == R.id.ntp_feed_header_menu_item_manage) {
            Context context = this.g;
            Intent intent = new Intent(context, (Class<?>) FeedManagementActivity.class);
            intent.putExtra("feed_management_initiating_stream_type_extra", i);
            N.MxULk9PS(i, 42);
            AbstractC6588jL0.a(6);
            context.startActivity(intent);
            return;
        }
        QI0 qi0 = this.l;
        if (h == R.id.ntp_feed_header_menu_item_activity) {
            ((UI0) qi0).a.d(1, new LoadUrlParams("https://myactivity.google.com/myactivity?product=50", 0));
            N.MxULk9PS(i, 16);
            AbstractC6588jL0.a(0);
            return;
        }
        if (h == R.id.ntp_feed_header_menu_item_interest) {
            ((UI0) qi0).a.d(1, new LoadUrlParams("https://www.google.com/preferences/interests", 0));
            N.MxULk9PS(i, 6);
            AbstractC6588jL0.a(1);
            return;
        }
        if (h == R.id.ntp_feed_header_menu_item_reactions) {
            ((UI0) qi0).a.d(1, new LoadUrlParams("https://www.google.com/search/contributions/reactions", 0));
            N.MxULk9PS(i, 28);
            AbstractC6588jL0.a(1);
            return;
        }
        if (h == R.id.ntp_feed_header_menu_item_autoplay) {
            this.a.d();
            AbstractC6588jL0.a(5);
            return;
        }
        if (h == R.id.ntp_feed_header_menu_item_learn) {
            qi0.c();
            N.MxULk9PS(i, 3);
            AbstractC6588jL0.a(2);
        } else if (h == R.id.ntp_feed_header_menu_item_toggle_switch) {
            boolean z = !propertyModel2.j(AbstractC4077c13.a);
            R44.a(Profile.d()).e("ntp_snippets.list_visible", z);
            AbstractC6588jL0.a(3);
            EI2.b("NewTabPage.ContentSuggestions.ArticlesListVisible", R44.a(Profile.d()).a("ntp_snippets.list_visible"));
            N.MxULk9PS(((FeedStream) ((InterfaceC1623Mm3) hashMap.get(Integer.valueOf(propertyModel2.h(nd2))))).f, z ? 14 : 15);
        }
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final void o(PrimaryAccountChangeEvent primaryAccountChangeEvent) {
        t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01da, code lost:            if (r2 != false) goto L365;     */
    /* JADX WARN: Type inference failed for: r1v2, types: [EK0, nS1] */
    /* JADX WARN: Type inference failed for: r5v13, types: [vK0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [sK0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SK0.s():void");
    }

    public final void n(boolean z) {
        Ve4 ve4;
        boolean Moqc7YrQ = N.Moqc7YrQ();
        boolean z2 = Moqc7YrQ && AbstractC4860eJ0.b() && z;
        if (z2) {
            p();
        }
        LD2 ld2 = AbstractC4077c13.g;
        PropertyModel propertyModel = this.k;
        propertyModel.k(ld2, z2);
        if (!z2) {
            propertyModel.m(AbstractC4077c13.c, h(1));
        }
        boolean e = IG3.a().e();
        propertyModel.k(AbstractC4077c13.h, !e && Moqc7YrQ && z);
        if (!Moqc7YrQ || !z) {
            ve4 = Ve4.GONE;
        } else if (!e) {
            ve4 = Ve4.VISIBLE;
        } else {
            ve4 = Ve4.INVISIBLE;
        }
        propertyModel.o(AbstractC4077c13.i, ve4);
        if (!z) {
            this.m.d.k(GJ0.a, false);
        }
        propertyModel.k(AbstractC4077c13.a, z);
    }
}
