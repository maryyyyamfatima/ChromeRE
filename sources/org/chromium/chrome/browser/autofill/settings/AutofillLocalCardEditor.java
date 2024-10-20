package org.chromium.chrome.browser.autofill.settings;

import J.N;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.android.chrome.R;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC8134nq;
import defpackage.C0396Db0;
import defpackage.C1380Kq;
import defpackage.F53;
import defpackage.FI2;
import defpackage.G53;
import defpackage.H53;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.autofill.settings.AutofillLocalCardEditor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillLocalCardEditor extends AbstractC8134nq {
    public Button h0;
    public TextInputLayout i0;
    public EditText j0;
    public TextInputLayout k0;
    public EditText l0;
    public TextInputLayout m0;
    public EditText n0;
    public Spinner o0;
    public Spinner p0;
    public boolean q0 = true;
    public int r0;
    public int s0;

    @Override // org.chromium.chrome.browser.autofill.settings.AutofillEditorBase
    public final int M0() {
        return R.layout.0_resource_name_obfuscated_res_0x7f0e0053;
    }

    @Override // org.chromium.chrome.browser.autofill.settings.AutofillEditorBase
    public final int N0(boolean z) {
        return z ? R.string.0_resource_name_obfuscated_res_0x7f140222 : R.string.0_resource_name_obfuscated_res_0x7f140231;
    }

    @Override // defpackage.AbstractC8134nq, org.chromium.chrome.browser.autofill.settings.AutofillEditorBase, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
        attributes.flags |= 8192;
        getActivity().getWindow().setAttributes(attributes);
        View i0 = super.i0(layoutInflater, viewGroup, bundle);
        this.h0 = (Button) i0.findViewById(R.id.button_primary);
        this.i0 = (TextInputLayout) i0.findViewById(R.id.credit_card_name_label);
        this.j0 = (EditText) i0.findViewById(R.id.credit_card_name_edit);
        this.k0 = (TextInputLayout) i0.findViewById(R.id.credit_card_nickname_label);
        this.l0 = (EditText) i0.findViewById(R.id.credit_card_nickname_edit);
        this.m0 = (TextInputLayout) i0.findViewById(R.id.credit_card_number_label);
        this.n0 = (EditText) i0.findViewById(R.id.credit_card_number_edit);
        this.l0.addTextChangedListener(new C1380Kq(this));
        this.l0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Jq
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                AutofillLocalCardEditor.this.k0.k(z);
            }
        });
        this.n0.addTextChangedListener(new C0396Db0());
        this.o0 = (Spinner) i0.findViewById(R.id.autofill_credit_card_editor_month_spinner);
        this.p0 = (Spinner) i0.findViewById(R.id.autofill_credit_card_editor_year_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item);
        Calendar calendar = Calendar.getInstance();
        boolean z = true;
        calendar.set(5, 1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM (MM)", Locale.getDefault());
        for (int i = 0; i < 12; i++) {
            calendar.set(2, i);
            arrayAdapter.add(simpleDateFormat.format(calendar.getTime()));
        }
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.o0.setAdapter((SpinnerAdapter) arrayAdapter);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item);
        int i2 = calendar.get(1);
        for (int i3 = i2; i3 < i2 + 10; i3++) {
            arrayAdapter2.add(Integer.toString(i3));
        }
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.p0.setAdapter((SpinnerAdapter) arrayAdapter2);
        PersonalDataManager.CreditCard creditCard = this.e0;
        if (creditCard == null) {
            this.m0.requestFocus();
        } else {
            if (!TextUtils.isEmpty(creditCard.getName())) {
                this.i0.i.setText(this.e0.getName());
            }
            if (!TextUtils.isEmpty(this.e0.getNumber())) {
                this.m0.i.setText(this.e0.getNumber());
            }
            this.i0.setFocusableInTouchMode(true);
            int parseInt = (!this.e0.getMonth().isEmpty() ? Integer.parseInt(this.e0.getMonth()) : 1) - 1;
            this.r0 = parseInt;
            this.o0.setSelection(parseInt);
            this.s0 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= this.p0.getAdapter().getCount()) {
                    z = false;
                    break;
                }
                if (this.e0.getYear().equals(this.p0.getAdapter().getItem(i4))) {
                    this.s0 = i4;
                    break;
                }
                i4++;
            }
            if (!z && !this.e0.getYear().isEmpty()) {
                ((ArrayAdapter) this.p0.getAdapter()).insert(this.e0.getYear(), 0);
                this.s0 = 0;
            }
            this.p0.setSelection(this.s0);
            if (!this.e0.getNickname().isEmpty()) {
                this.l0.setText(this.e0.getNickname());
            }
        }
        P0(i0);
        return i0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if ((adapterView != this.p0 || i == this.s0) && ((adapterView != this.o0 || i == this.r0) && (adapterView != this.f0 || i == this.g0))) {
            return;
        }
        Q0();
    }

    @Override // org.chromium.chrome.browser.autofill.settings.AutofillEditorBase, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Q0();
    }

    @Override // org.chromium.chrome.browser.autofill.settings.AutofillEditorBase
    public final boolean O0() {
        String replaceAll = this.n0.getText().toString().replaceAll("\\s+", "");
        PersonalDataManager d = PersonalDataManager.d();
        if (TextUtils.isEmpty(d.b(replaceAll, true))) {
            this.m0.l(this.d0.getString(R.string.0_resource_name_obfuscated_res_0x7f14080b));
            return false;
        }
        Object obj = ThreadUtils.a;
        long j = d.a;
        PersonalDataManager.CreditCard creditCard = (PersonalDataManager.CreditCard) N.MHzz0BSK(j, d, replaceAll);
        creditCard.a = this.b0;
        creditCard.b = "Chrome settings";
        creditCard.e = this.j0.getText().toString().trim();
        creditCard.h = String.valueOf(this.o0.getSelectedItemPosition() + 1);
        creditCard.i = (String) this.p0.getSelectedItem();
        creditCard.l = ((PersonalDataManager.AutofillProfile) this.f0.getSelectedItem()).getGUID();
        creditCard.p = this.l0.getText().toString().trim();
        creditCard.a = N.M7sdleUt(j, d, creditCard);
        H53.a().getClass();
        H53.b(creditCard);
        if (this.c0) {
            FI2.a("AutofillCreditCardsAdded");
            if (!creditCard.getNickname().isEmpty()) {
                FI2.a("AutofillCreditCardsAddedWithNickname");
            }
        }
        return true;
    }

    @Override // org.chromium.chrome.browser.autofill.settings.AutofillEditorBase
    public final void L0() {
        if (this.b0 != null) {
            PersonalDataManager d = PersonalDataManager.d();
            String str = this.b0;
            d.getClass();
            Object obj = ThreadUtils.a;
            N.MIAwuIe5(d.a, d, str);
            H53 a = H53.a();
            String str2 = this.b0;
            a.getClass();
            Iterator it = H53.a.iterator();
            while (it.hasNext()) {
                PostTask.c(AbstractC5103f04.a, new F53((G53) it.next(), str2));
            }
        }
    }

    @Override // defpackage.AbstractC8134nq
    public final void P0(View view) {
        super.P0(view);
        this.j0.addTextChangedListener(this);
        this.n0.addTextChangedListener(this);
        this.o0.setOnItemSelectedListener(this);
        this.p0.setOnItemSelectedListener(this);
        this.o0.setOnTouchListener(this);
        this.p0.setOnTouchListener(this);
    }

    public final void Q0() {
        this.h0.setEnabled(!TextUtils.isEmpty(this.n0.getText()) && this.q0);
    }
}
