package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Va4 {
    public final FrameLayout a;
    public final InterfaceC6244iK3 b;
    public final View c;
    public final View d;
    public final View e;

    public Va4(Context context, C6930kK3 c6930kK3) {
        this.b = c6930kK3;
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.addView(c6930kK3);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f61910_resource_name_obfuscated_res_0x7f0e02e4, (ViewGroup) null);
        this.d = inflate;
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.f61920_resource_name_obfuscated_res_0x7f0e02e5, (ViewGroup) null);
        this.c = inflate2;
        View inflate3 = LayoutInflater.from(context).inflate(R.layout.f58430_resource_name_obfuscated_res_0x7f0e015e, (ViewGroup) null);
        this.e = inflate3;
        frameLayout.addView(inflate);
        frameLayout.addView(inflate2);
        frameLayout.addView(inflate3);
    }
}
