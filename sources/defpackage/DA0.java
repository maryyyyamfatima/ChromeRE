package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DA0 {
    public final ViewGroup a;
    public final View b;
    public final TextView c;
    public final LoadingView d;

    public DA0(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.f57360_resource_name_obfuscated_res_0x7f0e00f0, (ViewGroup) null);
        this.a = viewGroup;
        this.b = viewGroup.findViewById(R.id.empty_container);
        this.c = (TextView) viewGroup.findViewById(R.id.empty);
        this.d = (LoadingView) viewGroup.findViewById(R.id.loading);
    }
}
