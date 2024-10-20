package org.chromium.chrome.browser.password_edit_dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.android.chrome.R;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class UsernameSelectionConfirmationView extends b implements AdapterView.OnItemSelectedListener {
    public Spinner g;
    public Callback h;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public UsernameSelectionConfirmationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.chrome.browser.password_edit_dialog.b, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Spinner spinner = (Spinner) findViewById(R.id.usernames_spinner);
        this.g = spinner;
        spinner.setOnItemSelectedListener(this);
    }

    @Override // org.chromium.chrome.browser.password_edit_dialog.b
    public final void e(String str, List list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.addAll(list);
        this.g.setAdapter((SpinnerAdapter) arrayAdapter);
        this.g.setSelection(list.indexOf(str));
    }

    @Override // org.chromium.chrome.browser.password_edit_dialog.b
    public final void d(Callback callback) {
        this.h = callback;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.h != null) {
            this.h.onResult(this.g.getItemAtPosition(i).toString());
        }
    }
}
