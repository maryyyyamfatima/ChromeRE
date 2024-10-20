package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FA2 extends AbstractC8305oK2 {
    public final QB i;

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return 4;
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 3;
        }
        return i == 2 ? 2 : 0;
    }

    public FA2(QB qb) {
        this.i = qb;
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        if (i == 0) {
            return new BA2(from.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e021a, (ViewGroup) recyclerView, false));
        }
        if (i == 1) {
            return new CA2(from.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e021f, (ViewGroup) recyclerView, false));
        }
        if (i == 2) {
            return new DA2(from.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0222, (ViewGroup) recyclerView, false), this.i);
        }
        if (i != 3) {
            return null;
        }
        return new EA2(from.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0224, (ViewGroup) recyclerView, false));
    }
}
