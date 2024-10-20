package defpackage;

import J.N;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.chrome.R;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.tasks.tab_management.TabGroupUiToolbarView;
import org.chromium.chrome.browser.tasks.tab_management.c;
import org.chromium.chrome.browser.toolbar.bottom.ScrollingBottomViewResourceFrameLayout;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.resources.ResourceManager;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class JB implements InterfaceC7458ls {
    public final LB a;
    public final InterfaceC1543Lw3 g;

    public JB(a aVar, WindowAndroid windowAndroid, C9897sy1 c9897sy1, ResourceManager resourceManager, FC fc, ZU0 zu0, ScrollingBottomViewResourceFrameLayout scrollingBottomViewResourceFrameLayout, C1933Ow3 c1933Ow3, C8385oa2 c8385oa2) {
        C0759Fv3 c0759Fv3;
        PropertyModel propertyModel = new PropertyModel(MB.e);
        RY2 ry2 = new RY2(scrollingBottomViewResourceFrameLayout, scrollingBottomViewResourceFrameLayout.j);
        UD2.a(propertyModel, new NB(scrollingBottomViewResourceFrameLayout, ry2), new TD2() { // from class: GB
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                NB nb = (NB) obj;
                FD2 fd2 = (FD2) obj2;
                ND2 nd2 = MB.a;
                if (nd2 == fd2) {
                    nb.a.findViewById(R.id.bottom_controls_wrapper).getLayoutParams().height = propertyModel2.h(nd2);
                    return;
                }
                ND2 nd22 = MB.b;
                if (nd22 != fd2) {
                    LD2 ld2 = MB.c;
                    if (ld2 == fd2) {
                        nb.a.setVisibility(propertyModel2.j(ld2) ? 0 : 4);
                        return;
                    }
                    LD2 ld22 = MB.d;
                    if (ld22 == fd2) {
                        nb.b.k = propertyModel2.j(ld22);
                        return;
                    }
                    return;
                }
                nb.b.j = propertyModel2.h(nd22);
            }
        });
        new C7173l20(propertyModel, ry2, new TD2() { // from class: HB
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
            }
        }, c9897sy1.K);
        scrollingBottomViewResourceFrameLayout.findViewById(R.id.bottom_container_slot).getLayoutParams().height = scrollingBottomViewResourceFrameLayout.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080098);
        LB lb = new LB(windowAndroid, propertyModel, fc, zu0, scrollingBottomViewResourceFrameLayout.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080098), c8385oa2);
        this.a = lb;
        resourceManager.a().d(scrollingBottomViewResourceFrameLayout.getId(), scrollingBottomViewResourceFrameLayout.g);
        this.g = c1933Ow3;
        ZN3.c = scrollingBottomViewResourceFrameLayout.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080098);
        lb.l = false;
        lb.l();
        lb.j();
        ry2.k = lb.h();
        c9897sy1.f(ry2);
        IB ib = new IB(lb);
        TraceEvent i = TraceEvent.i("TabGroupUiCoordinator.initializeWithNative", null);
        try {
            if (RC.a().e()) {
                N.MT4iKtWs("TabGroupsAndroidSyntheticTrial", "Downloaded_Enabled", 0);
            }
            c cVar = new c(1, c1933Ow3.g, c1933Ow3.r, null, null, AbstractC5177fD3.a(), null, null, 2, null, null, c1933Ow3.k, true, "TabStrip", c1933Ow3.q);
            c1933Ow3.A = cVar;
            cVar.d((C9537rv0) c1933Ow3.w.get());
            PropertyModel propertyModel2 = c1933Ow3.h;
            c1933Ow3.y = UD2.a(propertyModel2, new C5774gx3(c1933Ow3.j, c1933Ow3.A.g), new TD2() { // from class: Mw3
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    int c;
                    PropertyModel propertyModel3 = (PropertyModel) wd2;
                    C5774gx3 c5774gx3 = (C5774gx3) obj;
                    FD2 fd2 = (FD2) obj2;
                    PD2 pd2 = AbstractC5086ex3.a;
                    if (pd2 == fd2) {
                        c5774gx3.a.g.setOnClickListener((View.OnClickListener) propertyModel3.i(pd2));
                        return;
                    }
                    PD2 pd22 = AbstractC5086ex3.b;
                    if (pd22 == fd2) {
                        c5774gx3.a.a.setOnClickListener((View.OnClickListener) propertyModel3.i(pd22));
                        return;
                    }
                    LD2 ld2 = AbstractC5086ex3.c;
                    if (ld2 == fd2) {
                        TabGroupUiToolbarView tabGroupUiToolbarView = c5774gx3.a;
                        boolean j = propertyModel3.j(ld2);
                        if (tabGroupUiToolbarView.k == null) {
                            throw new IllegalStateException("Current Toolbar doesn't have a container view");
                        }
                        for (int i2 = 0; i2 < tabGroupUiToolbarView.k.getChildCount(); i2++) {
                            tabGroupUiToolbarView.k.getChildAt(i2).setVisibility(j ? 0 : 4);
                        }
                        return;
                    }
                    LD2 ld22 = AbstractC5086ex3.d;
                    if (ld22 == fd2) {
                        TabGroupUiToolbarView tabGroupUiToolbarView2 = c5774gx3.a;
                        boolean j2 = propertyModel3.j(ld22);
                        if (!j2) {
                            c = AbstractC11746yN.c(tabGroupUiToolbarView2.getContext(), R.dimen.0_resource_name_obfuscated_res_0x7f0801b6);
                        } else {
                            c = tabGroupUiToolbarView2.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070180);
                        }
                        tabGroupUiToolbarView2.m.setBackgroundColor(c);
                        ChromeImageView chromeImageView = tabGroupUiToolbarView2.i;
                        if (chromeImageView != null && tabGroupUiToolbarView2.j != null) {
                            chromeImageView.setColorFilter(c, PorterDuff.Mode.SRC_IN);
                            tabGroupUiToolbarView2.j.setColorFilter(c, PorterDuff.Mode.SRC_IN);
                        }
                        ColorStateList b = Y50.b(tabGroupUiToolbarView2.getContext(), j2 ? R.color.0_resource_name_obfuscated_res_0x7f070122 : R.color.0_resource_name_obfuscated_res_0x7f07012b);
                        tabGroupUiToolbarView2.g.setImageTintList(b);
                        tabGroupUiToolbarView2.a.setImageTintList(b);
                        EditText editText = tabGroupUiToolbarView2.l;
                        if (editText != null) {
                            editText.setTextColor(b);
                        }
                        ChromeImageView chromeImageView2 = tabGroupUiToolbarView2.h;
                        if (chromeImageView2 != null) {
                            chromeImageView2.setImageTintList(b);
                            return;
                        }
                        return;
                    }
                    ND2 nd2 = AbstractC5086ex3.e;
                    if (nd2 == fd2) {
                        c5774gx3.a.g.setImageResource(propertyModel3.h(nd2));
                        return;
                    }
                    PD2 pd23 = AbstractC5086ex3.f;
                    if (pd23 == fd2) {
                        int intValue = ((Integer) propertyModel3.i(pd23)).intValue();
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c5774gx3.b.s;
                        linearLayoutManager.i1(intValue - ((linearLayoutManager.T0() - linearLayoutManager.R0()) / 2), 0);
                        return;
                    }
                    PD2 pd24 = AbstractC5086ex3.g;
                    if (pd24 == fd2) {
                        c5774gx3.a.g.setContentDescription((String) propertyModel3.i(pd24));
                        return;
                    }
                    PD2 pd25 = AbstractC5086ex3.h;
                    if (pd25 == fd2) {
                        c5774gx3.a.a.setContentDescription((String) propertyModel3.i(pd25));
                    }
                }
            });
            boolean e = AbstractC5177fD3.e(aVar);
            InterfaceC10590uz3 interfaceC10590uz3 = c1933Ow3.r;
            if (!e || c1933Ow3.l == null) {
                c0759Fv3 = null;
            } else {
                Activity activity = c1933Ow3.a;
                C0759Fv3 c0759Fv32 = new C0759Fv3(activity, interfaceC10590uz3, c1933Ow3.x, c1933Ow3.v, (ViewGroup) activity.findViewById(R.id.coordinator), null, null, null, c1933Ow3.u, c1933Ow3.l, c1933Ow3.q);
                c1933Ow3.z = c0759Fv32;
                c0759Fv32.b(c1933Ow3.g, interfaceC10590uz3, c1933Ow3.x, c1933Ow3.A.a.D);
                C0759Fv3 c0759Fv33 = c1933Ow3.z;
                c0759Fv33.getClass();
                c0759Fv3 = c0759Fv33;
            }
            c1933Ow3.B = new C4742dx3(c1933Ow3.a, ib, c1933Ow3, propertyModel2, c1933Ow3.r, c1933Ow3.v, c1933Ow3.s, c1933Ow3.i, c0759Fv3, c1933Ow3.o, c1933Ow3.t, c1933Ow3.m);
            if (AbstractC7492lx3.a == null) {
                Activity activity2 = ApplicationStatus.c;
                if (activity2 instanceof ChromeTabbedActivity) {
                    AbstractC7492lx3.a = new C7148kx3((AbstractC11276wz3) ((ChromeTabbedActivity) activity2).s1());
                }
            }
            if (!AbstractC5177fD3.a()) {
                ((AbstractC11276wz3) interfaceC10590uz3).j(false).g(new C1803Nw3(c1933Ow3));
                if (i == null) {
                    return;
                }
            } else if (i == null) {
                return;
            }
            i.close();
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        InterfaceC1543Lw3 interfaceC1543Lw3 = this.g;
        if (interfaceC1543Lw3 != null) {
            ((C1933Ow3) interfaceC1543Lw3).h();
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        InterfaceC1543Lw3 interfaceC1543Lw3 = this.g;
        return interfaceC1543Lw3 == null ? new C8385oa2() : ((C1933Ow3) interfaceC1543Lw3).r();
    }
}
