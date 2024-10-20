package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hN2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5914hN2 {
    public final ZX1 a;
    public final PropertyModel b;
    public final Callback c;
    public final Callback d;

    public C5914hN2(Context context, ZX1 zx1, C3852bN2 c3852bN2, C4195cN2 c4195cN2) {
        this.a = zx1;
        ScrollView scrollView = (ScrollView) LayoutInflater.from(context).inflate(R.layout.f57340_resource_name_obfuscated_res_0x7f0e00ee, (ViewGroup) null);
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, new C5570gN2(this));
        bd2.e(AbstractC4249cY1.c, context.getString(R.string.f84510_resource_name_obfuscated_res_0x7f140957));
        bd2.e(AbstractC4249cY1.h, scrollView);
        bd2.d(AbstractC4249cY1.j, context.getResources(), R.string.f71080_resource_name_obfuscated_res_0x7f14038c);
        bd2.d(AbstractC4249cY1.n, context.getResources(), R.string.f69890_resource_name_obfuscated_res_0x7f1402f4);
        this.b = bd2.a();
        this.c = c3852bN2;
        this.d = c4195cN2;
    }
}
