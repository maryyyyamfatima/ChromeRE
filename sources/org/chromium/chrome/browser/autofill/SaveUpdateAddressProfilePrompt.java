package org.chromium.chrome.browser.autofill;

import J.N;
import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC5266fV2;
import defpackage.C11939yv1;
import defpackage.C1634Mp;
import defpackage.C2998Xb3;
import defpackage.C7928nE;
import defpackage.DD2;
import defpackage.GD2;
import defpackage.ID2;
import defpackage.InterfaceC11596xv1;
import defpackage.JD2;
import defpackage.L7;
import defpackage.PD2;
import defpackage.UN;
import defpackage.ViewOnClickListenerC0501Dw0;
import defpackage.ZX1;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.autofill.SaveUpdateAddressProfilePrompt;
import org.chromium.chrome.browser.autofill.SaveUpdateAddressProfilePromptController;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SaveUpdateAddressProfilePrompt {
    public final SaveUpdateAddressProfilePromptController a;
    public final ZX1 b;
    public final PropertyModel c;
    public final View d;
    public final ViewOnClickListenerC0501Dw0 e;
    public final L7 f;
    public boolean g;

    public SaveUpdateAddressProfilePrompt(SaveUpdateAddressProfilePromptController saveUpdateAddressProfilePromptController, ZX1 zx1, Activity activity, Profile profile, PersonalDataManager.AutofillProfile autofillProfile, boolean z) {
        this.a = saveUpdateAddressProfilePromptController;
        this.b = zx1;
        View inflate = LayoutInflater.from(activity).inflate(z ? R.layout.0_resource_name_obfuscated_res_0x7f0e005b : R.layout.0_resource_name_obfuscated_res_0x7f0e0056, (ViewGroup) null);
        this.d = inflate;
        if (!z) {
            final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.nickname_input_layout);
            C7928nE c7928nE = UN.a;
            if (!N.M09VlOh_("AutofillAddressProfileSavePromptNicknameSupport")) {
                textInputLayout.setVisibility(8);
            } else {
                final EditText editText = (EditText) inflate.findViewById(R.id.nickname_input);
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: dV2
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        TextInputLayout.this.o((z2 || !TextUtils.isEmpty(editText.getText())) ? "Label" : "Add a label");
                    }
                });
                C11939yv1.g.a(new InterfaceC11596xv1() { // from class: eV2
                    @Override // defpackage.InterfaceC11596xv1
                    public final void g(boolean z2) {
                        if (z2) {
                            return;
                        }
                        EditText editText2 = editText;
                        if (editText2.hasFocus()) {
                            editText2.clearFocus();
                        }
                    }
                });
            }
        }
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        C2998Xb3 c2998Xb3 = new C2998Xb3(zx1, new Callback() { // from class: ZU2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                SaveUpdateAddressProfilePromptController saveUpdateAddressProfilePromptController2 = SaveUpdateAddressProfilePrompt.this.a;
                if (intValue == 1) {
                    long j = saveUpdateAddressProfilePromptController2.a;
                    if (j != 0) {
                        N.MDecxVDS(j, saveUpdateAddressProfilePromptController2);
                    }
                } else if (intValue == 2) {
                    long j2 = saveUpdateAddressProfilePromptController2.a;
                    if (j2 != 0) {
                        N.MnY8YSzO(j2, saveUpdateAddressProfilePromptController2);
                    }
                }
                long j3 = saveUpdateAddressProfilePromptController2.a;
                if (j3 != 0) {
                    N.M1OELO83(j3, saveUpdateAddressProfilePromptController2);
                }
            }
        });
        GD2 gd2 = new GD2();
        gd2.a = c2998Xb3;
        e.put(jd2, gd2);
        ID2 id2 = AbstractC4249cY1.v;
        DD2 dd2 = new DD2();
        dd2.a = 1;
        e.put(id2, dd2);
        PD2 pd2 = AbstractC4249cY1.h;
        GD2 gd22 = new GD2();
        gd22.a = inflate;
        this.c = AbstractC5266fV2.a(e, pd2, gd22, e);
        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = new ViewOnClickListenerC0501Dw0(activity, null, profile);
        this.e = viewOnClickListenerC0501Dw0;
        viewOnClickListenerC0501Dw0.t = true;
        L7 l7 = new L7(false);
        this.f = l7;
        l7.a = viewOnClickListenerC0501Dw0;
        l7.b = viewOnClickListenerC0501Dw0.getContext();
        final C1634Mp c1634Mp = new C1634Mp(activity, autofillProfile, 0);
        inflate.findViewById(R.id.edit_button).setOnClickListener(new View.OnClickListener() { // from class: aV2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final SaveUpdateAddressProfilePrompt saveUpdateAddressProfilePrompt = SaveUpdateAddressProfilePrompt.this;
                saveUpdateAddressProfilePrompt.getClass();
                saveUpdateAddressProfilePrompt.f.d(c1634Mp, new Callback() { // from class: bV2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        SaveUpdateAddressProfilePrompt saveUpdateAddressProfilePrompt2 = SaveUpdateAddressProfilePrompt.this;
                        saveUpdateAddressProfilePrompt2.g = true;
                        PersonalDataManager.AutofillProfile autofillProfile2 = ((C1634Mp) obj).q;
                        SaveUpdateAddressProfilePromptController saveUpdateAddressProfilePromptController2 = saveUpdateAddressProfilePrompt2.a;
                        long j = saveUpdateAddressProfilePromptController2.a;
                        if (j != 0) {
                            N.MvmusX4r(j, saveUpdateAddressProfilePromptController2, autofillProfile2);
                        }
                        saveUpdateAddressProfilePrompt2.b.c(3, saveUpdateAddressProfilePrompt2.c);
                    }
                }, new Callback() { // from class: cV2
                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                    }

                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }
                });
            }
        });
    }

    public final void show() {
        this.b.l(this.c, 1, false);
    }

    public static SaveUpdateAddressProfilePrompt create(WindowAndroid windowAndroid, SaveUpdateAddressProfilePromptController saveUpdateAddressProfilePromptController, Profile profile, PersonalDataManager.AutofillProfile autofillProfile, boolean z) {
        Activity activity = (Activity) windowAndroid.k().get();
        ZX1 s = windowAndroid.s();
        if (activity == null || s == null) {
            return null;
        }
        return new SaveUpdateAddressProfilePrompt(saveUpdateAddressProfilePromptController, s, activity, profile, autofillProfile, z);
    }

    public final void setDialogDetails(String str, String str2, String str3) {
        PropertyModel propertyModel = this.c;
        propertyModel.o(AbstractC4249cY1.c, str);
        propertyModel.o(AbstractC4249cY1.j, str2);
        propertyModel.o(AbstractC4249cY1.n, str3);
        this.f.r = str2;
    }

    public final void setSaveDetails(String str, String str2, String str3) {
        View view = this.d;
        a((TextView) view.findViewById(R.id.address), str);
        a((TextView) view.findViewById(R.id.email), str2);
        a((TextView) view.findViewById(R.id.phone), str3);
    }

    public final void setUpdateDetails(String str, String str2, String str3) {
        View view = this.d;
        a((TextView) view.findViewById(R.id.subtitle), str);
        boolean z = !TextUtils.isEmpty(str2);
        view.findViewById(R.id.header_new).setVisibility(z ? 0 : 8);
        view.findViewById(R.id.header_old).setVisibility(z ? 0 : 8);
        view.findViewById(R.id.no_header_space).setVisibility(z ? 8 : 0);
        a((TextView) view.findViewById(R.id.details_old), str2);
        a((TextView) view.findViewById(R.id.details_new), str3);
    }

    public final void dismiss() {
        if (!this.g) {
            ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = this.e;
            if (viewOnClickListenerC0501Dw0.isShowing()) {
                viewOnClickListenerC0501Dw0.dismiss();
            }
        }
        this.b.c(4, this.c);
    }

    public static void a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }
}
