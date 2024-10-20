package org.chromium.chrome.browser.password_check;

import J.N;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC1872Ok2;
import defpackage.AbstractC1996Pj1;
import defpackage.AbstractC4326cl2;
import defpackage.AbstractC4670dl2;
import defpackage.AbstractC5013el2;
import defpackage.AbstractC5357fl2;
import defpackage.C10159tk2;
import defpackage.C11674y84;
import defpackage.C1293Jy2;
import defpackage.C1612Mk2;
import defpackage.C2392Sk2;
import defpackage.C3983bl2;
import defpackage.C5175fD1;
import defpackage.C7272lK1;
import defpackage.EI2;
import defpackage.GD2;
import defpackage.InterfaceC0963Hk2;
import defpackage.JD2;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.YH2;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.password_check.CompromisedCredential;
import org.chromium.chrome.browser.password_check.PasswordCheckDeletionDialogFragment;
import org.chromium.chrome.browser.password_check.PasswordCheckFragmentView;
import org.chromium.chrome.browser.password_check.PasswordCheckViewDialogFragment;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordCheckFragmentView extends AbstractC0123Ay2 {
    public C1612Mk2 j0;
    public int k0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        int i;
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1407e6);
        C1293Jy2 c1293Jy2 = this.c0;
        Q0(c1293Jy2.a(c1293Jy2.a));
        if (bundle != null && bundle.containsKey("password-check-referrer")) {
            i = bundle.getInt("password-check-referrer");
        } else {
            i = this.l.getInt("password-check-referrer");
        }
        this.k0 = i;
        F0();
    }

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menu.add(0, R.id.menu_id_targeted_help, 0, R.string.0_resource_name_obfuscated_res_0x7f140629).setIcon(C11674y84.b(N(), R.drawable.0_resource_name_obfuscated_res_0x7f09023a, getActivity().getTheme()));
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void t0() {
        super.t0();
        final C1612Mk2 c1612Mk2 = this.j0;
        if (c1612Mk2.f == null) {
            HashMap e = PropertyModel.e(AbstractC5357fl2.f);
            JD2 jd2 = AbstractC5357fl2.a;
            C5175fD1 c5175fD1 = new C5175fD1();
            GD2 gd2 = new GD2();
            gd2.a = c5175fD1;
            PropertyModel a = AbstractC1996Pj1.a(e, jd2, gd2, e);
            c1612Mk2.f = a;
            TD2 td2 = new TD2() { // from class: Kk2
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PD2 pd2;
                    PD2 pd22;
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    PasswordCheckFragmentView passwordCheckFragmentView = (PasswordCheckFragmentView) obj;
                    FD2 fd2 = (FD2) obj2;
                    JD2 jd22 = AbstractC5357fl2.a;
                    if (fd2 == jd22) {
                        passwordCheckFragmentView.d0.n0(new RK2(new C5648gc3((C5175fD1) propertyModel.i(jd22), new InterfaceC5992hc3() { // from class: hl2
                            @Override // defpackage.InterfaceC5992hc3
                            public final int a(Object obj3) {
                                return ((C7272lK1) obj3).a;
                            }
                        }, new InterfaceC5304fc3() { // from class: jl2
                            @Override // defpackage.InterfaceC5304fc3
                            public final void a(Object obj3, Object obj4) {
                                C10508ul2 c10508ul2 = (C10508ul2) obj3;
                                new UD2(((C7272lK1) obj4).b, c10508ul2.a, c10508ul2.z, true);
                            }
                        }), new QK2() { // from class: kl2
                            @Override // defpackage.QK2
                            public final Object a(int i, RecyclerView recyclerView) {
                                if (i == 1) {
                                    return new C10508ul2(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e01df, new TD2() { // from class: ll2
                                        @Override // defpackage.TD2
                                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                                            PropertyModel propertyModel2 = (PropertyModel) wd22;
                                            View view = (View) obj3;
                                            FD2 fd22 = (FD2) obj4;
                                            PD2 pd23 = AbstractC5013el2.a;
                                            Pair pair = (Pair) propertyModel2.i(pd23);
                                            ND2 nd2 = AbstractC5013el2.b;
                                            int h = propertyModel2.h(nd2);
                                            PD2 pd24 = AbstractC5013el2.c;
                                            Long l = (Long) propertyModel2.i(pd24);
                                            PD2 pd25 = AbstractC5013el2.d;
                                            Integer num = (Integer) propertyModel2.i(pd25);
                                            JD2 jd23 = AbstractC5013el2.e;
                                            Runnable runnable = (Runnable) propertyModel2.i(jd23);
                                            LD2 ld2 = AbstractC5013el2.g;
                                            boolean j = propertyModel2.j(ld2);
                                            if (fd22 == pd23) {
                                                AbstractC9822sl2.f(view, h, num, l, pair, runnable);
                                                return;
                                            }
                                            if (fd22 == nd2) {
                                                final Runnable runnable2 = (Runnable) propertyModel2.i(AbstractC5013el2.f);
                                                ImageButton imageButton = (ImageButton) view.findViewById(R.id.check_status_restart_button);
                                                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.check_status_text_layout);
                                                boolean z = h == 0 || h == 3 || h == 8;
                                                ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).setMarginEnd(z ? 0 : view.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0800dc));
                                                imageButton.setVisibility(z ? 0 : 8);
                                                imageButton.setOnClickListener(z ? new View.OnClickListener() { // from class: ql2
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        runnable2.run();
                                                    }
                                                } : null);
                                                imageButton.setClickable(z);
                                                AbstractC9822sl2.c(view, h, num);
                                                AbstractC9822sl2.d(view, h, num);
                                                AbstractC9822sl2.f(view, h, num, l, pair, runnable);
                                                AbstractC9822sl2.e(view, h, j, num);
                                                return;
                                            }
                                            if (fd22 == pd24) {
                                                AbstractC9822sl2.f(view, h, num, l, pair, runnable);
                                                return;
                                            }
                                            if (fd22 == pd25) {
                                                AbstractC9822sl2.c(view, h, num);
                                                AbstractC9822sl2.d(view, h, num);
                                                AbstractC9822sl2.f(view, h, num, l, pair, runnable);
                                                AbstractC9822sl2.e(view, h, j, num);
                                                return;
                                            }
                                            if (fd22 == jd23 || fd22 == AbstractC5013el2.f || fd22 != ld2) {
                                                return;
                                            }
                                            AbstractC9822sl2.e(view, h, j, num);
                                        }
                                    });
                                }
                                if (i == 2) {
                                    return new C10508ul2(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e01dd, new TD2() { // from class: ml2
                                        @Override // defpackage.TD2
                                        public final void d(WD2 wd22, Object obj3, Object obj4) {
                                            AbstractC9822sl2.a((PropertyModel) wd22, (View) obj3, (FD2) obj4);
                                        }
                                    });
                                }
                                if (i != 3) {
                                    return null;
                                }
                                return new C10508ul2(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e01de, new TD2() { // from class: ml2
                                    @Override // defpackage.TD2
                                    public final void d(WD2 wd22, Object obj3, Object obj4) {
                                        AbstractC9822sl2.a((PropertyModel) wd22, (View) obj3, (FD2) obj4);
                                    }
                                });
                            }
                        }));
                        return;
                    }
                    PD2 pd23 = AbstractC5357fl2.b;
                    PD2 pd24 = AbstractC5357fl2.c;
                    if (fd2 == pd23) {
                        if (propertyModel.i(pd23) == null) {
                            return;
                        }
                        new PasswordCheckDeletionDialogFragment((InterfaceDialogInterfaceOnClickListenerC1742Nk2) propertyModel.i(pd23), (String) propertyModel.i(pd24)).Q0(passwordCheckFragmentView.M(), null);
                    } else {
                        if (fd2 == pd24 || fd2 == (pd2 = AbstractC5357fl2.d) || fd2 != (pd22 = AbstractC5357fl2.e) || propertyModel.i(pd22) == null) {
                            return;
                        }
                        new PasswordCheckViewDialogFragment((InterfaceDialogInterfaceOnClickListenerC1742Nk2) propertyModel.i(pd22), (CompromisedCredential) propertyModel.i(pd2)).Q0(passwordCheckFragmentView.M(), null);
                    }
                }
            };
            PasswordCheckFragmentView passwordCheckFragmentView = c1612Mk2.b;
            UD2.a(a, passwordCheckFragmentView, td2);
            PropertyModel propertyModel = c1612Mk2.f;
            InterfaceC0963Hk2 b = AbstractC1872Ok2.b(c1612Mk2.c);
            int i = passwordCheckFragmentView.k0;
            Runnable runnable = new Runnable() { // from class: Jk2
                @Override // java.lang.Runnable
                public final void run() {
                    C1612Mk2 c1612Mk22 = C1612Mk2.this;
                    InterfaceC0963Hk2 b2 = AbstractC1872Ok2.b(c1612Mk22.c);
                    N.M2leB6Ho(((C2392Sk2) b2).a.a, c1612Mk22.b.getActivity());
                }
            };
            C3983bl2 c3983bl2 = c1612Mk2.e;
            c3983bl2.d = propertyModel;
            c3983bl2.e = b;
            c3983bl2.f = runnable;
            c3983bl2.k = false;
            EI2.h(i, 4, "PasswordManager.BulkCheck.PasswordCheckReferrerAndroid");
            EI2.h(i, 4, "PasswordManager.BulkCheck.PasswordCheckReferrerAndroid2");
            boolean z = i != 1;
            c3983bl2.a(z ? 1 : ((C2392Sk2) c3983bl2.f()).f);
            ((C2392Sk2) c3983bl2.f()).a(c3983bl2, true);
            if (z) {
                AbstractC4326cl2.b(0);
                N.MqdzTSiP(((C2392Sk2) c3983bl2.f()).a.a);
            }
        }
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putInt("password-check-referrer", this.k0);
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        C1612Mk2 c1612Mk2 = this.j0;
        c1612Mk2.getClass();
        if (menuItem.getItemId() != R.id.menu_id_targeted_help) {
            return false;
        }
        PasswordCheckFragmentView passwordCheckFragmentView = c1612Mk2.b;
        c1612Mk2.a.d(passwordCheckFragmentView.getActivity(), passwordCheckFragmentView.getActivity().getString(R.string.0_resource_name_obfuscated_res_0x7f1404e6), null, Profile.d());
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        C1612Mk2 c1612Mk2 = this.j0;
        c1612Mk2.e.k = false;
        C10159tk2 c10159tk2 = c1612Mk2.d;
        Callback callback = c10159tk2.c;
        if (callback != null) {
            callback.onResult(Boolean.valueOf(YH2.a(0)));
            c10159tk2.c = null;
        }
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        C1612Mk2 c1612Mk2 = this.j0;
        C2392Sk2 c2392Sk2 = AbstractC1872Ok2.a;
        JD2 jd2 = AbstractC5357fl2.a;
        C3983bl2 c3983bl2 = c1612Mk2.e;
        if (c2392Sk2 == null) {
            c3983bl2.getClass();
        } else {
            boolean z = false;
            if (((C5175fD1) c3983bl2.d.i(jd2)).get(0) != null && ((C7272lK1) ((C5175fD1) c3983bl2.d.i(jd2)).get(0)).b.h(AbstractC5013el2.b) == 1) {
                z = true;
            }
            if (z) {
                AbstractC4326cl2.b(2);
            }
            N.MbiHHiCX(c2392Sk2.a.a);
        }
        PasswordCheckFragmentView passwordCheckFragmentView = c1612Mk2.b;
        if (passwordCheckFragmentView.getActivity() == null || passwordCheckFragmentView.getActivity().isFinishing()) {
            if (!c3983bl2.k) {
                C5175fD1 c5175fD1 = (C5175fD1) c3983bl2.d.i(jd2);
                for (int i = 1; i < c5175fD1.size(); i++) {
                    AbstractC4326cl2.a(4, (CompromisedCredential) ((C7272lK1) c5175fD1.get(i)).b.i(AbstractC4670dl2.a));
                }
            }
            ((C2392Sk2) c3983bl2.f()).b.d(c3983bl2);
            c1612Mk2.f = null;
        }
        if (getActivity().isFinishing()) {
            int i2 = this.k0;
            if (i2 == 2 || i2 == 3) {
                this.j0.getClass();
                AbstractC1872Ok2.a();
            }
        }
    }
}
