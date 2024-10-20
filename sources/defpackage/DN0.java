package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DN0 {
    public final ViewGroup a;
    public final TabLayout b;
    public final ViewGroup c;
    public Callback d;

    public DN0(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.f57090_resource_name_obfuscated_res_0x7f0e00d5, (ViewGroup) null);
        this.a = viewGroup;
        TabLayout tabLayout = (TabLayout) viewGroup.findViewById(R.id.tabs);
        this.b = tabLayout;
        this.c = (ViewGroup) viewGroup.findViewById(R.id.content_container);
        CN0 cn0 = new CN0(this);
        InterfaceC11266wx3 interfaceC11266wx3 = tabLayout.I;
        if (interfaceC11266wx3 != null) {
            tabLayout.f11501J.remove(interfaceC11266wx3);
        }
        tabLayout.I = cn0;
        tabLayout.b(cn0);
    }
}
