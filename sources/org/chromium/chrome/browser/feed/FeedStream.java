package org.chromium.chrome.browser.feed;

import J.N;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC6588jL0;
import defpackage.AbstractC6867k82;
import defpackage.C0936Hf0;
import defpackage.C1127Ir1;
import defpackage.C11814ya2;
import defpackage.C12008z71;
import defpackage.C12075zK0;
import defpackage.C12157za2;
import defpackage.C12180ze1;
import defpackage.C2070Py0;
import defpackage.C2254Rj;
import defpackage.C3496aL0;
import defpackage.C3835bK0;
import defpackage.C4183cL0;
import defpackage.C4527dL0;
import defpackage.C4870eL0;
import defpackage.C5214fL0;
import defpackage.C5558gL0;
import defpackage.C5902hL0;
import defpackage.C6241iK0;
import defpackage.C6246iL0;
import defpackage.C6523j82;
import defpackage.C6583jK0;
import defpackage.C6827k14;
import defpackage.C6927kK0;
import defpackage.C7211l82;
import defpackage.C7271lK0;
import defpackage.C7555m82;
import defpackage.C7615mK0;
import defpackage.C7928nE;
import defpackage.C7931nE2;
import defpackage.C7954nJ0;
import defpackage.C7959nK0;
import defpackage.EI2;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC1494Lm3;
import defpackage.InterfaceC1623Mm3;
import defpackage.InterfaceC3830bJ0;
import defpackage.InterfaceC4517dJ0;
import defpackage.InterfaceC6322ia1;
import defpackage.InterfaceC7610mJ0;
import defpackage.InterfaceC9790sg0;
import defpackage.PB;
import defpackage.PJ0;
import defpackage.Q44;
import defpackage.QB;
import defpackage.QI0;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.RJ0;
import defpackage.RunnableC11732yK0;
import defpackage.UN;
import defpackage.VJ0;
import defpackage.ViewOnClickListenerC1069If3;
import defpackage.XF0;
import defpackage.YJ0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.feed.FeedReliabilityLoggingBridge;
import org.chromium.chrome.browser.feed.FeedStream;
import org.chromium.chrome.browser.feed.sections.SectionHeaderView;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FeedStream implements InterfaceC1623Mm3 {
    public C2070Py0 A;
    public InterfaceC6322ia1 B;
    public PJ0 C;
    public int D;
    public boolean E;
    public long F;
    public final ArrayList G;
    public C7211l82 H;
    public final QB I;

    /* renamed from: J */
    public PB f11523J;
    public String K;
    public View L;
    public View M;
    public final VJ0 a = new VJ0();
    public final int b;
    public final Activity c;
    public final long d;
    public final C12157za2 e;
    public final int f;
    public final C7615mK0 g;
    public final ViewOnClickListenerC1069If3 h;
    public final C12008z71 i;
    public final WindowAndroid j;
    public final InterfaceC3830bJ0 k;
    public final C7959nK0 l;
    public InterfaceC4517dJ0 m;
    public int n;
    public final int o;
    public boolean p;
    public final C6583jK0 q;
    public final YJ0 r;
    public RJ0 s;
    public final C7271lK0 t;
    public final HashMap u;
    public final C6927kK0 v;
    public final FeedReliabilityLoggingBridge w;
    public InterfaceC7610mJ0 x;
    public RecyclerView y;
    public C7555m82 z;

    public FeedStream(Activity activity, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, QB qb, boolean z, WindowAndroid windowAndroid, InterfaceC0079Ap3 interfaceC0079Ap3, int i, InterfaceC3830bJ0 interfaceC3830bJ0, QI0 qi0, C12008z71 c12008z71, InterfaceC4517dJ0 interfaceC4517dJ0) {
        C12157za2 c12157za2 = new C12157za2();
        this.e = c12157za2;
        this.q = new C6583jK0(this);
        this.G = new ArrayList();
        this.c = activity;
        this.f = i;
        FeedReliabilityLoggingBridge feedReliabilityLoggingBridge = new FeedReliabilityLoggingBridge();
        this.w = feedReliabilityLoggingBridge;
        this.d = N.MIFFwCrU(this, i, feedReliabilityLoggingBridge.a);
        this.I = qb;
        this.g = new C7615mK0(windowAndroid, interfaceC0079Ap3);
        this.h = viewOnClickListenerC1069If3;
        this.i = c12008z71;
        this.E = z;
        this.j = windowAndroid;
        this.k = interfaceC3830bJ0;
        this.v = new C6927kK0(this);
        this.m = interfaceC4517dJ0;
        HashMap hashMap = new HashMap();
        this.u = hashMap;
        hashMap.put("GeneralActions", new C6241iK0(this, qi0));
        hashMap.put("FeedActions", new C3835bK0(this));
        this.b = N.M6BYCIpb();
        c12157za2.a(new InterfaceC1494Lm3() { // from class: WJ0
            @Override // defpackage.InterfaceC1494Lm3
            public final void onContentChanged() {
                FeedStream feedStream = FeedStream.this;
                boolean z2 = feedStream.E;
                if (z2 && z2 && feedStream.z != null) {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(feedStream.y.getBackground(), PropertyValuesHolder.ofInt("alpha", 255));
                    ofPropertyValuesHolder.setTarget(feedStream.y.getBackground());
                    ofPropertyValuesHolder.setDuration(feedStream.y.S.c).setInterpolator(AbstractC8142nr1.f);
                    ofPropertyValuesHolder.start();
                    feedStream.E = false;
                }
            }
        });
        this.t = new C7271lK0(this);
        this.o = N.M4qKtJTt();
        this.r = new YJ0(this);
        if (i == 2) {
            this.l = new C7959nK0();
        }
    }

    public final boolean h() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("WebFeedSort") && this.f == 2;
    }

    public final void b() {
        PB pb = this.f11523J;
        if (pb != null) {
            ((m) this.I).l(pb, true, 0);
        }
        this.f11523J = null;
        this.K = null;
    }

    public void replaceDataStoreEntry(String str, byte[] bArr) {
        C2070Py0 c2070Py0 = this.A;
        if (c2070Py0 != null) {
            ((InterfaceC9790sg0) ((C0936Hf0) c2070Py0.a.i.get()).r.get()).b(str, bArr);
        }
    }

    public void removeDataStoreEntry(String str) {
        C2070Py0 c2070Py0 = this.A;
        if (c2070Py0 != null) {
            ((InterfaceC9790sg0) ((C0936Hf0) c2070Py0.a.i.get()).r.get()).remove(str);
        }
    }

    public final boolean f(int i) {
        LinearLayoutManager linearLayoutManager;
        int C;
        int T0;
        int i2;
        RecyclerView recyclerView = this.y;
        if (recyclerView == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.s) == null || (C = linearLayoutManager.C()) < 0 || C < (T0 = linearLayoutManager.T0()) || (i2 = C - T0) > i) {
            return false;
        }
        if (!this.p) {
            this.p = true;
            int i3 = this.f - 1;
            EI2.c(C, AbstractC6588jL0.a[i3]);
            EI2.d(i2, AbstractC6588jL0.b[i3]);
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: TJ0
                @Override // java.lang.Runnable
                public final void run() {
                    final FeedStream feedStream = FeedStream.this;
                    feedStream.getClass();
                    N.MOl5J0Or(feedStream.d, feedStream, new Callback() { // from class: UJ0
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            FeedStream.this.p = false;
                        }
                    });
                }
            });
        }
        return true;
    }

    public final void a(ArrayList arrayList) {
        if (this.H == null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Activity activity = this.c;
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            FrameLayout frameLayout = new FrameLayout(activity);
            this.H = new C7211l82(d(), frameLayout, "Spacer");
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, displayMetrics.heightPixels));
        }
        arrayList.add(this.H);
    }

    public void onStreamUpdated(byte[] bArr) {
        int i;
        AbstractC6867k82 c7211l82;
        final FeedReliabilityLoggingBridge feedReliabilityLoggingBridge = this.w;
        if (this.z == null) {
            return;
        }
        try {
            C5558gL0 c5558gL0 = C5558gL0.n;
            int length = bArr.length;
            XF0 c = XF0.c();
            C5558gL0 c5558gL02 = C5558gL0.n;
            C5558gL0 c5558gL03 = new C5558gL0();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(c5558gL03.getClass());
                    b.f(c5558gL03, bArr, 0, length + 0, new C2254Rj(c));
                    b.b(c5558gL03);
                    if (c5558gL03.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c5558gL03);
                    this.F = c5558gL03.l;
                    C4183cL0 c4183cL0 = c5558gL03.m;
                    if (c4183cL0 == null) {
                        c4183cL0 = C4183cL0.o;
                    }
                    C7954nJ0 c7954nJ0 = new C7954nJ0(c4183cL0);
                    PJ0 pj0 = this.C;
                    if (pj0 != null) {
                        long j = this.F;
                        if (j != 0 && !pj0.e.equals(String.valueOf(j))) {
                            this.C = null;
                        }
                    }
                    Iterator it = c5558gL03.k.iterator();
                    while (it.hasNext()) {
                        this.B.l(((C4527dL0) it.next()).j.p());
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = c5558gL03.j.iterator();
                    boolean z = false;
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        char c2 = 2;
                        i = this.f;
                        if (!hasNext) {
                            break;
                        }
                        C5214fL0 c5214fL0 = (C5214fL0) it2.next();
                        int i2 = c5214fL0.j;
                        if (i2 == 1) {
                            C4870eL0 c4870eL0 = i2 == 1 ? (C4870eL0) c5214fL0.k : C4870eL0.m;
                            String str = c4870eL0.l;
                            int i3 = c4870eL0.j;
                            if (i3 == 1) {
                                c7211l82 = new C6523j82(str, (i3 == 1 ? (C5902hL0) c4870eL0.k : C5902hL0.k).j.p(), c7954nJ0);
                            } else {
                                if (i3 == 4) {
                                    if (this.E) {
                                        c7211l82 = null;
                                    } else {
                                        C7928nE c7928nE = UN.a;
                                        if (N.M09VlOh_("FeedLoadingPlaceholder")) {
                                            if ((c4870eL0.j == 4 ? (C3496aL0) c4870eL0.k : C3496aL0.k).j) {
                                                c7211l82 = new C7211l82(d(), str, R.layout.0_resource_name_obfuscated_res_0x7f0e010d);
                                            }
                                        }
                                        c7211l82 = new C7211l82(d(), str, R.layout.0_resource_name_obfuscated_res_0x7f0e010e);
                                    }
                                } else if (i == 2) {
                                    c7211l82 = new C7211l82(d(), str, R.layout.0_resource_name_obfuscated_res_0x7f0e0114);
                                } else {
                                    int i4 = (i3 == 3 ? (C6246iL0) c4870eL0.k : C6246iL0.k).j;
                                    if (i4 == 0) {
                                        c2 = 1;
                                    } else if (i4 != 1) {
                                        c2 = i4 != 2 ? i4 != 3 ? (char) 0 : (char) 4 : (char) 3;
                                    }
                                    if (c2 == 0) {
                                        c2 = 5;
                                    }
                                    c7211l82 = c2 == 3 ? new C7211l82(d(), str, R.layout.0_resource_name_obfuscated_res_0x7f0e01b6) : new C7211l82(d(), str, R.layout.0_resource_name_obfuscated_res_0x7f0e01b7);
                                }
                            }
                            if (c7211l82 != null) {
                                arrayList.add(c7211l82);
                                if (!c7211l82.b()) {
                                    z = true;
                                }
                            }
                        } else {
                            int a = this.z.a(i2 == 2 ? (String) c5214fL0.k : "");
                            if (a != -1) {
                                arrayList.add(this.z.b(a));
                                if (!this.z.b(a).b()) {
                                    z = true;
                                }
                            }
                        }
                    }
                    C7928nE c7928nE2 = UN.a;
                    if (N.M09VlOh_("WebFeedOnboarding") && arrayList.size() <= 2) {
                        a(arrayList);
                    }
                    i(arrayList);
                    RecyclerView recyclerView = this.y;
                    Objects.requireNonNull(feedReliabilityLoggingBridge);
                    recyclerView.post(new Runnable() { // from class: SJ0
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedReliabilityLoggingBridge feedReliabilityLoggingBridge2 = FeedReliabilityLoggingBridge.this;
                            if (feedReliabilityLoggingBridge2.b.g()) {
                                if (feedReliabilityLoggingBridge2.c != 0) {
                                    feedReliabilityLoggingBridge2.b.e(AbstractC4877eM2.a(feedReliabilityLoggingBridge2.c), System.nanoTime());
                                    feedReliabilityLoggingBridge2.c = 0;
                                }
                                if (feedReliabilityLoggingBridge2.e != 0) {
                                    feedReliabilityLoggingBridge2.b.c(AbstractC5221fM2.a(feedReliabilityLoggingBridge2.e), System.nanoTime());
                                    feedReliabilityLoggingBridge2.e = 0;
                                }
                                feedReliabilityLoggingBridge2.d = false;
                            }
                        }
                    });
                    InterfaceC4517dJ0 interfaceC4517dJ0 = this.m;
                    if (interfaceC4517dJ0 != null && z) {
                        C12075zK0 c12075zK0 = (C12075zK0) interfaceC4517dJ0;
                        if (i == 1 && c12075zK0.M) {
                            SectionHeaderView sectionHeaderView = c12075zK0.w;
                            sectionHeaderView.getClass();
                            if (N.MMltG$kc("WebFeedAwareness", "awareness_style").equals("IPH")) {
                                Q44 q44 = new Q44(c12075zK0.a, c12075zK0.j);
                                RunnableC11732yK0 runnableC11732yK0 = new RunnableC11732yK0(c12075zK0);
                                C12180ze1 c12180ze1 = new C12180ze1(sectionHeaderView.h.getContext().getResources(), "IPH_WebFeedAwareness", R.string.0_resource_name_obfuscated_res_0x7f140bbd, R.string.0_resource_name_obfuscated_res_0x7f140bbd);
                                TabLayout tabLayout = sectionHeaderView.g;
                                c12180ze1.h = (tabLayout != null ? tabLayout.k(1) : null).h;
                                c12180ze1.i = runnableC11732yK0;
                                q44.a(c12180ze1.a());
                            }
                        }
                        this.m = null;
                    }
                    f(0);
                } catch (IOException e) {
                    if (!(e.getCause() instanceof C1127Ir1)) {
                        throw new C1127Ir1(e);
                    }
                    throw ((C1127Ir1) e.getCause());
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (C1127Ir1 e2) {
                if (!e2.g) {
                    throw e2;
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            Object[] objArr = {e4};
            Throwable c3 = AbstractC4851eH1.c(objArr);
            String b2 = AbstractC4851eH1.b("Unable to parse StreamUpdate proto data", c3, objArr);
            if (c3 != null) {
                Log.wtf(AbstractC4851eH1.e("FeedStream"), b2, c3);
            } else {
                Log.wtf(AbstractC4851eH1.e("FeedStream"), b2);
            }
            if (feedReliabilityLoggingBridge.b.g()) {
                feedReliabilityLoggingBridge.b.e(4, System.nanoTime());
                feedReliabilityLoggingBridge.b.c(5, System.nanoTime());
                feedReliabilityLoggingBridge.d = false;
                feedReliabilityLoggingBridge.c = 0;
                feedReliabilityLoggingBridge.e = 0;
            }
        }
    }

    public final void i(ArrayList arrayList) {
        C7555m82 c7555m82 = this.z;
        if (!c7555m82.g(arrayList, this.D, c7555m82.d() - this.D)) {
            return;
        }
        Iterator it = this.e.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1494Lm3) c11814ya2.next()).onContentChanged();
            }
        }
    }

    public final boolean g(PJ0 pj0) {
        if (pj0 != null && pj0.b >= 0 && pj0.a >= 0) {
            int d = this.z.d();
            int i = pj0.b;
            if (d <= i || this.z.b(i).b()) {
                return false;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.y.s;
            if (linearLayoutManager != null) {
                linearLayoutManager.i1(pj0.a, pj0.c);
            }
        }
        return true;
    }

    public final String e(View view) {
        View c = c(this.y, view);
        if (c != null) {
            this.y.getClass();
            int J2 = RecyclerView.J(c);
            return (J2 < 0 || J2 >= this.z.d()) ? "" : this.z.b(J2).a;
        }
        PB pb = this.f11523J;
        return (pb == null || c(pb.c(), view) == null) ? "" : this.K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View c(View view, View view2) {
        if (view == null || view2 == null) {
            return null;
        }
        if (view == view2.getParent()) {
            return view2;
        }
        for (ViewParent viewParent = view2.getParent(); viewParent != 0; viewParent = viewParent.getParent()) {
            if (viewParent.getParent() == view) {
                if (viewParent instanceof View) {
                    return (View) viewParent;
                }
                return null;
            }
        }
        return null;
    }

    public final int d() {
        return this.c.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080612);
    }
}
