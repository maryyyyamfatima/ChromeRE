package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import org.chromium.components.browser_ui.settings.SpinnerPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yg3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3153Yg3 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ SpinnerPreference a;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object selectedItem;
        SpinnerPreference spinnerPreference = this.a;
        spinnerPreference.V = i;
        InterfaceC9213qy2 interfaceC9213qy2 = spinnerPreference.j;
        if (interfaceC9213qy2 != null) {
            Spinner spinner = spinnerPreference.T;
            if (spinner == null) {
                selectedItem = spinnerPreference.U.getItem(i);
            } else {
                selectedItem = spinner.getSelectedItem();
            }
            interfaceC9213qy2.l(spinnerPreference, selectedItem);
        }
    }

    public C3153Yg3(SpinnerPreference spinnerPreference) {
        this.a = spinnerPreference;
    }
}
