package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ED1 extends AbstractDialogInterfaceOnClickListenerC10927vy2 {
    public CharSequence[] A0;
    public CharSequence[] B0;
    public int z0;

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2, defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            this.z0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.A0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.B0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) R0();
        if (listPreference.Z == null || listPreference.a0 == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.z0 = listPreference.W(listPreference.b0);
        this.A0 = listPreference.Z;
        this.B0 = listPreference.a0;
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2, defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.z0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.A0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.B0);
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void U0(C5490g8 c5490g8) {
        c5490g8.h(this.A0, this.z0, new DD1(this));
        c5490g8.g(null, null);
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void T0(boolean z) {
        int i;
        if (!z || (i = this.z0) < 0) {
            return;
        }
        String charSequence = this.B0[i].toString();
        ListPreference listPreference = (ListPreference) R0();
        if (listPreference.f(charSequence)) {
            listPreference.Y(charSequence);
        }
    }
}
