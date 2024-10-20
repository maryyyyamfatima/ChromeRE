package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pp */
/* loaded from: classes.dex */
public final class C8815pp implements InterfaceC10272u34, InterfaceC4090c34 {
    public final ViewGroup a;
    public final InterfaceC7697ma2 g;
    public final C3189Yo h;
    public final C1245Jp i;
    public C9425rc2 j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [Yo, org.chromium.base.Callback] */
    /* JADX WARN: Type inference failed for: r5v1, types: [nu0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [pu0] */
    public C8815pp(AbstractC4159cG1 abstractC4159cG1, InterfaceC9158qp interfaceC9158qp, InterfaceC10111tc2 interfaceC10111tc2, C5809h34 c5809h34, InterfaceC7697ma2 interfaceC7697ma2, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32, InterfaceC3472aG1 interfaceC3472aG1, InterfaceC7697ma2 interfaceC7697ma22, Callback callback, InterfaceC0079Ap3 interfaceC0079Ap33, InterfaceC6114hx interfaceC6114hx, InterfaceC6092ht1 interfaceC6092ht1, C4959ec2 c4959ec2) {
        this.a = abstractC4159cG1;
        Context context = abstractC4159cG1.getContext();
        PropertyModel propertyModel = new PropertyModel(AbstractC6413ip3.g);
        C7616mK1 c7616mK1 = new C7616mK1();
        propertyModel.o(AbstractC6413ip3.b, interfaceC10111tc2);
        LD2 ld2 = AbstractC6413ip3.a;
        propertyModel.k(ld2, false);
        propertyModel.o(AbstractC6413ip3.c, c7616mK1);
        C1245Jp c1245Jp = new C1245Jp(context, interfaceC9158qp, c5809h34, propertyModel, new Handler(), interfaceC7697ma2, interfaceC0079Ap3, interfaceC0079Ap32, interfaceC3472aG1, callback, interfaceC0079Ap33, interfaceC6114hx, interfaceC6092ht1, c4959ec2);
        this.i = c1245Jp;
        InterfaceC9158qp interfaceC9158qp2 = c1245Jp.g;
        InterfaceC6495j34 interfaceC6495j34 = c1245Jp.h;
        final C9189qu0 c9189qu0 = c1245Jp.m;
        c9189qu0.getClass();
        ?? r5 = new InterfaceC0079Ap3() { // from class: nu0
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return C9189qu0.this.f;
            }
        };
        C8503ou0 c8503ou0 = new InterfaceC0079Ap3() { // from class: ou0
            public /* synthetic */ C8503ou0() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return C9189qu0.this.h;
            }
        };
        ?? r7 = new InterfaceC0079Ap3() { // from class: pu0
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                InterfaceC0079Ap3 interfaceC0079Ap34 = C9189qu0.this.e;
                if (interfaceC0079Ap34 == null) {
                    return null;
                }
                return (J63) interfaceC0079Ap34.get();
            }
        };
        Context context2 = c1245Jp.a;
        c9189qu0.g = new TH0(context2, c8503ou0);
        c9189qu0.d = new C7548m71(context2, c1245Jp, interfaceC9158qp2);
        c9189qu0.b(new C3703aw0(context2, c1245Jp, interfaceC9158qp2, c9189qu0.g, c9189qu0.b, r7));
        c9189qu0.b(new C1829Oc(context2, c1245Jp, interfaceC6495j34, r5));
        c9189qu0.b(new C4232cV(context2, c1245Jp, c9189qu0.g));
        c9189qu0.b(new C4482dC0(context2, c1245Jp, r5));
        c9189qu0.b(new NE3(context2, c1245Jp));
        c9189qu0.b(new C7003kZ1(context2, c1245Jp, c9189qu0.g));
        c9189qu0.b(new C2422Sq2(context2, c1245Jp, interfaceC6495j34, c9189qu0.g, c9189qu0.i, c9189qu0.c, interfaceC9158qp2));
        c9189qu0.b(new C6456ix(context2, c1245Jp, interfaceC6495j34, c9189qu0.g, c9189qu0.i));
        propertyModel.o(AbstractC6413ip3.f, c1245Jp);
        C8472op c8472op = new C8472op(this, context, c7616mK1);
        c8472op.a(new Callback() { // from class: Wo
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C8815pp c8815pp = C8815pp.this;
                c8815pp.getClass();
                c8815pp.j = ((C7100kp3) obj).b;
            }
        });
        new C4407cz1(propertyModel, ld2, new C3720az1(ld2), c8472op, new TD2() { // from class: Xo
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                int i;
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                C7100kp3 c7100kp3 = (C7100kp3) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld22 = AbstractC6413ip3.a;
                if (ld22.equals(fd2)) {
                    boolean j = propertyModel2.j(ld22);
                    C9425rc2 c9425rc2 = c7100kp3.b;
                    c9425rc2.getClass();
                    C9425rc2 c9425rc22 = c7100kp3.b;
                    ViewGroup viewGroup = c7100kp3.a;
                    if (j) {
                        viewGroup.setVisibility(0);
                        if (c9425rc2.getParent() == null) {
                            viewGroup.addView(c9425rc2);
                        }
                        if (c9425rc22.getVisibility() == 0) {
                            return;
                        }
                        c9425rc22.setVisibility(0);
                        C9768sc2 c9768sc2 = c9425rc22.U0;
                        if (c9768sc2 == null || c9768sc2.k == 0) {
                            return;
                        }
                        c9768sc2.R(-1);
                        return;
                    }
                    if (c9425rc22.getVisibility() == 0) {
                        c9425rc22.setVisibility(8);
                        c9425rc22.h.c().a();
                    }
                    AbstractC8540p04.i(c9425rc2);
                    viewGroup.setVisibility(4);
                    return;
                }
                PD2 pd2 = AbstractC6413ip3.b;
                if (pd2.equals(fd2)) {
                    C9425rc2 c9425rc23 = c7100kp3.b;
                    InterfaceC10111tc2 interfaceC10111tc22 = (InterfaceC10111tc2) propertyModel2.i(pd2);
                    c9425rc23.V0 = interfaceC10111tc22;
                    c9425rc23.X0 = ((a) interfaceC10111tc22).n;
                    c9425rc23.Z0 = new ViewTreeObserverOnGlobalLayoutListenerC7709mc2(c9425rc23);
                    a aVar = (a) c9425rc23.V0;
                    AbstractC4159cG1 abstractC4159cG12 = DeviceFormFactor.b(aVar.m) ? aVar.a : null;
                    c9425rc23.Y0 = abstractC4159cG12;
                    if (abstractC4159cG12 != null) {
                        c9425rc23.a1 = new ViewOnLayoutChangeListenerC8053nc2(c9425rc23);
                        return;
                    } else {
                        c9425rc23.a1 = null;
                        return;
                    }
                }
                PD2 pd22 = AbstractC6413ip3.f;
                if (!pd22.equals(fd2)) {
                    LD2 ld23 = AbstractC6413ip3.d;
                    if (ld23.equals(fd2)) {
                        if (propertyModel2.j(ld23)) {
                            final C9425rc2 c9425rc24 = c7100kp3.b;
                            c9425rc24.getClass();
                            PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: ic2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9425rc2 c9425rc25 = C9425rc2.this;
                                    c9425rc25.announceForAccessibility(c9425rc25.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140154, Integer.valueOf(c9425rc25.U0.q())));
                                }
                            }, 300L);
                            return;
                        }
                        return;
                    }
                    PD2 pd23 = AbstractC6413ip3.c;
                    if (pd23.equals(fd2)) {
                        ((C7616mK1) propertyModel2.i(pd23)).l(new C6756jp3(c7100kp3));
                        return;
                    }
                    ND2 nd2 = AbstractC6413ip3.e;
                    if (nd2.equals(fd2)) {
                        C9425rc2 c9425rc25 = c7100kp3.b;
                        if (propertyModel2.h(nd2) == 2) {
                            i = c9425rc25.Q0;
                        } else {
                            i = c9425rc25.P0;
                        }
                        if (!c9425rc25.isHardwareAccelerated() && Color.alpha(i) == 255) {
                            i = Color.argb(254, Color.red(i), Color.green(i), Color.blue(i));
                        }
                        c9425rc25.setBackground(new ColorDrawable(i));
                        return;
                    }
                    return;
                }
                c7100kp3.b.W0 = (InterfaceC8740pc2) propertyModel2.i(pd22);
            }
        });
        this.g = interfaceC7697ma22;
        ?? r2 = new Callback() { // from class: Yo
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Profile profile = (Profile) obj;
                C1245Jp c1245Jp2 = C8815pp.this.i;
                if (c1245Jp2.w != null) {
                    c1245Jp2.m(true);
                    c1245Jp2.w.a.remove(c1245Jp2);
                }
                AutocompleteController autocompleteController = profile == null ? null : (AutocompleteController) N.MDwR4hsq(profile);
                c1245Jp2.w = autocompleteController;
                autocompleteController.a.add(c1245Jp2);
                C9189qu0 c9189qu02 = c1245Jp2.m;
                LargeIconBridge largeIconBridge = c9189qu02.h;
                if (largeIconBridge != null) {
                    largeIconBridge.a();
                    c9189qu02.h = null;
                }
                ImageFetcher imageFetcher = c9189qu02.f;
                if (imageFetcher != null) {
                    imageFetcher.b();
                    c9189qu02.f = null;
                }
                TH0 th0 = c9189qu02.g;
                if (th0 != null) {
                    th0.a.evictAll();
                }
                c9189qu02.h = new LargeIconBridge(profile);
                ProfileKey g = profile.g();
                C1241Jo0 c1241Jo0 = AbstractC6474j01.a;
                Object obj2 = ThreadUtils.a;
                c9189qu02.f = AbstractC0687Fh1.a(2, new C0557Eh1(g), c1241Jo0, 512000);
                c1245Jp2.k();
            }
        };
        this.h = r2;
        ((C8385oa2) interfaceC7697ma22).m(r2);
        b();
    }

    @Override // defpackage.InterfaceC10272u34
    public final void L(boolean z) {
        C1245Jp c1245Jp = this.i;
        c1245Jp.getClass();
        c1245Jp.z = z ? 2 : 0;
        c1245Jp.n();
    }

    @Override // defpackage.InterfaceC10272u34
    public final void d(boolean z) {
        String str;
        C1245Jp c1245Jp = this.i;
        InterfaceC3472aG1 interfaceC3472aG1 = c1245Jp.k;
        InterfaceC6092ht1 interfaceC6092ht1 = c1245Jp.q;
        int i = 0;
        if (!z) {
            interfaceC6092ht1.b(2);
            c1245Jp.c();
            EI2.b("Omnibox.FocusResultedInNavigation", c1245Jp.D);
            EI2.h(c1245Jp.B, 4, "Android.Omnibox.RefineActionUsage");
            int p = interfaceC3472aG1.p(((a) c1245Jp.g).o.F);
            boolean z2 = c1245Jp.E;
            if (p != 1) {
                if (p != 16 && p != 19) {
                    switch (p) {
                        case 6:
                        case 9:
                            str = "SRP";
                            break;
                        case 7:
                        case 8:
                            break;
                        default:
                            str = "Other";
                            break;
                    }
                } else {
                    str = "Widget";
                }
                EI2.b("Android.Omnibox.SuggestionsListScrolled.".concat(str), z2);
                c1245Jp.z = 0;
                c1245Jp.A = 0;
                c1245Jp.C = -1L;
                c1245Jp.e();
            }
            str = "NTP";
            EI2.b("Android.Omnibox.SuggestionsListScrolled.".concat(str), z2);
            c1245Jp.z = 0;
            c1245Jp.A = 0;
            c1245Jp.C = -1L;
            c1245Jp.e();
        } else {
            if (c1245Jp.u != null) {
                ((ZX1) c1245Jp.l.get()).c(4, c1245Jp.u);
            }
            c1245Jp.B = 0;
            c1245Jp.D = false;
            c1245Jp.E = false;
            c1245Jp.x = System.currentTimeMillis();
            interfaceC6092ht1.a(2);
            c1245Jp.z = 1;
            if (interfaceC3472aG1.p(false) != 16) {
                c1245Jp.i(new RunnableC0075Ap(c1245Jp), -1L);
            } else {
                String b = ((C5809h34) c1245Jp.h).b();
                c1245Jp.h(b, b);
            }
        }
        C9189qu0 c9189qu0 = c1245Jp.m;
        if (!z) {
            ImageFetcher imageFetcher = c9189qu0.f;
            if (imageFetcher != null) {
                imageFetcher.a();
            }
            TH0 th0 = c9189qu0.g;
            if (th0 != null) {
                th0.a.evictAll();
            }
            c9189qu0.k = false;
        }
        c9189qu0.d.getClass();
        while (true) {
            ArrayList arrayList = c9189qu0.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC7444lp3) arrayList.get(i)).d(z);
            i++;
        }
    }

    public final void b() {
        WeakHashMap weakHashMap = Ec4.a;
        int layoutDirection = this.a.getLayoutDirection();
        C9531ru0 c9531ru0 = this.i.n;
        if (c9531ru0.d == layoutDirection) {
            return;
        }
        c9531ru0.d = layoutDirection;
        for (int i = 0; i < c9531ru0.f.size(); i++) {
            ((C7815mu0) c9531ru0.f.get(i)).b.m(AbstractC5038ep3.b, layoutDirection);
        }
    }

    @Override // defpackage.InterfaceC4090c34
    public final void a(String str, String str2) {
        this.i.h(str, str2);
    }
}
