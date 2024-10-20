package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fG2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5191fG2 {
    public final Context a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;

    public C5191fG2(Activity activity, XF2 xf2) {
        this.a = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.f60200_resource_name_obfuscated_res_0x7f0e0236, (ViewGroup) null, false);
        this.b = inflate;
        ((Button) inflate.findViewById(R.id.download)).setOnClickListener(xf2);
        ((Button) inflate.findViewById(R.id.settings)).setOnClickListener(new ViewOnClickListenerC4847eG2(this));
        a();
    }

    public final void a() {
        if (this.e) {
            View view = this.b;
            Button button = (Button) view.findViewById(R.id.download);
            Button button2 = (Button) view.findViewById(R.id.settings);
            if (this.c) {
                button.setVisibility(0);
                button2.setVisibility(8);
            } else if (this.d) {
                button.setVisibility(0);
                button2.setVisibility(8);
            } else {
                button.setVisibility(8);
                button2.setVisibility(0);
            }
        }
    }
}
