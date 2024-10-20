package org.chromium.chrome.browser.autofill.settings;

import J.N;
import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC8134nq;
import defpackage.C12256zr;
import defpackage.C3199Yq;
import defpackage.C7928nE;
import defpackage.EI2;
import defpackage.H53;
import defpackage.UN;
import defpackage.ViewOnClickListenerC0605Er;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.autofill.settings.AutofillServerCardEditor;
import org.chromium.chrome.browser.autofill.settings.VirtualCardEnrollmentFields;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillServerCardEditor extends AbstractC8134nq {
    public static final /* synthetic */ int p0 = 0;
    public View h0;
    public View i0;
    public TextView j0;
    public boolean k0;
    public C3199Yq l0;
    public boolean m0;
    public boolean n0;
    public C12256zr o0;

    @Override // org.chromium.chrome.browser.autofill.settings.AutofillEditorBase
    public final int M0() {
        return R.layout.0_resource_name_obfuscated_res_0x7f0e0058;
    }

    @Override // org.chromium.chrome.browser.autofill.settings.AutofillEditorBase
    public final int N0(boolean z) {
        return R.string.0_resource_name_obfuscated_res_0x7f140231;
    }

    public static void Q0(int i, int i2) {
        StringBuilder sb = new StringBuilder("Autofill.SettingsPage.ButtonClicked.");
        String str = "None";
        sb.append(i != 1 ? i != 2 ? "None" : "VirtualCard" : "ServerCard");
        sb.append(".");
        if (i2 == 1) {
            str = "EditCard";
        } else if (i2 == 2) {
            str = "VirtualCardEnroll";
        } else if (i2 == 3) {
            str = "VirtualCardUnenroll";
        }
        sb.append(str);
        EI2.b(sb.toString(), true);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [zr] */
    @Override // androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("AutofillEnableUpdateVirtualCardEnrollment")) {
            this.l0 = new C3199Yq(Profile.d());
            this.o0 = new Callback() { // from class: zr
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Boolean bool = (Boolean) obj;
                    AutofillServerCardEditor autofillServerCardEditor = AutofillServerCardEditor.this;
                    if (autofillServerCardEditor.n0) {
                        C3199Yq c3199Yq = autofillServerCardEditor.l0;
                        long j = c3199Yq.a;
                        if (j != 0) {
                            N.MgCnSGKp(j);
                            c3199Yq.a = 0L;
                            return;
                        }
                        return;
                    }
                    autofillServerCardEditor.m0 = false;
                    if (!bool.booleanValue()) {
                        autofillServerCardEditor.j0.setEnabled(true);
                        return;
                    }
                    autofillServerCardEditor.k0 = !autofillServerCardEditor.k0;
                    autofillServerCardEditor.j0.setEnabled(true);
                    autofillServerCardEditor.j0.setText(autofillServerCardEditor.k0 ? R.string.0_resource_name_obfuscated_res_0x7f14020d : R.string.0_resource_name_obfuscated_res_0x7f14020e);
                }
            };
        }
    }

    @Override // defpackage.AbstractC8134nq, org.chromium.chrome.browser.autofill.settings.AutofillEditorBase, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View i0 = super.i0(layoutInflater, viewGroup, bundle);
        if (this.e0 == null) {
            getActivity().finish();
            return i0;
        }
        ((TextView) i0.findViewById(R.id.title)).setText(this.e0.g);
        ((TextView) i0.findViewById(R.id.summary)).setText(this.e0.a(getActivity()));
        i0.findViewById(R.id.edit_server_card).setOnClickListener(new View.OnClickListener() { // from class: xr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = AutofillServerCardEditor.p0;
                AutofillServerCardEditor autofillServerCardEditor = AutofillServerCardEditor.this;
                AutofillServerCardEditor.Q0(autofillServerCardEditor.R0() ? 2 : 1, 1);
                CustomTabActivity.W1(autofillServerCardEditor.getActivity(), "https://payments.google.com/#paymentMethods");
            }
        });
        LinearLayout linearLayout = (LinearLayout) i0.findViewById(R.id.virtual_card_ui);
        this.j0 = (TextView) i0.findViewById(R.id.virtual_card_enrollment_button);
        if (R0()) {
            linearLayout.setVisibility(0);
            this.k0 = this.e0.getVirtualCardEnrollmentState() == 2;
            this.j0.setEnabled(true);
            this.j0.setText(this.k0 ? R.string.0_resource_name_obfuscated_res_0x7f14020d : R.string.0_resource_name_obfuscated_res_0x7f14020e);
            this.j0.setOnClickListener(new View.OnClickListener() { // from class: yr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = AutofillServerCardEditor.p0;
                    final AutofillServerCardEditor autofillServerCardEditor = AutofillServerCardEditor.this;
                    final ZX1 zx1 = new ZX1(new C4998ej(autofillServerCardEditor.getActivity()));
                    AutofillServerCardEditor.Q0(2, autofillServerCardEditor.k0 ? 3 : 2);
                    autofillServerCardEditor.j0.setEnabled(false);
                    if (!autofillServerCardEditor.k0) {
                        C3199Yq c3199Yq = autofillServerCardEditor.l0;
                        long instrumentId = autofillServerCardEditor.e0.getInstrumentId();
                        Callback callback = new Callback() { // from class: Ar
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj) {
                                return new ZE(this, obj);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj) {
                                ZX1 zx12 = zx1;
                                VirtualCardEnrollmentFields virtualCardEnrollmentFields = (VirtualCardEnrollmentFields) obj;
                                int i2 = AutofillServerCardEditor.p0;
                                final AutofillServerCardEditor autofillServerCardEditor2 = AutofillServerCardEditor.this;
                                autofillServerCardEditor2.getClass();
                                new C2424Sr(autofillServerCardEditor2.getActivity(), zx12, virtualCardEnrollmentFields, autofillServerCardEditor2.getActivity().getString(R.string.0_resource_name_obfuscated_res_0x7f140259), autofillServerCardEditor2.getActivity().getString(R.string.0_resource_name_obfuscated_res_0x7f1406d5), new InterfaceC2294Rr() { // from class: Cr
                                    @Override // defpackage.InterfaceC2294Rr
                                    public final void a(int i3, String str) {
                                        int i4 = AutofillServerCardEditor.p0;
                                        AutofillServerCardEditor autofillServerCardEditor3 = AutofillServerCardEditor.this;
                                        autofillServerCardEditor3.getClass();
                                        EI2.h(i3, 3, "Autofill.VirtualCard.SettingsPageEnrollment.LinkClicked");
                                        CustomTabActivity.W1(autofillServerCardEditor3.getActivity(), str);
                                    }
                                }, new Callback() { // from class: Dr
                                    @Override // org.chromium.base.Callback
                                    public final ZE e0(Object obj2) {
                                        return new ZE(this, obj2);
                                    }

                                    @Override // org.chromium.base.Callback
                                    public final void onResult(Object obj2) {
                                        int i3 = AutofillServerCardEditor.p0;
                                        AutofillServerCardEditor autofillServerCardEditor3 = AutofillServerCardEditor.this;
                                        autofillServerCardEditor3.getClass();
                                        if (((Integer) obj2).intValue() == 1) {
                                            EI2.b("Autofill.VirtualCard.SettingsPageEnrollment", true);
                                            C3199Yq c3199Yq2 = autofillServerCardEditor3.l0;
                                            C12256zr c12256zr = autofillServerCardEditor3.o0;
                                            long j = c3199Yq2.a;
                                            if (j == 0) {
                                                throw new IllegalStateException("The native delegate was cleaned up or not initialized.");
                                            }
                                            N.MTA0Nx58(j, c12256zr);
                                            autofillServerCardEditor3.m0 = true;
                                            return;
                                        }
                                        EI2.b("Autofill.VirtualCard.SettingsPageEnrollment", false);
                                        autofillServerCardEditor3.j0.setEnabled(true);
                                    }
                                }).a();
                            }
                        };
                        long j = c3199Yq.a;
                        if (j == 0) {
                            throw new IllegalStateException("The native delegate was cleaned up or not initialized.");
                        }
                        N.MyTpmSWv(j, instrumentId, callback);
                        return;
                    }
                    Activity activity = autofillServerCardEditor.getActivity();
                    final C3074Xr c3074Xr = new C3074Xr(activity, new Callback() { // from class: Br
                        public /* synthetic */ C0215Br() {
                        }

                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            int i2 = AutofillServerCardEditor.p0;
                            AutofillServerCardEditor autofillServerCardEditor2 = AutofillServerCardEditor.this;
                            autofillServerCardEditor2.getClass();
                            if (((Boolean) obj).booleanValue()) {
                                C3199Yq c3199Yq2 = autofillServerCardEditor2.l0;
                                long instrumentId2 = autofillServerCardEditor2.e0.getInstrumentId();
                                C12256zr c12256zr = autofillServerCardEditor2.o0;
                                long j2 = c3199Yq2.a;
                                if (j2 == 0) {
                                    throw new IllegalStateException("The native delegate was cleaned up or not initialized.");
                                }
                                N.MnSf6709(j2, instrumentId2, c12256zr);
                                autofillServerCardEditor2.m0 = true;
                                return;
                            }
                            autofillServerCardEditor2.j0.setEnabled(true);
                        }
                    }, zx1);
                    C2998Xb3 c2998Xb3 = new C2998Xb3(zx1, new Callback() { // from class: Vr
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            Integer num = (Integer) obj;
                            C3074Xr c3074Xr2 = C3074Xr.this;
                            c3074Xr2.getClass();
                            EI2.b("Autofill.VirtualCard.SettingsPageUnenrollment", num.intValue() == 1);
                            c3074Xr2.b.onResult(Boolean.valueOf(num.intValue() == 1));
                        }
                    });
                    HashMap e = PropertyModel.e(AbstractC4249cY1.B);
                    JD2 jd2 = AbstractC4249cY1.a;
                    GD2 gd2 = new GD2();
                    gd2.a = c2998Xb3;
                    e.put(jd2, gd2);
                    PD2 pd2 = AbstractC4249cY1.c;
                    String string = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f14022e);
                    GD2 gd22 = new GD2();
                    gd22.a = string;
                    e.put(pd2, gd22);
                    PD2 pd22 = AbstractC4249cY1.f;
                    SpannableString d = AbstractC1774Nr.d(activity, R.string.0_resource_name_obfuscated_res_0x7f14022c, new Callback() { // from class: Wr
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            C3074Xr c3074Xr2 = C3074Xr.this;
                            c3074Xr2.getClass();
                            EI2.h(2, 3, "Autofill.VirtualCard.SettingsPageUnenrollment.LinkClicked");
                            CustomTabActivity.W1(c3074Xr2.a, (String) obj);
                        }
                    });
                    GD2 gd23 = new GD2();
                    gd23.a = d;
                    e.put(pd22, gd23);
                    PD2 pd23 = AbstractC4249cY1.j;
                    String string2 = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f14022d);
                    GD2 gd24 = new GD2();
                    gd24.a = string2;
                    e.put(pd23, gd24);
                    PD2 pd24 = AbstractC4249cY1.n;
                    String string3 = activity.getString(android.R.string.cancel);
                    GD2 gd25 = new GD2();
                    gd25.a = string3;
                    zx1.l(AbstractC5266fV2.a(e, pd24, gd25, e), 1, false);
                }
            });
        } else {
            linearLayout.setVisibility(8);
        }
        this.h0 = i0.findViewById(R.id.local_copy_label);
        this.i0 = i0.findViewById(R.id.clear_local_copy);
        if (this.e0.getIsCached()) {
            this.i0.setOnClickListener(new ViewOnClickListenerC0605Er(this));
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.i0.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.h0);
                viewGroup2.removeView(this.i0);
            }
        }
        P0(i0);
        return i0;
    }

    public final boolean R0() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("AutofillEnableUpdateVirtualCardEnrollment") && (this.e0.getVirtualCardEnrollmentState() == 2 || this.e0.getVirtualCardEnrollmentState() == 4);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (adapterView != this.f0 || i == this.g0) {
            return;
        }
        ((Button) this.L.findViewById(R.id.button_primary)).setEnabled(true);
    }

    @Override // org.chromium.chrome.browser.autofill.settings.AutofillEditorBase
    public final boolean O0() {
        if (this.f0.getSelectedItem() == null || !(this.f0.getSelectedItem() instanceof PersonalDataManager.AutofillProfile)) {
            return true;
        }
        this.e0.l = ((PersonalDataManager.AutofillProfile) this.f0.getSelectedItem()).getGUID();
        PersonalDataManager d = PersonalDataManager.d();
        PersonalDataManager.CreditCard creditCard = this.e0;
        d.getClass();
        Object obj = ThreadUtils.a;
        N.MmUEbunT(d.a, d, creditCard);
        H53 a = H53.a();
        PersonalDataManager.CreditCard creditCard2 = this.e0;
        a.getClass();
        H53.b(creditCard2);
        return true;
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("AutofillEnableUpdateVirtualCardEnrollment")) {
            if (this.m0) {
                this.n0 = true;
                return;
            }
            C3199Yq c3199Yq = this.l0;
            long j = c3199Yq.a;
            if (j != 0) {
                N.MgCnSGKp(j);
                c3199Yq.a = 0L;
            }
        }
    }
}
