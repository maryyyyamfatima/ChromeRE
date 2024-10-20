package org.chromium.chrome.browser.autofill.settings;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.fragment.app.c;
import com.android.chrome.R;
import defpackage.AbstractC1774Nr;
import defpackage.K53;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.FadingEdgeScrollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AutofillEditorBase extends c implements AdapterView.OnItemSelectedListener, View.OnTouchListener, TextWatcher {
    public String b0;
    public boolean c0;
    public Context d0;

    public void L0() {
    }

    public abstract int M0();

    public abstract int N0(boolean z);

    public abstract boolean O0();

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // androidx.fragment.app.c
    public View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        F0();
        this.d0 = viewGroup.getContext();
        Bundle bundle2 = this.l;
        if (bundle2 != null) {
            this.b0 = bundle2.getString("guid");
        }
        if (this.b0 == null) {
            this.b0 = "";
            this.c0 = true;
        } else {
            this.c0 = false;
        }
        getActivity().setTitle(N0(this.c0));
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e004f, viewGroup, false);
        FadingEdgeScrollView fadingEdgeScrollView = (FadingEdgeScrollView) inflate.findViewById(R.id.scroll_view);
        fadingEdgeScrollView.i = 0;
        fadingEdgeScrollView.j = 1;
        fadingEdgeScrollView.invalidate();
        fadingEdgeScrollView.getViewTreeObserver().addOnScrollChangedListener(new K53(fadingEdgeScrollView, inflate.findViewById(R.id.shadow)));
        LinearLayout linearLayout = (LinearLayout) fadingEdgeScrollView.findViewById(R.id.content);
        layoutInflater.inflate(M0(), (ViewGroup) linearLayout, true);
        layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0050, (ViewGroup) linearLayout, true);
        return inflate;
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.delete_menu_id) {
            L0();
            getActivity().finish();
            return true;
        }
        if (menuItem.getItemId() != R.id.help_menu_id) {
            return false;
        }
        AbstractC1774Nr.e(getActivity(), Profile.d());
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view instanceof Spinner) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:            if ((!(r1 instanceof org.chromium.chrome.browser.autofill.settings.AutofillServerCardEditor)) != false) goto L49;     */
    @Override // androidx.fragment.app.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h0(android.view.Menu r2, android.view.MenuInflater r3) {
        /*
            r1 = this;
            r2.clear()
            r0 = 2131755017(0x7f100009, float:1.9140901E38)
            r3.inflate(r0, r2)
            r3 = 2130772541(0x7f01023d, float:1.7148203E38)
            android.view.MenuItem r2 = r2.findItem(r3)
            if (r2 == 0) goto L21
            boolean r3 = r1.c0
            if (r3 != 0) goto L1d
            boolean r3 = r1 instanceof org.chromium.chrome.browser.autofill.settings.AutofillServerCardEditor
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r2.setVisible(r0)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.autofill.settings.AutofillEditorBase.h0(android.view.Menu, android.view.MenuInflater):void");
    }
}
