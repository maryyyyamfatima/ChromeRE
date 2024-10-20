package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import org.chromium.chrome.browser.feed.sections.SectionHeaderView;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o13 */
/* loaded from: classes.dex */
public final class C8202o13 implements TD2, InterfaceC5863hD1 {
    @Override // defpackage.InterfaceC5863hD1
    public final void a(InterfaceC7925nD1 interfaceC7925nD1, Object obj, int i, int i2) {
        C12042zD2 c12042zD2 = (C12042zD2) interfaceC7925nD1;
        SectionHeaderView sectionHeaderView = (SectionHeaderView) obj;
        for (int i3 = i; i3 < i2 + i; i3++) {
            TabLayout tabLayout = sectionHeaderView.g;
            if (tabLayout != null) {
                C0249Bx3 m = tabLayout.m();
                m.f = LayoutInflater.from(m.h.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01b4, (ViewGroup) m.h, false);
                m.e();
                m.a = new C7514m13();
                sectionHeaderView.g.c(m);
                m.h.setClipToPadding(false);
                m.h.setClipChildren(false);
            }
        }
        g(c12042zD2, sectionHeaderView, i, i2, null);
    }

    @Override // defpackage.InterfaceC5863hD1
    public final void b(InterfaceC7925nD1 interfaceC7925nD1, Object obj, int i, int i2) {
        SectionHeaderView sectionHeaderView = (SectionHeaderView) obj;
        if (((C12042zD2) interfaceC7925nD1).size() == 0) {
            TabLayout tabLayout = sectionHeaderView.g;
            if (tabLayout != null) {
                tabLayout.o();
                return;
            }
            return;
        }
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i) {
                return;
            }
            TabLayout tabLayout2 = sectionHeaderView.g;
            if (tabLayout2 != null) {
                tabLayout2.p(i3);
            }
        }
    }

    @Override // defpackage.InterfaceC5863hD1
    public final /* bridge */ /* synthetic */ void c(InterfaceC7925nD1 interfaceC7925nD1, int i, Object obj, Object obj2, int i2) {
        g((C12042zD2) interfaceC7925nD1, (SectionHeaderView) obj, i, i2, (FD2) obj2);
    }

    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        final SectionHeaderView sectionHeaderView = (SectionHeaderView) obj;
        FD2 fd2 = (FD2) obj2;
        LD2 ld2 = AbstractC4077c13.a;
        if (fd2 == ld2) {
            boolean j = propertyModel.j(ld2);
            sectionHeaderView.m = j;
            if (sectionHeaderView.g != null) {
                while (r1 < sectionHeaderView.g.l()) {
                    sectionHeaderView.a(sectionHeaderView.g.k(r1));
                    r1++;
                }
                sectionHeaderView.g.setEnabled(j);
            }
            sectionHeaderView.h.setEnabled(j);
            if (j) {
                h(propertyModel, sectionHeaderView);
                return;
            }
            return;
        }
        if (fd2 == AbstractC4077c13.c) {
            h(propertyModel, sectionHeaderView);
            return;
        }
        PD2 pd2 = AbstractC4077c13.d;
        if (fd2 == pd2) {
            OK0 ok0 = (OK0) propertyModel.i(pd2);
            C7170l13 c7170l13 = sectionHeaderView.j;
            if (c7170l13 != null) {
                c7170l13.a = ok0;
                return;
            }
            return;
        }
        PD2 pd22 = AbstractC4077c13.f;
        PD2 pd23 = AbstractC4077c13.e;
        if (fd2 == pd22 || fd2 == pd23) {
            final C7616mK1 c7616mK1 = (C7616mK1) propertyModel.i(pd23);
            final SC1 sc1 = (SC1) propertyModel.i(pd22);
            sectionHeaderView.i.setOnClickListener(new View.OnClickListener() { // from class: f13
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SC1 sc12;
                    int i = SectionHeaderView.o;
                    SectionHeaderView sectionHeaderView2 = SectionHeaderView.this;
                    sectionHeaderView2.getClass();
                    AbstractC6588jL0.a(4);
                    C7616mK1 c7616mK12 = c7616mK1;
                    if (c7616mK12 == null || (sc12 = sc1) == null) {
                        return;
                    }
                    sectionHeaderView2.i.e(new C6826k13(new C4738dx(sectionHeaderView2.i.getContext(), c7616mK12, sc12)), true);
                    ListMenuButton listMenuButton = sectionHeaderView2.i;
                    listMenuButton.o = true;
                    listMenuButton.f();
                }
            });
            return;
        }
        LD2 ld22 = AbstractC4077c13.g;
        if (fd2 == ld22) {
            boolean j2 = propertyModel.j(ld22);
            if (sectionHeaderView.g != null) {
                sectionHeaderView.h.setVisibility(j2 ? 8 : 0);
                sectionHeaderView.g.setVisibility(j2 ? 0 : 8);
                return;
            }
            return;
        }
        PD2 pd24 = AbstractC4077c13.i;
        if (fd2 == pd24) {
            Ve4 ve4 = (Ve4) propertyModel.i(pd24);
            ImageView imageView = sectionHeaderView.a;
            if (imageView != null) {
                int ordinal = ve4.ordinal();
                imageView.setVisibility(ordinal != 0 ? ordinal != 1 ? 8 : 4 : 0);
                return;
            }
            return;
        }
        LD2 ld23 = AbstractC4077c13.h;
        if (fd2 == ld23) {
            boolean j3 = propertyModel.j(ld23);
            ImageView imageView2 = sectionHeaderView.a;
            if (imageView2 == null) {
                return;
            }
            if (j3) {
                imageView2.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f09024f);
                sectionHeaderView.a.setImageTintMode(PorterDuff.Mode.DST);
                return;
            } else {
                imageView2.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f090338);
                sectionHeaderView.a.setImageTintMode(PorterDuff.Mode.SRC_IN);
                return;
            }
        }
        PD2 pd25 = AbstractC4077c13.j;
        if (fd2 == pd25) {
            View view = (View) propertyModel.i(pd25);
            View view2 = sectionHeaderView.l;
            if (view2 != null) {
                sectionHeaderView.removeView(view2);
            }
            sectionHeaderView.addView(view);
            sectionHeaderView.l = view;
            return;
        }
        ID2 id2 = AbstractC4077c13.k;
        if (fd2 == id2) {
            sectionHeaderView.n = propertyModel.h(id2);
        }
    }

    public static void h(PropertyModel propertyModel, SectionHeaderView sectionHeaderView) {
        ND2 nd2 = AbstractC4077c13.c;
        if (propertyModel.h(nd2) <= ((C12042zD2) propertyModel.i(AbstractC4077c13.b)).size()) {
            int h = propertyModel.h(nd2);
            TabLayout tabLayout = sectionHeaderView.g;
            C0249Bx3 k = tabLayout != null ? tabLayout.k(h) : null;
            if (k == null || sectionHeaderView.g.j() == h) {
                return;
            }
            sectionHeaderView.g.r(k, true);
        }
    }

    public static void g(C12042zD2 c12042zD2, SectionHeaderView sectionHeaderView, int i, int i2, FD2 fd2) {
        PropertyModel propertyModel = (PropertyModel) c12042zD2.get(0);
        LD2 ld2 = AbstractC4421d13.b;
        PD2 pd2 = AbstractC4421d13.a;
        if (fd2 == null || fd2 == pd2 || fd2 == ld2) {
            sectionHeaderView.h.setText((String) propertyModel.i(pd2));
            for (int i3 = i; i3 < i + i2; i3++) {
                PropertyModel propertyModel2 = (PropertyModel) c12042zD2.get(i3);
                boolean j = propertyModel2.j(ld2);
                String str = (String) propertyModel2.i(pd2);
                TabLayout tabLayout = sectionHeaderView.g;
                C0249Bx3 k = tabLayout != null ? tabLayout.k(i3) : null;
                if (k != null) {
                    C7514m13 c7514m13 = (C7514m13) k.a;
                    c7514m13.c = str;
                    c7514m13.a = j;
                    sectionHeaderView.a(k);
                }
            }
        }
        PD2 pd22 = AbstractC4421d13.c;
        if (fd2 == null || fd2 == pd22) {
            for (int i4 = i; i4 < i + i2; i4++) {
                Ve4 ve4 = (Ve4) ((PropertyModel) c12042zD2.get(i4)).i(pd22);
                TabLayout tabLayout2 = sectionHeaderView.g;
                C0249Bx3 k2 = tabLayout2 != null ? tabLayout2.k(i4) : null;
                if (k2 != null) {
                    if (ve4 == Ve4.GONE) {
                        k2.h.setPadding(k2.h.getPaddingLeft(), 0, sectionHeaderView.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f08022c) + k2.h.getPaddingRight(), 0);
                    }
                    ImageView imageView = (ImageView) k2.h.findViewById(R.id.options_indicator);
                    int ordinal = ve4.ordinal();
                    imageView.setVisibility(ordinal != 0 ? ordinal != 1 ? 8 : 4 : 0);
                    if (ve4 == Ve4.VISIBLE) {
                        k2.c(((C7514m13) k2.a).c + sectionHeaderView.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1404ad));
                    } else {
                        k2.c(((C7514m13) k2.a).c);
                    }
                }
            }
        }
        LD2 ld22 = AbstractC4421d13.d;
        if (fd2 == null || fd2 == ld22) {
            for (int i5 = i; i5 < i + i2; i5++) {
                boolean j2 = ((PropertyModel) c12042zD2.get(i5)).j(ld22);
                TabLayout tabLayout3 = sectionHeaderView.g;
                if (tabLayout3 != null && tabLayout3.l() > i5) {
                    C0249Bx3 k3 = sectionHeaderView.g.k(i5);
                    ImageView imageView2 = (ImageView) k3.h.findViewById(R.id.options_indicator);
                    if (imageView2 != null) {
                        if (j2) {
                            Resources resources = sectionHeaderView.getResources();
                            Resources.Theme theme = sectionHeaderView.getContext().getTheme();
                            ThreadLocal threadLocal = GP2.a;
                            imageView2.setImageDrawable(resources.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f0903c1, theme));
                            k3.c(((C7514m13) k3.a).c + sectionHeaderView.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1404ae));
                        } else {
                            Resources resources2 = sectionHeaderView.getResources();
                            Resources.Theme theme2 = sectionHeaderView.getContext().getTheme();
                            ThreadLocal threadLocal2 = GP2.a;
                            imageView2.setImageDrawable(resources2.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f0903c0, theme2));
                            k3.c(((C7514m13) k3.a).c + sectionHeaderView.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1404ad));
                        }
                    }
                }
            }
        }
    }
}
