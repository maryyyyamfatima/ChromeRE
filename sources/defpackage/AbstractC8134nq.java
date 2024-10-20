package defpackage;

import J.N;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.autofill.settings.AutofillEditorBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nq */
/* loaded from: classes.dex */
public abstract class AbstractC8134nq extends AutofillEditorBase {
    public PersonalDataManager.CreditCard e0;
    public Spinner f0;
    public int g0;

    @Override // org.chromium.chrome.browser.autofill.settings.AutofillEditorBase, androidx.fragment.app.c
    public View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View i0 = super.i0(layoutInflater, viewGroup, bundle);
        if (Build.VERSION.SDK_INT >= 26) {
            getActivity().getWindow().getDecorView().setImportantForAutofill(8);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        PersonalDataManager.AutofillProfile autofillProfile = new PersonalDataManager.AutofillProfile();
        autofillProfile.p = getActivity().getString(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f1409e9);
        arrayAdapter.add(autofillProfile);
        ArrayList f = PersonalDataManager.d().f();
        int i = 0;
        for (int i2 = 0; i2 < f.size(); i2++) {
            PersonalDataManager.AutofillProfile autofillProfile2 = (PersonalDataManager.AutofillProfile) f.get(i2);
            if (autofillProfile2.c && !TextUtils.isEmpty(autofillProfile2.getStreetAddress())) {
                arrayAdapter.add(autofillProfile2);
            }
        }
        Spinner spinner = (Spinner) i0.findViewById(com.android.chrome.R.id.autofill_credit_card_editor_billing_address_spinner);
        this.f0 = spinner;
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        if (arrayAdapter.getCount() == 1) {
            this.f0.setEnabled(false);
        }
        PersonalDataManager d = PersonalDataManager.d();
        String str = this.b0;
        d.getClass();
        Object obj = ThreadUtils.a;
        PersonalDataManager.CreditCard creditCard = (PersonalDataManager.CreditCard) N.M3g2doJx(d.a, d, str);
        this.e0 = creditCard;
        if (creditCard != null && !TextUtils.isEmpty(creditCard.getBillingAddressId())) {
            while (true) {
                if (i >= this.f0.getAdapter().getCount()) {
                    break;
                }
                if (TextUtils.equals(((PersonalDataManager.AutofillProfile) this.f0.getAdapter().getItem(i)).getGUID(), this.e0.getBillingAddressId())) {
                    this.g0 = i;
                    this.f0.setSelection(i);
                    break;
                }
                i++;
            }
        }
        return i0;
    }

    public void P0(View view) {
        ((Button) view.findViewById(com.android.chrome.R.id.button_secondary)).setOnClickListener(new ViewOnClickListenerC12250zq(this));
        Button button = (Button) view.findViewById(com.android.chrome.R.id.button_primary);
        button.setOnClickListener(new ViewOnClickListenerC0080Aq(this));
        button.setEnabled(false);
        this.f0.setOnItemSelectedListener(this);
        this.f0.setOnTouchListener(this);
    }
}
