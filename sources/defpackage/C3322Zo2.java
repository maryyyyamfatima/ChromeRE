package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.FadingShadowView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zo2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3322Zo2 {
    public final int a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final ProgressBar e;
    public final ImageView f;
    public final View g;

    public C3322Zo2(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.f40230_resource_name_obfuscated_res_0x7f08072d);
        context.getResources().getDimensionPixelSize(R.dimen.f28050_resource_name_obfuscated_res_0x7f08005f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f60850_resource_name_obfuscated_res_0x7f0e0279, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.origin);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.f = (ImageView) inflate.findViewById(R.id.security_icon);
        this.g = inflate.findViewById(R.id.close);
        inflate.findViewById(R.id.open_in_new_tab).setVisibility(8);
        inflate.findViewById(R.id.favicon).setVisibility(8);
        ((FadingShadowView) inflate.findViewById(R.id.shadow)).a(context.getColor(R.color.f26860_resource_name_obfuscated_res_0x7f0708ad));
    }
}
