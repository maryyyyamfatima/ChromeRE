package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.DualControlLayout;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ur0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2685Ur0 {
    public final View a;
    public final TextView b;
    public final C5967hY0 c;
    public final C3291Zi1 d;
    public final ButtonCompat e;
    public final ButtonCompat f;

    public C2685Ur0(Context context, View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.heading);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.file_info);
        int i = C5967hY0.L;
        View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.f57230_resource_name_obfuscated_res_0x7f0e00e3, (ViewGroup) null);
        this.c = new C5967hY0(inflate);
        int i2 = C3291Zi1.F;
        View inflate2 = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.f57260_resource_name_obfuscated_res_0x7f0e00e6, (ViewGroup) null);
        this.d = new C3291Zi1(inflate2);
        inflate.setVisibility(8);
        inflate2.setVisibility(4);
        frameLayout.addView(inflate);
        frameLayout.addView(inflate2);
        ButtonCompat a = DualControlLayout.a(context, true, "", null);
        this.e = a;
        a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        a.setVisibility(4);
        ButtonCompat a2 = DualControlLayout.a(context, false, view.getResources().getString(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4), null);
        this.f = a2;
        a2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        a2.setVisibility(4);
        DualControlLayout dualControlLayout = (DualControlLayout) view.findViewById(R.id.button_bar);
        dualControlLayout.addView(a);
        dualControlLayout.addView(a2);
    }
}
