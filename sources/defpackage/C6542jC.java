package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.FadingShadowView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6542jC {
    public final int a;
    public final View b;

    public C6542jC(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.f40230_resource_name_obfuscated_res_0x7f08072d);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f60850_resource_name_obfuscated_res_0x7f0e0279, (ViewGroup) null);
        this.b = inflate;
        ((FadingShadowView) inflate.findViewById(R.id.shadow)).a(context.getColor(R.color.f26860_resource_name_obfuscated_res_0x7f0708ad));
    }
}
