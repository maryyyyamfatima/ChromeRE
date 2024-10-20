package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tF2 */
/* loaded from: classes2.dex */
public final class C9994tF2 {
    public final Context a;
    public final View b;
    public final View c;

    public C9994tF2(Context context, C8966qF2 c8966qF2) {
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0230, (ViewGroup) null);
        this.c = inflate;
        this.b = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0231, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.screenshots_container);
        recyclerView.g(new C9651sF2(this));
        recyclerView.n0(c8966qF2);
    }
}
