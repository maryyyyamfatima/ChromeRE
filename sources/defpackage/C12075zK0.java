package defpackage;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.feed.FeedServiceBridge;
import org.chromium.chrome.browser.feed.FeedStream;
import org.chromium.chrome.browser.feed.sections.SectionHeaderView;
import org.chromium.chrome.browser.feed.settings.FeedAutoplaySettingsFragment;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.toolbar.top.e;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12075zK0 implements InterfaceC4173cJ0, InterfaceC2173Qs3, InterfaceC11576xs, InterfaceC2678Up3, InterfaceC3830bJ0, InterfaceC4517dJ0 {
    public final RecyclerView A;
    public C2070Py0 B;
    public TK0 C;
    public InterfaceC6322ia1 D;
    public FY2 E;
    public C6860k71 F;
    public C4872eL2 G;
    public C11919ys H;
    public OJ0 I;

    /* renamed from: J, reason: collision with root package name */
    public final InterfaceC0079Ap3 f11552J;
    public ZK0 K;
    public C11233ws L;
    public boolean M;
    public final Activity a;
    public final ViewOnClickListenerC1069If3 b;
    public final View c;
    public final boolean d;
    public final AK0 e;
    public final SK0 f;
    public final QB g;
    public final WindowAndroid h;
    public final InterfaceC0079Ap3 i;
    public final Handler j;
    public final C12157za2 k;
    public final QI0 l;
    public final C12008z71 m;
    public final QZ3 n;
    public final C11046wK0 o;
    public boolean p;
    public int q;
    public int r;
    public final Profile s;
    public BK0 t;
    public View u;
    public final PropertyModel v;
    public final SectionHeaderView w;
    public final C6207iD1 x;
    public final UD2 y;
    public C7555m82 z;

    /* JADX WARN: Type inference failed for: r13v3, types: [wS] */
    /* JADX WARN: Type inference failed for: r8v10, types: [vS] */
    public C12075zK0(Activity activity, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, WindowAndroid windowAndroid, C3018Xf3 c3018Xf3, NewTabPageLayout newTabPageLayout, int i, boolean z, AK0 ak0, Profile profile, boolean z2, QB qb, InterfaceC0079Ap3 interfaceC0079Ap3, FY2 fy2, int i2, C9626sA2 c9626sA2, InterfaceC0079Ap3 interfaceC0079Ap32, int i3, long j, ZK0 zk0, boolean z3, ViewGroup viewGroup, UI0 ui0, C12008z71 c12008z71) {
        RecyclerView recyclerView;
        C12157za2 c12157za2 = new C12157za2();
        this.k = c12157za2;
        this.a = activity;
        this.b = viewOnClickListenerC1069If3;
        this.c = newTabPageLayout;
        this.d = z2;
        this.e = ak0;
        this.g = qb;
        this.s = profile;
        this.h = windowAndroid;
        this.i = interfaceC0079Ap3;
        this.E = fy2;
        this.f11552J = interfaceC0079Ap32;
        this.K = zk0;
        this.l = ui0;
        this.m = c12008z71;
        this.M = false;
        this.r = 0;
        Resources resources = activity.getResources();
        C11046wK0 c11046wK0 = new C11046wK0(this, activity);
        this.o = c11046wK0;
        c11046wK0.setPadding(0, resources.getDimensionPixelOffset(R.dimen.f41520_resource_name_obfuscated_res_0x7f0807b5), 0, 0);
        QZ3 qz3 = new QZ3(c11046wK0);
        this.n = qz3;
        this.z = new C7555m82();
        WK0.a().getClass();
        VB2 a = FeedServiceBridge.a();
        if (a != null) {
            TK0 tk0 = new TK0(activity, activity, z);
            this.C = tk0;
            this.B = new C2070Py0(((C1421Ky0) a).b, tk0);
            FY2 fy22 = this.E;
            if (fy22 != null) {
                fy22.e(this.C);
            }
        } else {
            this.C = null;
            this.B = null;
        }
        C2070Py0 c2070Py0 = this.B;
        if (c2070Py0 != null) {
            C0416Df0 c0416Df0 = c2070Py0.a;
            c0416Df0.getClass();
            Context context = (Context) c0416Df0.j.get();
            C0936Hf0 c0936Hf0 = (C0936Hf0) c0416Df0.i.get();
            InterfaceC9989tE2 interfaceC9989tE2 = c0416Df0.k;
            C0156Bf0 c0156Bf0 = c0416Df0.b;
            final InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1 = (InterfaceScheduledExecutorServiceC4493dE1) c0156Bf0.c.get();
            final Executor executor = (Executor) c0156Bf0.v.get();
            this.D = new C0121Ay0(context, c0936Hf0, new C5016em(interfaceC9989tE2, new InterfaceC9989tE2() { // from class: vS
                @Override // defpackage.InterfaceC9989tE2
                public final Object get() {
                    return InterfaceScheduledExecutorServiceC4493dE1.this;
                }
            }, new InterfaceC9989tE2() { // from class: wS
                @Override // defpackage.InterfaceC9989tE2
                public final Object get() {
                    return executor;
                }
            }), (C2931Wo1) c0416Df0.l.get(), (Wb4) c0416Df0.r.get(), c0416Df0.a, (C6922kJ0) c0416Df0.s.get());
            c9626sA2.getClass();
            if (N.Mvhrh1Yn() || AX.e().g("force-enable-feed-reliability-logging")) {
                C6922kJ0 c6922kJ0 = (C6922kJ0) this.B.a.s.get();
                this.I = new OJ0(c6922kJ0);
                c6922kJ0.i = i3;
                c6922kJ0.w();
                c6922kJ0.t(AbstractC2629Ug.a.a(), j);
            }
        } else {
            this.D = new C11630y12(activity);
        }
        InterfaceC6322ia1 interfaceC6322ia1 = this.D;
        if (interfaceC6322ia1 != null) {
            recyclerView = interfaceC6322ia1.i(this.z, viewGroup);
            recyclerView.setId(R.id.feed_stream_recycler_view);
            recyclerView.setClipToPadding(false);
            recyclerView.setBackgroundColor(AbstractC10957w33.a(activity));
            if (Build.VERSION.SDK_INT >= 26) {
                recyclerView.setDefaultFocusHighlightEnabled(false);
            }
            if (z3) {
                recyclerView.setOverScrollMode(2);
            }
        } else {
            recyclerView = null;
        }
        this.A = recyclerView;
        C8646pK0.d(activity, recyclerView, qz3);
        ZK0 zk02 = this.K;
        if (zk02 != null && zk02.getParent() == null) {
            this.K.addView(recyclerView);
            c11046wK0.addView(this.K);
        } else {
            c11046wK0.addView(recyclerView);
        }
        ZK0 zk03 = this.K;
        if (zk03 != null) {
            zk03.M.a(this);
        }
        this.j = new Handler(Looper.getMainLooper());
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("WebFeed")) {
            this.w = (SectionHeaderView) LayoutInflater.from(activity).inflate(R.layout.f59110_resource_name_obfuscated_res_0x7f0e01b3, (ViewGroup) null, false);
        } else {
            this.w = (SectionHeaderView) LayoutInflater.from(activity).inflate(R.layout.f59080_resource_name_obfuscated_res_0x7f0e01b0, (ViewGroup) null, false);
        }
        JD2 jd2 = AbstractC4077c13.b;
        PD2 pd2 = AbstractC4077c13.i;
        PD2 pd22 = AbstractC4077c13.j;
        ID2 id2 = AbstractC4077c13.k;
        HashMap e = PropertyModel.e(new FD2[]{AbstractC4077c13.a, jd2, AbstractC4077c13.c, AbstractC4077c13.d, AbstractC4077c13.e, AbstractC4077c13.f, AbstractC4077c13.g, AbstractC4077c13.h, pd2, pd22, id2});
        C12042zD2 c12042zD2 = new C12042zD2();
        GD2 gd2 = new GD2();
        gd2.a = c12042zD2;
        e.put(jd2, gd2);
        Ve4 ve4 = Ve4.INVISIBLE;
        GD2 gd22 = new GD2();
        gd22.a = ve4;
        e.put(pd2, gd22);
        DD2 dd2 = new DD2();
        dd2.a = i;
        e.put(id2, dd2);
        PropertyModel propertyModel = new PropertyModel(e);
        this.v = propertyModel;
        C8202o13 c8202o13 = new C8202o13();
        this.y = UD2.a(propertyModel, this.w, c8202o13);
        C6207iD1 c6207iD1 = new C6207iD1((C12042zD2) propertyModel.i(jd2), this.w, c8202o13);
        this.x = c6207iD1;
        ((C12042zD2) propertyModel.i(jd2)).l(c6207iD1);
        FJ0 fj0 = new FJ0(activity);
        propertyModel.o(pd22, fj0.a);
        SK0 sk0 = new SK0(this, activity, c3018Xf3, propertyModel, i2 != 1 ? -1 : 1, ui0, fj0);
        this.f = sk0;
        WK0 a2 = WK0.a();
        if (a2.c == null) {
            a2.c = new HashSet();
        }
        a2.c.add(this);
        c12157za2.a(a2);
        sk0.s();
    }

    public final String c() {
        String str;
        int i;
        int i2;
        View r;
        ND2 nd2 = AbstractC4077c13.c;
        SK0 sk0 = this.f;
        int h = sk0.k.h(nd2);
        RecyclerView recyclerView = sk0.a.A;
        LinearLayoutManager linearLayoutManager = recyclerView != null ? (LinearLayoutManager) recyclerView.s : null;
        int i3 = 0;
        if (linearLayoutManager != null) {
            int R0 = linearLayoutManager.R0();
            i2 = linearLayoutManager.T0();
            if (R0 != -1 && (r = linearLayoutManager.r(R0)) != null) {
                i3 = r.getTop();
            }
            InterfaceC1623Mm3 interfaceC1623Mm3 = sk0.G;
            str = interfaceC1623Mm3 != null ? String.valueOf(((FeedStream) interfaceC1623Mm3).F) : "";
            i = i3;
            i3 = R0;
        } else {
            str = "";
            i = 0;
            i2 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pos", i3);
            jSONObject.put("lpos", i2);
            jSONObject.put("off", i);
            jSONObject.put("tabId", h);
            jSONObject.put("contentState", str);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public final void b() {
        AZ0 az0;
        FY2 fy2;
        ZK0 zk0 = this.K;
        if (zk0 != null) {
            if (zk0.h) {
                zk0.h(false, false);
                DO3 do3 = (DO3) this.f11552J.get();
                if (do3 != null) {
                    ((e) do3).a.b0(false);
                }
            }
            this.K.M.d(this);
            this.K.m();
            this.K = null;
        }
        SK0 sk0 = this.f;
        if ((!sk0.F.isEmpty()) && (fy2 = this.E) != null) {
            C6860k71 c6860k71 = this.F;
            if (c6860k71 != null) {
                fy2.c(c6860k71);
                this.F = null;
            }
            C4872eL2 c4872eL2 = this.G;
            if (c4872eL2 != null) {
                this.E.c(c4872eL2);
                this.G = null;
            }
            C11919ys c11919ys = this.H;
            if (c11919ys != null) {
                this.E.c(c11919ys);
                this.H = null;
            }
        }
        FY2 fy22 = this.E;
        if (fy22 != null) {
            fy22.c(this.C);
            this.E = null;
        }
        BK0 bk0 = this.t;
        if (bk0 != null) {
            bk0.b();
        }
        this.t = null;
        FY2 fy23 = this.E;
        if (fy23 != null) {
            fy23.c(this.C);
            this.E = null;
        }
        UD2 ud2 = this.y;
        if (ud2 != null) {
            ud2.b();
            ((C12042zD2) this.v.i(AbstractC4077c13.b)).a.d(this.x);
        }
        sk0.f();
        sk0.i.b();
        IG3.a().h(sk0);
        WK0.a().getClass();
        VB2 a = FeedServiceBridge.a();
        if (a != null && (az0 = (AZ0) ((C1421Ky0) a).a.f.get()) != null) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("FeedClearImageMemoryCache")) {
                a b = a.b(((NJ0) az0.a).a);
                b.getClass();
                AbstractC10296u74.a();
                b.g.e(0L);
                b.a.e();
                C3492aK1 c3492aK1 = b.i;
                synchronized (c3492aK1) {
                    c3492aK1.b(0);
                }
            }
        }
        WK0 a2 = WK0.a();
        HashSet hashSet = a2.c;
        if (hashSet != null) {
            hashSet.remove(this);
            this.k.d(a2);
        }
        InterfaceC6322ia1 interfaceC6322ia1 = this.D;
        if (interfaceC6322ia1 != null) {
            interfaceC6322ia1.c();
        }
        this.o.removeAllViews();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [qK0] */
    @Override // defpackage.InterfaceC2173Qs3
    public final void a() {
        DO3 do3 = (DO3) this.f11552J.get();
        if (do3 != null) {
            ((e) do3).a.b0(true);
        }
        OJ0 oj0 = this.I;
        if (oj0 != null) {
            oj0.a.p(SystemClock.elapsedRealtimeNanos());
        }
        final ?? r0 = new Callback() { // from class: qK0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C12075zK0 c12075zK0 = C12075zK0.this;
                DO3 do32 = (DO3) c12075zK0.f11552J.get();
                if (do32 != null) {
                    ((e) do32).a.b0(false);
                }
                ZK0 zk0 = c12075zK0.K;
                if (zk0 == null) {
                    return;
                }
                zk0.h(false, false);
            }
        };
        InterfaceC1623Mm3 interfaceC1623Mm3 = this.f.G;
        if (interfaceC1623Mm3 != null) {
            final FeedStream feedStream = (FeedStream) interfaceC1623Mm3;
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: XJ0
                @Override // java.lang.Runnable
                public final void run() {
                    FeedStream feedStream2 = FeedStream.this;
                    InterfaceC6322ia1 interfaceC6322ia1 = feedStream2.B;
                    if (interfaceC6322ia1 != null) {
                        interfaceC6322ia1.b();
                    }
                    N.MVSbRkAk(feedStream2.d, feedStream2, r0);
                }
            });
        } else {
            r0.onResult(Boolean.FALSE);
        }
        LU3.a(this.s).notifyEvent("feed_swipe_refresh_shown");
    }

    public final void d() {
        Bundle bundle = new Bundle();
        String name = FeedAutoplaySettingsFragment.class.getName();
        Intent intent = new Intent();
        Activity activity = this.a;
        intent.setClass(activity, SettingsActivity.class);
        if (!(activity instanceof Activity)) {
            intent.addFlags(268435456);
            intent.addFlags(67108864);
        }
        intent.putExtra("show_fragment", name);
        intent.putExtra("show_fragment_args", bundle);
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            activity.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final void e() {
        if (!WK0.a().a) {
            return;
        }
        this.p = true;
        Iterator it = this.k.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                Iterator it2 = ((WK0) c11814ya2.next()).b.iterator();
                while (true) {
                    C11814ya2 c11814ya22 = (C11814ya2) it2;
                    if (c11814ya22.hasNext()) {
                        Rm4 rm4 = (Rm4) ((VK0) c11814ya22.next());
                        rm4.i.c.a(rm4);
                    }
                }
            } else {
                this.f.l();
                AbstractC9664sI0.b(4, new Runnable() { // from class: rK0
                    @Override // java.lang.Runnable
                    public final void run() {
                        final C12075zK0 c12075zK0 = C12075zK0.this;
                        c12075zK0.j.postDelayed(new Runnable() { // from class: tK0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C12075zK0 c12075zK02 = C12075zK0.this;
                                int i = c12075zK02.r;
                                SK0 sk0 = c12075zK02.f;
                                if (sk0.k() && !sk0.j(i)) {
                                    sk0.a.A.m0(i);
                                }
                                Q44 q44 = new Q44(c12075zK02.a, c12075zK02.j);
                                SectionHeaderView sectionHeaderView = c12075zK02.w;
                                C12180ze1 c12180ze1 = new C12180ze1(sectionHeaderView.h.getContext().getResources(), "IPH_FeatureNotificationGuideNTPSuggestionCardHelpBubble", R.string.f73650_resource_name_obfuscated_res_0x7f140498, R.string.f73650_resource_name_obfuscated_res_0x7f140498);
                                c12180ze1.h = sectionHeaderView.h;
                                q44.a(c12180ze1.a());
                            }
                        }, 50L);
                    }
                });
                return;
            }
        }
    }

    public final void h(boolean z) {
        if (!this.f.F.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            View view = this.c;
            if (view != null) {
                arrayList.add(view);
            }
            arrayList.add(this.w);
            if (z) {
                if (this.u == null) {
                    C11046wK0 c11046wK0 = this.o;
                    this.u = LayoutInflater.from(c11046wK0.getContext()).inflate(R.layout.f59650_resource_name_obfuscated_res_0x7f0e01f9, (ViewGroup) c11046wK0, false);
                }
                arrayList.add(this.u);
            }
            f(arrayList);
        }
    }

    public final void g(boolean z) {
        ArrayList arrayList = new ArrayList();
        View view = this.c;
        if (view != null) {
            arrayList.add(view);
        }
        if (z) {
            this.l.a();
            this.t = this.e.d(this.a, this);
            arrayList.add(this.w);
            ZK0 zk0 = this.K;
            if (zk0 != null) {
                FY2 fy2 = this.E;
                if (!zk0.isEnabled()) {
                    zk0.setEnabled(true);
                    if (fy2 != null) {
                        zk0.P = fy2;
                        fy2.e(zk0);
                    }
                }
            }
        } else {
            BK0 bk0 = this.t;
            if (bk0 != null) {
                bk0.b();
                this.t = null;
            }
            ZK0 zk02 = this.K;
            if (zk02 != null) {
                zk02.m();
            }
        }
        f(arrayList);
        this.A.requestFocus();
    }

    public final void f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.f37550_resource_name_obfuscated_res_0x7f080612);
            if (view != this.w) {
                i = dimensionPixelSize;
            }
            arrayList2.add(new C7211l82(i, view, "Header" + view.hashCode()));
        }
        if (this.z.g(arrayList2, 0, this.q)) {
            int size = arrayList2.size();
            this.q = size;
            SK0 sk0 = this.f;
            sk0.B = size;
            InterfaceC1623Mm3 interfaceC1623Mm3 = sk0.G;
            if (interfaceC1623Mm3 != null) {
                ((FeedStream) interfaceC1623Mm3).D = size;
            }
        }
        this.r = arrayList.size() - 1;
    }
}
