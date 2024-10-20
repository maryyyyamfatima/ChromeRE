package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a extends Preference {
    public final long T;

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        c1812Ny2.C = false;
    }

    @Override // androidx.preference.Preference
    public final long m() {
        return this.T;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ArrayList arrayList, long j) {
        super(context, null);
        CharSequence charSequence = null;
        this.K = R.layout.f57460_resource_name_obfuscated_res_0x7f0e00fb;
        I(R.drawable.f46960_resource_name_obfuscated_res_0x7f0901c0);
        Q(R.string.f73380_resource_name_obfuscated_res_0x7f14047a);
        L(999);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence2 = preference.m;
            boolean z = preference instanceof d;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList2.add((d) preference);
            }
            if (arrayList2.contains(preference.O)) {
                if (z) {
                    arrayList2.add((d) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                charSequence = charSequence == null ? charSequence2 : this.a.getString(R.string.f87670_resource_name_obfuscated_res_0x7f140a9d, charSequence, charSequence2);
            }
        }
        P(charSequence);
        this.T = j + 1000000;
    }
}
