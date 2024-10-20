package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4757e02 extends AbstractDialogInterfaceOnClickListenerC10927vy2 {
    public boolean A0;
    public CharSequence[] B0;
    public CharSequence[] C0;
    public final HashSet z0 = new HashSet();

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2, defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            HashSet hashSet = this.z0;
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.A0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.B0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.C0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        AbstractC2705Uv0.a(R0());
        throw null;
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2, defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.z0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.A0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.B0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.C0);
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void U0(C5490g8 c5490g8) {
        int length = this.C0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.z0.contains(this.C0[i].toString());
        }
        c5490g8.d(this.B0, zArr, new DialogInterfaceOnMultiChoiceClickListenerC4414d02(this));
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void T0(boolean z) {
        if (z && this.A0) {
            AbstractC2705Uv0.a(R0());
            throw null;
        }
        this.A0 = false;
    }
}
